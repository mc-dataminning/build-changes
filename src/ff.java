import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import java.util.Arrays;
import java.util.Collection;

public class ff implements ArgumentType<akn> {
   private static final Collection<String> a = Arrays.asList("foo", "foo:bar", "012");
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> wx.b("advancement.advancementNotFound", $$0));
   private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> wx.b("recipe.notFound", $$0));

   public static ff a() {
      return new ff();
   }

   public static af a(CommandContext<ee> $$0, String $$1) throws CommandSyntaxException {
      akn $$2 = c($$0, $$1);
      af $$3 = ((ee)$$0.getSource()).l().aE().a($$2);
      if ($$3 == null) {
         throw b.create($$2);
      } else {
         return $$3;
      }
   }

   public static cxy<?> b(CommandContext<ee> $$0, String $$1) throws CommandSyntaxException {
      cxz $$2 = ((ee)$$0.getSource()).l().aJ();
      akn $$3 = c($$0, $$1);
      return $$2.a($$3).orElseThrow(() -> c.create($$3));
   }

   public static akn c(CommandContext<ee> $$0, String $$1) {
      return (akn)$$0.getArgument($$1, akn.class);
   }

   public akn a(StringReader $$0) throws CommandSyntaxException {
      return akn.a($$0);
   }

   public Collection<String> getExamples() {
      return a;
   }
}
