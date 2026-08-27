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

public class fg implements ArgumentType<fg.b> {
   public static final SuggestionProvider<ec> a = ($$0, $$1) -> {
      StringReader $$2 = new StringReader($$1.getInput());
      $$2.setCursor($$1.getStart());
      gs $$3 = new gs($$2);

      try {
         $$3.t();
      } catch (CommandSyntaxException var5) {
      }

      return $$3.a($$1, $$1x -> eh.b(((ec)$$0.getSource()).q(), $$1x));
   };
   private static final Collection<String> b = Arrays.asList("Player", "0123", "*", "@e");
   private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(ws.c("argument.scoreHolder.empty"));
   final boolean d;

   public fg(boolean $$0) {
      this.d = $$0;
   }

   public static eui a(CommandContext<ec> $$0, String $$1) throws CommandSyntaxException {
      return b($$0, $$1).iterator().next();
   }

   public static Collection<eui> b(CommandContext<ec> $$0, String $$1) throws CommandSyntaxException {
      return a($$0, $$1, Collections::emptyList);
   }

   public static Collection<eui> c(CommandContext<ec> $$0, String $$1) throws CommandSyntaxException {
      return a($$0, $$1, ((ec)$$0.getSource()).l().aK()::e);
   }

   public static Collection<eui> a(CommandContext<ec> $$0, String $$1, Supplier<Collection<eui>> $$2) throws CommandSyntaxException {
      Collection<eui> $$3 = ((fg.b)$$0.getArgument($$1, fg.b.class)).getNames((ec)$$0.getSource(), $$2);
      if ($$3.isEmpty()) {
         throw ep.d.create();
      } else {
         return $$3;
      }
   }

   public static fg a() {
      return new fg(false);
   }

   public static fg b() {
      return new fg(true);
   }

   public fg.b a(StringReader $$0) throws CommandSyntaxException {
      if ($$0.canRead() && $$0.peek() == '@') {
         gs $$1 = new gs($$0);
         gr $$2 = $$1.t();
         if (!this.d && $$2.a() > 1) {
            throw ep.a.createWithContext($$0);
         } else {
            return new fg.c($$2);
         }
      } else {
         int $$3 = $$0.getCursor();

         while ($$0.canRead() && $$0.peek() != ' ') {
            $$0.skip();
         }

         String $$4 = $$0.getString().substring($$3, $$0.getCursor());
         if ($$4.equals("*")) {
            return ($$0x, $$1) -> {
               Collection<eui> $$2 = $$1.get();
               if ($$2.isEmpty()) {
                  throw c.create();
               } else {
                  return $$2;
               }
            };
         } else {
            List<eui> $$5 = List.of(eui.c($$4));
            if ($$4.startsWith("#")) {
               return ($$1, $$2) -> $$5;
            } else {
               try {
                  UUID $$6 = UUID.fromString($$4);
                  return ($$2, $$3x) -> {
                     MinecraftServer $$4x = $$2.l();
                     eui $$5x = null;
                     List<eui> $$6x = null;

                     for (aqe $$7 : $$4x.K()) {
                        bql $$8 = $$7.a($$6);
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
                     aqf $$5x = $$4x.ah().a($$4);
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

   public static class a implements hw<fg, fg.a.a> {
      private static final byte a = 1;

      public void a(fg.a.a $$0, vs $$1) {
         int $$2 = 0;
         if ($$0.b) {
            $$2 |= 1;
         }

         $$1.k($$2);
      }

      public fg.a.a a(vs $$0) {
         byte $$1 = $$0.readByte();
         boolean $$2 = ($$1 & 1) != 0;
         return new fg.a.a($$2);
      }

      public void a(fg.a.a $$0, JsonObject $$1) {
         $$1.addProperty("amount", $$0.b ? "multiple" : "single");
      }

      public fg.a.a a(fg $$0) {
         return new fg.a.a($$0.d);
      }

      public final class a implements hw.a<fg> {
         final boolean b;

         a(boolean $$1) {
            this.b = $$1;
         }

         public fg a(dy $$0) {
            return new fg(this.b);
         }

         @Override
         public hw<fg, ?> a() {
            return a.this;
         }
      }
   }

   @FunctionalInterface
   public interface b {
      Collection<eui> getNames(ec var1, Supplier<Collection<eui>> var2) throws CommandSyntaxException;
   }

   public static class c implements fg.b {
      private final gr a;

      public c(gr $$0) {
         this.a = $$0;
      }

      @Override
      public Collection<eui> getNames(ec $$0, Supplier<Collection<eui>> $$1) throws CommandSyntaxException {
         List<? extends bql> $$2 = this.a.b($$0);
         if ($$2.isEmpty()) {
            throw ep.d.create();
         } else {
            return List.copyOf($$2);
         }
      }
   }
}
