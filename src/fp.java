import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Arrays;
import java.util.Collection;

public class fp implements ArgumentType<vj> {
   private static final Collection<String> a = Arrays.asList("0", "0b", "0l", "0.0", "\"foo\"", "{foo=bar}", "[0]");

   private fp() {
   }

   public static fp a() {
      return new fp();
   }

   public static <S> vj a(CommandContext<S> $$0, String $$1) {
      return (vj)$$0.getArgument($$1, vj.class);
   }

   public vj a(StringReader $$0) throws CommandSyntaxException {
      return new vk($$0).d();
   }

   public Collection<String> getExamples() {
      return a;
   }
}
