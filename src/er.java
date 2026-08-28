import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import java.util.Arrays;
import java.util.Collection;
import javax.annotation.Nullable;

public class er implements ArgumentType<wy> {
   private static final Collection<String> b = Arrays.asList("\"hello world\"", "'hello world'", "\"\"", "{text:\"hello world\"}", "[\"\"]");
   public static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> wy.b("argument.component.invalid", $$0));
   private final jg.a c;

   private er(jg.a $$0) {
      this.c = $$0;
   }

   public static wy a(CommandContext<ei> $$0, String $$1) {
      return (wy)$$0.getArgument($$1, wy.class);
   }

   public static wy a(CommandContext<ei> $$0, String $$1, @Nullable bwd $$2) throws CommandSyntaxException {
      return xb.a((ei)$$0.getSource(), a($$0, $$1), $$2, 0);
   }

   public static wy b(CommandContext<ei> $$0, String $$1) throws CommandSyntaxException {
      return a($$0, $$1, ((ei)$$0.getSource()).f());
   }

   public static er a(ee $$0) {
      return new er($$0);
   }

   public wy a(StringReader $$0) throws CommandSyntaxException {
      return em.a(xa.a, this.c, a, $$0);
   }

   public Collection<String> getExamples() {
      return b;
   }
}
