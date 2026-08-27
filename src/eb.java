import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Arrays;
import java.util.Collection;

public class eb implements ArgumentType<qw> {
   private static final Collection<String> a = Arrays.asList("{}", "{foo=bar}");

   private eb() {
   }

   public static eb a() {
      return new eb();
   }

   public static <S> qw a(CommandContext<S> $$0, String $$1) {
      return (qw)$$0.getArgument($$1, qw.class);
   }

   public qw a(StringReader $$0) throws CommandSyntaxException {
      return new rr($$0).f();
   }

   public Collection<String> getExamples() {
      return a;
   }
}
