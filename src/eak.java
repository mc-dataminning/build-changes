import com.mojang.serialization.Codec;

public class eak extends ebg {
   public static final Codec<eak> a = Codec.unit(() -> eak.b);
   public static final eak b = new eak();

   private eak() {
   }

   @Override
   public boolean a(dhn $$0, atw $$1) {
      return true;
   }

   @Override
   protected ebh<?> a() {
      return ebh.a;
   }
}
