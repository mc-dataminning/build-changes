import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Arrays;
import java.util.Collection;

public class eb implements ArgumentType<sj> {
   private static final Collection<String> a = Arrays.asList("{}", "{foo=bar}");

   private eb() {
   }

   public static eb a() {
      return new eb();
   }

   public static <S> sj a(CommandContext<S> $$0, String $$1) {
      return (sj)$$0.getArgument($$1, sj.class);
   }

   public sj a(StringReader $$0) throws CommandSyntaxException {
      return new th($$0).f();
   }

   public Collection<String> getExamples() {
      return a;
   }
}
