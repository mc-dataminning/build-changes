import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Optional;

public class bpt implements bpo<StringReader, ale> {
   public static final bpo<StringReader, ale> a = new bpt();

   private bpt() {
   }

   @Override
   public Optional<ale> a(bpn<StringReader> $$0) {
      $$0.b().skipWhitespace();

      try {
         return Optional.of(ale.b($$0.b()));
      } catch (CommandSyntaxException var3) {
         return Optional.empty();
      }
   }
}
