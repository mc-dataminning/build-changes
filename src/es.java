import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import java.util.Arrays;
import java.util.Collection;
import javax.annotation.Nullable;

public class es implements ArgumentType<wy> {
   private static final Collection<String> b = Arrays.asList("\"hello world\"", "'hello world'", "\"\"", "{text:\"hello world\"}", "[\"\"]");
   public static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> wy.b("argument.component.invalid", $$0));
   private final jh.a c;

   private es(jh.a $$0) {
      this.c = $$0;
   }

   public static wy a(CommandContext<ej> $$0, String $$1) {
      return (wy)$$0.getArgument($$1, wy.class);
   }

   public static wy a(CommandContext<ej> $$0, String $$1, @Nullable bwi $$2) throws CommandSyntaxException {
      return xb.a((ej)$$0.getSource(), a($$0, $$1), $$2, 0);
   }

   public static wy b(CommandContext<ej> $$0, String $$1) throws CommandSyntaxException {
      return a($$0, $$1, ((ej)$$0.getSource()).f());
   }

   public static es a(ef $$0) {
      return new es($$0);
   }

   public wy a(StringReader $$0) throws CommandSyntaxException {
      return en.a(xa.a, this.c, a, $$0);
   }

   public Collection<String> getExamples() {
      return b;
   }
}
