import com.mojang.brigadier.StringReader;
import java.util.Optional;

public class bna implements bmq<StringReader, vp> {
   public static final bmq<StringReader, vp> a = new bna();

   private bna() {
   }

   @Override
   public Optional<vp> a(bmp<StringReader> $$0) {
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
