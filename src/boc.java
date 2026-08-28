import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Optional;

public class boc implements bnx<StringReader, aku> {
   public static final bnx<StringReader, aku> a = new boc();

   private boc() {
   }

   @Override
   public Optional<aku> a(bnw<StringReader> $$0) {
      $$0.b().skipWhitespace();

      try {
         return Optional.of(aku.b($$0.b()));
      } catch (CommandSyntaxException var3) {
         return Optional.empty();
      }
   }
}
