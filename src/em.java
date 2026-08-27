import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import java.util.Arrays;
import java.util.Collection;

public class em implements ArgumentType<wu> {
   private static final Collection<String> b = Arrays.asList("\"hello world\"", "\"\"", "\"{\"text\":\"hello world\"}", "[\"\"]");
   public static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> wu.b("argument.component.invalid", $$0));
   private final iy.a c;

   private em(iy.a $$0) {
      this.c = $$0;
   }

   public static wu a(CommandContext<ed> $$0, String $$1) {
      return (wu)$$0.getArgument($$1, wu.class);
   }

   public static em a(dz $$0) {
      return new em($$0);
   }

   public wu a(StringReader $$0) throws CommandSyntaxException {
      try {
         return eh.a(this.c, $$0, ww.a);
      } catch (Exception var4) {
         String $$2 = var4.getCause() != null ? var4.getCause().getMessage() : var4.getMessage();
         throw a.createWithContext($$0, $$2);
      }
   }

   public Collection<String> getExamples() {
      return b;
   }
}
