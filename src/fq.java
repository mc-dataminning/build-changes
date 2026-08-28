import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Arrays;
import java.util.Collection;

public class fq implements ArgumentType<un> {
   private static final Collection<String> a = Arrays.asList("0", "0b", "0l", "0.0", "\"foo\"", "{foo=bar}", "[0]");

   private fq() {
   }

   public static fq a() {
      return new fq();
   }

   public static <S> un a(CommandContext<S> $$0, String $$1) {
      return (un)$$0.getArgument($$1, un.class);
   }

   public un a(StringReader $$0) throws CommandSyntaxException {
      return new uo($$0).d();
   }

   public Collection<String> getExamples() {
      return a;
   }
}
