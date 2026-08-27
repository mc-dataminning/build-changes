import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import java.util.Arrays;
import java.util.Collection;

public class ed implements ArgumentType<vq> {
   private static final Collection<String> b = Arrays.asList("\"hello world\"", "\"\"", "\"{\"text\":\"hello world\"}", "[\"\"]");
   public static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> vq.b("argument.component.invalid", $$0));

   private ed() {
   }

   public static vq a(CommandContext<du> $$0, String $$1) {
      return (vq)$$0.getArgument($$1, vq.class);
   }

   public static ed a() {
      return new ed();
   }

   public vq a(StringReader $$0) throws CommandSyntaxException {
      try {
         return dy.a($$0, vs.a);
      } catch (Exception var4) {
         String $$2 = var4.getCause() != null ? var4.getCause().getMessage() : var4.getMessage();
         throw a.createWithContext($$0, $$2);
      }
   }

   public Collection<String> getExamples() {
      return b;
   }
}
