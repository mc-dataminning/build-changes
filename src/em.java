import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Arrays;
import java.util.Collection;

public class em implements ArgumentType<sw> {
   private static final Collection<String> a = Arrays.asList("0", "0b", "0l", "0.0", "\"foo\"", "{foo=bar}", "[0]");

   private em() {
   }

   public static em a() {
      return new em();
   }

   public static <S> sw a(CommandContext<S> $$0, String $$1) {
      return (sw)$$0.getArgument($$1, sw.class);
   }

   public sw a(StringReader $$0) throws CommandSyntaxException {
      return new sx($$0).d();
   }

   public Collection<String> getExamples() {
      return a;
   }
}
