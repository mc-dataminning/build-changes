import com.mojang.serialization.MapCodec;

public class dlz extends dmb {
   public static final MapCodec<dlz> a = b(dlz::new);
   private static final ffw c = dmr.b(12.0, 0.0, 4.0);

   @Override
   public MapCodec<? extends dlz> a() {
      return a;
   }

   protected dlz(eas.d $$0) {
      super($$0);
   }

   @Override
   protected ffw a(eat $$0, diq $$1, iv $$2, ffh $$3) {
      return c;
   }
}
