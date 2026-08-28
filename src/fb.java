import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Arrays;
import java.util.Collection;

public class fb implements ArgumentType<uu> {
   private static final Collection<String> a = Arrays.asList("0", "0b", "0l", "0.0", "\"foo\"", "{foo=bar}", "[0]");

   private fb() {
   }

   public static fb a() {
      return new fb();
   }

   public static <S> uu a(CommandContext<S> $$0, String $$1) {
      return (uu)$$0.getArgument($$1, uu.class);
   }

   public uu a(StringReader $$0) throws CommandSyntaxException {
      return uv.b(ul.a, $$0);
   }

   public Collection<String> getExamples() {
      return a;
   }
}
