import com.mojang.serialization.MapCodec;

public class dor extends dmm {
   public static final MapCodec<dor> a = b(dor::new);
   private static final ffr b = dmm.b(16.0, 0.0, 15.0);

   @Override
   public MapCodec<dor> a() {
      return a;
   }

   protected dor(ean.d $$0) {
      super($$0);
   }

   @Override
   protected boolean g_(eao $$0) {
      return true;
   }

   @Override
   public eao a(ddd $$0) {
      return !this.m().a((djk)$$0.q(), $$0.a()) ? dmm.a(this.m(), dmo.j.m(), $$0.q(), $$0.a()) : super.a($$0);
   }

   @Override
   protected eao a(eao $$0, djk $$1, djw $$2, iv $$3, jb $$4, iv $$5, eao $$6, azv $$7) {
      if ($$4 == jb.b && !$$0.a($$1, $$3)) {
         $$2.a($$3, this, 1);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected void a(eao $$0, arq $$1, iv $$2, azv $$3) {
      dpl.a(null, $$0, $$1, $$2);
   }

   @Override
   protected boolean a(eao $$0, djk $$1, iv $$2) {
      eao $$3 = $$1.a_($$2.d());
      return !$$3.e() || $$3.b() instanceof dpn;
   }

   @Override
   protected ffr a(eao $$0, din $$1, iv $$2, ffc $$3) {
      return b;
   }

   @Override
   protected boolean a(eao $$0, exk $$1) {
      return false;
   }
}
