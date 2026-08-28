import com.mojang.brigadier.StringReader;
import java.util.Optional;

public class boa implements bnq<StringReader, vg> {
   public static final bnq<StringReader, vg> a = new boa();

   private boa() {
   }

   @Override
   public Optional<vg> a(bnp<StringReader> $$0) {
      $$0.b().skipWhitespace();
      int $$1 = $$0.c();

      try {
         return Optional.of(new vh($$0.b()).d());
      } catch (Exception var4) {
         $$0.a().a($$1, var4);
         return Optional.empty();
      }
   }
}
