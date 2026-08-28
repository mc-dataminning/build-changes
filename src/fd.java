import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import java.util.Arrays;
import java.util.Collection;

public class fd implements ArgumentType<xe> {
   private static final Collection<String> b = Arrays.asList("\"hello world\"", "\"\"", "\"{\"text\":\"hello world\"}", "[\"\"]");
   public static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> xe.b("argument.component.invalid", $$0));
   private final jq.a c;

   private fd(jq.a $$0) {
      this.c = $$0;
   }

   public static xe a(CommandContext<eu> $$0, String $$1) {
      return (xe)$$0.getArgument($$1, xe.class);
   }

   public static fd a(eq $$0) {
      return new fd($$0);
   }

   public xe a(StringReader $$0) throws CommandSyntaxException {
      try {
         return ey.a(this.c, $$0, xg.a);
      } catch (Exception var4) {
         String $$2 = var4.getCause() != null ? var4.getCause().getMessage() : var4.getMessage();
         throw a.createWithContext($$0, $$2);
      }
   }

   public Collection<String> getExamples() {
      return b;
   }
}
