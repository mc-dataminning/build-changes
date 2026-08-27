import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import java.util.Arrays;
import java.util.Collection;

public class dy implements ArgumentType<tf> {
   private static final Collection<String> b = Arrays.asList("\"hello world\"", "\"\"", "\"{\"text\":\"hello world\"}", "[\"\"]");
   public static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> tf.a("argument.component.invalid", $$0));

   private dy() {
   }

   public static tf a(CommandContext<dr> $$0, String $$1) {
      return (tf)$$0.getArgument($$1, tf.class);
   }

   public static dy a() {
      return new dy();
   }

   public tf a(StringReader $$0) throws CommandSyntaxException {
      try {
         tf $$1 = tf.a.a($$0);
         if ($$1 == null) {
            throw a.createWithContext($$0, "empty");
         } else {
            return $$1;
         }
      } catch (Exception var4) {
         String $$3 = var4.getCause() != null ? var4.getCause().getMessage() : var4.getMessage();
         throw a.createWithContext($$0, $$3);
      }
   }

   public Collection<String> getExamples() {
      return b;
   }
}
