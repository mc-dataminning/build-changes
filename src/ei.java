import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Arrays;
import java.util.Collection;

public class ei implements ArgumentType<rk> {
   private static final Collection<String> a = Arrays.asList("0", "0b", "0l", "0.0", "\"foo\"", "{foo=bar}", "[0]");

   private ei() {
   }

   public static ei a() {
      return new ei();
   }

   public static <S> rk a(CommandContext<S> $$0, String $$1) {
      return (rk)$$0.getArgument($$1, rk.class);
   }

   public rk a(StringReader $$0) throws CommandSyntaxException {
      return new rl($$0).d();
   }

   public Collection<String> getExamples() {
      return a;
   }
}
