import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Optional;

public class bmo implements bmj<StringReader, alb> {
   public static final bmj<StringReader, alb> a = new bmo();

   private bmo() {
   }

   @Override
   public Optional<alb> a(bmi<StringReader> $$0) {
      $$0.b().skipWhitespace();

      try {
         return Optional.of(alb.b($$0.b()));
      } catch (CommandSyntaxException var3) {
         return Optional.empty();
      }
   }
}
