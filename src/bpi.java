import com.mojang.brigadier.StringReader;
import java.util.Optional;

public class bpi implements boy<StringReader, vu> {
   public static final boy<StringReader, vu> a = new bpi();

   private bpi() {
   }

   @Override
   public Optional<vu> a(box<StringReader> $$0) {
      $$0.b().skipWhitespace();
      int $$1 = $$0.c();

      try {
         return Optional.of(new vv($$0.b()).d());
      } catch (Exception var4) {
         $$0.a().a($$1, var4);
         return Optional.empty();
      }
   }
}
