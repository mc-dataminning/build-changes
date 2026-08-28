import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Optional;

public class bms implements bmn<StringReader, ale> {
   public static final bmn<StringReader, ale> a = new bms();

   private bms() {
   }

   @Override
   public Optional<ale> a(bmm<StringReader> $$0) {
      $$0.b().skipWhitespace();

      try {
         return Optional.of(ale.b($$0.b()));
      } catch (CommandSyntaxException var3) {
         return Optional.empty();
      }
   }
}
