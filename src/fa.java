import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Arrays;
import java.util.Collection;

public class fa implements ArgumentType<tx> {
   private static final Collection<String> a = Arrays.asList("{}", "{foo=bar}");

   private fa() {
   }

   public static fa a() {
      return new fa();
   }

   public static <S> tx a(CommandContext<S> $$0, String $$1) {
      return (tx)$$0.getArgument($$1, tx.class);
   }

   public tx a(StringReader $$0) throws CommandSyntaxException {
      return new uv($$0).f();
   }

   public Collection<String> getExamples() {
      return a;
   }
}
