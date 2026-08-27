import com.mojang.serialization.Codec;
import javax.annotation.Nullable;

public class ekv implements ekx {
   private static final ekv b = new ekv();
   public static final Codec<ekv> a = Codec.unit(b);

   @Override
   public ua a(ayg $$0, @Nullable ua $$1) {
      return new ua();
   }

   @Override
   public eky<?> a() {
      return eky.a;
   }
}
