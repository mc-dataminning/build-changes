import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import java.util.Arrays;
import java.util.Collection;

public class fg implements ArgumentType<wo> {
   private static final Collection<String> b = Arrays.asList("\"hello world\"", "\"\"", "\"{\"text\":\"hello world\"}", "[\"\"]");
   public static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> wo.b("argument.component.invalid", $$0));
   private final jt.a c;

   private fg(jt.a $$0) {
      this.c = $$0;
   }

   public static wo a(CommandContext<ex> $$0, String $$1) {
      return (wo)$$0.getArgument($$1, wo.class);
   }

   public static fg a(et $$0) {
      return new fg($$0);
   }

   public wo a(StringReader $$0) throws CommandSyntaxException {
      try {
         return fb.a(this.c, $$0, wq.a);
      } catch (Exception var4) {
         String $$2 = var4.getCause() != null ? var4.getCause().getMessage() : var4.getMessage();
         throw a.createWithContext($$0, $$2);
      }
   }

   public Collection<String> getExamples() {
      return b;
   }
}
