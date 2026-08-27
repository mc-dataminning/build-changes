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

   public static emw a(CommandContext<ds> $$0, String $$1) throws CommandSyntaxException {
      return b($$0, $$1).iterator().next();
   }

   public static Collection<emw> b(CommandContext<ds> $$0, String $$1) throws CommandSyntaxException {
      return a($$0, $$1, Collections::emptyList);
   }

   public static Collection<emw> c(CommandContext<ds> $$0, String $$1) throws CommandSyntaxException {
      return a($$0, $$1, ((ds)$$0.getSource()).l().aH()::e);
   }

   public static Collection<emw> a(CommandContext<ds> $$0, String $$1, Supplier<Collection<emw>> $$2) throws CommandSyntaxException {
      Collection<emw> $$3 = ((ew.b)$$0.getArgument($$1, ew.b.class)).getNames((ds)$$0.getSource(), $$2);
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
               Collection<emw> $$2 = $$1.get();
               if ($$2.isEmpty()) {
                  throw c.create();
               } else {
                  return $$2;
               }
            };
         } else {
            List<emw> $$5 = List.of(emw.d($$4));
            if ($$4.startsWith("#")) {
               return ($$1, $$2) -> $$5;
            } else {
               try {
                  UUID $$6 = UUID.fromString($$4);
                  return ($$2, $$3x) -> {
                     MinecraftServer $$4x = $$2.l();
                     emw $$5x = null;
                     List<emw> $$6x = null;

                     for (and $$7 : $$4x.H()) {
                        blv $$8 = $$7.a($$6);
                        if ($$8 != null) {
                           if ($$5x == null) {
                              $$5x = $$8;
                           } else {
                              if ($$6x == null) {
                                 $$6x = new ArrayList<>();
                                 $$6x.add($$5x);
                              }

                              $$6x.add($$8);
                           }
                        }
                     }

                     if ($$6x != null) {
                        return $$6x;
                     } else {
                        return $$5x != null ? List.of($$5x) : $$5;
                     }
                  };
               } catch (IllegalArgumentException var6) {
                  return ($$2, $$3x) -> {
                     MinecraftServer $$4x = $$2.l();
                     ane $$5x = $$4x.ae().a($$4);
                     return $$5x != null ? List.of($$5x) : $$5;
                  };
               }
            }
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
      Collection<emw> getNames(ds var1, Supplier<Collection<emw>> var2) throws CommandSyntaxException;
   }

   public static class c implements ew.b {
      private final ge a;

      public c(ge $$0) {
         this.a = $$0;
      }

      @Override
      public Collection<emw> getNames(ds $$0, Supplier<Collection<emw>> $$1) throws CommandSyntaxException {
         List<? extends blv> $$2 = this.a.b($$0);
         if ($$2.isEmpty()) {
            throw ef.d.create();
         } else {
            return List.copyOf($$2);
         }
      }
   }
}
