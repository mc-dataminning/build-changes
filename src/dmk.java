import com.mojang.serialization.MapCodec;

public class dmk extends dmm {
   public static final MapCodec<dmk> a = b(dmk::new);
   private static final fgk c = dnc.b(12.0, 0.0, 4.0);

   @Override
   public MapCodec<? extends dmk> a() {
      return a;
   }

   protected dmk(ebd.d $$0) {
      super($$0);
   }

   @Override
   protected fgk a(ebe $$0, djb $$1, iv $$2, ffv $$3) {
      return c;
   }
}
