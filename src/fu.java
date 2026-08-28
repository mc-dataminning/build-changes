import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import java.util.Arrays;
import java.util.Collection;

public class fu implements ArgumentType<alc> {
   private static final Collection<String> a = Arrays.asList("foo", "foo:bar", "012");
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> xd.b("advancement.advancementNotFound", $$0));
   private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> xd.b("recipe.notFound", $$0));

   public static fu a() {
      return new fu();
   }

   public static ag a(CommandContext<et> $$0, String $$1) throws CommandSyntaxException {
      alc $$2 = c($$0, $$1);
      ag $$3 = ((et)$$0.getSource()).l().aD().a($$2);
      if ($$3 == null) {
         throw b.create($$2);
      } else {
         return $$3;
      }
   }

   public static daj<?> b(CommandContext<et> $$0, String $$1) throws CommandSyntaxException {
      dal $$2 = ((et)$$0.getSource()).l().aI();
      alc $$3 = c($$0, $$1);
      return $$2.a($$3).orElseThrow(() -> c.create($$3));
   }

   public static alc c(CommandContext<et> $$0, String $$1) {
      return (alc)$$0.getArgument($$1, alc.class);
   }

   public alc a(StringReader $$0) throws CommandSyntaxException {
      return alc.a($$0);
   }

   public Collection<String> getExamples() {
      return a;
   }
}
