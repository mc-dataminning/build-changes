import com.mojang.brigadier.StringReader;
import java.util.Optional;

public class boy implements boo<StringReader, vj> {
   public static final boo<StringReader, vj> a = new boy();

   private boy() {
   }

   @Override
   public Optional<vj> a(bon<StringReader> $$0) {
      $$0.b().skipWhitespace();
      int $$1 = $$0.c();

      try {
         return Optional.of(new vk($$0.b()).d());
      } catch (Exception var4) {
         $$0.a().a($$1, var4);
         return Optional.empty();
      }
   }
}
