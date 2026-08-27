import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Arrays;
import java.util.Collection;

public class em implements ArgumentType<ty> {
   private static final Collection<String> a = Arrays.asList("{}", "{foo=bar}");

   private em() {
   }

   public static em a() {
      return new em();
   }

   public static <S> ty a(CommandContext<S> $$0, String $$1) {
      return (ty)$$0.getArgument($$1, ty.class);
   }

   public ty a(StringReader $$0) throws CommandSyntaxException {
      return new uw($$0).f();
   }

   public Collection<String> getExamples() {
      return a;
   }
}
