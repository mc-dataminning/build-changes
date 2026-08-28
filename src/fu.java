import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import java.util.Arrays;
import java.util.Collection;

public class fu implements ArgumentType<akq> {
   private static final Collection<String> a = Arrays.asList("foo", "foo:bar", "012");
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> wy.b("advancement.advancementNotFound", $$0));
   private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> wy.b("recipe.notFound", $$0));

   public static fu a() {
      return new fu();
   }

   public static ag a(CommandContext<et> $$0, String $$1) throws CommandSyntaxException {
      akq $$2 = c($$0, $$1);
      ag $$3 = ((et)$$0.getSource()).l().aE().a($$2);
      if ($$3 == null) {
         throw b.create($$2);
      } else {
         return $$3;
      }
   }

   public static cyz<?> b(CommandContext<et> $$0, String $$1) throws CommandSyntaxException {
      czb $$2 = ((et)$$0.getSource()).l().aJ();
      akq $$3 = c($$0, $$1);
      return $$2.a($$3).orElseThrow(() -> c.create($$3));
   }

   public static akq c(CommandContext<et> $$0, String $$1) {
      return (akq)$$0.getArgument($$1, akq.class);
   }

   public akq a(StringReader $$0) throws CommandSyntaxException {
      return akq.a($$0);
   }

   public Collection<String> getExamples() {
      return a;
   }
}
