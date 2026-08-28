import com.mojang.brigadier.StringReader;
import java.util.Optional;

public class bmv implements bml<StringReader, uy> {
   public static final bml<StringReader, uy> a = new bmv();

   private bmv() {
   }

   @Override
   public Optional<uy> a(bmk<StringReader> $$0) {
      $$0.b().skipWhitespace();
      int $$1 = $$0.c();

      try {
         return Optional.of(new uz($$0.b()).d());
      } catch (Exception var4) {
         $$0.a().a($$1, var4);
         return Optional.empty();
      }
   }
}
