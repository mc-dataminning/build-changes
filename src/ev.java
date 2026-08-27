import com.google.common.collect.Lists;
import com.google.gson.JsonObject;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.suggestion.SuggestionProvider;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.function.Supplier;

public class ev implements ArgumentType<ev.b> {
   public static final SuggestionProvider<dt> a = ($$0, $$1) -> {
      StringReader $$2 = new StringReader($$1.getInput());
      $$2.setCursor($$1.getStart());
      gd $$3 = new gd($$2);

      try {
         $$3.t();
      } catch (CommandSyntaxException var5) {
      }

      return $$3.a($$1, $$1x -> dw.b(((dt)$$0.getSource()).q(), $$1x));
   };
   private static final Collection<String> b = Arrays.asList("Player", "0123", "*", "@e");
   private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(ti.c("argument.scoreHolder.empty"));
   final boolean d;

   public ev(boolean $$0) {
      this.d = $$0;
   }

   public static String a(CommandContext<dt> $$0, String $$1) throws CommandSyntaxException {
      return b($$0, $$1).iterator().next();
   }

   public static Collection<String> b(CommandContext<dt> $$0, String $$1) throws CommandSyntaxException {
      return a($$0, $$1, Collections::emptyList);
   }

   public static Collection<String> c(CommandContext<dt> $$0, String $$1) throws CommandSyntaxException {
      return a($$0, $$1, ((dt)$$0.getSource()).l().aF()::e);
   }

   public static Collection<String> a(CommandContext<dt> $$0, String $$1, Supplier<Collection<String>> $$2) throws CommandSyntaxException {
      Collection<String> $$3 = ((ev.b)$$0.getArgument($$1, ev.b.class)).getNames((dt)$$0.getSource(), $$2);
      if ($$3.isEmpty()) {
         throw ee.d.create();
      } else {
         return $$3;
      }
   }

   public static ev a() {
      return new ev(false);
   }

   public static ev b() {
      return new ev(true);
   }

   public ev.b a(StringReader $$0) throws CommandSyntaxException {
      if ($$0.canRead() && $$0.peek() == '@') {
         gd $$1 = new gd($$0);
         gc $$2 = $$1.t();
         if (!this.d && $$2.a() > 1) {
            throw ee.a.create();
         } else {
            return new ev.c($$2);
         }
      } else {
         int $$3 = $$0.getCursor();

         while ($$0.canRead() && $$0.peek() != ' ') {
            $$0.skip();
         }

         String $$4 = $$0.getString().substring($$3, $$0.getCursor());
         if ($$4.equals("*")) {
            return ($$0x, $$1) -> {
               Collection<String> $$2 = $$1.get();
               if ($$2.isEmpty()) {
                  throw c.create();
               } else {
                  return $$2;
               }
            };
         } else {
            Collection<String> $$5 = Collections.singleton($$4);
            return ($$1, $$2) -> $$5;
         }
      }
   }

   public Collection<String> getExamples() {
      return b;
   }

   public static class a implements gi<ev, ev.a.a> {
      private static final byte a = 1;

      public void a(ev.a.a $$0, sl $$1) {
         int $$2 = 0;
         if ($$0.b) {
            $$2 |= 1;
         }

         $$1.k($$2);
      }

      public ev.a.a a(sl $$0) {
         byte $$1 = $$0.readByte();
         boolean $$2 = ($$1 & 1) != 0;
         return new ev.a.a($$2);
      }

      public void a(ev.a.a $$0, JsonObject $$1) {
         $$1.addProperty("amount", $$0.b ? "multiple" : "single");
      }

      public ev.a.a a(ev $$0) {
         return new ev.a.a($$0.d);
      }

      public final class a implements gi.a<ev> {
         final boolean b;

         a(boolean $$1) {
            this.b = $$1;
         }

         public ev a(dn $$0) {
            return new ev(this.b);
         }

         @Override
         public gi<ev, ?> a() {
            return a.this;
         }
      }
   }

   @FunctionalInterface
   public interface b {
      Collection<String> getNames(dt var1, Supplier<Collection<String>> var2) throws CommandSyntaxException;
   }

   public static class c implements ev.b {
      private final gc a;

      public c(gc $$0) {
         this.a = $$0;
      }

      @Override
      public Collection<String> getNames(dt $$0, Supplier<Collection<String>> $$1) throws CommandSyntaxException {
         List<? extends bil> $$2 = this.a.b($$0);
         if ($$2.isEmpty()) {
            throw ee.d.create();
         } else {
            List<String> $$3 = Lists.newArrayList();

            for (bil $$4 : $$2) {
               $$3.add($$4.cx());
            }

            return $$3;
         }
      }
   }
}
