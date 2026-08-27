import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Optional;

public class bll implements blg<StringReader, akh> {
   public static final blg<StringReader, akh> a = new bll();

   private bll() {
   }

   @Override
   public Optional<akh> a(blf<StringReader> $$0) {
      $$0.b().skipWhitespace();

      try {
         return Optional.of(akh.b($$0.b()));
      } catch (CommandSyntaxException var3) {
         return Optional.empty();
      }
   }
}
