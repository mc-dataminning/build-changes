import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Arrays;
import java.util.Collection;

public class eo implements ArgumentType<ul> {
   private static final Collection<String> a = Arrays.asList("0", "0b", "0l", "0.0", "\"foo\"", "{foo=bar}", "[0]");

   private eo() {
   }

   public static eo a() {
      return new eo();
   }

   public static <S> ul a(CommandContext<S> $$0, String $$1) {
      return (ul)$$0.getArgument($$1, ul.class);
   }

   public ul a(StringReader $$0) throws CommandSyntaxException {
      return new um($$0).d();
   }

   public Collection<String> getExamples() {
      return a;
   }
}
