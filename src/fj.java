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

public class fj implements ArgumentType<fj.b> {
   public static final SuggestionProvider<ee> a = ($$0, $$1) -> {
      StringReader $$2 = new StringReader($$1.getInput());
      $$2.setCursor($$1.getStart());
      gu $$3 = new gu($$2);

      try {
         $$3.t();
      } catch (CommandSyntaxException var5) {
      }

      return $$3.a($$1, $$1x -> ej.b(((ee)$$0.getSource()).q(), $$1x));
   };
   private static final Collection<String> b = Arrays.asList("Player", "0123", "*", "@e");
   private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(wx.c("argument.scoreHolder.empty"));
   final boolean d;

   public fj(boolean $$0) {
      this.d = $$0;
   }

   public static evn a(CommandContext<ee> $$0, String $$1) throws CommandSyntaxException {
      return b($$0, $$1).iterator().next();
   }

   public static Collection<evn> b(CommandContext<ee> $$0, String $$1) throws CommandSyntaxException {
      return a($$0, $$1, Collections::emptyList);
   }

   public static Collection<evn> c(CommandContext<ee> $$0, String $$1) throws CommandSyntaxException {
      return a($$0, $$1, ((ee)$$0.getSource()).l().aK()::e);
   }

   public static Collection<evn> a(CommandContext<ee> $$0, String $$1, Supplier<Collection<evn>> $$2) throws CommandSyntaxException {
      Collection<evn> $$3 = ((fj.b)$$0.getArgument($$1, fj.b.class)).getNames((ee)$$0.getSource(), $$2);
      if ($$3.isEmpty()) {
         throw er.d.create();
      } else {
         return $$3;
      }
   }

   public static fj a() {
      return new fj(false);
   }

   public static fj b() {
      return new fj(true);
   }

   public fj.b a(StringReader $$0) throws CommandSyntaxException {
      if ($$0.canRead() && $$0.peek() == '@') {
         gu $$1 = new gu($$0);
         gt $$2 = $$1.t();
         if (!this.d && $$2.a() > 1) {
            throw er.a.createWithContext($$0);
         } else {
            return new fj.c($$2);
         }
      } else {
         int $$3 = $$0.getCursor();

         while ($$0.canRead() && $$0.peek() != ' ') {
            $$0.skip();
         }

         String $$4 = $$0.getString().substring($$3, $$0.getCursor());
         if ($$4.equals("*")) {
            return ($$0x, $$1) -> {
               Collection<evn> $$2 = $$1.get();
               if ($$2.isEmpty()) {
                  throw c.create();
               } else {
                  return $$2;
               }
            };
         } else {
            List<evn> $$5 = List.of(evn.c($$4));
            if ($$4.startsWith("#")) {
               return ($$1, $$2) -> $$5;
            } else {
               try {
                  UUID $$6 = UUID.fromString($$4);
                  return ($$2, $$3x) -> {
                     MinecraftServer $$4x = $$2.l();
                     evn $$5x = null;
                     List<evn> $$6x = null;

                     for (aqm $$7 : $$4x.K()) {
                        bru $$8 = $$7.a($$6);
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
                     aqn $$5x = $$4x.ah().a($$4);
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

   public static class a implements hy<fj, fj.a.a> {
      private static final byte a = 1;

      public void a(fj.a.a $$0, vx $$1) {
         int $$2 = 0;
         if ($$0.b) {
            $$2 |= 1;
         }

         $$1.k($$2);
      }

      public fj.a.a a(vx $$0) {
         byte $$1 = $$0.readByte();
         boolean $$2 = ($$1 & 1) != 0;
         return new fj.a.a($$2);
      }

      public void a(fj.a.a $$0, JsonObject $$1) {
         $$1.addProperty("amount", $$0.b ? "multiple" : "single");
      }

      public fj.a.a a(fj $$0) {
         return new fj.a.a($$0.d);
      }

      public final class a implements hy.a<fj> {
         final boolean b;

         a(boolean $$1) {
            this.b = $$1;
         }

         public fj a(ea $$0) {
            return new fj(this.b);
         }

         @Override
         public hy<fj, ?> a() {
            return a.this;
         }
      }
   }

   @FunctionalInterface
   public interface b {
      Collection<evn> getNames(ee var1, Supplier<Collection<evn>> var2) throws CommandSyntaxException;
   }

   public static class c implements fj.b {
      private final gt a;

      public c(gt $$0) {
         this.a = $$0;
      }

      @Override
      public Collection<evn> getNames(ee $$0, Supplier<Collection<evn>> $$1) throws CommandSyntaxException {
         List<? extends bru> $$2 = this.a.b($$0);
         if ($$2.isEmpty()) {
            throw er.d.create();
         } else {
            return List.copyOf($$2);
         }
      }
   }
}
