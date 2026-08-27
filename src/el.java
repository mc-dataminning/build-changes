import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import java.util.Arrays;
import java.util.Collection;

public class el implements ArgumentType<ws> {
   private static final Collection<String> b = Arrays.asList("\"hello world\"", "\"\"", "\"{\"text\":\"hello world\"}", "[\"\"]");
   public static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> ws.b("argument.component.invalid", $$0));
   private final ix.a c;

   private el(ix.a $$0) {
      this.c = $$0;
   }

   public static ws a(CommandContext<ec> $$0, String $$1) {
      return (ws)$$0.getArgument($$1, ws.class);
   }

   public static el a(dy $$0) {
      return new el($$0);
   }

   public ws a(StringReader $$0) throws CommandSyntaxException {
      try {
         return eg.a(this.c, $$0, wu.a);
      } catch (Exception var4) {
         String $$2 = var4.getCause() != null ? var4.getCause().getMessage() : var4.getMessage();
         throw a.createWithContext($$0, $$2);
      }
   }

   public Collection<String> getExamples() {
      return b;
   }
}
