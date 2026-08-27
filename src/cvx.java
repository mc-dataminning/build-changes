import com.mojang.serialization.MapCodec;

public class cvx extends cyp implements cvd, cvw {
   public static final MapCodec<cvx> c = b(cvx::new);
   private static final float g = 0.11F;

   @Override
   public MapCodec<cvx> a() {
      return c;
   }

   public cvx(dhh.d $$0) {
      super($$0, hx.a, r_, false, 0.1);
      this.k(this.E.b().a(e, Integer.valueOf(0)).a(s_, Boolean.valueOf(false)));
   }

   @Override
   protected int a(ats $$0) {
      return 1;
   }

   @Override
   protected boolean g(dhi $$0) {
      return $$0.i();
   }

   @Override
   protected cva b() {
      return cvc.sw;
   }

   @Override
   protected dhi a(dhi $$0, dhi $$1) {
      return $$1.a(s_, $$0.c(s_));
   }

   @Override
   protected dhi a(dhi $$0, ats $$1) {
      return super.a($$0, $$1).a(s_, Boolean.valueOf($$1.i() < 0.11F));
   }

   @Override
   public clj a(csd $$0, ht $$1, dhi $$2) {
      return new clj(clm.wi);
   }

   @Override
   public bix a(dhi $$0, csa $$1, ht $$2, cdu $$3, biw $$4, ejq $$5) {
      return cvw.a($$3, $$0, $$1, $$2);
   }

   @Override
   protected void a(dhj.a<cva, dhi> $$0) {
      super.a($$0);
      $$0.a(s_);
   }

   @Override
   public boolean b(csd $$0, ht $$1, dhi $$2) {
      return !$$2.c(s_);
   }

   @Override
   public boolean a(csa $$0, ats $$1, ht $$2, dhi $$3) {
      return true;
   }

   @Override
   public void a(ame $$0, ats $$1, ht $$2, dhi $$3) {
      $$0.a($$2, $$3.a(s_, Boolean.valueOf(true)), 2);
   }
}
