import java.util.UUID;
import javax.annotation.Nullable;

public class cly extends clw implements bus {
   private static final btu c = bty.bx.n().a(0.5F).b(0.97F);
   private static final ale d = ale.b("attacking");
   private static final bvs cb = new bvs(d, 0.05, bvs.a.a);
   private static final brd cc = bag.a(0, 1);
   private int cd;
   private static final brd ce = bag.a(20, 39);
   private int cf;
   @Nullable
   private UUID cg;
   private static final int ch = 10;
   private static final brd ci = bag.a(4, 6);
   private int cj;

   public cly(bty<? extends cly> $$0, dej $$1) {
      super($$0, $$1);
      this.a(erk.i, 8.0F);
   }

   @Override
   public void a(@Nullable UUID $$0) {
      this.cg = $$0;
   }

   @Override
   protected void t() {
      this.bS.a(2, new ccz(this, 1.0, false));
      this.bS.a(7, new ccx(this, 1.0));
      this.bT.a(1, new cdc(this).a());
      this.bT.a(2, new cdd<>(this, cnx.class, 10, true, false, this::a_));
      this.bT.a(3, new cdj<>(this, true));
   }

   public static bvt.a gx() {
      return clw.gr().a(bvu.A, 0.0).a(bvu.v, 0.23F).a(bvu.c, 5.0);
   }

   @Override
   public btu e(buz $$0) {
      return this.p_() ? c : super.e($$0);
   }

   @Override
   protected boolean gp() {
      return false;
   }

   @Override
   protected void ac() {
      bvq $$0 = this.g(bvu.v);
      if (this.ad_()) {
         if (!this.p_() && !$$0.b(d)) {
            $$0.b(cb);
         }

         this.gy();
      } else if ($$0.b(d)) {
         $$0.c(d);
      }

      this.a((arj)this.dS(), true);
      if (this.m() != null) {
         this.gz();
      }

      if (this.ad_()) {
         this.aZ = this.ag;
      }

      super.ac();
   }

   private void gy() {
      if (this.cd > 0) {
         this.cd--;
         if (this.cd == 0) {
            this.gB();
         }
      }
   }

   private void gz() {
      if (this.cj > 0) {
         this.cj--;
      } else {
         if (this.Q().a(this.m())) {
            this.gA();
         }

         this.cj = ci.a(this.af);
      }
   }

   private void gA() {
      double $$0 = this.h(bvu.m);
      eyr $$1 = eyr.a(this.dq()).c($$0, 10.0, $$0);
      this.dS()
         .a(cly.class, $$1, btw.f)
         .stream()
         .filter($$0x -> $$0x != this)
         .filter($$0x -> $$0x.m() == null)
         .filter($$0x -> !$$0x.s(this.m()))
         .forEach($$0x -> $$0x.h(this.m()));
   }

   private void gB() {
      this.a(awg.DM, this.fd() * 2.0F, this.fe() * 1.8F);
   }

   @Override
   public void h(@Nullable bun $$0) {
      if (this.m() == null && $$0 != null) {
         this.cd = cc.a(this.af);
         this.cj = ci.a(this.af);
      }

      if ($$0 instanceof cnx) {
         this.c((cnx)$$0);
      }

      super.h($$0);
   }

   @Override
   public void c() {
      this.a(ce.a(this.af));
   }

   public static boolean b(bty<cly> $$0, dek $$1, btx $$2, jf $$3, azn $$4) {
      return $$1.am() != brp.a && !$$1.a_($$3.e()).a(dho.kK);
   }

   @Override
   public boolean a(dem $$0) {
      return $$0.f(this) && !$$0.d(this.cO());
   }

   @Override
   public void b(ug $$0) {
      super.b($$0);
      this.a_($$0);
   }

   @Override
   public void a(ug $$0) {
      super.a($$0);
      this.a(this.dS(), $$0);
   }

   @Override
   public void a(int $$0) {
      this.cf = $$0;
   }

   @Override
   public int a() {
      return this.cf;
   }

   @Override
   protected awf w() {
      return this.ad_() ? awg.DM : awg.DL;
   }

   @Override
   protected awf d(bsj $$0) {
      return awg.DO;
   }

   @Override
   protected awf o_() {
      return awg.DN;
   }

   @Override
   protected void a(azn $$0, brq $$1) {
      this.a(btz.a, new cvs(cvw.oX));
   }

   @Override
   protected cvs go() {
      return cvs.k;
   }

   @Override
   protected void gw() {
      this.g(bvu.A).a(0.0);
   }

   @Nullable
   @Override
   public UUID b() {
      return this.cg;
   }

   @Override
   public boolean a(cnx $$0) {
      return this.a_((bun)$$0);
   }

   @Override
   public boolean j(cvs $$0) {
      return this.i($$0);
   }
}
