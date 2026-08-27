import com.mojang.serialization.MapCodec;

public class djf extends dej {
   public static final MapCodec<djf> a = b(djf::new);
   protected static final evf b = dea.a(2.0, 0.0, 2.0, 14.0, 3.0, 14.0);

   @Override
   public MapCodec<djf> a() {
      return a;
   }

   public djf(drc.d $$0) {
      super($$0);
   }

   @Override
   protected evf a(drd $$0, daf $$1, io $$2, eur $$3) {
      return b;
   }

   @Override
   protected boolean b(drd $$0, daf $$1, io $$2) {
      return $$0.a(avx.aL) || $$0.a(dec.dX) || super.b($$0, $$1, $$2);
   }
}
