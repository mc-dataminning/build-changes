import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Optional;

public class blv implements blq<StringReader, akn> {
   public static final blq<StringReader, akn> a = new blv();

   private blv() {
   }

   @Override
   public Optional<akn> a(blp<StringReader> $$0) {
      $$0.b().skipWhitespace();

      try {
         return Optional.of(akn.b($$0.b()));
      } catch (CommandSyntaxException var3) {
         return Optional.empty();
      }
   }
}
