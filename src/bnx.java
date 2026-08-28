import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Optional;

public class bnx implements bns<StringReader, ali> {
   public static final bns<StringReader, ali> a = new bnx();

   private bnx() {
   }

   @Override
   public Optional<ali> a(bnr<StringReader> $$0) {
      $$0.b().skipWhitespace();

      try {
         return Optional.of(ali.b($$0.b()));
      } catch (CommandSyntaxException var3) {
         return Optional.empty();
      }
   }
}
