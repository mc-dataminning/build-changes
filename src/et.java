import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import java.util.Arrays;
import java.util.Collection;

public class et implements ArgumentType<ahd> {
   private static final Collection<String> a = Arrays.asList("foo", "foo:bar", "012");
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> vd.b("advancement.advancementNotFound", $$0));
   private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> vd.b("recipe.notFound", $$0));
   private static final DynamicCommandExceptionType d = new DynamicCommandExceptionType($$0 -> vd.b("predicate.unknown", $$0));
   private static final DynamicCommandExceptionType e = new DynamicCommandExceptionType($$0 -> vd.b("item_modifier.unknown", $$0));

   public static et a() {
      return new et();
   }

   public static af a(CommandContext<ds> $$0, String $$1) throws CommandSyntaxException {
      ahd $$2 = e($$0, $$1);
      af $$3 = ((ds)$$0.getSource()).l().aB().a($$2);
      if ($$3 == null) {
         throw b.create($$2);
      } else {
         return $$3;
      }
   }

   public static cpx<?> b(CommandContext<ds> $$0, String $$1) throws CommandSyntaxException {
      cpy $$2 = ((ds)$$0.getSource()).l().aG();
      ahd $$3 = e($$0, $$1);
      return $$2.a($$3).orElseThrow(() -> c.create($$3));
   }

   public static ejo c(CommandContext<ds> $$0, String $$1) throws CommandSyntaxException {
      ahd $$2 = e($$0, $$1);
      egs $$3 = ((ds)$$0.getSource()).l().aJ();
      ejo $$4 = $$3.getElement(egu.a, $$2);
      if ($$4 == null) {
         throw d.create($$2);
      } else {
         return $$4;
      }
   }

   public static eic d(CommandContext<ds> $$0, String $$1) throws CommandSyntaxException {
      ahd $$2 = e($$0, $$1);
      egs $$3 = ((ds)$$0.getSource()).l().aJ();
      eic $$4 = $$3.getElement(egu.b, $$2);
      if ($$4 == null) {
         throw e.create($$2);
      } else {
         return $$4;
      }
   }

   public static ahd e(CommandContext<ds> $$0, String $$1) {
      return (ahd)$$0.getArgument($$1, ahd.class);
   }

   public ahd a(StringReader $$0) throws CommandSyntaxException {
      return ahd.a($$0);
   }

   public Collection<String> getExamples() {
      return a;
   }
}
