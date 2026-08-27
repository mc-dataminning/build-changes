import com.mojang.serialization.MapCodec;

public class dkl extends dej {
   public static final MapCodec<dkl> a = b(dkl::new);
   protected static final float b = 6.0F;
   protected static final evf c = dea.a(2.0, 0.0, 2.0, 14.0, 13.0, 14.0);

   @Override
   public MapCodec<dkl> a() {
      return a;
   }

   protected dkl(drc.d $$0) {
      super($$0);
   }

   @Override
   protected evf a(drd $$0, daf $$1, io $$2, eur $$3) {
      return c;
   }

   @Override
   protected boolean b(drd $$0, daf $$1, io $$2) {
      return $$0.a(avx.aL) || $$0.a(dec.dX) || super.b($$0, $$1, $$2);
   }
}
