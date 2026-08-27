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

public class fi implements ArgumentType<fi.b> {
   public static final SuggestionProvider<ed> a = ($$0, $$1) -> {
      StringReader $$2 = new StringReader($$1.getInput());
      $$2.setCursor($$1.getStart());
      gt $$3 = new gt($$2);

      try {
         $$3.t();
      } catch (CommandSyntaxException var5) {
      }

      return $$3.a($$1, $$1x -> ei.b(((ed)$$0.getSource()).q(), $$1x));
   };
   private static final Collection<String> b = Arrays.asList("Player", "0123", "*", "@e");
   private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(wu.c("argument.scoreHolder.empty"));
   final boolean d;

   public fi(boolean $$0) {
      this.d = $$0;
   }

   public static eus a(CommandContext<ed> $$0, String $$1) throws CommandSyntaxException {
      return b($$0, $$1).iterator().next();
   }

   public static Collection<eus> b(CommandContext<ed> $$0, String $$1) throws CommandSyntaxException {
      return a($$0, $$1, Collections::emptyList);
   }

   public static Collection<eus> c(CommandContext<ed> $$0, String $$1) throws CommandSyntaxException {
      return a($$0, $$1, ((ed)$$0.getSource()).l().aK()::e);
   }

   public static Collection<eus> a(CommandContext<ed> $$0, String $$1, Supplier<Collection<eus>> $$2) throws CommandSyntaxException {
      Collection<eus> $$3 = ((fi.b)$$0.getArgument($$1, fi.b.class)).getNames((ed)$$0.getSource(), $$2);
      if ($$3.isEmpty()) {
         throw eq.d.create();
      } else {
         return $$3;
      }
   }

   public static fi a() {
      return new fi(false);
   }

   public static fi b() {
      return new fi(true);
   }

   public fi.b a(StringReader $$0) throws CommandSyntaxException {
      if ($$0.canRead() && $$0.peek() == '@') {
         gt $$1 = new gt($$0);
         gs $$2 = $$1.t();
         if (!this.d && $$2.a() > 1) {
            throw eq.a.createWithContext($$0);
         } else {
            return new fi.c($$2);
         }
      } else {
         int $$3 = $$0.getCursor();

         while ($$0.canRead() && $$0.peek() != ' ') {
            $$0.skip();
         }

         String $$4 = $$0.getString().substring($$3, $$0.getCursor());
         if ($$4.equals("*")) {
            return ($$0x, $$1) -> {
               Collection<eus> $$2 = $$1.get();
               if ($$2.isEmpty()) {
                  throw c.create();
               } else {
                  return $$2;
               }
            };
         } else {
            List<eus> $$5 = List.of(eus.c($$4));
            if ($$4.startsWith("#")) {
               return ($$1, $$2) -> $$5;
            } else {
               try {
                  UUID $$6 = UUID.fromString($$4);
                  return ($$2, $$3x) -> {
                     MinecraftServer $$4x = $$2.l();
                     eus $$5x = null;
                     List<eus> $$6x = null;

                     for (aqh $$7 : $$4x.K()) {
                        brh $$8 = $$7.a($$6);
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
                     aqi $$5x = $$4x.ah().a($$4);
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

   public static class a implements hx<fi, fi.a.a> {
      private static final byte a = 1;

      public void a(fi.a.a $$0, vu $$1) {
         int $$2 = 0;
         if ($$0.b) {
            $$2 |= 1;
         }

         $$1.k($$2);
      }

      public fi.a.a a(vu $$0) {
         byte $$1 = $$0.readByte();
         boolean $$2 = ($$1 & 1) != 0;
         return new fi.a.a($$2);
      }

      public void a(fi.a.a $$0, JsonObject $$1) {
         $$1.addProperty("amount", $$0.b ? "multiple" : "single");
      }

      public fi.a.a a(fi $$0) {
         return new fi.a.a($$0.d);
      }

      public final class a implements hx.a<fi> {
         final boolean b;

         a(boolean $$1) {
            this.b = $$1;
         }

         public fi a(dz $$0) {
            return new fi(this.b);
         }

         @Override
         public hx<fi, ?> a() {
            return a.this;
         }
      }
   }

   @FunctionalInterface
   public interface b {
      Collection<eus> getNames(ed var1, Supplier<Collection<eus>> var2) throws CommandSyntaxException;
   }

   public static class c implements fi.b {
      private final gs a;

      public c(gs $$0) {
         this.a = $$0;
      }

      @Override
      public Collection<eus> getNames(ed $$0, Supplier<Collection<eus>> $$1) throws CommandSyntaxException {
         List<? extends brh> $$2 = this.a.b($$0);
         if ($$2.isEmpty()) {
            throw eq.d.create();
         } else {
            return List.copyOf($$2);
         }
      }
   }
}
