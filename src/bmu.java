import com.mojang.brigadier.StringReader;
import java.util.Optional;

public class bmu implements bmk<StringReader, ux> {
   public static final bmk<StringReader, ux> a = new bmu();

   private bmu() {
   }

   @Override
   public Optional<ux> a(bmj<StringReader> $$0) {
      $$0.b().skipWhitespace();
      int $$1 = $$0.c();

      try {
         return Optional.of(new uy($$0.b()).d());
      } catch (Exception var4) {
         $$0.a().a($$1, var4);
         return Optional.empty();
      }
   }
}
