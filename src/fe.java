import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import java.util.Arrays;
import java.util.Collection;

public class fe implements ArgumentType<akh> {
   private static final Collection<String> a = Arrays.asList("foo", "foo:bar", "012");
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> wu.b("advancement.advancementNotFound", $$0));
   private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> wu.b("recipe.notFound", $$0));

   public static fe a() {
      return new fe();
   }

   public static af a(CommandContext<ed> $$0, String $$1) throws CommandSyntaxException {
      akh $$2 = c($$0, $$1);
      af $$3 = ((ed)$$0.getSource()).l().aE().a($$2);
      if ($$3 == null) {
         throw b.create($$2);
      } else {
         return $$3;
      }
   }

   public static cxf<?> b(CommandContext<ed> $$0, String $$1) throws CommandSyntaxException {
      cxg $$2 = ((ed)$$0.getSource()).l().aJ();
      akh $$3 = c($$0, $$1);
      return $$2.a($$3).orElseThrow(() -> c.create($$3));
   }

   public static akh c(CommandContext<ed> $$0, String $$1) {
      return (akh)$$0.getArgument($$1, akh.class);
   }

   public akh a(StringReader $$0) throws CommandSyntaxException {
      return akh.a($$0);
   }

   public Collection<String> getExamples() {
      return a;
   }
}
