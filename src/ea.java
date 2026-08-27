import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Arrays;
import java.util.Collection;

public class ea implements ArgumentType<qs> {
   private static final Collection<String> a = Arrays.asList("{}", "{foo=bar}");

   private ea() {
   }

   public static ea a() {
      return new ea();
   }

   public static <S> qs a(CommandContext<S> $$0, String $$1) {
      return (qs)$$0.getArgument($$1, qs.class);
   }

   public qs a(StringReader $$0) throws CommandSyntaxException {
      return new rm($$0).f();
   }

   public Collection<String> getExamples() {
      return a;
   }
}
