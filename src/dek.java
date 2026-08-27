import com.mojang.serialization.MapCodec;

public class dek extends del {
   public static final MapCodec<dek> a = b(dek::new);
   protected static final float b = 6.0F;
   protected static final exn c = dfc.a(2.0, 0.0, 2.0, 14.0, 15.0, 14.0);

   @Override
   public MapCodec<dek> a() {
      return a;
   }

   protected dek(dtb.d $$0) {
      super($$0);
   }

   @Override
   protected exn a(dtc $$0, dbg $$1, ir $$2, ewz $$3) {
      return c;
   }
}
