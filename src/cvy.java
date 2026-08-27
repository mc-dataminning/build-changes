import com.mojang.serialization.MapCodec;

public class cvy extends cyo implements cvd, cvw {
   public static final MapCodec<cvy> c = b(cvy::new);

   @Override
   public MapCodec<cvy> a() {
      return c;
   }

   public cvy(dhh.d $$0) {
      super($$0, hx.a, r_, false);
      this.k(this.E.b().a(s_, Boolean.valueOf(false)));
   }

   @Override
   protected cyp c() {
      return (cyp)cvc.sv;
   }

   @Override
   protected dhi a(dhi $$0, dhi $$1) {
      return $$1.a(s_, $$0.c(s_));
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
