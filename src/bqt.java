import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import javax.annotation.Nullable;

public abstract class bqt implements bql<StringReader, String> {
   private final bqf<CommandSyntaxException> a;
   private final bqf<CommandSyntaxException> b;

   public bqt(bqf<CommandSyntaxException> $$0, bqf<CommandSyntaxException> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Nullable
   public String b(bqk<StringReader> $$0) {
      StringReader $$1 = $$0.f();
      $$1.skipWhitespace();
      String $$2 = $$1.getString();
      int $$3 = $$1.getCursor();
      int $$4 = $$3;

      while ($$4 < $$2.length() && this.a($$2.charAt($$4))) {
         $$4++;
      }

      int $$5 = $$4 - $$3;
      if ($$5 == 0) {
         $$0.b().a($$0.g(), this.a);
         return null;
      } else if ($$2.charAt($$3) != '_' && $$2.charAt($$4 - 1) != '_') {
         $$1.setCursor($$4);
         return $$2.substring($$3, $$4);
      } else {
         $$0.b().a($$0.g(), this.b);
         return null;
      }
   }

   protected abstract boolean a(char var1);
}
