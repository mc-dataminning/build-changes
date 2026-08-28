import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Optional;

public class boe implements bnz<StringReader, alj> {
   public static final bnz<StringReader, alj> a = new boe();

   private boe() {
   }

   @Override
   public Optional<alj> a(bny<StringReader> $$0) {
      $$0.b().skipWhitespace();

      try {
         return Optional.of(alj.b($$0.b()));
      } catch (CommandSyntaxException var3) {
         return Optional.empty();
      }
   }
}
