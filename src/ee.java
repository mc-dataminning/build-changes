import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Arrays;
import java.util.Collection;

public class ee implements ArgumentType<sy> {
   private static final Collection<String> a = Arrays.asList("{}", "{foo=bar}");

   private ee() {
   }

   public static ee a() {
      return new ee();
   }

   public static <S> sy a(CommandContext<S> $$0, String $$1) {
      return (sy)$$0.getArgument($$1, sy.class);
   }

   public sy a(StringReader $$0) throws CommandSyntaxException {
      return new tw($$0).f();
   }

   public Collection<String> getExamples() {
      return a;
   }
}
