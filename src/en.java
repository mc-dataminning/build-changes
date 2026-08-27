import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Arrays;
import java.util.Collection;

public class en implements ArgumentType<tv> {
   private static final Collection<String> a = Arrays.asList("0", "0b", "0l", "0.0", "\"foo\"", "{foo=bar}", "[0]");

   private en() {
   }

   public static en a() {
      return new en();
   }

   public static <S> tv a(CommandContext<S> $$0, String $$1) {
      return (tv)$$0.getArgument($$1, tv.class);
   }

   public tv a(StringReader $$0) throws CommandSyntaxException {
      return new tw($$0).d();
   }

   public Collection<String> getExamples() {
      return a;
   }
}
