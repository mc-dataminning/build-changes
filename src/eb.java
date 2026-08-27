import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Arrays;
import java.util.Collection;

public class eb implements ArgumentType<qx> {
   private static final Collection<String> a = Arrays.asList("{}", "{foo=bar}");

   private eb() {
   }

   public static eb a() {
      return new eb();
   }

   public static <S> qx a(CommandContext<S> $$0, String $$1) {
      return (qx)$$0.getArgument($$1, qx.class);
   }

   public qx a(StringReader $$0) throws CommandSyntaxException {
      return new rr($$0).f();
   }

   public Collection<String> getExamples() {
      return a;
   }
}
