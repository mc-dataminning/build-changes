import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import java.util.Arrays;
import java.util.Collection;

public class fi implements ArgumentType<akt> {
   private static final Collection<String> a = Arrays.asList("foo", "foo:bar", "012");
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> xe.b("advancement.advancementNotFound", $$0));
   private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> xe.b("recipe.notFound", $$0));

   public static fi a() {
      return new fi();
   }

   public static ag a(CommandContext<eh> $$0, String $$1) throws CommandSyntaxException {
      akt $$2 = c($$0, $$1);
      ag $$3 = ((eh)$$0.getSource()).l().aE().a($$2);
      if ($$3 == null) {
         throw b.create($$2);
      } else {
         return $$3;
      }
   }

   public static czc<?> b(CommandContext<eh> $$0, String $$1) throws CommandSyntaxException {
      czd $$2 = ((eh)$$0.getSource()).l().aJ();
      akt $$3 = c($$0, $$1);
      return $$2.a($$3).orElseThrow(() -> c.create($$3));
   }

   public static akt c(CommandContext<eh> $$0, String $$1) {
      return (akt)$$0.getArgument($$1, akt.class);
   }

   public akt a(StringReader $$0) throws CommandSyntaxException {
      return akt.a($$0);
   }

   public Collection<String> getExamples() {
      return a;
   }
}
