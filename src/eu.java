import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import java.util.Arrays;
import java.util.Collection;

public class eu implements ArgumentType<agm> {
   private static final Collection<String> a = Arrays.asList("foo", "foo:bar", "012");
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> uv.b("advancement.advancementNotFound", $$0));
   private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> uv.b("recipe.notFound", $$0));
   private static final DynamicCommandExceptionType d = new DynamicCommandExceptionType($$0 -> uv.b("predicate.unknown", $$0));
   private static final DynamicCommandExceptionType e = new DynamicCommandExceptionType($$0 -> uv.b("item_modifier.unknown", $$0));

   public static eu a() {
      return new eu();
   }

   public static af a(CommandContext<du> $$0, String $$1) throws CommandSyntaxException {
      agm $$2 = e($$0, $$1);
      af $$3 = ((du)$$0.getSource()).l().aB().a($$2);
      if ($$3 == null) {
         throw b.create($$2);
      } else {
         return $$3;
      }
   }

   public static cov<?> b(CommandContext<du> $$0, String $$1) throws CommandSyntaxException {
      cow $$2 = ((du)$$0.getSource()).l().aG();
      agm $$3 = e($$0, $$1);
      return $$2.a($$3).orElseThrow(() -> c.create($$3));
   }

   public static eib c(CommandContext<du> $$0, String $$1) throws CommandSyntaxException {
      agm $$2 = e($$0, $$1);
      eff $$3 = ((du)$$0.getSource()).l().aJ();
      eib $$4 = $$3.getElement(efh.a, $$2);
      if ($$4 == null) {
         throw d.create($$2);
      } else {
         return $$4;
      }
   }

   public static egp d(CommandContext<du> $$0, String $$1) throws CommandSyntaxException {
      agm $$2 = e($$0, $$1);
      eff $$3 = ((du)$$0.getSource()).l().aJ();
      egp $$4 = $$3.getElement(efh.b, $$2);
      if ($$4 == null) {
         throw e.create($$2);
      } else {
         return $$4;
      }
   }

   public static agm e(CommandContext<du> $$0, String $$1) {
      return (agm)$$0.getArgument($$1, agm.class);
   }

   public agm a(StringReader $$0) throws CommandSyntaxException {
      return agm.a($$0);
   }

   public Collection<String> getExamples() {
      return a;
   }
}
