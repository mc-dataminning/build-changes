import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Arrays;
import java.util.Collection;

public class ek implements ArgumentType<rr> {
   private static final Collection<String> a = Arrays.asList("0", "0b", "0l", "0.0", "\"foo\"", "{foo=bar}", "[0]");

   private ek() {
   }

   public static ek a() {
      return new ek();
   }

   public static <S> rr a(CommandContext<S> $$0, String $$1) {
      return (rr)$$0.getArgument($$1, rr.class);
   }

   public rr a(StringReader $$0) throws CommandSyntaxException {
      return new rs($$0).d();
   }

   public Collection<String> getExamples() {
      return a;
   }
}
