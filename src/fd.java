import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import java.util.Arrays;
import java.util.Collection;

public class fd implements ArgumentType<akf> {
   private static final Collection<String> a = Arrays.asList("foo", "foo:bar", "012");
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> ws.b("advancement.advancementNotFound", $$0));
   private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> ws.b("recipe.notFound", $$0));
   private static final DynamicCommandExceptionType d = new DynamicCommandExceptionType($$0 -> ws.b("predicate.unknown", $$0));
   private static final DynamicCommandExceptionType e = new DynamicCommandExceptionType($$0 -> ws.b("item_modifier.unknown", $$0));

   public static fd a() {
      return new fd();
   }

   public static af a(CommandContext<ec> $$0, String $$1) throws CommandSyntaxException {
      akf $$2 = e($$0, $$1);
      af $$3 = ((ec)$$0.getSource()).l().aE().a($$2);
      if ($$3 == null) {
         throw b.create($$2);
      } else {
         return $$3;
      }
   }

   public static cwi<?> b(CommandContext<ec> $$0, String $$1) throws CommandSyntaxException {
      cwj $$2 = ((ec)$$0.getSource()).l().aJ();
      akf $$3 = e($$0, $$1);
      return $$2.a($$3).orElseThrow(() -> c.create($$3));
   }

   public static erh c(CommandContext<ec> $$0, String $$1) throws CommandSyntaxException {
      akf $$2 = e($$0, $$1);
      eod $$3 = ((ec)$$0.getSource()).l().aM();
      erh $$4 = $$3.getElement(eof.a, $$2);
      if ($$4 == null) {
         throw d.create($$2);
      } else {
         return $$4;
      }
   }

   public static epp d(CommandContext<ec> $$0, String $$1) throws CommandSyntaxException {
      akf $$2 = e($$0, $$1);
      eod $$3 = ((ec)$$0.getSource()).l().aM();
      epp $$4 = $$3.getElement(eof.b, $$2);
      if ($$4 == null) {
         throw e.create($$2);
      } else {
         return $$4;
      }
   }

   public static akf e(CommandContext<ec> $$0, String $$1) {
      return (akf)$$0.getArgument($$1, akf.class);
   }

   public akf a(StringReader $$0) throws CommandSyntaxException {
      return akf.a($$0);
   }

   public Collection<String> getExamples() {
      return a;
   }
}
