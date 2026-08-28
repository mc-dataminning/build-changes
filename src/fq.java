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

public class fq implements ArgumentType<fq.b> {
   public static final SuggestionProvider<ek> a = ($$0, $$1) -> {
      StringReader $$2 = new StringReader($$1.getInput());
      $$2.setCursor($$1.getStart());
      hb $$3 = new hb($$2, hb.a((ek)$$0.getSource()));

      try {
         $$3.t();
      } catch (CommandSyntaxException var5) {
      }

      return $$3.a($$1, $$1x -> ep.b(((ek)$$0.getSource()).q(), $$1x));
   };
   private static final Collection<String> b = Arrays.asList("Player", "0123", "*", "@e");
   private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(xg.c("argument.scoreHolder.empty"));
   final boolean d;

   public fq(boolean $$0) {
      this.d = $$0;
   }

   public static fhg a(CommandContext<ek> $$0, String $$1) throws CommandSyntaxException {
      return b($$0, $$1).iterator().next();
   }

   public static Collection<fhg> b(CommandContext<ek> $$0, String $$1) throws CommandSyntaxException {
      return a($$0, $$1, Collections::emptyList);
   }

   public static Collection<fhg> c(CommandContext<ek> $$0, String $$1) throws CommandSyntaxException {
      return a($$0, $$1, ((ek)$$0.getSource()).l().aJ()::d);
   }

   public static Collection<fhg> a(CommandContext<ek> $$0, String $$1, Supplier<Collection<fhg>> $$2) throws CommandSyntaxException {
      Collection<fhg> $$3 = ((fq.b)$$0.getArgument($$1, fq.b.class)).getNames((ek)$$0.getSource(), $$2);
      if ($$3.isEmpty()) {
         throw ex.d.create();
      } else {
         return $$3;
      }
   }

   public static fq a() {
      return new fq(false);
   }

   public static fq b() {
      return new fq(true);
   }

   public fq.b a(StringReader $$0) throws CommandSyntaxException {
      return this.a($$0, true);
   }

   public <S> fq.b a(StringReader $$0, S $$1) throws CommandSyntaxException {
      return this.a($$0, hb.a($$1));
   }

   private fq.b a(StringReader $$0, boolean $$1) throws CommandSyntaxException {
      if ($$0.canRead() && $$0.peek() == '@') {
         hb $$2 = new hb($$0, $$1);
         ha $$3 = $$2.t();
         if (!this.d && $$3.a() > 1) {
            throw ex.a.createWithContext($$0);
         } else {
            return new fq.c($$3);
         }
      } else {
         int $$4 = $$0.getCursor();

         while ($$0.canRead() && $$0.peek() != ' ') {
            $$0.skip();
         }

         String $$5 = $$0.getString().substring($$4, $$0.getCursor());
         if ($$5.equals("*")) {
            return ($$0x, $$1x) -> {
               Collection<fhg> $$2 = (Collection<fhg>)$$1x.get();
               if ($$2.isEmpty()) {
                  throw c.create();
               } else {
                  return $$2;
               }
            };
         } else {
            List<fhg> $$6 = List.of(fhg.c($$5));
            if ($$5.startsWith("#")) {
               return ($$1x, $$2) -> $$6;
            } else {
               try {
                  UUID $$7 = UUID.fromString($$5);
                  return ($$2, $$3) -> {
                     MinecraftServer $$4x = $$2.l();
                     fhg $$5x = null;
                     List<fhg> $$6x = null;

                     for (asb $$7x : $$4x.L()) {
                        bxe $$8 = $$7x.b($$7);
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
                     asc $$5x = $$4x.ag().a($$5);
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

   public static class a implements ih<fq, fq.a.a> {
      private static final byte a = 1;

      public void a(fq.a.a $$0, vy $$1) {
         int $$2 = 0;
         if ($$0.b) {
            $$2 |= 1;
         }

         $$1.l($$2);
      }

      public fq.a.a a(vy $$0) {
         byte $$1 = $$0.readByte();
         boolean $$2 = ($$1 & 1) != 0;
         return new fq.a.a($$2);
      }

      public void a(fq.a.a $$0, JsonObject $$1) {
         $$1.addProperty("amount", $$0.b ? "multiple" : "single");
      }

      public fq.a.a a(fq $$0) {
         return new fq.a.a($$0.d);
      }

      public final class a implements ih.a<fq> {
         final boolean b;

         a(final boolean $$1) {
            this.b = $$1;
         }

         public fq a(eg $$0) {
            return new fq(this.b);
         }

         @Override
         public ih<fq, ?> a() {
            return a.this;
         }
      }
   }

   @FunctionalInterface
   public interface b {
      Collection<fhg> getNames(ek var1, Supplier<Collection<fhg>> var2) throws CommandSyntaxException;
   }

   public static class c implements fq.b {
      private final ha a;

      public c(ha $$0) {
         this.a = $$0;
      }

      @Override
      public Collection<fhg> getNames(ek $$0, Supplier<Collection<fhg>> $$1) throws CommandSyntaxException {
         List<? extends bxe> $$2 = this.a.b($$0);
         if ($$2.isEmpty()) {
            throw ex.d.create();
         } else {
            return List.copyOf($$2);
         }
      }
   }
}
