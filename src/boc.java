import com.mojang.brigadier.StringReader;
import java.util.Optional;

public class boc implements bns<StringReader, vh> {
   public static final bns<StringReader, vh> a = new boc();

   private boc() {
   }

   @Override
   public Optional<vh> a(bnr<StringReader> $$0) {
      $$0.b().skipWhitespace();
      int $$1 = $$0.c();

      try {
         return Optional.of(new vi($$0.b()).d());
      } catch (Exception var4) {
         $$0.a().a($$1, var4);
         return Optional.empty();
      }
   }
}
