import com.mojang.serialization.MapCodec;

public class dnq extends dfc {
   public static final MapCodec<dnq> a = b(dnq::new);
   private static final double b = 5.0;
   private static final exn c = dfc.a(5.0, 5.0, 5.0, 11.0, 11.0, 11.0);

   @Override
   public MapCodec<dnq> a() {
      return a;
   }

   protected dnq(dtb.d $$0) {
      super($$0);
   }

   @Override
   protected dlw a_(dtc $$0) {
      return dlw.a;
   }

   @Override
   protected exn a(dtc $$0, dbg $$1, ir $$2, ewz $$3) {
      return c;
   }

   @Override
   protected float d(dtc $$0, dbg $$1, ir $$2) {
      return 1.0F;
   }
}
