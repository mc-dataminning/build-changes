import java.util.UUID;
import javax.annotation.Nullable;

public class cmt extends cmr implements bvm {
   private static final buo c = bus.bN.n().a(0.5F).b(0.97F);
   private static final alj cb = alj.b("attacking");
   private static final bwn cc = new bwn(cb, 0.05, bwn.a.a);
   private static final brv cd = bao.a(0, 1);
   private int ce;
   private static final brv cf = bao.a(20, 39);
   private int cg;
   @Nullable
   private UUID ch;
   private static final int ci = 10;
   private static final brv cj = bao.a(4, 6);
   private int ck;

   public cmt(bus<? extends cmt> $$0, dfm $$1) {
      super($$0, $$1);
      this.a(esm.i, 8.0F);
   }

   @Override
   public void a(@Nullable UUID $$0) {
      this.ch = $$0;
   }

   @Override
   protected void q() {
      this.bS.a(2, new cdu(this, 1.0, false));
      this.bS.a(7, new cds(this, 1.0));
      this.bT.a(1, new cdx(this).a());
      this.bT.a(2, new cdy<>(this, cou.class, 10, true, false, this::a));
      this.bT.a(3, new cee<>(this, true));
   }

   public static bwo.a gw() {
      return cmr.gq().a(bwp.A, 0.0).a(bwp.v, 0.23F).a(bwp.c, 5.0);
   }

   @Override
   public buo e(bvt $$0) {
      return this.e_() ? c : super.e($$0);
   }

   @Override
   protected boolean go() {
      return false;
   }

   @Override
   protected void a(arp $$0) {
      bwl $$1 = this.g(bwp.v);
      if (this.ac_()) {
         if (!this.e_() && !$$1.b(cb)) {
            $$1.b(cc);
         }

         this.gx();
      } else if ($$1.b(cb)) {
         $$1.c(cb);
      }

      this.a($$0, true);
      if (this.aa_() != null) {
         this.gy();
      }

      if (this.ac_()) {
         this.bc = this.af;
      }

      super.a($$0);
   }

   private void gx() {
      if (this.ce > 0) {
         this.ce--;
         if (this.ce == 0) {
            this.gA();
         }
      }
   }

   private void gy() {
      if (this.ck > 0) {
         this.ck--;
      } else {
         if (this.N().a(this.aa_())) {
            this.gz();
         }

         this.ck = cj.a(this.ae);
      }
   }

   private void gz() {
      double $$0 = this.h(bwp.m);
      ezt $$1 = ezt.a(this.dt()).c($$0, 10.0, $$0);
      this.dV()
         .a(cmt.class, $$1, buq.f)
         .stream()
         .filter($$0x -> $$0x != this)
         .filter($$0x -> $$0x.aa_() == null)
         .filter($$0x -> !$$0x.s(this.aa_()))
         .forEach($$0x -> $$0x.h(this.aa_()));
   }

   private void gA() {
      this.a(awn.DK, this.fe() * 2.0F, this.ff() * 1.8F);
   }

   @Override
   public void h(@Nullable bvh $$0) {
      if (this.aa_() == null && $$0 != null) {
         this.ce = cd.a(this.ae);
         this.ck = cj.a(this.ae);
      }

      if ($$0 instanceof cou) {
         this.c((cou)$$0);
      }

      super.h($$0);
   }

   @Override
   public void c() {
      this.a(cf.a(this.ae));
   }

   public static boolean b(bus<cmt> $$0, dfn $$1, bur $$2, jh $$3, azu $$4) {
      return $$1.ak() != bsh.a && !$$1.a_($$3.e()).a(dis.kK);
   }

   @Override
   public boolean a(dfp $$0) {
      return $$0.f(this) && !$$0.d(this.cR());
   }

   @Override
   public void b(ul $$0) {
      super.b($$0);
      this.a_($$0);
   }

   @Override
   public void a(ul $$0) {
      super.a($$0);
      this.a(this.dV(), $$0);
   }

   @Override
   public void a(int $$0) {
      this.cg = $$0;
   }

   @Override
   public int a() {
      return this.cg;
   }

   @Override
   protected awm t() {
      return this.ac_() ? awn.DK : awn.DJ;
   }

   @Override
   protected awm e(btb $$0) {
      return awn.DM;
   }

   @Override
   protected awm n_() {
      return awn.DL;
   }

   @Override
   protected void a(azu $$0, bsi $$1) {
      this.a(but.a, new cwm(cwq.oX));
   }

   @Override
   protected cwm gn() {
      return cwm.k;
   }

   @Override
   protected void gv() {
      this.g(bwp.A).a(0.0);
   }

   @Nullable
   @Override
   public UUID b() {
      return this.ch;
   }

   @Override
   public boolean a(arp $$0, cou $$1) {
      return this.a($$1, $$0);
   }

   @Override
   public boolean c(arp $$0, cwm $$1) {
      return this.g($$1);
   }
}
