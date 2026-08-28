import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Optional;

public class bmp implements bmk<StringReader, akq> {
   public static final bmk<StringReader, akq> a = new bmp();

   private bmp() {
   }

   @Override
   public Optional<akq> a(bmj<StringReader> $$0) {
      $$0.b().skipWhitespace();

      try {
         return Optional.of(akq.b($$0.b()));
      } catch (CommandSyntaxException var3) {
         return Optional.empty();
      }
   }
}
