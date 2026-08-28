import com.mojang.serialization.MapCodec;

public class dkg extends dfh {
   public static final MapCodec<dkg> a = b(dkg::new);
   protected static final ewy b = dfh.a(0.0, 0.0, 0.0, 16.0, 14.0, 16.0);

   @Override
   public MapCodec<dkg> a() {
      return a;
   }

   public dkg(dsj.d $$0) {
      super($$0);
   }

   @Override
   protected ewy b(dsk $$0, dbl $$1, ja $$2, ewk $$3) {
      return b;
   }

   @Override
   protected ewy b_(dsk $$0, dbl $$1, ja $$2) {
      return ewv.b();
   }

   @Override
   protected ewy c(dsk $$0, dbl $$1, ja $$2, ewk $$3) {
      return ewv.b();
   }

   @Override
   protected boolean a(dsk $$0, eow $$1) {
      return false;
   }

   @Override
   protected float d(dsk $$0, dbl $$1, ja $$2) {
      return 0.2F;
   }
}
