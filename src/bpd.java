import com.mojang.brigadier.StringReader;
import java.util.Optional;

public class bpd implements bot<StringReader, vu> {
   public static final bot<StringReader, vu> a = new bpd();

   private bpd() {
   }

   @Override
   public Optional<vu> a(bos<StringReader> $$0) {
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
