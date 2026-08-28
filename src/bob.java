import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Optional;

public class bob implements bnw<StringReader, all> {
   public static final bnw<StringReader, all> a = new bob();

   private bob() {
   }

   @Override
   public Optional<all> a(bnv<StringReader> $$0) {
      $$0.b().skipWhitespace();

      try {
         return Optional.of(all.b($$0.b()));
      } catch (CommandSyntaxException var3) {
         return Optional.empty();
      }
   }
}
