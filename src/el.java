import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Arrays;
import java.util.Collection;

public class el implements ArgumentType<tk> {
   private static final Collection<String> a = Arrays.asList("0", "0b", "0l", "0.0", "\"foo\"", "{foo=bar}", "[0]");

   private el() {
   }

   public static el a() {
      return new el();
   }

   public static <S> tk a(CommandContext<S> $$0, String $$1) {
      return (tk)$$0.getArgument($$1, tk.class);
   }

   public tk a(StringReader $$0) throws CommandSyntaxException {
      return new tl($$0).d();
   }

   public Collection<String> getExamples() {
      return a;
   }
}
