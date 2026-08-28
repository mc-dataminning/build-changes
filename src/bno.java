import com.mojang.brigadier.StringReader;
import java.util.Optional;

public class bno implements bne<StringReader, vc> {
   public static final bne<StringReader, vc> a = new bno();

   private bno() {
   }

   @Override
   public Optional<vc> a(bnd<StringReader> $$0) {
      $$0.b().skipWhitespace();
      int $$1 = $$0.c();

      try {
         return Optional.of(new vd($$0.b()).d());
      } catch (Exception var4) {
         $$0.a().a($$1, var4);
         return Optional.empty();
      }
   }
}
