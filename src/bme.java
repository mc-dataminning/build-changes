import com.mojang.brigadier.StringReader;
import java.util.Optional;

public class bme implements blu<StringReader, vh> {
   public static final blu<StringReader, vh> a = new bme();

   private bme() {
   }

   @Override
   public Optional<vh> a(blt<StringReader> $$0) {
      $$0.b().skipWhitespace();
      int $$1 = $$0.c();

      try {
         return Optional.of(new vi($$0.b()).d());
      } catch (Exception var4) {
         $$0.a().a($$1, var4);
         return Optional.empty();
      }
   }
}
