import com.mojang.serialization.MapCodec;

public class dhc extends dfl {
   public static final MapCodec<dhc> a = b(dhc::new);
   protected static final float b = 6.0F;
   protected static final exn c = dfc.a(2.0, 0.0, 2.0, 14.0, 13.0, 14.0);

   @Override
   public MapCodec<dhc> a() {
      return a;
   }

   protected dhc(dtb.d $$0) {
      super($$0);
   }

   @Override
   protected exn a(dtc $$0, dbg $$1, ir $$2, ewz $$3) {
      return c;
   }

   @Override
   protected boolean b(dtc $$0, dbg $$1, ir $$2) {
      return $$0.a(awe.co);
   }
}
