import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import javax.annotation.Nullable;

public class bqv implements bql<StringReader, alr> {
   public static final bql<StringReader, alr> a = new bqv();

   private bqv() {
   }

   @Nullable
   public alr b(bqk<StringReader> $$0) {
      $$0.f().skipWhitespace();

      try {
         return alr.b($$0.f());
      } catch (CommandSyntaxException var3) {
         return null;
      }
   }
}
