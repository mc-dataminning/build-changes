import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Arrays;
import java.util.Collection;

public class fc implements ArgumentType<uw> {
   private static final Collection<String> a = Arrays.asList("0", "0b", "0l", "0.0", "\"foo\"", "{foo=bar}", "[0]");

   private fc() {
   }

   public static fc a() {
      return new fc();
   }

   public static <S> uw a(CommandContext<S> $$0, String $$1) {
      return (uw)$$0.getArgument($$1, uw.class);
   }

   public uw a(StringReader $$0) throws CommandSyntaxException {
      return ux.b(un.a, $$0);
   }

   public Collection<String> getExamples() {
      return a;
   }
}
