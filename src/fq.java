import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Arrays;
import java.util.Collection;

public class fq implements ArgumentType<ut> {
   private static final Collection<String> a = Arrays.asList("0", "0b", "0l", "0.0", "\"foo\"", "{foo=bar}", "[0]");

   private fq() {
   }

   public static fq a() {
      return new fq();
   }

   public static <S> ut a(CommandContext<S> $$0, String $$1) {
      return (ut)$$0.getArgument($$1, ut.class);
   }

   public ut a(StringReader $$0) throws CommandSyntaxException {
      return new uu($$0).d();
   }

   public Collection<String> getExamples() {
      return a;
   }
}
