import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import java.util.Arrays;
import java.util.Collection;

public class ed implements ArgumentType<vs> {
   private static final Collection<String> b = Arrays.asList("\"hello world\"", "\"\"", "\"{\"text\":\"hello world\"}", "[\"\"]");
   public static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> vs.b("argument.component.invalid", $$0));
   private final in.a c;

   private ed(in.a $$0) {
      this.c = $$0;
   }

   public static vs a(CommandContext<du> $$0, String $$1) {
      return (vs)$$0.getArgument($$1, vs.class);
   }

   public static ed a(dq $$0) {
      return new ed($$0);
   }

   public vs a(StringReader $$0) throws CommandSyntaxException {
      try {
         return dy.a(this.c, $$0, vu.a);
      } catch (Exception var4) {
         String $$2 = var4.getCause() != null ? var4.getCause().getMessage() : var4.getMessage();
         throw a.createWithContext($$0, $$2);
      }
   }

   public Collection<String> getExamples() {
      return b;
   }
}
