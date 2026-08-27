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
      af $$3 = ((du)$$0.getSource()).l().aB().a($$2);
      if ($$3 == null) {
         throw b.create($$2);
      } else {
         return $$3;
      }
   }

   public static csd<?> b(CommandContext<du> $$0, String $$1) throws CommandSyntaxException {
      cse $$2 = ((du)$$0.getSource()).l().aG();
      aiy $$3 = e($$0, $$1);
      return $$2.a($$3).orElseThrow(() -> c.create($$3));
   }

   public static elu c(CommandContext<du> $$0, String $$1) throws CommandSyntaxException {
      aiy $$2 = e($$0, $$1);
      eiy $$3 = ((du)$$0.getSource()).l().aJ();
      elu $$4 = $$3.getElement(eja.a, $$2);
      if ($$4 == null) {
         throw d.create($$2);
      } else {
         return $$4;
      }
   }

   public static eki d(CommandContext<du> $$0, String $$1) throws CommandSyntaxException {
      aiy $$2 = e($$0, $$1);
      eiy $$3 = ((du)$$0.getSource()).l().aJ();
      eki $$4 = $$3.getElement(eja.b, $$2);
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
