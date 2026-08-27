import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import java.util.Arrays;
import java.util.Collection;

public class ev implements ArgumentType<ajt> {
   private static final Collection<String> a = Arrays.asList("foo", "foo:bar", "012");
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> wg.b("advancement.advancementNotFound", $$0));
   private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> wg.b("recipe.notFound", $$0));
   private static final DynamicCommandExceptionType d = new DynamicCommandExceptionType($$0 -> wg.b("predicate.unknown", $$0));
   private static final DynamicCommandExceptionType e = new DynamicCommandExceptionType($$0 -> wg.b("item_modifier.unknown", $$0));

   public static ev a() {
      return new ev();
   }

   public static af a(CommandContext<du> $$0, String $$1) throws CommandSyntaxException {
      ajt $$2 = e($$0, $$1);
      af $$3 = ((du)$$0.getSource()).l().aE().a($$2);
      if ($$3 == null) {
         throw b.create($$2);
      } else {
         return $$3;
      }
   }

   public static cvl<?> b(CommandContext<du> $$0, String $$1) throws CommandSyntaxException {
      cvm $$2 = ((du)$$0.getSource()).l().aJ();
      ajt $$3 = e($$0, $$1);
      return $$2.a($$3).orElseThrow(() -> c.create($$3));
   }

   public static eqc c(CommandContext<du> $$0, String $$1) throws CommandSyntaxException {
      ajt $$2 = e($$0, $$1);
      ene $$3 = ((du)$$0.getSource()).l().aM();
      eqc $$4 = $$3.getElement(eng.a, $$2);
      if ($$4 == null) {
         throw d.create($$2);
      } else {
         return $$4;
      }
   }

   public static eop d(CommandContext<du> $$0, String $$1) throws CommandSyntaxException {
      ajt $$2 = e($$0, $$1);
      ene $$3 = ((du)$$0.getSource()).l().aM();
      eop $$4 = $$3.getElement(eng.b, $$2);
      if ($$4 == null) {
         throw e.create($$2);
      } else {
         return $$4;
      }
   }

   public static ajt e(CommandContext<du> $$0, String $$1) {
      return (ajt)$$0.getArgument($$1, ajt.class);
   }

   public ajt a(StringReader $$0) throws CommandSyntaxException {
      return ajt.a($$0);
   }

   public Collection<String> getExamples() {
      return a;
   }
}
