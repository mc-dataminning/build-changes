import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import java.util.Arrays;
import java.util.Collection;

public class es implements ArgumentType<agt> {
   private static final Collection<String> a = Arrays.asList("foo", "foo:bar", "012");
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> vb.b("advancement.advancementNotFound", $$0));
   private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> vb.b("recipe.notFound", $$0));
   private static final DynamicCommandExceptionType d = new DynamicCommandExceptionType($$0 -> vb.b("predicate.unknown", $$0));
   private static final DynamicCommandExceptionType e = new DynamicCommandExceptionType($$0 -> vb.b("item_modifier.unknown", $$0));

   public static es a() {
      return new es();
   }

   public static af a(CommandContext<ds> $$0, String $$1) throws CommandSyntaxException {
      agt $$2 = e($$0, $$1);
      af $$3 = ((ds)$$0.getSource()).l().aB().a($$2);
      if ($$3 == null) {
         throw b.create($$2);
      } else {
         return $$3;
      }
   }

   public static cpn<?> b(CommandContext<ds> $$0, String $$1) throws CommandSyntaxException {
      cpo $$2 = ((ds)$$0.getSource()).l().aG();
      agt $$3 = e($$0, $$1);
      return $$2.a($$3).orElseThrow(() -> c.create($$3));
   }

   public static ejd c(CommandContext<ds> $$0, String $$1) throws CommandSyntaxException {
      agt $$2 = e($$0, $$1);
      egh $$3 = ((ds)$$0.getSource()).l().aJ();
      ejd $$4 = $$3.getElement(egj.a, $$2);
      if ($$4 == null) {
         throw d.create($$2);
      } else {
         return $$4;
      }
   }

   public static ehr d(CommandContext<ds> $$0, String $$1) throws CommandSyntaxException {
      agt $$2 = e($$0, $$1);
      egh $$3 = ((ds)$$0.getSource()).l().aJ();
      ehr $$4 = $$3.getElement(egj.b, $$2);
      if ($$4 == null) {
         throw e.create($$2);
      } else {
         return $$4;
      }
   }

   public static agt e(CommandContext<ds> $$0, String $$1) {
      return (agt)$$0.getArgument($$1, agt.class);
   }

   public agt a(StringReader $$0) throws CommandSyntaxException {
      return agt.a($$0);
   }

   public Collection<String> getExamples() {
      return a;
   }
}
