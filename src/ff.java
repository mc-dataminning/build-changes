import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import java.util.Arrays;
import java.util.Collection;

public class ff implements ArgumentType<xv> {
   private static final Collection<String> b = Arrays.asList("\"hello world\"", "\"\"", "\"{\"text\":\"hello world\"}", "[\"\"]");
   public static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> xv.b("argument.component.invalid", $$0));
   private final js.a c;

   private ff(js.a $$0) {
      this.c = $$0;
   }

   public static xv a(CommandContext<ew> $$0, String $$1) {
      return (xv)$$0.getArgument($$1, xv.class);
   }

   public static ff a(es $$0) {
      return new ff($$0);
   }

   public xv a(StringReader $$0) throws CommandSyntaxException {
      try {
         return fa.a(this.c, $$0, xx.a);
      } catch (Exception var4) {
         String $$2 = var4.getCause() != null ? var4.getCause().getMessage() : var4.getMessage();
         throw a.createWithContext($$0, $$2);
      }
   }

   public Collection<String> getExamples() {
      return b;
   }
}
