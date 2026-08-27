import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Arrays;
import java.util.Collection;

public class eo implements ArgumentType<ud> {
   private static final Collection<String> a = Arrays.asList("{}", "{foo=bar}");

   private eo() {
   }

   public static eo a() {
      return new eo();
   }

   public static <S> ud a(CommandContext<S> $$0, String $$1) {
      return (ud)$$0.getArgument($$1, ud.class);
   }

   public ud a(StringReader $$0) throws CommandSyntaxException {
      return new vb($$0).f();
   }

   public Collection<String> getExamples() {
      return a;
   }
}
