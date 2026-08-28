import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import java.util.Arrays;
import java.util.Collection;

public class fr implements ArgumentType<akk> {
   private static final Collection<String> a = Arrays.asList("foo", "foo:bar", "012");
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> wu.b("advancement.advancementNotFound", $$0));
   private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> wu.b("recipe.notFound", $$0));

   public static fr a() {
      return new fr();
   }

   public static af a(CommandContext<eq> $$0, String $$1) throws CommandSyntaxException {
      akk $$2 = c($$0, $$1);
      af $$3 = ((eq)$$0.getSource()).l().aF().a($$2);
      if ($$3 == null) {
         throw b.create($$2);
      } else {
         return $$3;
      }
   }

   public static cyl<?> b(CommandContext<eq> $$0, String $$1) throws CommandSyntaxException {
      cyn $$2 = ((eq)$$0.getSource()).l().aK();
      akk $$3 = c($$0, $$1);
      return $$2.a($$3).orElseThrow(() -> c.create($$3));
   }

   public static akk c(CommandContext<eq> $$0, String $$1) {
      return (akk)$$0.getArgument($$1, akk.class);
   }

   public akk a(StringReader $$0) throws CommandSyntaxException {
      return akk.a($$0);
   }

   public Collection<String> getExamples() {
      return a;
   }
}
