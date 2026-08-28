import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Arrays;
import java.util.Collection;

public class fk implements ArgumentType<ali> {
   private static final Collection<String> a = Arrays.asList("foo", "foo:bar", "012");

   public static fk a() {
      return new fk();
   }

   public static ali a(CommandContext<ej> $$0, String $$1) {
      return (ali)$$0.getArgument($$1, ali.class);
   }

   public ali a(StringReader $$0) throws CommandSyntaxException {
      return ali.a($$0);
   }

   public Collection<String> getExamples() {
      return a;
   }
}
