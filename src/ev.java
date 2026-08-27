import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Arrays;
import java.util.Collection;

public class ev implements ArgumentType<uv> {
   private static final Collection<String> a = Arrays.asList("0", "0b", "0l", "0.0", "\"foo\"", "{foo=bar}", "[0]");

   private ev() {
   }

   public static ev a() {
      return new ev();
   }

   public static <S> uv a(CommandContext<S> $$0, String $$1) {
      return (uv)$$0.getArgument($$1, uv.class);
   }

   public uv a(StringReader $$0) throws CommandSyntaxException {
      return new uw($$0).d();
   }

   public Collection<String> getExamples() {
      return a;
   }
}
