import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Optional;

public class bmc implements blx<StringReader, akk> {
   public static final blx<StringReader, akk> a = new bmc();

   private bmc() {
   }

   @Override
   public Optional<akk> a(blw<StringReader> $$0) {
      $$0.b().skipWhitespace();

      try {
         return Optional.of(akk.b($$0.b()));
      } catch (CommandSyntaxException var3) {
         return Optional.empty();
      }
   }
}
