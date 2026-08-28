import com.mojang.serialization.MapCodec;

public class deo extends dep {
   public static final MapCodec<deo> a = b(deo::new);
   protected static final float b = 6.0F;
   protected static final ews c = dff.a(2.0, 0.0, 2.0, 14.0, 15.0, 14.0);

   @Override
   public MapCodec<deo> a() {
      return a;
   }

   protected deo(dsg.d $$0) {
      super($$0);
   }

   @Override
   protected ews a(dsh $$0, dbj $$1, ja $$2, ewe $$3) {
      return c;
   }
}
