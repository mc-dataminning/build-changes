import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import java.util.Arrays;
import java.util.Collection;

public class dz implements ArgumentType<te> {
   private static final Collection<String> b = Arrays.asList("\"hello world\"", "\"\"", "\"{\"text\":\"hello world\"}", "[\"\"]");
   public static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> te.a("argument.component.invalid", $$0));

   private dz() {
   }

   public static te a(CommandContext<ds> $$0, String $$1) {
      return (te)$$0.getArgument($$1, te.class);
   }

   public static dz a() {
      return new dz();
   }

   public te a(StringReader $$0) throws CommandSyntaxException {
      try {
         te $$1 = te.a.a($$0);
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
