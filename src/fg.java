import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Arrays;
import java.util.Collection;

public class fg implements ArgumentType<ul> {
   private static final Collection<String> a = Arrays.asList("{}", "{foo=bar}");

   private fg() {
   }

   public static fg a() {
      return new fg();
   }

   public static <S> ul a(CommandContext<S> $$0, String $$1) {
      return (ul)$$0.getArgument($$1, ul.class);
   }

   public ul a(StringReader $$0) throws CommandSyntaxException {
      return new vj($$0).f();
   }

   public Collection<String> getExamples() {
      return a;
   }
}
