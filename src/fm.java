import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Arrays;
import java.util.Collection;

public class fm implements ArgumentType<uy> {
   private static final Collection<String> a = Arrays.asList("0", "0b", "0l", "0.0", "\"foo\"", "{foo=bar}", "[0]");

   private fm() {
   }

   public static fm a() {
      return new fm();
   }

   public static <S> uy a(CommandContext<S> $$0, String $$1) {
      return (uy)$$0.getArgument($$1, uy.class);
   }

   public uy a(StringReader $$0) throws CommandSyntaxException {
      return new uz($$0).d();
   }

   public Collection<String> getExamples() {
      return a;
   }
}
