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

public class ey implements ArgumentType<ey.b> {
   public static final SuggestionProvider<du> a = ($$0, $$1) -> {
      StringReader $$2 = new StringReader($$1.getInput());
      $$2.setCursor($$1.getStart());
      gh $$3 = new gh($$2);

      try {
         $$3.t();
      } catch (CommandSyntaxException var5) {
      }

      return $$3.a($$1, $$1x -> dz.b(((du)$$0.getSource()).q(), $$1x));
   };
   private static final Collection<String> b = Arrays.asList("Player", "0123", "*", "@e");
   private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(vq.c("argument.scoreHolder.empty"));
   final boolean d;

   public ey(boolean $$0) {
      this.d = $$0;
   }

   public static eov a(CommandContext<du> $$0, String $$1) throws CommandSyntaxException {
      return b($$0, $$1).iterator().next();
   }

   public static Collection<eov> b(CommandContext<du> $$0, String $$1) throws CommandSyntaxException {
      return a($$0, $$1, Collections::emptyList);
   }

   public static Collection<eov> c(CommandContext<du> $$0, String $$1) throws CommandSyntaxException {
      return a($$0, $$1, ((du)$$0.getSource()).l().aH()::e);
   }

   public static Collection<eov> a(CommandContext<du> $$0, String $$1, Supplier<Collection<eov>> $$2) throws CommandSyntaxException {
      Collection<eov> $$3 = ((ey.b)$$0.getArgument($$1, ey.b.class)).getNames((du)$$0.getSource(), $$2);
      if ($$3.isEmpty()) {
         throw eh.d.create();
      } else {
         return $$3;
      }
   }

   public static ey a() {
      return new ey(false);
   }

   public static ey b() {
      return new ey(true);
   }

   public ey.b a(StringReader $$0) throws CommandSyntaxException {
      if ($$0.canRead() && $$0.peek() == '@') {
         gh $$1 = new gh($$0);
         gg $$2 = $$1.t();
         if (!this.d && $$2.a() > 1) {
            throw eh.a.create();
         } else {
            return new ey.c($$2);
         }
      } else {
         int $$3 = $$0.getCursor();

         while ($$0.canRead() && $$0.peek() != ' ') {
            $$0.skip();
         }

         String $$4 = $$0.getString().substring($$3, $$0.getCursor());
         if ($$4.equals("*")) {
            return ($$0x, $$1) -> {
               Collection<eov> $$2 = $$1.get();
               if ($$2.isEmpty()) {
                  throw c.create();
               } else {
                  return $$2;
               }
            };
         } else {
            List<eov> $$5 = List.of(eov.d($$4));
            if ($$4.startsWith("#")) {
               return ($$1, $$2) -> $$5;
            } else {
               try {
                  UUID $$6 = UUID.fromString($$4);
                  return ($$2, $$3x) -> {
                     MinecraftServer $$4x = $$2.l();
                     eov $$5x = null;
                     List<eov> $$6x = null;

                     for (aov $$7 : $$4x.H()) {
                        bno $$8 = $$7.a($$6);
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
                     aow $$5x = $$4x.ae().a($$4);
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

   public static class a implements hl<ey, ey.a.a> {
      private static final byte a = 1;

      public void a(ey.a.a $$0, uq $$1) {
         int $$2 = 0;
         if ($$0.b) {
            $$2 |= 1;
         }

         $$1.k($$2);
      }

      public ey.a.a a(uq $$0) {
         byte $$1 = $$0.readByte();
         boolean $$2 = ($$1 & 1) != 0;
         return new ey.a.a($$2);
      }

      public void a(ey.a.a $$0, JsonObject $$1) {
         $$1.addProperty("amount", $$0.b ? "multiple" : "single");
      }

      public ey.a.a a(ey $$0) {
         return new ey.a.a($$0.d);
      }

      public final class a implements hl.a<ey> {
         final boolean b;

         a(boolean $$1) {
            this.b = $$1;
         }

         public ey a(dq $$0) {
            return new ey(this.b);
         }

         @Override
         public hl<ey, ?> a() {
            return a.this;
         }
      }
   }

   @FunctionalInterface
   public interface b {
      Collection<eov> getNames(du var1, Supplier<Collection<eov>> var2) throws CommandSyntaxException;
   }

   public static class c implements ey.b {
      private final gg a;

      public c(gg $$0) {
         this.a = $$0;
      }

      @Override
      public Collection<eov> getNames(du $$0, Supplier<Collection<eov>> $$1) throws CommandSyntaxException {
         List<? extends bno> $$2 = this.a.b($$0);
         if ($$2.isEmpty()) {
            throw eh.d.create();
         } else {
            return List.copyOf($$2);
         }
      }
   }
}
