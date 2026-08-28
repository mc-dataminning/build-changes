import com.mojang.serialization.MapCodec;

public class eld extends elz {
   public static final MapCodec<eld> a = MapCodec.unit(() -> eld.b);
   public static final eld b = new eld();

   private eld() {
   }

   @Override
   public boolean a(drx $$0, azc $$1) {
      return true;
   }

   @Override
   protected ema<?> a() {
      return ema.a;
   }
}
