import com.mojang.serialization.Codec;

public class dye extends dyf {
   public static final Codec<dye> a = Codec.unit(() -> dye.b);
   public static final dye b = new dye();

   private dye() {
   }

   @Override
   public boolean a(gu $$0, gu $$1, gu $$2, aru $$3) {
      return true;
   }

   @Override
   protected dyg<?> a() {
      return dyg.a;
   }
}
