import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Arrays;
import java.util.Collection;

public class ed implements ArgumentType<sd> {
   private static final Collection<String> a = Arrays.asList("{}", "{foo=bar}");

   private ed() {
   }

   public static ed a() {
      return new ed();
   }

   public static <S> sd a(CommandContext<S> $$0, String $$1) {
      return (sd)$$0.getArgument($$1, sd.class);
   }

   public sd a(StringReader $$0) throws CommandSyntaxException {
      return new tb($$0).f();
   }

   public Collection<String> getExamples() {
      return a;
   }
}
