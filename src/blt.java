import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Optional;

public class blt implements blo<StringReader, akm> {
   public static final blo<StringReader, akm> a = new blt();

   private blt() {
   }

   @Override
   public Optional<akm> a(bln<StringReader> $$0) {
      $$0.b().skipWhitespace();

      try {
         return Optional.of(akm.b($$0.b()));
      } catch (CommandSyntaxException var3) {
         return Optional.empty();
      }
   }
}
