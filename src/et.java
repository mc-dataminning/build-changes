import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import java.util.Arrays;
import java.util.Collection;

public class et implements ArgumentType<ahg> {
   private static final Collection<String> a = Arrays.asList("foo", "foo:bar", "012");
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> vf.b("advancement.advancementNotFound", $$0));
   private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> vf.b("recipe.notFound", $$0));
   private static final DynamicCommandExceptionType d = new DynamicCommandExceptionType($$0 -> vf.b("predicate.unknown", $$0));
   private static final DynamicCommandExceptionType e = new DynamicCommandExceptionType($$0 -> vf.b("item_modifier.unknown", $$0));

   public static et a() {
      return new et();
   }

   public static af a(CommandContext<ds> $$0, String $$1) throws CommandSyntaxException {
      ahg $$2 = e($$0, $$1);
      af $$3 = ((ds)$$0.getSource()).l().aB().a($$2);
      if ($$3 == null) {
         throw b.create($$2);
      } else {
         return $$3;
      }
   }

   public static cqe<?> b(CommandContext<ds> $$0, String $$1) throws CommandSyntaxException {
      cqf $$2 = ((ds)$$0.getSource()).l().aG();
      ahg $$3 = e($$0, $$1);
      return $$2.a($$3).orElseThrow(() -> c.create($$3));
   }

   public static ejv c(CommandContext<ds> $$0, String $$1) throws CommandSyntaxException {
      ahg $$2 = e($$0, $$1);
      egz $$3 = ((ds)$$0.getSource()).l().aJ();
      ejv $$4 = $$3.getElement(ehb.a, $$2);
      if ($$4 == null) {
         throw d.create($$2);
      } else {
         return $$4;
      }
   }

   public static eij d(CommandContext<ds> $$0, String $$1) throws CommandSyntaxException {
      ahg $$2 = e($$0, $$1);
      egz $$3 = ((ds)$$0.getSource()).l().aJ();
      eij $$4 = $$3.getElement(ehb.b, $$2);
      if ($$4 == null) {
         throw e.create($$2);
      } else {
         return $$4;
      }
   }

   public static ahg e(CommandContext<ds> $$0, String $$1) {
      return (ahg)$$0.getArgument($$1, ahg.class);
   }

   public ahg a(StringReader $$0) throws CommandSyntaxException {
      return ahg.a($$0);
   }

   public Collection<String> getExamples() {
      return a;
   }
}
