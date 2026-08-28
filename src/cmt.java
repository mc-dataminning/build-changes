import java.util.UUID;
import javax.annotation.Nullable;

public class cmt extends cmr implements bvm {
   private static final buo c = bus.bQ.n().a(0.5F).b(0.97F);
   private static final akv cb = akv.b("attacking");
   private static final bwn cc = new bwn(cb, 0.05, bwn.a.a);
   private static final brv cd = bab.a(0, 1);
   private int ce;
   private static final brv cf = bab.a(20, 39);
   private int cg;
   @Nullable
   private UUID ch;
   private static final int ci = 10;
   private static final brv cj = bab.a(4, 6);
   private int ck;

   public cmt(bus<? extends cmt> $$0, dgi $$1) {
      super($$0, $$1);
      this.a(etq.i, 8.0F);
   }

   @Override
   public void a(@Nullable UUID $$0) {
      this.ch = $$0;
   }

   @Override
   protected void p() {
      this.bS.a(2, new cdu(this, 1.0, false));
      this.bS.a(7, new cds(this, 1.0));
      this.bT.a(1, new cdx(this).a());
      this.bT.a(2, new cdy<>(this, cox.class, 10, true, false, this::a));
      this.bT.a(3, new cee<>(this, true));
   }

   public static bwo.a gB() {
      return cmr.gv().a(bwp.A, 0.0).a(bwp.v, 0.23F).a(bwp.c, 5.0);
   }

   @Override
   public buo e(bvt $$0) {
      return this.e_() ? c : super.e($$0);
   }

   @Override
   protected boolean gt() {
      return false;
   }

   @Override
   protected void a(ard $$0) {
      bwl $$1 = this.g(bwp.v);
      if (this.ac_()) {
         if (!this.e_() && !$$1.b(cb)) {
            $$1.b(cc);
         }

         this.gC();
      } else if ($$1.b(cb)) {
         $$1.c(cb);
      }

      this.a($$0, true);
      if (this.O_() != null) {
         this.gD();
      }

      if (this.ac_()) {
         this.bd = this.af;
      }

      super.a($$0);
   }

   private void gC() {
      if (this.ce > 0) {
         this.ce--;
         if (this.ce == 0) {
            this.gF();
         }
      }
   }

   private void gD() {
      if (this.ck > 0) {
         this.ck--;
      } else {
         if (this.Q().a(this.O_())) {
            this.gE();
         }

         this.ck = cj.a(this.ae);
      }
   }

   private void gE() {
      double $$0 = this.h(bwp.m);
      fav $$1 = fav.a(this.dt()).c($$0, 10.0, $$0);
      this.dV()
         .a(cmt.class, $$1, buq.f)
         .stream()
         .filter($$0x -> $$0x != this)
         .filter($$0x -> $$0x.O_() == null)
         .filter($$0x -> !$$0x.s(this.O_()))
         .forEach($$0x -> $$0x.h(this.O_()));
   }

   private void gF() {
      this.a(awa.Eu, this.fg() * 2.0F, this.fh() * 1.8F);
   }

   @Override
   public void h(@Nullable bvh $$0) {
      if (this.O_() == null && $$0 != null) {
         this.ce = cd.a(this.ae);
         this.ck = cj.a(this.ae);
      }

      if ($$0 instanceof cox) {
         this.c((cox)$$0);
      }

      super.h($$0);
   }

   @Override
   public void c() {
      this.a(cf.a(this.ae));
   }

   public static boolean b(bus<cmt> $$0, dgj $$1, bur $$2, ji $$3, azh $$4) {
      return $$1.am() != bsh.a && !$$1.a_($$3.e()).a(djo.lm);
   }

   @Override
   public boolean a(dgl $$0) {
      return $$0.f(this) && !$$0.d(this.cR());
   }

   @Override
   public void b(tq $$0) {
      super.b($$0);
      this.a_($$0);
   }

   @Override
   public void a(tq $$0) {
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
   protected avz u() {
      return this.ac_() ? awa.Eu : awa.Et;
   }

   @Override
   protected avz e(btb $$0) {
      return awa.Ew;
   }

   @Override
   protected avz o_() {
      return awa.Ev;
   }

   @Override
   protected void a(azh $$0, bsi $$1) {
      this.a(but.a, new cwp(cwt.pB));
   }

   @Override
   protected cwp gs() {
      return cwp.j;
   }

   @Override
   protected void gA() {
      this.g(bwp.A).a(0.0);
   }

   @Nullable
   @Override
   public UUID b() {
      return this.ch;
   }

   @Override
   public boolean a(ard $$0, cox $$1) {
      return this.a($$1, $$0);
   }

   @Override
   public boolean c(ard $$0, cwp $$1) {
      return this.g($$1);
   }
}
