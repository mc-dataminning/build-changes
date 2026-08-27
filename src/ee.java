import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import java.util.Arrays;
import java.util.Collection;

public class ee implements ArgumentType<wi> {
   private static final Collection<String> b = Arrays.asList("\"hello world\"", "\"\"", "\"{\"text\":\"hello world\"}", "[\"\"]");
   public static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> wi.b("argument.component.invalid", $$0));
   private final ip.a c;

   private ee(ip.a $$0) {
      this.c = $$0;
   }

   public static wi a(CommandContext<dv> $$0, String $$1) {
      return (wi)$$0.getArgument($$1, wi.class);
   }

   public static ee a(dr $$0) {
      return new ee($$0);
   }

   public wi a(StringReader $$0) throws CommandSyntaxException {
      try {
         return dz.a(this.c, $$0, wk.a);
      } catch (Exception var4) {
         String $$2 = var4.getCause() != null ? var4.getCause().getMessage() : var4.getMessage();
         throw a.createWithContext($$0, $$2);
      }
   }

   public Collection<String> getExamples() {
      return b;
   }
}
