import com.mojang.serialization.Codec;

public class ecd extends ecz {
   public static final Codec<ecd> a = Codec.unit(() -> ecd.b);
   public static final ecd b = new ecd();

   private ecd() {
   }

   @Override
   public boolean a(djg $$0, auu $$1) {
      return true;
   }

   @Override
   protected eda<?> a() {
      return eda.a;
   }
}
