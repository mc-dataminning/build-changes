import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import javax.annotation.Nullable;

public class bqm implements bqc<StringReader, alk> {
   public static final bqc<StringReader, alk> a = new bqm();

   private bqm() {
   }

   @Nullable
   public alk b(bqb<StringReader> $$0) {
      $$0.f().skipWhitespace();

      try {
         return alk.b($$0.f());
      } catch (CommandSyntaxException var3) {
         return null;
      }
   }
}
