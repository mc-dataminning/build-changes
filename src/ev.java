import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import java.util.Arrays;
import java.util.Collection;

public class ev implements ArgumentType<aiy> {
   private static final Collection<String> a = Arrays.asList("foo", "foo:bar", "012");
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> vq.b("advancement.advancementNotFound", $$0));
   private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> vq.b("recipe.notFound", $$0));
   private static final DynamicCommandExceptionType d = new DynamicCommandExceptionType($$0 -> vq.b("predicate.unknown", $$0));
   private static final DynamicCommandExceptionType e = new DynamicCommandExceptionType($$0 -> vq.b("item_modifier.unknown", $$0));

   public static ev a() {
      return new ev();
   }

   public static af a(CommandContext<du> $$0, String $$1) throws CommandSyntaxException {
      aiy $$2 = e($$0, $$1);
      af $$3 = ((du)$$0.getSource()).l().aD().a($$2);
      if ($$3 == null) {
         throw b.create($$2);
      } else {
         return $$3;
      }
   }

   public static csh<?> b(CommandContext<du> $$0, String $$1) throws CommandSyntaxException {
      csi $$2 = ((du)$$0.getSource()).l().aI();
      aiy $$3 = e($$0, $$1);
      return $$2.a($$3).orElseThrow(() -> c.create($$3));
   }

   public static emb c(CommandContext<du> $$0, String $$1) throws CommandSyntaxException {
      aiy $$2 = e($$0, $$1);
      ejf $$3 = ((du)$$0.getSource()).l().aL();
      emb $$4 = $$3.getElement(ejh.a, $$2);
      if ($$4 == null) {
         throw d.create($$2);
      } else {
         return $$4;
      }
   }

   public static ekp d(CommandContext<du> $$0, String $$1) throws CommandSyntaxException {
      aiy $$2 = e($$0, $$1);
      ejf $$3 = ((du)$$0.getSource()).l().aL();
      ekp $$4 = $$3.getElement(ejh.b, $$2);
      if ($$4 == null) {
         throw e.create($$2);
      } else {
         return $$4;
      }
   }

   public static aiy e(CommandContext<du> $$0, String $$1) {
      return (aiy)$$0.getArgument($$1, aiy.class);
   }

   public aiy a(StringReader $$0) throws CommandSyntaxException {
      return aiy.a($$0);
   }

   public Collection<String> getExamples() {
      return a;
   }
}
