import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import java.util.Arrays;
import java.util.Collection;

public class ew implements ArgumentType<ajv> {
   private static final Collection<String> a = Arrays.asList("foo", "foo:bar", "012");
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> wi.b("advancement.advancementNotFound", $$0));
   private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> wi.b("recipe.notFound", $$0));
   private static final DynamicCommandExceptionType d = new DynamicCommandExceptionType($$0 -> wi.b("predicate.unknown", $$0));
   private static final DynamicCommandExceptionType e = new DynamicCommandExceptionType($$0 -> wi.b("item_modifier.unknown", $$0));

   public static ew a() {
      return new ew();
   }

   public static af a(CommandContext<dv> $$0, String $$1) throws CommandSyntaxException {
      ajv $$2 = e($$0, $$1);
      af $$3 = ((dv)$$0.getSource()).l().aE().a($$2);
      if ($$3 == null) {
         throw b.create($$2);
      } else {
         return $$3;
      }
   }

   public static cvu<?> b(CommandContext<dv> $$0, String $$1) throws CommandSyntaxException {
      cvv $$2 = ((dv)$$0.getSource()).l().aJ();
      ajv $$3 = e($$0, $$1);
      return $$2.a($$3).orElseThrow(() -> c.create($$3));
   }

   public static eql c(CommandContext<dv> $$0, String $$1) throws CommandSyntaxException {
      ajv $$2 = e($$0, $$1);
      enn $$3 = ((dv)$$0.getSource()).l().aM();
      eql $$4 = $$3.getElement(enp.a, $$2);
      if ($$4 == null) {
         throw d.create($$2);
      } else {
         return $$4;
      }
   }

   public static eoy d(CommandContext<dv> $$0, String $$1) throws CommandSyntaxException {
      ajv $$2 = e($$0, $$1);
      enn $$3 = ((dv)$$0.getSource()).l().aM();
      eoy $$4 = $$3.getElement(enp.b, $$2);
      if ($$4 == null) {
         throw e.create($$2);
      } else {
         return $$4;
      }
   }

   public static ajv e(CommandContext<dv> $$0, String $$1) {
      return (ajv)$$0.getArgument($$1, ajv.class);
   }

   public ajv a(StringReader $$0) throws CommandSyntaxException {
      return ajv.a($$0);
   }

   public Collection<String> getExamples() {
      return a;
   }
}
