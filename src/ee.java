import com.google.common.collect.Iterables;
import com.google.gson.JsonObject;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ee implements ArgumentType<gc> {
   private static final Collection<String> g = Arrays.asList("Player", "0123", "@e", "@e[type=foo]", "dd12be42-52a9-4a91-a8a1-11c01849e498");
   public static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(tl.c("argument.entity.toomany"));
   public static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(tl.c("argument.player.toomany"));
   public static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(tl.c("argument.player.entities"));
   public static final SimpleCommandExceptionType d = new SimpleCommandExceptionType(tl.c("argument.entity.notfound.entity"));
   public static final SimpleCommandExceptionType e = new SimpleCommandExceptionType(tl.c("argument.entity.notfound.player"));
   public static final SimpleCommandExceptionType f = new SimpleCommandExceptionType(tl.c("argument.entity.selector.not_allowed"));
   final boolean h;
   final boolean i;

   protected ee(boolean $$0, boolean $$1) {
      this.h = $$0;
      this.i = $$1;
   }

   public static ee a() {
      return new ee(true, false);
   }

   public static biw a(CommandContext<dt> $$0, String $$1) throws CommandSyntaxException {
      return ((gc)$$0.getArgument($$1, gc.class)).a((dt)$$0.getSource());
   }

   public static ee b() {
      return new ee(false, false);
   }

   public static Collection<? extends biw> b(CommandContext<dt> $$0, String $$1) throws CommandSyntaxException {
      Collection<? extends biw> $$2 = c($$0, $$1);
      if ($$2.isEmpty()) {
         throw d.create();
      } else {
         return $$2;
      }
   }

   public static Collection<? extends biw> c(CommandContext<dt> $$0, String $$1) throws CommandSyntaxException {
      return ((gc)$$0.getArgument($$1, gc.class)).b((dt)$$0.getSource());
   }

   public static Collection<aku> d(CommandContext<dt> $$0, String $$1) throws CommandSyntaxException {
      return ((gc)$$0.getArgument($$1, gc.class)).d((dt)$$0.getSource());
   }

   public static ee c() {
      return new ee(true, true);
   }

   public static aku e(CommandContext<dt> $$0, String $$1) throws CommandSyntaxException {
      return ((gc)$$0.getArgument($$1, gc.class)).c((dt)$$0.getSource());
   }

   public static ee d() {
      return new ee(false, true);
   }

   public static Collection<aku> f(CommandContext<dt> $$0, String $$1) throws CommandSyntaxException {
      List<aku> $$2 = ((gc)$$0.getArgument($$1, gc.class)).d((dt)$$0.getSource());
      if ($$2.isEmpty()) {
         throw e.create();
      } else {
         return $$2;
      }
   }

   public gc a(StringReader $$0) throws CommandSyntaxException {
      int $$1 = 0;
      gd $$2 = new gd($$0);
      gc $$3 = $$2.t();
      if ($$3.a() > 1 && this.h) {
         if (this.i) {
            $$0.setCursor(0);
            throw b.createWithContext($$0);
         } else {
            $$0.setCursor(0);
            throw a.createWithContext($$0);
         }
      } else if ($$3.b() && this.i && !$$3.c()) {
         $$0.setCursor(0);
         throw c.createWithContext($$0);
      } else {
         return $$3;
      }
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      if ($$0.getSource() instanceof dw $$2) {
         StringReader $$3 = new StringReader($$1.getInput());
         $$3.setCursor($$1.getStart());
         gd $$4 = new gd($$3, $$2.c(2));

         try {
            $$4.t();
         } catch (CommandSyntaxException var7) {
         }

         return $$4.a($$1, $$1x -> {
            Collection<String> $$2x = $$2.q();
            Iterable<String> $$3x = (Iterable<String>)(this.i ? $$2x : Iterables.concat($$2x, $$2.y()));
            dw.b($$3x, $$1x);
         });
      } else {
         return Suggestions.empty();
      }
   }

   public Collection<String> getExamples() {
      return g;
   }

   public static class a implements gi<ee, ee.a.a> {
      private static final byte a = 1;
      private static final byte b = 2;

      public void a(ee.a.a $$0, so $$1) {
         int $$2 = 0;
         if ($$0.b) {
            $$2 |= 1;
         }

         if ($$0.c) {
            $$2 |= 2;
         }

         $$1.k($$2);
      }

      public ee.a.a a(so $$0) {
         byte $$1 = $$0.readByte();
         return new ee.a.a(($$1 & 1) != 0, ($$1 & 2) != 0);
      }

      public void a(ee.a.a $$0, JsonObject $$1) {
         $$1.addProperty("amount", $$0.b ? "single" : "multiple");
         $$1.addProperty("type", $$0.c ? "players" : "entities");
      }

      public ee.a.a a(ee $$0) {
         return new ee.a.a($$0.h, $$0.i);
      }

      public final class a implements gi.a<ee> {
         final boolean b;
         final boolean c;

         a(boolean $$1, boolean $$2) {
            this.b = $$1;
            this.c = $$2;
         }

         public ee a(dn $$0) {
            return new ee(this.b, this.c);
         }

         @Override
         public gi<ee, ?> a() {
            return a.this;
         }
      }
   }
}
