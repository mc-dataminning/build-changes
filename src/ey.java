import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import java.util.Arrays;
import java.util.Collection;

public class ey implements ArgumentType<xl> {
   private static final Collection<String> b = Arrays.asList("\"hello world\"", "\"\"", "\"{\"text\":\"hello world\"}", "[\"\"]");
   public static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> xl.b("argument.component.invalid", $$0));
   private final jk.a c;

   private ey(jk.a $$0) {
      this.c = $$0;
   }

   public static xl a(CommandContext<ep> $$0, String $$1) {
      return (xl)$$0.getArgument($$1, xl.class);
   }

   public static ey a(el $$0) {
      return new ey($$0);
   }

   public xl a(StringReader $$0) throws CommandSyntaxException {
      try {
         return et.a(this.c, $$0, xn.a);
      } catch (Exception var4) {
         String $$2 = var4.getCause() != null ? var4.getCause().getMessage() : var4.getMessage();
         throw a.createWithContext($$0, $$2);
      }
   }

   public Collection<String> getExamples() {
      return b;
   }
}
