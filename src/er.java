import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import java.util.Arrays;
import java.util.Collection;

public class er implements ArgumentType<aep> {
   private static final Collection<String> a = Arrays.asList("foo", "foo:bar", "012");
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> te.a("advancement.advancementNotFound", $$0));
   private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> te.a("recipe.notFound", $$0));
   private static final DynamicCommandExceptionType d = new DynamicCommandExceptionType($$0 -> te.a("predicate.unknown", $$0));
   private static final DynamicCommandExceptionType e = new DynamicCommandExceptionType($$0 -> te.a("item_modifier.unknown", $$0));

   public static er a() {
      return new er();
   }

   public static ae a(CommandContext<ds> $$0, String $$1) throws CommandSyntaxException {
      aep $$2 = e($$0, $$1);
      ae $$3 = ((ds)$$0.getSource()).l().az().a($$2);
      if ($$3 == null) {
         throw b.create($$2);
      } else {
         return $$3;
      }
   }

   public static clz<?> b(CommandContext<ds> $$0, String $$1) throws CommandSyntaxException {
      cma $$2 = ((ds)$$0.getSource()).l().aE();
      aep $$3 = e($$0, $$1);
      return (clz<?>)$$2.a($$3).orElseThrow(() -> c.create($$3));
   }

   public static efh c(CommandContext<ds> $$0, String $$1) throws CommandSyntaxException {
      aep $$2 = e($$0, $$1);
      eck $$3 = ((ds)$$0.getSource()).l().aH();
      efh $$4 = $$3.getElement(ecm.a, $$2);
      if ($$4 == null) {
         throw d.create($$2);
      } else {
         return $$4;
      }
   }

   public static edw d(CommandContext<ds> $$0, String $$1) throws CommandSyntaxException {
      aep $$2 = e($$0, $$1);
      eck $$3 = ((ds)$$0.getSource()).l().aH();
      edw $$4 = $$3.getElement(ecm.b, $$2);
      if ($$4 == null) {
         throw e.create($$2);
      } else {
         return $$4;
      }
   }

   public static aep e(CommandContext<ds> $$0, String $$1) {
      return (aep)$$0.getArgument($$1, aep.class);
   }

   public aep a(StringReader $$0) throws CommandSyntaxException {
      return aep.a($$0);
   }

   public Collection<String> getExamples() {
      return a;
   }
}
