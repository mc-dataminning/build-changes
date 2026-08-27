import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Arrays;
import java.util.Collection;

public class ee implements ArgumentType<sw> {
   private static final Collection<String> a = Arrays.asList("{}", "{foo=bar}");

   private ee() {
   }

   public static ee a() {
      return new ee();
   }

   public static <S> sw a(CommandContext<S> $$0, String $$1) {
      return (sw)$$0.getArgument($$1, sw.class);
   }

   public sw a(StringReader $$0) throws CommandSyntaxException {
      return new tu($$0).f();
   }

   public Collection<String> getExamples() {
      return a;
   }
}
