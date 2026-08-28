import com.mojang.brigadier.StringReader;
import java.util.Optional;

public class bmh implements blx<StringReader, uu> {
   public static final blx<StringReader, uu> a = new bmh();

   private bmh() {
   }

   @Override
   public Optional<uu> a(blw<StringReader> $$0) {
      $$0.b().skipWhitespace();
      int $$1 = $$0.c();

      try {
         return Optional.of(new uv($$0.b()).d());
      } catch (Exception var4) {
         $$0.a().a($$1, var4);
         return Optional.empty();
      }
   }
}
