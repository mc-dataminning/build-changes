import com.mojang.brigadier.StringReader;
import java.util.Optional;

public class boj implements bnz<StringReader, vi> {
   public static final bnz<StringReader, vi> a = new boj();

   private boj() {
   }

   @Override
   public Optional<vi> a(bny<StringReader> $$0) {
      $$0.b().skipWhitespace();
      int $$1 = $$0.c();

      try {
         return Optional.of(new vj($$0.b()).d());
      } catch (Exception var4) {
         $$0.a().a($$1, var4);
         return Optional.empty();
      }
   }
}
