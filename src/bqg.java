import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class bqg implements bqa<StringReader, String> {
   private final Pattern a;
   private final bpu<CommandSyntaxException> b;

   public bqg(Pattern $$0, bpu<CommandSyntaxException> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public String b(bpz<StringReader> $$0) {
      StringReader $$1 = $$0.f();
      String $$2 = $$1.getString();
      Matcher $$3 = this.a.matcher($$2).region($$1.getCursor(), $$2.length());
      if (!$$3.lookingAt()) {
         $$0.b().a($$0.g(), this.b);
         return null;
      } else {
         $$1.setCursor($$3.end());
         return $$3.group(0);
      }
   }
}
