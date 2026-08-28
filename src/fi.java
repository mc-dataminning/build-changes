import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Arrays;
import java.util.Collection;

public class fi implements ArgumentType<vo> {
   private static final Collection<String> a = Arrays.asList("0", "0b", "0l", "0.0", "\"foo\"", "{foo=bar}", "[0]");

   private fi() {
   }

   public static fi a() {
      return new fi();
   }

   public static <S> vo a(CommandContext<S> $$0, String $$1) {
      return (vo)$$0.getArgument($$1, vo.class);
   }

   public vo a(StringReader $$0) throws CommandSyntaxException {
      return new vp($$0).d();
   }

   public Collection<String> getExamples() {
      return a;
   }
}
