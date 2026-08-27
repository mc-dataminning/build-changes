import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import java.util.Arrays;
import java.util.Collection;

public class ev implements ArgumentType<ajh> {
   private static final Collection<String> a = Arrays.asList("foo", "foo:bar", "012");
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> vu.b("advancement.advancementNotFound", $$0));
   private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> vu.b("recipe.notFound", $$0));
   private static final DynamicCommandExceptionType d = new DynamicCommandExceptionType($$0 -> vu.b("predicate.unknown", $$0));
   private static final DynamicCommandExceptionType e = new DynamicCommandExceptionType($$0 -> vu.b("item_modifier.unknown", $$0));

   public static ev a() {
      return new ev();
   }

   public static af a(CommandContext<du> $$0, String $$1) throws CommandSyntaxException {
      ajh $$2 = e($$0, $$1);
      af $$3 = ((du)$$0.getSource()).l().aE().a($$2);
      if ($$3 == null) {
         throw b.create($$2);
      } else {
         return $$3;
      }
   }

   public static ctp<?> b(CommandContext<du> $$0, String $$1) throws CommandSyntaxException {
      ctq $$2 = ((du)$$0.getSource()).l().aJ();
      ajh $$3 = e($$0, $$1);
      return $$2.a($$3).orElseThrow(() -> c.create($$3));
   }

   public static ent c(CommandContext<du> $$0, String $$1) throws CommandSyntaxException {
      ajh $$2 = e($$0, $$1);
      ekx $$3 = ((du)$$0.getSource()).l().aM();
      ent $$4 = $$3.getElement(ekz.a, $$2);
      if ($$4 == null) {
         throw d.create($$2);
      } else {
         return $$4;
      }
   }

   public static emh d(CommandContext<du> $$0, String $$1) throws CommandSyntaxException {
      ajh $$2 = e($$0, $$1);
      ekx $$3 = ((du)$$0.getSource()).l().aM();
      emh $$4 = $$3.getElement(ekz.b, $$2);
      if ($$4 == null) {
         throw e.create($$2);
      } else {
         return $$4;
      }
   }

   public static ajh e(CommandContext<du> $$0, String $$1) {
      return (ajh)$$0.getArgument($$1, ajh.class);
   }

   public ajh a(StringReader $$0) throws CommandSyntaxException {
      return ajh.a($$0);
   }

   public Collection<String> getExamples() {
      return a;
   }
}
