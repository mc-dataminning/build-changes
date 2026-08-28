import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Optional;

public class bnv implements bnq<StringReader, alh> {
   public static final bnq<StringReader, alh> a = new bnv();

   private bnv() {
   }

   @Override
   public Optional<alh> a(bnp<StringReader> $$0) {
      $$0.b().skipWhitespace();

      try {
         return Optional.of(alh.b($$0.b()));
      } catch (CommandSyntaxException var3) {
         return Optional.empty();
      }
   }
}
