import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Arrays;
import java.util.Collection;

public class er implements ArgumentType<uk> {
   private static final Collection<String> a = Arrays.asList("{}", "{foo=bar}");

   private er() {
   }

   public static er a() {
      return new er();
   }

   public static <S> uk a(CommandContext<S> $$0, String $$1) {
      return (uk)$$0.getArgument($$1, uk.class);
   }

   public uk a(StringReader $$0) throws CommandSyntaxException {
      return new vi($$0).f();
   }

   public Collection<String> getExamples() {
      return a;
   }
}
