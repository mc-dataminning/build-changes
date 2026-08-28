import com.mojang.brigadier.StringReader;
import java.util.Optional;

public class boh implements bnx<StringReader, un> {
   public static final bnx<StringReader, un> a = new boh();

   private boh() {
   }

   @Override
   public Optional<un> a(bnw<StringReader> $$0) {
      $$0.b().skipWhitespace();
      int $$1 = $$0.c();

      try {
         return Optional.of(new uo($$0.b()).d());
      } catch (Exception var4) {
         $$0.a().a($$1, var4);
         return Optional.empty();
      }
   }
}
