import com.mojang.serialization.MapCodec;

public class ddj extends ddk {
   public static final MapCodec<ddj> a = b(ddj::new);
   protected static final float b = 6.0F;
   protected static final evf c = dea.a(2.0, 0.0, 2.0, 14.0, 15.0, 14.0);

   @Override
   public MapCodec<ddj> a() {
      return a;
   }

   protected ddj(drc.d $$0) {
      super($$0);
   }

   @Override
   protected evf a(drd $$0, daf $$1, io $$2, eur $$3) {
      return c;
   }
}
