import com.mojang.brigadier.StringReader;
import java.util.Optional;

public class bmy implements bmo<StringReader, vp> {
   public static final bmo<StringReader, vp> a = new bmy();

   private bmy() {
   }

   @Override
   public Optional<vp> a(bmn<StringReader> $$0) {
      $$0.b().skipWhitespace();
      int $$1 = $$0.c();

      try {
         return Optional.of(new vq($$0.b()).d());
      } catch (Exception var4) {
         $$0.a().a($$1, var4);
         return Optional.empty();
      }
   }
}
