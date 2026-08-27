import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Arrays;
import java.util.Collection;

public class fn implements ArgumentType<fl> {
   private static final Collection<String> b = Arrays.asList("0 0", "~ ~", "~-5 ~5");
   public static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(te.c("argument.rotation.incomplete"));

   public static fn a() {
      return new fn();
   }

   public static fl a(CommandContext<ds> $$0, String $$1) {
      return (fl)$$0.getArgument($$1, fl.class);
   }

   public fl a(StringReader $$0) throws CommandSyntaxException {
      int $$1 = $$0.getCursor();
      if (!$$0.canRead()) {
         throw a.createWithContext($$0);
      } else {
         fr $$2 = fr.a($$0, false);
         if ($$0.canRead() && $$0.peek() == ' ') {
            $$0.skip();
            fr $$3 = fr.a($$0, false);
            return new fs($$3, $$2, new fr(true, 0.0));
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
