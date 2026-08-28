import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Arrays;
import java.util.Collection;

public class fi implements ArgumentType<vp> {
   private static final Collection<String> a = Arrays.asList("0", "0b", "0l", "0.0", "\"foo\"", "{foo=bar}", "[0]");

   private fi() {
   }

   public static fi a() {
      return new fi();
   }

   public static <S> vp a(CommandContext<S> $$0, String $$1) {
      return (vp)$$0.getArgument($$1, vp.class);
   }

   public vp a(StringReader $$0) throws CommandSyntaxException {
      return new vq($$0).d();
   }

   public Collection<String> getExamples() {
      return a;
   }
}
