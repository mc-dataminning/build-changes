import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import java.util.Arrays;
import java.util.Collection;

public class eu implements ArgumentType<agi> {
   private static final Collection<String> a = Arrays.asList("foo", "foo:bar", "012");
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> ur.b("advancement.advancementNotFound", $$0));
   private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> ur.b("recipe.notFound", $$0));
   private static final DynamicCommandExceptionType d = new DynamicCommandExceptionType($$0 -> ur.b("predicate.unknown", $$0));
   private static final DynamicCommandExceptionType e = new DynamicCommandExceptionType($$0 -> ur.b("item_modifier.unknown", $$0));

   public static eu a() {
      return new eu();
   }

   public static af a(CommandContext<du> $$0, String $$1) throws CommandSyntaxException {
      agi $$2 = e($$0, $$1);
      af $$3 = ((du)$$0.getSource()).m().aB().a($$2);
      if ($$3 == null) {
         throw b.create($$2);
      } else {
         return $$3;
      }
   }

   public static coq<?> b(CommandContext<du> $$0, String $$1) throws CommandSyntaxException {
      cor $$2 = ((du)$$0.getSource()).m().aG();
      agi $$3 = e($$0, $$1);
      return $$2.a($$3).orElseThrow(() -> c.create($$3));
   }

   public static ehw c(CommandContext<du> $$0, String $$1) throws CommandSyntaxException {
      agi $$2 = e($$0, $$1);
      efa $$3 = ((du)$$0.getSource()).m().aJ();
      ehw $$4 = $$3.getElement(efc.a, $$2);
      if ($$4 == null) {
         throw d.create($$2);
      } else {
         return $$4;
      }
   }

   public static egk d(CommandContext<du> $$0, String $$1) throws CommandSyntaxException {
      agi $$2 = e($$0, $$1);
      efa $$3 = ((du)$$0.getSource()).m().aJ();
      egk $$4 = $$3.getElement(efc.b, $$2);
      if ($$4 == null) {
         throw e.create($$2);
      } else {
         return $$4;
      }
   }

   public static agi e(CommandContext<du> $$0, String $$1) {
      return (agi)$$0.getArgument($$1, agi.class);
   }

   public agi a(StringReader $$0) throws CommandSyntaxException {
      return agi.a($$0);
   }

   public Collection<String> getExamples() {
      return a;
   }
}
