import com.mojang.brigadier.StringReader;
import java.util.Optional;

public class bmx implements bmn<StringReader, vo> {
   public static final bmn<StringReader, vo> a = new bmx();

   private bmx() {
   }

   @Override
   public Optional<vo> a(bmm<StringReader> $$0) {
      $$0.b().skipWhitespace();
      int $$1 = $$0.c();

      try {
         return Optional.of(new vp($$0.b()).d());
      } catch (Exception var4) {
         $$0.a().a($$1, var4);
         return Optional.empty();
      }
   }
}
