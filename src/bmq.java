import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Optional;

public class bmq implements bml<StringReader, akr> {
   public static final bml<StringReader, akr> a = new bmq();

   private bmq() {
   }

   @Override
   public Optional<akr> a(bmk<StringReader> $$0) {
      $$0.b().skipWhitespace();

      try {
         return Optional.of(akr.b($$0.b()));
      } catch (CommandSyntaxException var3) {
         return Optional.empty();
      }
   }
}
