import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Optional;

public class bno implements bnj<StringReader, alc> {
   public static final bnj<StringReader, alc> a = new bno();

   private bno() {
   }

   @Override
   public Optional<alc> a(bni<StringReader> $$0) {
      $$0.b().skipWhitespace();

      try {
         return Optional.of(alc.b($$0.b()));
      } catch (CommandSyntaxException var3) {
         return Optional.empty();
      }
   }
}
