import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Arrays;
import java.util.Collection;

public class ez implements ArgumentType<ur> {
   private static final Collection<String> a = Arrays.asList("{}", "{foo=bar}");

   private ez() {
   }

   public static ez a() {
      return new ez();
   }

   public static <S> ur a(CommandContext<S> $$0, String $$1) {
      return (ur)$$0.getArgument($$1, ur.class);
   }

   public ur a(StringReader $$0) throws CommandSyntaxException {
      return new vp($$0).f();
   }

   public Collection<String> getExamples() {
      return a;
   }
}
