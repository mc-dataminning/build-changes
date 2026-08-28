import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Arrays;
import java.util.Collection;

public class fn implements ArgumentType<vd> {
   private static final Collection<String> a = Arrays.asList("0", "0b", "0l", "0.0", "\"foo\"", "{foo=bar}", "[0]");

   private fn() {
   }

   public static fn a() {
      return new fn();
   }

   public static <S> vd a(CommandContext<S> $$0, String $$1) {
      return (vd)$$0.getArgument($$1, vd.class);
   }

   public vd a(StringReader $$0) throws CommandSyntaxException {
      return new ve($$0).d();
   }

   public Collection<String> getExamples() {
      return a;
   }
}
