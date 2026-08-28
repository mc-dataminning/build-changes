import com.mojang.brigadier.StringReader;
import java.util.Optional;

public class bmw implements bmm<StringReader, vo> {
   public static final bmm<StringReader, vo> a = new bmw();

   private bmw() {
   }

   @Override
   public Optional<vo> a(bml<StringReader> $$0) {
      $$0.b().skipWhitespace();
      int $$1 = $$0.c();

      try {
         return Optional.of(new vp($$0.b()).d());
      } catch (Exception var4) {
         $$0.a().a($$1, var4);
         return Optional.empty();
      }
   }
}
