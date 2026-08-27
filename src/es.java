import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import java.util.Arrays;
import java.util.Collection;

public class es implements ArgumentType<aex> {
   private static final Collection<String> a = Arrays.asList("foo", "foo:bar", "012");
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> tm.a("advancement.advancementNotFound", $$0));
   private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> tm.a("recipe.notFound", $$0));
   private static final DynamicCommandExceptionType d = new DynamicCommandExceptionType($$0 -> tm.a("predicate.unknown", $$0));
   private static final DynamicCommandExceptionType e = new DynamicCommandExceptionType($$0 -> tm.a("item_modifier.unknown", $$0));

   public static es a() {
      return new es();
   }

   public static af a(CommandContext<dt> $$0, String $$1) throws CommandSyntaxException {
      aex $$2 = e($$0, $$1);
      af $$3 = ((dt)$$0.getSource()).l().az().a($$2);
      if ($$3 == null) {
         throw b.create($$2);
      } else {
         return $$3;
      }
   }

   public static cmk<?> b(CommandContext<dt> $$0, String $$1) throws CommandSyntaxException {
      cml $$2 = ((dt)$$0.getSource()).l().aE();
      aex $$3 = e($$0, $$1);
      return $$2.a($$3).orElseThrow(() -> c.create($$3));
   }

   public static efp c(CommandContext<dt> $$0, String $$1) throws CommandSyntaxException {
      aex $$2 = e($$0, $$1);
      ect $$3 = ((dt)$$0.getSource()).l().aH();
      efp $$4 = $$3.getElement(ecv.a, $$2);
      if ($$4 == null) {
         throw d.create($$2);
      } else {
         return $$4;
      }
   }

   public static eed d(CommandContext<dt> $$0, String $$1) throws CommandSyntaxException {
      aex $$2 = e($$0, $$1);
      ect $$3 = ((dt)$$0.getSource()).l().aH();
      eed $$4 = $$3.getElement(ecv.b, $$2);
      if ($$4 == null) {
         throw e.create($$2);
      } else {
         return $$4;
      }
   }

   public static aex e(CommandContext<dt> $$0, String $$1) {
      return (aex)$$0.getArgument($$1, aex.class);
   }

   public aex a(StringReader $$0) throws CommandSyntaxException {
      return aex.a($$0);
   }

   public Collection<String> getExamples() {
      return a;
   }
}
