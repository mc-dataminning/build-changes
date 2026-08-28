import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Arrays;
import java.util.Collection;

public class ff implements ArgumentType<uj> {
   private static final Collection<String> a = Arrays.asList("{}", "{foo=bar}");

   private ff() {
   }

   public static ff a() {
      return new ff();
   }

   public static <S> uj a(CommandContext<S> $$0, String $$1) {
      return (uj)$$0.getArgument($$1, uj.class);
   }

   public uj a(StringReader $$0) throws CommandSyntaxException {
      return new vh($$0).f();
   }

   public Collection<String> getExamples() {
      return a;
   }
}
