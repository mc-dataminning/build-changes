import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Arrays;
import java.util.Collection;

public class fe implements ArgumentType<ug> {
   private static final Collection<String> a = Arrays.asList("{}", "{foo=bar}");

   private fe() {
   }

   public static fe a() {
      return new fe();
   }

   public static <S> ug a(CommandContext<S> $$0, String $$1) {
      return (ug)$$0.getArgument($$1, ug.class);
   }

   public ug a(StringReader $$0) throws CommandSyntaxException {
      return new ve($$0).f();
   }

   public Collection<String> getExamples() {
      return a;
   }
}
