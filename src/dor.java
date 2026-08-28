import com.mojang.serialization.MapCodec;

public class dor extends drh {
   public static final MapCodec<dor> a = b(dor::new);

   @Override
   public MapCodec<dor> a() {
      return a;
   }

   public dor(dwv.d $$0) {
      super($$0);
   }

   @Override
   public void a(dww $$0, dgh $$1, ji $$2, azh $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$3.a(10) == 0) {
         $$1.a(lt.ab, (double)$$2.u() + $$3.j(), (double)$$2.v() + 1.1, (double)$$2.w() + $$3.j(), 0.0, 0.0, 0.0);
      }
   }
}
