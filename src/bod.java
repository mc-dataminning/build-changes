import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Optional;

public class bod implements bny<StringReader, akv> {
   public static final bny<StringReader, akv> a = new bod();

   private bod() {
   }

   @Override
   public Optional<akv> a(bnx<StringReader> $$0) {
      $$0.b().skipWhitespace();

      try {
         return Optional.of(akv.b($$0.b()));
      } catch (CommandSyntaxException var3) {
         return Optional.empty();
      }
   }
}
