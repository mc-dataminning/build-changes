import com.mojang.brigadier.StringReader;
import java.util.Optional;

public class bmz implements bmp<StringReader, vp> {
   public static final bmp<StringReader, vp> a = new bmz();

   private bmz() {
   }

   @Override
   public Optional<vp> a(bmo<StringReader> $$0) {
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
