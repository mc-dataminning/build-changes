import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import java.util.Arrays;
import java.util.Collection;

public class ev implements ArgumentType<ajc> {
   private static final Collection<String> a = Arrays.asList("foo", "foo:bar", "012");
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> vs.b("advancement.advancementNotFound", $$0));
   private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> vs.b("recipe.notFound", $$0));
   private static final DynamicCommandExceptionType d = new DynamicCommandExceptionType($$0 -> vs.b("predicate.unknown", $$0));
   private static final DynamicCommandExceptionType e = new DynamicCommandExceptionType($$0 -> vs.b("item_modifier.unknown", $$0));

   public static ev a() {
      return new ev();
   }

   public static af a(CommandContext<du> $$0, String $$1) throws CommandSyntaxException {
      ajc $$2 = e($$0, $$1);
      af $$3 = ((du)$$0.getSource()).l().aE().a($$2);
      if ($$3 == null) {
         throw b.create($$2);
      } else {
         return $$3;
      }
   }

   public static csu<?> b(CommandContext<du> $$0, String $$1) throws CommandSyntaxException {
      csv $$2 = ((du)$$0.getSource()).l().aJ();
      ajc $$3 = e($$0, $$1);
      return $$2.a($$3).orElseThrow(() -> c.create($$3));
   }

   public static emx c(CommandContext<du> $$0, String $$1) throws CommandSyntaxException {
      ajc $$2 = e($$0, $$1);
      ekb $$3 = ((du)$$0.getSource()).l().aM();
      emx $$4 = $$3.getElement(ekd.a, $$2);
      if ($$4 == null) {
         throw d.create($$2);
      } else {
         return $$4;
      }
   }

   public static ell d(CommandContext<du> $$0, String $$1) throws CommandSyntaxException {
      ajc $$2 = e($$0, $$1);
      ekb $$3 = ((du)$$0.getSource()).l().aM();
      ell $$4 = $$3.getElement(ekd.b, $$2);
      if ($$4 == null) {
         throw e.create($$2);
      } else {
         return $$4;
      }
   }

   public static ajc e(CommandContext<du> $$0, String $$1) {
      return (ajc)$$0.getArgument($$1, ajc.class);
   }

   public ajc a(StringReader $$0) throws CommandSyntaxException {
      return ajc.a($$0);
   }

   public Collection<String> getExamples() {
      return a;
   }
}
