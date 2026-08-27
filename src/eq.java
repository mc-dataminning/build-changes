import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import java.util.Arrays;
import java.util.Collection;

public class eq implements ArgumentType<aer> {
   private static final Collection<String> a = Arrays.asList("foo", "foo:bar", "012");
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> tf.a("advancement.advancementNotFound", $$0));
   private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> tf.a("recipe.notFound", $$0));
   private static final DynamicCommandExceptionType d = new DynamicCommandExceptionType($$0 -> tf.a("predicate.unknown", $$0));
   private static final DynamicCommandExceptionType e = new DynamicCommandExceptionType($$0 -> tf.a("item_modifier.unknown", $$0));

   public static eq a() {
      return new eq();
   }

   public static ae a(CommandContext<dr> $$0, String $$1) throws CommandSyntaxException {
      aer $$2 = e($$0, $$1);
      ae $$3 = ((dr)$$0.getSource()).l().az().a($$2);
      if ($$3 == null) {
         throw b.create($$2);
      } else {
         return $$3;
      }
   }

   public static cmb<?> b(CommandContext<dr> $$0, String $$1) throws CommandSyntaxException {
      cmc $$2 = ((dr)$$0.getSource()).l().aE();
      aer $$3 = e($$0, $$1);
      return (cmb<?>)$$2.a($$3).orElseThrow(() -> c.create($$3));
   }

   public static efg c(CommandContext<dr> $$0, String $$1) throws CommandSyntaxException {
      aer $$2 = e($$0, $$1);
      eck $$3 = ((dr)$$0.getSource()).l().aH();
      efg $$4 = $$3.getElement(ecm.a, $$2);
      if ($$4 == null) {
         throw d.create($$2);
      } else {
         return $$4;
      }
   }

   public static edu d(CommandContext<dr> $$0, String $$1) throws CommandSyntaxException {
      aer $$2 = e($$0, $$1);
      eck $$3 = ((dr)$$0.getSource()).l().aH();
      edu $$4 = $$3.getElement(ecm.b, $$2);
      if ($$4 == null) {
         throw e.create($$2);
      } else {
         return $$4;
      }
   }

   public static aer e(CommandContext<dr> $$0, String $$1) {
      return (aer)$$0.getArgument($$1, aer.class);
   }

   public aer a(StringReader $$0) throws CommandSyntaxException {
      return aer.a($$0);
   }

   public Collection<String> getExamples() {
      return a;
   }
}
