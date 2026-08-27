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

public class ez implements ArgumentType<ez.b> {
   public static final SuggestionProvider<dv> a = ($$0, $$1) -> {
      StringReader $$2 = new StringReader($$1.getInput());
      $$2.setCursor($$1.getStart());
      gl $$3 = new gl($$2);

      try {
         $$3.t();
      } catch (CommandSyntaxException var5) {
      }

      return $$3.a($$1, $$1x -> ea.b(((dv)$$0.getSource()).q(), $$1x));
   };
   private static final Collection<String> b = Arrays.asList("Player", "0123", "*", "@e");
   private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(wi.c("argument.scoreHolder.empty"));
   final boolean d;

   public ez(boolean $$0) {
      this.d = $$0;
   }

   public static etm a(CommandContext<dv> $$0, String $$1) throws CommandSyntaxException {
      return b($$0, $$1).iterator().next();
   }

   public static Collection<etm> b(CommandContext<dv> $$0, String $$1) throws CommandSyntaxException {
      return a($$0, $$1, Collections::emptyList);
   }

   public static Collection<etm> c(CommandContext<dv> $$0, String $$1) throws CommandSyntaxException {
      return a($$0, $$1, ((dv)$$0.getSource()).l().aK()::e);
   }

   public static Collection<etm> a(CommandContext<dv> $$0, String $$1, Supplier<Collection<etm>> $$2) throws CommandSyntaxException {
      Collection<etm> $$3 = ((ez.b)$$0.getArgument($$1, ez.b.class)).getNames((dv)$$0.getSource(), $$2);
      if ($$3.isEmpty()) {
         throw ei.d.create();
      } else {
         return $$3;
      }
   }

   public static ez a() {
      return new ez(false);
   }

   public static ez b() {
      return new ez(true);
   }

   public ez.b a(StringReader $$0) throws CommandSyntaxException {
      if ($$0.canRead() && $$0.peek() == '@') {
         gl $$1 = new gl($$0);
         gk $$2 = $$1.t();
         if (!this.d && $$2.a() > 1) {
            throw ei.a.createWithContext($$0);
         } else {
            return new ez.c($$2);
         }
      } else {
         int $$3 = $$0.getCursor();

         while ($$0.canRead() && $$0.peek() != ' ') {
            $$0.skip();
         }

         String $$4 = $$0.getString().substring($$3, $$0.getCursor());
         if ($$4.equals("*")) {
            return ($$0x, $$1) -> {
               Collection<etm> $$2 = $$1.get();
               if ($$2.isEmpty()) {
                  throw c.create();
               } else {
                  return $$2;
               }
            };
         } else {
            List<etm> $$5 = List.of(etm.c($$4));
            if ($$4.startsWith("#")) {
               return ($$1, $$2) -> $$5;
            } else {
               try {
                  UUID $$6 = UUID.fromString($$4);
                  return ($$2, $$3x) -> {
                     MinecraftServer $$4x = $$2.l();
                     etm $$5x = null;
                     List<etm> $$6x = null;

                     for (apu $$7 : $$4x.K()) {
                        bqa $$8 = $$7.a($$6);
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
                     apv $$5x = $$4x.ah().a($$4);
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

   public static class a implements hp<ez, ez.a.a> {
      private static final byte a = 1;

      public void a(ez.a.a $$0, vi $$1) {
         int $$2 = 0;
         if ($$0.b) {
            $$2 |= 1;
         }

         $$1.k($$2);
      }

      public ez.a.a a(vi $$0) {
         byte $$1 = $$0.readByte();
         boolean $$2 = ($$1 & 1) != 0;
         return new ez.a.a($$2);
      }

      public void a(ez.a.a $$0, JsonObject $$1) {
         $$1.addProperty("amount", $$0.b ? "multiple" : "single");
      }

      public ez.a.a a(ez $$0) {
         return new ez.a.a($$0.d);
      }

      public final class a implements hp.a<ez> {
         final boolean b;

         a(boolean $$1) {
            this.b = $$1;
         }

         public ez a(dr $$0) {
            return new ez(this.b);
         }

         @Override
         public hp<ez, ?> a() {
            return a.this;
         }
      }
   }

   @FunctionalInterface
   public interface b {
      Collection<etm> getNames(dv var1, Supplier<Collection<etm>> var2) throws CommandSyntaxException;
   }

   public static class c implements ez.b {
      private final gk a;

      public c(gk $$0) {
         this.a = $$0;
      }

      @Override
      public Collection<etm> getNames(dv $$0, Supplier<Collection<etm>> $$1) throws CommandSyntaxException {
         List<? extends bqa> $$2 = this.a.b($$0);
         if ($$2.isEmpty()) {
            throw ei.d.create();
         } else {
            return List.copyOf($$2);
         }
      }
   }
}
