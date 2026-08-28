import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Optional;

public class bpd implements boy<StringReader, alz> {
   public static final boy<StringReader, alz> a = new bpd();

   private bpd() {
   }

   @Override
   public Optional<alz> a(box<StringReader> $$0) {
      $$0.b().skipWhitespace();

      try {
         return Optional.of(alz.b($$0.b()));
      } catch (CommandSyntaxException var3) {
         return Optional.empty();
      }
   }
}
