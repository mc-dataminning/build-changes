import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Optional;

public class bmt implements bmo<StringReader, alf> {
   public static final bmo<StringReader, alf> a = new bmt();

   private bmt() {
   }

   @Override
   public Optional<alf> a(bmn<StringReader> $$0) {
      $$0.b().skipWhitespace();

      try {
         return Optional.of(alf.b($$0.b()));
      } catch (CommandSyntaxException var3) {
         return Optional.empty();
      }
   }
}
