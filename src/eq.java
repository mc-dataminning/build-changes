import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import java.util.Arrays;
import java.util.Collection;

public class eq implements ArgumentType<acq> {
   private static final Collection<String> a = Arrays.asList("foo", "foo:bar", "012");
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> sw.a("advancement.advancementNotFound", $$0));
   private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> sw.a("recipe.notFound", $$0));
   private static final DynamicCommandExceptionType d = new DynamicCommandExceptionType($$0 -> sw.a("predicate.unknown", $$0));
   private static final DynamicCommandExceptionType e = new DynamicCommandExceptionType($$0 -> sw.a("item_modifier.unknown", $$0));

   public static eq a() {
      return new eq();
   }

   public static ae a(CommandContext<ds> $$0, String $$1) throws CommandSyntaxException {
      acq $$2 = e($$0, $$1);
      ae $$3 = ((ds)$$0.getSource()).l().az().a($$2);
      if ($$3 == null) {
         throw b.create($$2);
      } else {
         return $$3;
      }
   }

   public static cjc<?> b(CommandContext<ds> $$0, String $$1) throws CommandSyntaxException {
      cjd $$2 = ((ds)$$0.getSource()).l().aE();
      acq $$3 = e($$0, $$1);
      return (cjc<?>)$$2.a($$3).orElseThrow(() -> c.create($$3));
   }

   public static eck c(CommandContext<ds> $$0, String $$1) throws CommandSyntaxException {
      acq $$2 = e($$0, $$1);
      dzn $$3 = ((ds)$$0.getSource()).l().aH();
      eck $$4 = $$3.getElement(dzp.a, $$2);
      if ($$4 == null) {
         throw d.create($$2);
      } else {
         return $$4;
      }
   }

   public static eaz d(CommandContext<ds> $$0, String $$1) throws CommandSyntaxException {
      acq $$2 = e($$0, $$1);
      dzn $$3 = ((ds)$$0.getSource()).l().aH();
      eaz $$4 = $$3.getElement(dzp.b, $$2);
      if ($$4 == null) {
         throw e.create($$2);
      } else {
         return $$4;
      }
   }

   public static acq e(CommandContext<ds> $$0, String $$1) {
      return (acq)$$0.getArgument($$1, acq.class);
   }

   public acq a(StringReader $$0) throws CommandSyntaxException {
      return acq.a($$0);
   }

   public Collection<String> getExamples() {
      return a;
   }
}
