import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Arrays;
import java.util.Collection;

public class fh implements ArgumentType<tw> {
   private static final Collection<String> a = Arrays.asList("{}", "{foo=bar}");

   private fh() {
   }

   public static fh a() {
      return new fh();
   }

   public static <S> tw a(CommandContext<S> $$0, String $$1) {
      return (tw)$$0.getArgument($$1, tw.class);
   }

   public tw a(StringReader $$0) throws CommandSyntaxException {
      return new uu($$0).f();
   }

   public Collection<String> getExamples() {
      return a;
   }
}
