import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Optional;

public class boy implements bot<StringReader, alz> {
   public static final bot<StringReader, alz> a = new boy();

   private boy() {
   }

   @Override
   public Optional<alz> a(bos<StringReader> $$0) {
      $$0.b().skipWhitespace();

      try {
         return Optional.of(alz.b($$0.b()));
      } catch (CommandSyntaxException var3) {
         return Optional.empty();
      }
   }
}
