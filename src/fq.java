import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import java.util.Arrays;
import java.util.Collection;

public class fq implements ArgumentType<ale> {
   private static final Collection<String> a = Arrays.asList("foo", "foo:bar", "012");
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> xo.b("advancement.advancementNotFound", $$0));
   private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> xo.b("recipe.notFound", $$0));

   public static fq a() {
      return new fq();
   }

   public static af a(CommandContext<ep> $$0, String $$1) throws CommandSyntaxException {
      ale $$2 = c($$0, $$1);
      af $$3 = ((ep)$$0.getSource()).l().aE().a($$2);
      if ($$3 == null) {
         throw b.create($$2);
      } else {
         return $$3;
      }
   }

   public static cyw<?> b(CommandContext<ep> $$0, String $$1) throws CommandSyntaxException {
      cyx $$2 = ((ep)$$0.getSource()).l().aJ();
      ale $$3 = c($$0, $$1);
      return $$2.a($$3).orElseThrow(() -> c.create($$3));
   }

   public static ale c(CommandContext<ep> $$0, String $$1) {
      return (ale)$$0.getArgument($$1, ale.class);
   }

   public ale a(StringReader $$0) throws CommandSyntaxException {
      return ale.a($$0);
   }

   public Collection<String> getExamples() {
      return a;
   }
}
