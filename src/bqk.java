import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import javax.annotation.Nullable;

public class bqk implements bqa<StringReader, ali> {
   public static final bqa<StringReader, ali> a = new bqk();

   private bqk() {
   }

   @Nullable
   public ali b(bpz<StringReader> $$0) {
      $$0.f().skipWhitespace();

      try {
         return ali.b($$0.f());
      } catch (CommandSyntaxException var3) {
         return null;
      }
   }
}
