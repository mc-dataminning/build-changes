import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Arrays;
import java.util.Collection;

public class ej implements ArgumentType<rl> {
   private static final Collection<String> a = Arrays.asList("0", "0b", "0l", "0.0", "\"foo\"", "{foo=bar}", "[0]");

   private ej() {
   }

   public static ej a() {
      return new ej();
   }

   public static <S> rl a(CommandContext<S> $$0, String $$1) {
      return (rl)$$0.getArgument($$1, rl.class);
   }

   public rl a(StringReader $$0) throws CommandSyntaxException {
      return new rm($$0).d();
   }

   public Collection<String> getExamples() {
      return a;
   }
}
