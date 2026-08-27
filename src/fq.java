import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Arrays;
import java.util.Collection;

public class fq implements ArgumentType<fo> {
   private static final Collection<String> b = Arrays.asList("0 0", "~ ~", "~-5 ~5");
   public static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(vd.c("argument.rotation.incomplete"));

   public static fq a() {
      return new fq();
   }

   public static fo a(CommandContext<ds> $$0, String $$1) {
      return (fo)$$0.getArgument($$1, fo.class);
   }

   public fo a(StringReader $$0) throws CommandSyntaxException {
      int $$1 = $$0.getCursor();
      if (!$$0.canRead()) {
         throw a.createWithContext($$0);
      } else {
         fu $$2 = fu.a($$0, false);
         if ($$0.canRead() && $$0.peek() == ' ') {
            $$0.skip();
            fu $$3 = fu.a($$0, false);
            return new fv($$3, $$2, new fu(true, 0.0));
         } else {
            $$0.setCursor($$1);
            throw a.createWithContext($$0);
         }
      }
   }

   public Collection<String> getExamples() {
      return b;
   }
}
