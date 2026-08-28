import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Optional;

public class bnj implements bne<StringReader, alb> {
   public static final bne<StringReader, alb> a = new bnj();

   private bnj() {
   }

   @Override
   public Optional<alb> a(bnd<StringReader> $$0) {
      $$0.b().skipWhitespace();

      try {
         return Optional.of(alb.b($$0.b()));
      } catch (CommandSyntaxException var3) {
         return Optional.empty();
      }
   }
}
