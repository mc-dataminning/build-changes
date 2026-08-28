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

public class fu implements ArgumentType<fu.b> {
   public static final SuggestionProvider<ep> a = ($$0, $$1) -> {
      StringReader $$2 = new StringReader($$1.getInput());
      $$2.setCursor($$1.getStart());
      hf $$3 = new hf($$2);

      try {
         $$3.t();
      } catch (CommandSyntaxException var5) {
      }

      return $$3.a($$1, $$1x -> eu.b(((ep)$$0.getSource()).q(), $$1x));
   };
   private static final Collection<String> b = Arrays.asList("Player", "0123", "*", "@e");
   private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(xl.c("argument.scoreHolder.empty"));
   final boolean d;

   public fu(boolean $$0) {
      this.d = $$0;
   }

   public static ewp a(CommandContext<ep> $$0, String $$1) throws CommandSyntaxException {
      return b($$0, $$1).iterator().next();
   }

   public static Collection<ewp> b(CommandContext<ep> $$0, String $$1) throws CommandSyntaxException {
      return a($$0, $$1, Collections::emptyList);
   }

   public static Collection<ewp> c(CommandContext<ep> $$0, String $$1) throws CommandSyntaxException {
      return a($$0, $$1, ((ep)$$0.getSource()).l().aK()::e);
   }

   public static Collection<ewp> a(CommandContext<ep> $$0, String $$1, Supplier<Collection<ewp>> $$2) throws CommandSyntaxException {
      Collection<ewp> $$3 = ((fu.b)$$0.getArgument($$1, fu.b.class)).getNames((ep)$$0.getSource(), $$2);
      if ($$3.isEmpty()) {
         throw fc.d.create();
      } else {
         return $$3;
      }
   }

   public static fu a() {
      return new fu(false);
   }

   public static fu b() {
      return new fu(true);
   }

   public fu.b a(StringReader $$0) throws CommandSyntaxException {
      if ($$0.canRead() && $$0.peek() == '@') {
         hf $$1 = new hf($$0);
         he $$2 = $$1.t();
         if (!this.d && $$2.a() > 1) {
            throw fc.a.createWithContext($$0);
         } else {
            return new fu.c($$2);
         }
      } else {
         int $$3 = $$0.getCursor();

         while ($$0.canRead() && $$0.peek() != ' ') {
            $$0.skip();
         }

         String $$4 = $$0.getString().substring($$3, $$0.getCursor());
         if ($$4.equals("*")) {
            return ($$0x, $$1) -> {
               Collection<ewp> $$2 = $$1.get();
               if ($$2.isEmpty()) {
                  throw c.create();
               } else {
                  return $$2;
               }
            };
         } else {
            List<ewp> $$5 = List.of(ewp.c($$4));
            if ($$4.startsWith("#")) {
               return ($$1, $$2) -> $$5;
            } else {
               try {
                  UUID $$6 = UUID.fromString($$4);
                  return ($$2, $$3x) -> {
                     MinecraftServer $$4x = $$2.l();
                     ewp $$5x = null;
                     List<ewp> $$6x = null;

                     for (arb $$7 : $$4x.K()) {
                        bsp $$8 = $$7.a($$6);
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
                     arc $$5x = $$4x.ah().a($$4);
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

   public static class a implements ik<fu, fu.a.a> {
      private static final byte a = 1;

      public void a(fu.a.a $$0, wl $$1) {
         int $$2 = 0;
         if ($$0.b) {
            $$2 |= 1;
         }

         $$1.k($$2);
      }

      public fu.a.a a(wl $$0) {
         byte $$1 = $$0.readByte();
         boolean $$2 = ($$1 & 1) != 0;
         return new fu.a.a($$2);
      }

      public void a(fu.a.a $$0, JsonObject $$1) {
         $$1.addProperty("amount", $$0.b ? "multiple" : "single");
      }

      public fu.a.a a(fu $$0) {
         return new fu.a.a($$0.d);
      }

      public final class a implements ik.a<fu> {
         final boolean b;

         a(final boolean $$1) {
            this.b = $$1;
         }

         public fu a(el $$0) {
            return new fu(this.b);
         }

         @Override
         public ik<fu, ?> a() {
            return a.this;
         }
      }
   }

   @FunctionalInterface
   public interface b {
      Collection<ewp> getNames(ep var1, Supplier<Collection<ewp>> var2) throws CommandSyntaxException;
   }

   public static class c implements fu.b {
      private final he a;

      public c(he $$0) {
         this.a = $$0;
      }

      @Override
      public Collection<ewp> getNames(ep $$0, Supplier<Collection<ewp>> $$1) throws CommandSyntaxException {
         List<? extends bsp> $$2 = this.a.b($$0);
         if ($$2.isEmpty()) {
            throw fc.d.create();
         } else {
            return List.copyOf($$2);
         }
      }
   }
}
