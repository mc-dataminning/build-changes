import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import java.util.Arrays;
import java.util.Collection;

public class eu implements ArgumentType<agg> {
   private static final Collection<String> a = Arrays.asList("foo", "foo:bar", "012");
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> ur.b("advancement.advancementNotFound", $$0));
   private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> ur.b("recipe.notFound", $$0));
   private static final DynamicCommandExceptionType d = new DynamicCommandExceptionType($$0 -> ur.b("predicate.unknown", $$0));
   private static final DynamicCommandExceptionType e = new DynamicCommandExceptionType($$0 -> ur.b("item_modifier.unknown", $$0));

   public static eu a() {
      return new eu();
   }

   public static af a(CommandContext<du> $$0, String $$1) throws CommandSyntaxException {
      agg $$2 = e($$0, $$1);
      af $$3 = ((du)$$0.getSource()).m().az().a($$2);
      if ($$3 == null) {
         throw b.create($$2);
      } else {
         return $$3;
      }
   }

   public static coh<?> b(CommandContext<du> $$0, String $$1) throws CommandSyntaxException {
      coi $$2 = ((du)$$0.getSource()).m().aE();
      agg $$3 = e($$0, $$1);
      return $$2.a($$3).orElseThrow(() -> c.create($$3));
   }

   public static ehk c(CommandContext<du> $$0, String $$1) throws CommandSyntaxException {
      agg $$2 = e($$0, $$1);
      eeo $$3 = ((du)$$0.getSource()).m().aH();
      ehk $$4 = $$3.getElement(eeq.a, $$2);
      if ($$4 == null) {
         throw d.create($$2);
      } else {
         return $$4;
      }
   }

   public static efy d(CommandContext<du> $$0, String $$1) throws CommandSyntaxException {
      agg $$2 = e($$0, $$1);
      eeo $$3 = ((du)$$0.getSource()).m().aH();
      efy $$4 = $$3.getElement(eeq.b, $$2);
      if ($$4 == null) {
         throw e.create($$2);
      } else {
         return $$4;
      }
   }

   public static agg e(CommandContext<du> $$0, String $$1) {
      return (agg)$$0.getArgument($$1, agg.class);
   }

   public agg a(StringReader $$0) throws CommandSyntaxException {
      return agg.a($$0);
   }

   public Collection<String> getExamples() {
      return a;
   }
}
