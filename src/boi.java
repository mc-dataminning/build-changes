import com.mojang.brigadier.StringReader;
import java.util.Optional;

public class boi implements bny<StringReader, un> {
   public static final bny<StringReader, un> a = new boi();

   private boi() {
   }

   @Override
   public Optional<un> a(bnx<StringReader> $$0) {
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
