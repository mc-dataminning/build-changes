import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Arrays;
import java.util.Collection;

public class ed implements ArgumentType<rz> {
   private static final Collection<String> a = Arrays.asList("{}", "{foo=bar}");

   private ed() {
   }

   public static ed a() {
      return new ed();
   }

   public static <S> rz a(CommandContext<S> $$0, String $$1) {
      return (rz)$$0.getArgument($$1, rz.class);
   }

   public rz a(StringReader $$0) throws CommandSyntaxException {
      return new sx($$0).f();
   }

   public Collection<String> getExamples() {
      return a;
   }
}
