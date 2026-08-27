import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Locale;

public record ath(int b) {
   private static final String c = "#";
   public static final Codec<ath> a = Codec.STRING.comapFlatMap($$0 -> {
      if (!$$0.startsWith("#")) {
         return DataResult.error(() -> "Not a color code: " + $$0);
      } else {
         try {
            int $$1 = (int)Long.parseLong($$0.substring(1), 16);
            return DataResult.success(new ath($$1));
         } catch (NumberFormatException var2) {
            return DataResult.error(() -> "Exception parsing color code: " + var2.getMessage());
         }
      }
   }, ath::b);

   private String b() {
      return String.format(Locale.ROOT, "#%08X", this.b);
   }

   @Override
   public String toString() {
      return this.b();
   }

   public int a() {
      return this.b;
   }
}
