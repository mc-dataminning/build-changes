import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import java.util.Arrays;
import java.util.Collection;

public class fc implements ArgumentType<wy> {
   private static final Collection<String> b = Arrays.asList("\"hello world\"", "\"\"", "\"{\"text\":\"hello world\"}", "[\"\"]");
   public static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> wy.b("argument.component.invalid", $$0));
   private final jo.a c;

   private fc(jo.a $$0) {
      this.c = $$0;
   }

   public static wy a(CommandContext<et> $$0, String $$1) {
      return (wy)$$0.getArgument($$1, wy.class);
   }

   public static fc a(ep $$0) {
      return new fc($$0);
   }

   public wy a(StringReader $$0) throws CommandSyntaxException {
      try {
         return ex.a(this.c, $$0, xa.a);
      } catch (Exception var4) {
         String $$2 = var4.getCause() != null ? var4.getCause().getMessage() : var4.getMessage();
         throw a.createWithContext($$0, $$2);
      }
   }

   public Collection<String> getExamples() {
      return b;
   }
}
