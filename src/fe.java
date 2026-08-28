import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import java.util.Arrays;
import java.util.Collection;

public class fe implements ArgumentType<xh> {
   private static final Collection<String> b = Arrays.asList("\"hello world\"", "\"\"", "\"{\"text\":\"hello world\"}", "[\"\"]");
   public static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> xh.b("argument.component.invalid", $$0));
   private final jr.a c;

   private fe(jr.a $$0) {
      this.c = $$0;
   }

   public static xh a(CommandContext<ev> $$0, String $$1) {
      return (xh)$$0.getArgument($$1, xh.class);
   }

   public static fe a(er $$0) {
      return new fe($$0);
   }

   public xh a(StringReader $$0) throws CommandSyntaxException {
      try {
         return ez.a(this.c, $$0, xj.a);
      } catch (Exception var4) {
         String $$2 = var4.getCause() != null ? var4.getCause().getMessage() : var4.getMessage();
         throw a.createWithContext($$0, $$2);
      }
   }

   public Collection<String> getExamples() {
      return b;
   }
}
