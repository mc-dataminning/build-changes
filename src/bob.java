import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Optional;

public class bob implements bnw<StringReader, aku> {
   public static final bnw<StringReader, aku> a = new bob();

   private bob() {
   }

   @Override
   public Optional<aku> a(bnv<StringReader> $$0) {
      $$0.b().skipWhitespace();

      try {
         return Optional.of(aku.b($$0.b()));
      } catch (CommandSyntaxException var3) {
         return Optional.empty();
      }
   }
}
