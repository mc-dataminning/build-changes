import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Optional;

public class bpl implements bpg<StringReader, ald> {
   public static final bpg<StringReader, ald> a = new bpl();

   private bpl() {
   }

   @Override
   public Optional<ald> a(bpf<StringReader> $$0) {
      $$0.b().skipWhitespace();

      try {
         return Optional.of(ald.b($$0.b()));
      } catch (CommandSyntaxException var3) {
         return Optional.empty();
      }
   }
}
