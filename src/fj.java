import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Arrays;
import java.util.Collection;

public class fj implements ArgumentType<ale> {
   private static final Collection<String> a = Arrays.asList("foo", "foo:bar", "012");

   public static fj a() {
      return new fj();
   }

   public static ale a(CommandContext<ei> $$0, String $$1) {
      return (ale)$$0.getArgument($$1, ale.class);
   }

   public ale a(StringReader $$0) throws CommandSyntaxException {
      return ale.a($$0);
   }

   public Collection<String> getExamples() {
      return a;
   }
}
