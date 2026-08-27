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

public class fm implements ArgumentType<fm.b> {
   public static final SuggestionProvider<eh> a = ($$0, $$1) -> {
      StringReader $$2 = new StringReader($$1.getInput());
      $$2.setCursor($$1.getStart());
      gx $$3 = new gx($$2);

      try {
         $$3.t();
      } catch (CommandSyntaxException var5) {
      }

      return $$3.a($$1, $$1x -> em.b(((eh)$$0.getSource()).q(), $$1x));
   };
   private static final Collection<String> b = Arrays.asList("Player", "0123", "*", "@e");
   private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(xe.c("argument.scoreHolder.empty"));
   final boolean d;

   public fm(boolean $$0) {
      this.d = $$0;
   }

   public static exx a(CommandContext<eh> $$0, String $$1) throws CommandSyntaxException {
      return b($$0, $$1).iterator().next();
   }

   public static Collection<exx> b(CommandContext<eh> $$0, String $$1) throws CommandSyntaxException {
      return a($$0, $$1, Collections::emptyList);
   }

   public static Collection<exx> c(CommandContext<eh> $$0, String $$1) throws CommandSyntaxException {
      return a($$0, $$1, ((eh)$$0.getSource()).l().aK()::e);
   }

   public static Collection<exx> a(CommandContext<eh> $$0, String $$1, Supplier<Collection<exx>> $$2) throws CommandSyntaxException {
      Collection<exx> $$3 = ((fm.b)$$0.getArgument($$1, fm.b.class)).getNames((eh)$$0.getSource(), $$2);
      if ($$3.isEmpty()) {
         throw eu.d.create();
      } else {
         return $$3;
      }
   }

   public static fm a() {
      return new fm(false);
   }

   public static fm b() {
      return new fm(true);
   }

   public fm.b a(StringReader $$0) throws CommandSyntaxException {
      if ($$0.canRead() && $$0.peek() == '@') {
         gx $$1 = new gx($$0);
         gw $$2 = $$1.t();
         if (!this.d && $$2.a() > 1) {
            throw eu.a.createWithContext($$0);
         } else {
            return new fm.c($$2);
         }
      } else {
         int $$3 = $$0.getCursor();

         while ($$0.canRead() && $$0.peek() != ' ') {
            $$0.skip();
         }

         String $$4 = $$0.getString().substring($$3, $$0.getCursor());
         if ($$4.equals("*")) {
            return ($$0x, $$1) -> {
               Collection<exx> $$2 = $$1.get();
               if ($$2.isEmpty()) {
                  throw c.create();
               } else {
                  return $$2;
               }
            };
         } else {
            List<exx> $$5 = List.of(exx.e($$4));
            if ($$4.startsWith("#")) {
               return ($$1, $$2) -> $$5;
            } else {
               try {
                  UUID $$6 = UUID.fromString($$4);
                  return ($$2, $$3x) -> {
                     MinecraftServer $$4x = $$2.l();
                     exx $$5x = null;
                     List<exx> $$6x = null;

                     for (aqt $$7 : $$4x.K()) {
                        brv $$8 = $$7.a($$6);
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
                     aqu $$5x = $$4x.ah().a($$4);
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

   public static class a implements ib<fm, fm.a.a> {
      private static final byte a = 1;

      public void a(fm.a.a $$0, we $$1) {
         int $$2 = 0;
         if ($$0.b) {
            $$2 |= 1;
         }

         $$1.k($$2);
      }

      public fm.a.a a(we $$0) {
         byte $$1 = $$0.readByte();
         boolean $$2 = ($$1 & 1) != 0;
         return new fm.a.a($$2);
      }

      public void a(fm.a.a $$0, JsonObject $$1) {
         $$1.addProperty("amount", $$0.b ? "multiple" : "single");
      }

      public fm.a.a a(fm $$0) {
         return new fm.a.a($$0.d);
      }

      public final class a implements ib.a<fm> {
         final boolean b;

         a(boolean $$1) {
            this.b = $$1;
         }

         public fm a(ed $$0) {
            return new fm(this.b);
         }

         @Override
         public ib<fm, ?> a() {
            return a.this;
         }
      }
   }

   @FunctionalInterface
   public interface b {
      Collection<exx> getNames(eh var1, Supplier<Collection<exx>> var2) throws CommandSyntaxException;
   }

   public static class c implements fm.b {
      private final gw a;

      public c(gw $$0) {
         this.a = $$0;
      }

      @Override
      public Collection<exx> getNames(eh $$0, Supplier<Collection<exx>> $$1) throws CommandSyntaxException {
         List<? extends brv> $$2 = this.a.b($$0);
         if ($$2.isEmpty()) {
            throw eu.d.create();
         } else {
            return List.copyOf($$2);
         }
      }
   }
}
