import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Optional;

public class bpc implements box<StringReader, alz> {
   public static final box<StringReader, alz> a = new bpc();

   private bpc() {
   }

   @Override
   public Optional<alz> a(bow<StringReader> $$0) {
      $$0.b().skipWhitespace();

      try {
         return Optional.of(alz.b($$0.b()));
      } catch (CommandSyntaxException var3) {
         return Optional.empty();
      }
   }
}
