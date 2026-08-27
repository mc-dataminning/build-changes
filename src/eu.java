import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import java.util.Arrays;
import java.util.Collection;

public class eu implements ArgumentType<afw> {
   private static final Collection<String> a = Arrays.asList("foo", "foo:bar", "012");
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> ui.b("advancement.advancementNotFound", $$0));
   private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> ui.b("recipe.notFound", $$0));
   private static final DynamicCommandExceptionType d = new DynamicCommandExceptionType($$0 -> ui.b("predicate.unknown", $$0));
   private static final DynamicCommandExceptionType e = new DynamicCommandExceptionType($$0 -> ui.b("item_modifier.unknown", $$0));

   public static eu a() {
      return new eu();
   }

   public static af a(CommandContext<du> $$0, String $$1) throws CommandSyntaxException {
      afw $$2 = e($$0, $$1);
      af $$3 = ((du)$$0.getSource()).m().az().a($$2);
      if ($$3 == null) {
         throw b.create($$2);
      } else {
         return $$3;
      }
   }

   public static cno<?> b(CommandContext<du> $$0, String $$1) throws CommandSyntaxException {
      cnp $$2 = ((du)$$0.getSource()).m().aE();
      afw $$3 = e($$0, $$1);
      return $$2.a($$3).orElseThrow(() -> c.create($$3));
   }

   public static egh c(CommandContext<du> $$0, String $$1) throws CommandSyntaxException {
      afw $$2 = e($$0, $$1);
      edl $$3 = ((du)$$0.getSource()).m().aH();
      egh $$4 = $$3.getElement(edn.a, $$2);
      if ($$4 == null) {
         throw d.create($$2);
      } else {
         return $$4;
      }
   }

   public static eev d(CommandContext<du> $$0, String $$1) throws CommandSyntaxException {
      afw $$2 = e($$0, $$1);
      edl $$3 = ((du)$$0.getSource()).m().aH();
      eev $$4 = $$3.getElement(edn.b, $$2);
      if ($$4 == null) {
         throw e.create($$2);
      } else {
         return $$4;
      }
   }

   public static afw e(CommandContext<du> $$0, String $$1) {
      return (afw)$$0.getArgument($$1, afw.class);
   }

   public afw a(StringReader $$0) throws CommandSyntaxException {
      return afw.a($$0);
   }

   public Collection<String> getExamples() {
      return a;
   }
}
