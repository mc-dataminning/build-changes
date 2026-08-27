import com.google.gson.JsonObject;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.suggestion.SuggestionProvider;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import java.util.function.Supplier;
import net.minecraft.server.MinecraftServer;

public class ew implements ArgumentType<ew.b> {
   public static final SuggestionProvider<ds> a = ($$0, $$1) -> {
      StringReader $$2 = new StringReader($$1.getInput());
      $$2.setCursor($$1.getStart());
      gf $$3 = new gf($$2);

      try {
         $$3.t();
      } catch (CommandSyntaxException var5) {
      }

      return $$3.a($$1, $$1x -> dx.b(((ds)$$0.getSource()).q(), $$1x));
   };
   private static final Collection<String> b = Arrays.asList("Player", "0123", "*", "@e");
   private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(vf.c("argument.scoreHolder.empty"));
   final boolean d;

   public ew(boolean $$0) {
      this.d = $$0;
   }

   public static emv a(CommandContext<ds> $$0, String $$1) throws CommandSyntaxException {
      return b($$0, $$1).iterator().next();
   }

   public static Collection<emv> b(CommandContext<ds> $$0, String $$1) throws CommandSyntaxException {
      return a($$0, $$1, Collections::emptyList);
   }

   public static Collection<emv> c(CommandContext<ds> $$0, String $$1) throws CommandSyntaxException {
      return a($$0, $$1, ((ds)$$0.getSource()).l().aH()::e);
   }

   public static Collection<emv> a(CommandContext<ds> $$0, String $$1, Supplier<Collection<emv>> $$2) throws CommandSyntaxException {
      Collection<emv> $$3 = ((ew.b)$$0.getArgument($$1, ew.b.class)).getNames((ds)$$0.getSource(), $$2);
      if ($$3.isEmpty()) {
         throw ef.d.create();
      } else {
         return $$3;
      }
   }

   public static ew a() {
      return new ew(false);
   }

   public static ew b() {
      return new ew(true);
   }

   public ew.b a(StringReader $$0) throws CommandSyntaxException {
      if ($$0.canRead() && $$0.peek() == '@') {
         gf $$1 = new gf($$0);
         ge $$2 = $$1.t();
         if (!this.d && $$2.a() > 1) {
            throw ef.a.create();
         } else {
            return new ew.c($$2);
         }
      } else {
         int $$3 = $$0.getCursor();

         while ($$0.canRead() && $$0.peek() != ' ') {
            $$0.skip();
         }

         String $$4 = $$0.getString().substring($$3, $$0.getCursor());
         if ($$4.equals("*")) {
            return ($$0x, $$1) -> {
               Collection<emv> $$2 = $$1.get();
               if ($$2.isEmpty()) {
                  throw c.create();
               } else {
                  return $$2;
               }
            };
         } else if ($$4.startsWith("#")) {
            List<emv> $$5 = List.of(emv.d($$4));
            return ($$1, $$2) -> $$5;
         } else {
            return ($$1, $$2) -> {
               MinecraftServer $$3x = $$1.l();
               ane $$4x = $$3x.ae().a($$4);
               if ($$4x != null) {
                  return List.of($$4x);
               } else {
                  try {
                     UUID $$5x = UUID.fromString($$4);
                     List<emv> $$6 = new ArrayList<>();

                     for (and $$7 : $$3x.H()) {
                        blu $$8 = $$7.a($$5x);
                        if ($$8 != null) {
                           $$6.add($$8);
                        }
                     }

                     if (!$$6.isEmpty()) {
                        return $$6;
                     }
                  } catch (IllegalArgumentException var10) {
                  }

                  return List.of(emv.d($$4));
               }
            };
         }
      }
   }

   public Collection<String> getExamples() {
      return b;
   }

   public static class a implements hj<ew, ew.a.a> {
      private static final byte a = 1;

      public void a(ew.a.a $$0, ui $$1) {
         int $$2 = 0;
         if ($$0.b) {
            $$2 |= 1;
         }

         $$1.k($$2);
      }

      public ew.a.a a(ui $$0) {
         byte $$1 = $$0.readByte();
         boolean $$2 = ($$1 & 1) != 0;
         return new ew.a.a($$2);
      }

      public void a(ew.a.a $$0, JsonObject $$1) {
         $$1.addProperty("amount", $$0.b ? "multiple" : "single");
      }

      public ew.a.a a(ew $$0) {
         return new ew.a.a($$0.d);
      }

      public final class a implements hj.a<ew> {
         final boolean b;

         a(boolean $$1) {
            this.b = $$1;
         }

         public ew a(dn $$0) {
            return new ew(this.b);
         }

         @Override
         public hj<ew, ?> a() {
            return a.this;
         }
      }
   }

   @FunctionalInterface
   public interface b {
      Collection<emv> getNames(ds var1, Supplier<Collection<emv>> var2) throws CommandSyntaxException;
   }

   public static class c implements ew.b {
      private final ge a;

      public c(ge $$0) {
         this.a = $$0;
      }

      @Override
      public Collection<emv> getNames(ds $$0, Supplier<Collection<emv>> $$1) throws CommandSyntaxException {
         List<? extends blu> $$2 = this.a.b($$0);
         if ($$2.isEmpty()) {
            throw ef.d.create();
         } else {
            return List.copyOf($$2);
         }
      }
   }
}
