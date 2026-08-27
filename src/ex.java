import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Arrays;
import java.util.Collection;

public class ex implements ArgumentType<va> {
   private static final Collection<String> a = Arrays.asList("0", "0b", "0l", "0.0", "\"foo\"", "{foo=bar}", "[0]");

   private ex() {
   }

   public static ex a() {
      return new ex();
   }

   public static <S> va a(CommandContext<S> $$0, String $$1) {
      return (va)$$0.getArgument($$1, va.class);
   }

   public va a(StringReader $$0) throws CommandSyntaxException {
      return new vb($$0).d();
   }

   public Collection<String> getExamples() {
      return a;
   }
}
