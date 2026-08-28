import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Arrays;
import java.util.Collection;

public class fl implements ArgumentType<alr> {
   private static final Collection<String> a = Arrays.asList("foo", "foo:bar", "012");

   public static fl a() {
      return new fl();
   }

   public static alr a(CommandContext<ek> $$0, String $$1) {
      return (alr)$$0.getArgument($$1, alr.class);
   }

   public alr a(StringReader $$0) throws CommandSyntaxException {
      return alr.a($$0);
   }

   public Collection<String> getExamples() {
      return a;
   }
}
