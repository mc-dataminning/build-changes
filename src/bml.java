import com.mojang.brigadier.StringReader;
import java.util.Optional;

public class bml implements bmb<StringReader, uu> {
   public static final bmb<StringReader, uu> a = new bml();

   private bml() {
   }

   @Override
   public Optional<uu> a(bma<StringReader> $$0) {
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
