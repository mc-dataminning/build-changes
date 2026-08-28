import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Arrays;
import java.util.Collection;

public class fo implements ArgumentType<vg> {
   private static final Collection<String> a = Arrays.asList("0", "0b", "0l", "0.0", "\"foo\"", "{foo=bar}", "[0]");

   private fo() {
   }

   public static fo a() {
      return new fo();
   }

   public static <S> vg a(CommandContext<S> $$0, String $$1) {
      return (vg)$$0.getArgument($$1, vg.class);
   }

   public vg a(StringReader $$0) throws CommandSyntaxException {
      return new vh($$0).d();
   }

   public Collection<String> getExamples() {
      return a;
   }
}
