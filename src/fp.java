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

public class fp implements ArgumentType<fp.b> {
   public static final SuggestionProvider<ej> a = ($$0, $$1) -> {
      StringReader $$2 = new StringReader($$1.getInput());
      $$2.setCursor($$1.getStart());
      ha $$3 = new ha($$2, ha.a((ej)$$0.getSource()));

      try {
         $$3.t();
      } catch (CommandSyntaxException var5) {
      }

      return $$3.a($$1, $$1x -> eo.b(((ej)$$0.getSource()).q(), $$1x));
   };
   private static final Collection<String> b = Arrays.asList("Player", "0123", "*", "@e");
   private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(xa.c("argument.scoreHolder.empty"));
   final boolean d;

   public fp(boolean $$0) {
      this.d = $$0;
   }

   public static fgu a(CommandContext<ej> $$0, String $$1) throws CommandSyntaxException {
      return b($$0, $$1).iterator().next();
   }

   public static Collection<fgu> b(CommandContext<ej> $$0, String $$1) throws CommandSyntaxException {
      return a($$0, $$1, Collections::emptyList);
   }

   public static Collection<fgu> c(CommandContext<ej> $$0, String $$1) throws CommandSyntaxException {
      return a($$0, $$1, ((ej)$$0.getSource()).l().aJ()::d);
   }

   public static Collection<fgu> a(CommandContext<ej> $$0, String $$1, Supplier<Collection<fgu>> $$2) throws CommandSyntaxException {
      Collection<fgu> $$3 = ((fp.b)$$0.getArgument($$1, fp.b.class)).getNames((ej)$$0.getSource(), $$2);
      if ($$3.isEmpty()) {
         throw ew.d.create();
      } else {
         return $$3;
      }
   }

   public static fp a() {
      return new fp(false);
   }

   public static fp b() {
      return new fp(true);
   }

   public fp.b a(StringReader $$0) throws CommandSyntaxException {
      return this.a($$0, true);
   }

   public <S> fp.b a(StringReader $$0, S $$1) throws CommandSyntaxException {
      return this.a($$0, ha.a($$1));
   }

   private fp.b a(StringReader $$0, boolean $$1) throws CommandSyntaxException {
      if ($$0.canRead() && $$0.peek() == '@') {
         ha $$2 = new ha($$0, $$1);
         gz $$3 = $$2.t();
         if (!this.d && $$3.a() > 1) {
            throw ew.a.createWithContext($$0);
         } else {
            return new fp.c($$3);
         }
      } else {
         int $$4 = $$0.getCursor();

         while ($$0.canRead() && $$0.peek() != ' ') {
            $$0.skip();
         }

         String $$5 = $$0.getString().substring($$4, $$0.getCursor());
         if ($$5.equals("*")) {
            return ($$0x, $$1x) -> {
               Collection<fgu> $$2 = (Collection<fgu>)$$1x.get();
               if ($$2.isEmpty()) {
                  throw c.create();
               } else {
                  return $$2;
               }
            };
         } else {
            List<fgu> $$6 = List.of(fgu.c($$5));
            if ($$5.startsWith("#")) {
               return ($$1x, $$2) -> $$6;
            } else {
               try {
                  UUID $$7 = UUID.fromString($$5);
                  return ($$2, $$3) -> {
                     MinecraftServer $$4x = $$2.l();
                     fgu $$5x = null;
                     List<fgu> $$6x = null;

                     for (ars $$7x : $$4x.L()) {
                        bwt $$8 = $$7x.b($$7);
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
                     art $$5x = $$4x.ag().a($$5);
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

   public static class a implements ig<fp, fp.a.a> {
      private static final byte a = 1;

      public void a(fp.a.a $$0, vw $$1) {
         int $$2 = 0;
         if ($$0.b) {
            $$2 |= 1;
         }

         $$1.l($$2);
      }

      public fp.a.a a(vw $$0) {
         byte $$1 = $$0.readByte();
         boolean $$2 = ($$1 & 1) != 0;
         return new fp.a.a($$2);
      }

      public void a(fp.a.a $$0, JsonObject $$1) {
         $$1.addProperty("amount", $$0.b ? "multiple" : "single");
      }

      public fp.a.a a(fp $$0) {
         return new fp.a.a($$0.d);
      }

      public final class a implements ig.a<fp> {
         final boolean b;

         a(final boolean $$1) {
            this.b = $$1;
         }

         public fp a(ef $$0) {
            return new fp(this.b);
         }

         @Override
         public ig<fp, ?> a() {
            return a.this;
         }
      }
   }

   @FunctionalInterface
   public interface b {
      Collection<fgu> getNames(ej var1, Supplier<Collection<fgu>> var2) throws CommandSyntaxException;
   }

   public static class c implements fp.b {
      private final gz a;

      public c(gz $$0) {
         this.a = $$0;
      }

      @Override
      public Collection<fgu> getNames(ej $$0, Supplier<Collection<fgu>> $$1) throws CommandSyntaxException {
         List<? extends bwt> $$2 = this.a.b($$0);
         if ($$2.isEmpty()) {
            throw ew.d.create();
         } else {
            return List.copyOf($$2);
         }
      }
   }
}
