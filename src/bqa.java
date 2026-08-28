import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Optional;

public class bqa implements bpv<StringReader, alg> {
   public static final bpv<StringReader, alg> a = new bqa();

   private bqa() {
   }

   @Override
   public Optional<alg> a(bpu<StringReader> $$0) {
      $$0.b().skipWhitespace();

      try {
         return Optional.of(alg.b($$0.b()));
      } catch (CommandSyntaxException var3) {
         return Optional.empty();
      }
   }
}
