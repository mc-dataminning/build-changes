import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Arrays;
import java.util.Collection;

public class ed implements ArgumentType<rt> {
   private static final Collection<String> a = Arrays.asList("{}", "{foo=bar}");

   private ed() {
   }

   public static ed a() {
      return new ed();
   }

   public static <S> rt a(CommandContext<S> $$0, String $$1) {
      return (rt)$$0.getArgument($$1, rt.class);
   }

   public rt a(StringReader $$0) throws CommandSyntaxException {
      return new so($$0).f();
   }

   public Collection<String> getExamples() {
      return a;
   }
}
