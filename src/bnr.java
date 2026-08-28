import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Optional;

public class bnr implements bnm<StringReader, ale> {
   public static final bnm<StringReader, ale> a = new bnr();

   private bnr() {
   }

   @Override
   public Optional<ale> a(bnl<StringReader> $$0) {
      $$0.b().skipWhitespace();

      try {
         return Optional.of(ale.b($$0.b()));
      } catch (CommandSyntaxException var3) {
         return Optional.empty();
      }
   }
}
