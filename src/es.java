import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Arrays;
import java.util.Collection;

public class es implements ArgumentType<tz> {
   private static final Collection<String> a = Arrays.asList("{}", "{foo=bar}");

   private es() {
   }

   public static es a() {
      return new es();
   }

   public static <S> tz a(CommandContext<S> $$0, String $$1) {
      return (tz)$$0.getArgument($$1, tz.class);
   }

   public tz a(StringReader $$0) throws CommandSyntaxException {
      return ux.a($$0);
   }

   public Collection<String> getExamples() {
      return a;
   }
}
