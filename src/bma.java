import com.mojang.brigadier.StringReader;
import java.util.Optional;

public class bma implements blq<StringReader, va> {
   public static final blq<StringReader, va> a = new bma();

   private bma() {
   }

   @Override
   public Optional<va> a(blp<StringReader> $$0) {
      $$0.b().skipWhitespace();
      int $$1 = $$0.c();

      try {
         return Optional.of(new vb($$0.b()).d());
      } catch (Exception var4) {
         $$0.a().a($$1, var4);
         return Optional.empty();
      }
   }
}
