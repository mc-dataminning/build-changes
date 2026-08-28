import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Optional;

public class bmv implements bmq<StringReader, alf> {
   public static final bmq<StringReader, alf> a = new bmv();

   private bmv() {
   }

   @Override
   public Optional<alf> a(bmp<StringReader> $$0) {
      $$0.b().skipWhitespace();

      try {
         return Optional.of(alf.b($$0.b()));
      } catch (CommandSyntaxException var3) {
         return Optional.empty();
      }
   }
}
