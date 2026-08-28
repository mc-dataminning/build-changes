import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Optional;

public class boc implements bnx<StringReader, akv> {
   public static final bnx<StringReader, akv> a = new boc();

   private boc() {
   }

   @Override
   public Optional<akv> a(bnw<StringReader> $$0) {
      $$0.b().skipWhitespace();

      try {
         return Optional.of(akv.b($$0.b()));
      } catch (CommandSyntaxException var3) {
         return Optional.empty();
      }
   }
}
