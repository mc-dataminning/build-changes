import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Arrays;
import java.util.Collection;

public class ec implements ArgumentType<sn> {
   private static final Collection<String> a = Arrays.asList("{}", "{foo=bar}");

   private ec() {
   }

   public static ec a() {
      return new ec();
   }

   public static <S> sn a(CommandContext<S> $$0, String $$1) {
      return (sn)$$0.getArgument($$1, sn.class);
   }

   public sn a(StringReader $$0) throws CommandSyntaxException {
      return new tl($$0).f();
   }

   public Collection<String> getExamples() {
      return a;
   }
}
