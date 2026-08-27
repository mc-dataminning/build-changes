import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Arrays;
import java.util.Collection;

public class ef implements ArgumentType<to> {
   private static final Collection<String> a = Arrays.asList("{}", "{foo=bar}");

   private ef() {
   }

   public static ef a() {
      return new ef();
   }

   public static <S> to a(CommandContext<S> $$0, String $$1) {
      return (to)$$0.getArgument($$1, to.class);
   }

   public to a(StringReader $$0) throws CommandSyntaxException {
      return new um($$0).f();
   }

   public Collection<String> getExamples() {
      return a;
   }
}
