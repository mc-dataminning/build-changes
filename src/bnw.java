import com.mojang.brigadier.StringReader;
import java.util.Optional;

public class bnw implements bnm<StringReader, vd> {
   public static final bnm<StringReader, vd> a = new bnw();

   private bnw() {
   }

   @Override
   public Optional<vd> a(bnl<StringReader> $$0) {
      $$0.b().skipWhitespace();
      int $$1 = $$0.c();

      try {
         return Optional.of(new ve($$0.b()).d());
      } catch (Exception var4) {
         $$0.a().a($$1, var4);
         return Optional.empty();
      }
   }
}
