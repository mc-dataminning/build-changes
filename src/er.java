import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import java.util.Arrays;
import java.util.Collection;

public class er implements ArgumentType<ww> {
   private static final Collection<String> b = Arrays.asList("\"hello world\"", "'hello world'", "\"\"", "{text:\"hello world\"}", "[\"\"]");
   public static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> ww.b("argument.component.invalid", $$0));
   private final jg.a c;

   private er(jg.a $$0) {
      this.c = $$0;
   }

   public static ww a(CommandContext<ei> $$0, String $$1) {
      return (ww)$$0.getArgument($$1, ww.class);
   }

   public static er a(ee $$0) {
      return new er($$0);
   }

   public ww a(StringReader $$0) throws CommandSyntaxException {
      return em.a(wy.a, this.c, a, $$0);
   }

   public Collection<String> getExamples() {
      return b;
   }
}
