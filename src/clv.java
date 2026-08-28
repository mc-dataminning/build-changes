import java.util.UUID;
import javax.annotation.Nullable;

public class clv extends clt implements bup {
   private static final btr c = btv.bx.n().a(0.5F).b(0.97F);
   private static final alc d = alc.b("attacking");
   private static final bvp cb = new bvp(d, 0.05, bvp.a.a);
   private static final bra cc = bae.a(0, 1);
   private int cd;
   private static final bra ce = bae.a(20, 39);
   private int cf;
   @Nullable
   private UUID cg;
   private static final int ch = 10;
   private static final bra ci = bae.a(4, 6);
   private int cj;

   public clv(btv<? extends clv> $$0, deg $$1) {
      super($$0, $$1);
      this.a(erg.i, 8.0F);
   }

   @Override
   public void a(@Nullable UUID $$0) {
      this.cg = $$0;
   }

   @Override
   protected void t() {
      this.bS.a(2, new ccw(this, 1.0, false));
      this.bS.a(7, new ccu(this, 1.0));
      this.bT.a(1, new ccz(this).a());
      this.bT.a(2, new cda<>(this, cnu.class, 10, true, false, this::a_));
      this.bT.a(3, new cdg<>(this, true));
   }

   public static bvq.a gy() {
      return clt.gs().a(bvr.A, 0.0).a(bvr.v, 0.23F).a(bvr.c, 5.0);
   }

   @Override
   public btr e(buw $$0) {
      return this.o_() ? c : super.e($$0);
   }

   @Override
   protected boolean gq() {
      return false;
   }

   @Override
   protected void ad() {
      bvn $$0 = this.g(bvr.v);
      if (this.ac_()) {
         if (!this.o_() && !$$0.b(d)) {
            $$0.b(cb);
         }

         this.gz();
      } else if ($$0.b(d)) {
         $$0.c(d);
      }

      this.a((arh)this.dS(), true);
      if (this.m() != null) {
         this.gA();
      }

      if (this.ac_()) {
         this.aZ = this.ag;
      }

      super.ad();
   }

   private void gz() {
      if (this.cd > 0) {
         this.cd--;
         if (this.cd == 0) {
            this.gC();
         }
      }
   }

   private void gA() {
      if (this.cj > 0) {
         this.cj--;
      } else {
         if (this.Q().a(this.m())) {
            this.gB();
         }

         this.cj = ci.a(this.af);
      }
   }

   private void gB() {
      double $$0 = this.h(bvr.m);
      eyn $$1 = eyn.a(this.dq()).c($$0, 10.0, $$0);
      this.dS()
         .a(clv.class, $$1, btt.f)
         .stream()
         .filter($$0x -> $$0x != this)
         .filter($$0x -> $$0x.m() == null)
         .filter($$0x -> !$$0x.s(this.m()))
         .forEach($$0x -> $$0x.h(this.m()));
   }

   private void gC() {
      this.a(awe.DM, this.fd() * 2.0F, this.fe() * 1.8F);
   }

   @Override
   public void h(@Nullable buk $$0) {
      if (this.m() == null && $$0 != null) {
         this.cd = cc.a(this.af);
         this.cj = ci.a(this.af);
      }

      if ($$0 instanceof cnu) {
         this.c((cnu)$$0);
      }

      super.h($$0);
   }

   @Override
   public void c() {
      this.a(ce.a(this.af));
   }

   public static boolean b(btv<clv> $$0, deh $$1, btu $$2, je $$3, azl $$4) {
      return $$1.am() != brm.a && !$$1.a_($$3.e()).a(dhl.kK);
   }

   @Override
   public boolean a(dej $$0) {
      return $$0.f(this) && !$$0.d(this.cO());
   }

   @Override
   public void b(uf $$0) {
      super.b($$0);
      this.a_($$0);
   }

   @Override
   public void a(uf $$0) {
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
   protected awd w() {
      return this.ac_() ? awe.DM : awe.DL;
   }

   @Override
   protected awd d(bsg $$0) {
      return awe.DO;
   }

   @Override
   protected awd n_() {
      return awe.DN;
   }

   @Override
   protected void a(azl $$0, brn $$1) {
      this.a(btw.a, new cvp(cvt.oX));
   }

   @Override
   protected cvp gp() {
      return cvp.k;
   }

   @Override
   protected void gx() {
      this.g(bvr.A).a(0.0);
   }

   @Nullable
   @Override
   public UUID b() {
      return this.cg;
   }

   @Override
   public boolean a(cnu $$0) {
      return this.a_((buk)$$0);
   }

   @Override
   public boolean j(cvp $$0) {
      return this.i($$0);
   }
}
