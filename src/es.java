import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Arrays;
import java.util.Collection;

public class es implements ArgumentType<tx> {
   private static final Collection<String> a = Arrays.asList("{}", "{foo=bar}");

   private es() {
   }

   public static es a() {
      return new es();
   }

   public static <S> tx a(CommandContext<S> $$0, String $$1) {
      return (tx)$$0.getArgument($$1, tx.class);
   }

   public tx a(StringReader $$0) throws CommandSyntaxException {
      return uv.a($$0);
   }

   public Collection<String> getExamples() {
      return a;
   }
}
