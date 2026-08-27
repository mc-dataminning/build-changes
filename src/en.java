import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Arrays;
import java.util.Collection;

public class en implements ArgumentType<ua> {
   private static final Collection<String> a = Arrays.asList("{}", "{foo=bar}");

   private en() {
   }

   public static en a() {
      return new en();
   }

   public static <S> ua a(CommandContext<S> $$0, String $$1) {
      return (ua)$$0.getArgument($$1, ua.class);
   }

   public ua a(StringReader $$0) throws CommandSyntaxException {
      return new uy($$0).f();
   }

   public Collection<String> getExamples() {
      return a;
   }
}
