import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Arrays;
import java.util.Collection;

public class fg implements ArgumentType<um> {
   private static final Collection<String> a = Arrays.asList("{}", "{foo=bar}");

   private fg() {
   }

   public static fg a() {
      return new fg();
   }

   public static <S> um a(CommandContext<S> $$0, String $$1) {
      return (um)$$0.getArgument($$1, um.class);
   }

   public um a(StringReader $$0) throws CommandSyntaxException {
      return new vk($$0).f();
   }

   public Collection<String> getExamples() {
      return a;
   }
}
