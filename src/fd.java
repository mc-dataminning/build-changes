import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Arrays;
import java.util.Collection;

public class fd implements ArgumentType<ub> {
   private static final Collection<String> a = Arrays.asList("{}", "{foo=bar}");

   private fd() {
   }

   public static fd a() {
      return new fd();
   }

   public static <S> ub a(CommandContext<S> $$0, String $$1) {
      return (ub)$$0.getArgument($$1, ub.class);
   }

   public ub a(StringReader $$0) throws CommandSyntaxException {
      return new uz($$0).f();
   }

   public Collection<String> getExamples() {
      return a;
   }
}
