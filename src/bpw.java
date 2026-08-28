import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Optional;

public class bpw implements bpr<StringReader, alg> {
   public static final bpr<StringReader, alg> a = new bpw();

   private bpw() {
   }

   @Override
   public Optional<alg> a(bpq<StringReader> $$0) {
      $$0.b().skipWhitespace();

      try {
         return Optional.of(alg.b($$0.b()));
      } catch (CommandSyntaxException var3) {
         return Optional.empty();
      }
   }
}
