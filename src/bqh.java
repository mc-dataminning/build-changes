import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import javax.annotation.Nullable;

public abstract class bqh implements bqa<StringReader, String> {
   private final int a;
   private final bpu<CommandSyntaxException> b;

   public bqh(int $$0, bpu<CommandSyntaxException> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Nullable
   public String b(bpz<StringReader> $$0) {
      StringReader $$1 = $$0.f();
      String $$2 = $$1.getString();
      int $$3 = $$1.getCursor();
      int $$4 = $$3;

      while ($$4 < $$2.length() && this.a($$2.charAt($$4))) {
         $$4++;
      }

      int $$5 = $$4 - $$3;
      if ($$5 < this.a) {
         $$0.b().a($$0.g(), this.b);
         return null;
      } else {
         $$1.setCursor($$4);
         return $$2.substring($$3, $$4);
      }
   }

   protected abstract boolean a(char var1);
}
