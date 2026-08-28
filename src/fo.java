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

public class fo implements ArgumentType<fo.b> {
   public static final SuggestionProvider<ei> a = ($$0, $$1) -> {
      StringReader $$2 = new StringReader($$1.getInput());
      $$2.setCursor($$1.getStart());
      gz $$3 = new gz($$2, gz.a((ei)$$0.getSource()));

      try {
         $$3.t();
      } catch (CommandSyntaxException var5) {
      }

      return $$3.a($$1, $$1x -> en.b(((ei)$$0.getSource()).q(), $$1x));
   };
   private static final Collection<String> b = Arrays.asList("Player", "0123", "*", "@e");
   private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(ww.c("argument.scoreHolder.empty"));
   final boolean d;

   public fo(boolean $$0) {
      this.d = $$0;
   }

   public static ffa a(CommandContext<ei> $$0, String $$1) throws CommandSyntaxException {
      return b($$0, $$1).iterator().next();
   }

   public static Collection<ffa> b(CommandContext<ei> $$0, String $$1) throws CommandSyntaxException {
      return a($$0, $$1, Collections::emptyList);
   }

   public static Collection<ffa> c(CommandContext<ei> $$0, String $$1) throws CommandSyntaxException {
      return a($$0, $$1, ((ei)$$0.getSource()).l().aJ()::e);
   }

   public static Collection<ffa> a(CommandContext<ei> $$0, String $$1, Supplier<Collection<ffa>> $$2) throws CommandSyntaxException {
      Collection<ffa> $$3 = ((fo.b)$$0.getArgument($$1, fo.b.class)).getNames((ei)$$0.getSource(), $$2);
      if ($$3.isEmpty()) {
         throw ev.d.create();
      } else {
         return $$3;
      }
   }

   public static fo a() {
      return new fo(false);
   }

   public static fo b() {
      return new fo(true);
   }

   public fo.b a(StringReader $$0) throws CommandSyntaxException {
      return this.a($$0, true);
   }

   public <S> fo.b a(StringReader $$0, S $$1) throws CommandSyntaxException {
      return this.a($$0, gz.a($$1));
   }

   private fo.b a(StringReader $$0, boolean $$1) throws CommandSyntaxException {
      if ($$0.canRead() && $$0.peek() == '@') {
         gz $$2 = new gz($$0, $$1);
         gy $$3 = $$2.t();
         if (!this.d && $$3.a() > 1) {
            throw ev.a.createWithContext($$0);
         } else {
            return new fo.c($$3);
         }
      } else {
         int $$4 = $$0.getCursor();

         while ($$0.canRead() && $$0.peek() != ' ') {
            $$0.skip();
         }

         String $$5 = $$0.getString().substring($$4, $$0.getCursor());
         if ($$5.equals("*")) {
            return ($$0x, $$1x) -> {
               Collection<ffa> $$2 = (Collection<ffa>)$$1x.get();
               if ($$2.isEmpty()) {
                  throw c.create();
               } else {
                  return $$2;
               }
            };
         } else {
            List<ffa> $$6 = List.of(ffa.c($$5));
            if ($$5.startsWith("#")) {
               return ($$1x, $$2) -> $$6;
            } else {
               try {
                  UUID $$7 = UUID.fromString($$5);
                  return ($$2, $$3) -> {
                     MinecraftServer $$4x = $$2.l();
                     ffa $$5x = null;
                     List<ffa> $$6x = null;

                     for (aro $$7x : $$4x.L()) {
                        bwa $$8 = $$7x.b($$7);
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
                        return $$5x != null ? List.of($$5x) : $$6;
                     }
                  };
               } catch (IllegalArgumentException var7) {
                  return ($$2, $$3) -> {
                     MinecraftServer $$4x = $$2.l();
                     arp $$5x = $$4x.ag().a($$5);
                     return $$5x != null ? List.of($$5x) : $$6;
                  };
               }
            }
         }
      }
   }

   public Collection<String> getExamples() {
      return b;
   }

   public static class a implements ie<fo, fo.a.a> {
      private static final byte a = 1;

      public void a(fo.a.a $$0, vs $$1) {
         int $$2 = 0;
         if ($$0.b) {
            $$2 |= 1;
         }

         $$1.l($$2);
      }

      public fo.a.a a(vs $$0) {
         byte $$1 = $$0.readByte();
         boolean $$2 = ($$1 & 1) != 0;
         return new fo.a.a($$2);
      }

      public void a(fo.a.a $$0, JsonObject $$1) {
         $$1.addProperty("amount", $$0.b ? "multiple" : "single");
      }

      public fo.a.a a(fo $$0) {
         return new fo.a.a($$0.d);
      }

      public final class a implements ie.a<fo> {
         final boolean b;

         a(final boolean $$1) {
            this.b = $$1;
         }

         public fo a(ee $$0) {
            return new fo(this.b);
         }

         @Override
         public ie<fo, ?> a() {
            return a.this;
         }
      }
   }

   @FunctionalInterface
   public interface b {
      Collection<ffa> getNames(ei var1, Supplier<Collection<ffa>> var2) throws CommandSyntaxException;
   }

   public static class c implements fo.b {
      private final gy a;

      public c(gy $$0) {
         this.a = $$0;
      }

      @Override
      public Collection<ffa> getNames(ei $$0, Supplier<Collection<ffa>> $$1) throws CommandSyntaxException {
         List<? extends bwa> $$2 = this.a.b($$0);
         if ($$2.isEmpty()) {
            throw ev.d.create();
         } else {
            return List.copyOf($$2);
         }
      }
   }
}
