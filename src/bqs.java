import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import javax.annotation.Nullable;

public class bqs implements bqc<StringReader, String> {
   private final int a;
   private final bpw<CommandSyntaxException> b;

   public bqs(int $$0, bpw<CommandSyntaxException> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Nullable
   public String b(bqb<StringReader> $$0) {
      $$0.f().skipWhitespace();
      int $$1 = $$0.g();
      String $$2 = $$0.f().readUnquotedString();
      if ($$2.length() < this.a) {
         $$0.b().a($$1, this.b);
         return null;
      } else {
         return $$2;
      }
   }
}
