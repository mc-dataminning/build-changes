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

public class eg implements ArgumentType<ge> {
   private static final Collection<String> g = Arrays.asList("Player", "0123", "@e", "@e[type=foo]", "dd12be42-52a9-4a91-a8a1-11c01849e498");
   public static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(uv.c("argument.entity.toomany"));
   public static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(uv.c("argument.player.toomany"));
   public static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(uv.c("argument.player.entities"));
   public static final SimpleCommandExceptionType d = new SimpleCommandExceptionType(uv.c("argument.entity.notfound.entity"));
   public static final SimpleCommandExceptionType e = new SimpleCommandExceptionType(uv.c("argument.entity.notfound.player"));
   public static final SimpleCommandExceptionType f = new SimpleCommandExceptionType(uv.c("argument.entity.selector.not_allowed"));
   final boolean h;
   final boolean i;

   protected eg(boolean $$0, boolean $$1) {
      this.h = $$0;
      this.i = $$1;
   }

   public static eg a() {
      return new eg(true, false);
   }

   public static bkv a(CommandContext<du> $$0, String $$1) throws CommandSyntaxException {
      return ((ge)$$0.getArgument($$1, ge.class)).a((du)$$0.getSource());
   }

   public static eg b() {
      return new eg(false, false);
   }

   public static Collection<? extends bkv> b(CommandContext<du> $$0, String $$1) throws CommandSyntaxException {
      Collection<? extends bkv> $$2 = c($$0, $$1);
      if ($$2.isEmpty()) {
         throw d.create();
      } else {
         return $$2;
      }
   }

   public static Collection<? extends bkv> c(CommandContext<du> $$0, String $$1) throws CommandSyntaxException {
      return ((ge)$$0.getArgument($$1, ge.class)).b((du)$$0.getSource());
   }

   public static Collection<amj> d(CommandContext<du> $$0, String $$1) throws CommandSyntaxException {
      return ((ge)$$0.getArgument($$1, ge.class)).d((du)$$0.getSource());
   }

   public static eg c() {
      return new eg(true, true);
   }

   public static amj e(CommandContext<du> $$0, String $$1) throws CommandSyntaxException {
      return ((ge)$$0.getArgument($$1, ge.class)).c((du)$$0.getSource());
   }

   public static eg d() {
      return new eg(false, true);
   }

   public static Collection<amj> f(CommandContext<du> $$0, String $$1) throws CommandSyntaxException {
      List<amj> $$2 = ((ge)$$0.getArgument($$1, ge.class)).d((du)$$0.getSource());
      if ($$2.isEmpty()) {
         throw e.create();
      } else {
         return $$2;
      }
   }

   public ge a(StringReader $$0) throws CommandSyntaxException {
      int $$1 = 0;
      gf $$2 = new gf($$0);
      ge $$3 = $$2.t();
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
      if ($$0.getSource() instanceof dy $$2) {
         StringReader $$3 = new StringReader($$1.getInput());
         $$3.setCursor($$1.getStart());
         gf $$4 = new gf($$3, $$2.c(2));

         try {
            $$4.t();
         } catch (CommandSyntaxException var7) {
         }

         return $$4.a($$1, $$1x -> {
            Collection<String> $$2x = $$2.q();
            Iterable<String> $$3x = (Iterable<String>)(this.i ? $$2x : Iterables.concat($$2x, $$2.A()));
            dy.b($$3x, $$1x);
         });
      } else {
         return Suggestions.empty();
      }
   }

   public Collection<String> getExamples() {
      return g;
   }

   public static class a implements hj<eg, eg.a.a> {
      private static final byte a = 1;
      private static final byte b = 2;

      public void a(eg.a.a $$0, ty $$1) {
         int $$2 = 0;
         if ($$0.b) {
            $$2 |= 1;
         }

         if ($$0.c) {
            $$2 |= 2;
         }

         $$1.k($$2);
      }

      public eg.a.a a(ty $$0) {
         byte $$1 = $$0.readByte();
         return new eg.a.a(($$1 & 1) != 0, ($$1 & 2) != 0);
      }

      public void a(eg.a.a $$0, JsonObject $$1) {
         $$1.addProperty("amount", $$0.b ? "single" : "multiple");
         $$1.addProperty("type", $$0.c ? "players" : "entities");
      }

      public eg.a.a a(eg $$0) {
         return new eg.a.a($$0.h, $$0.i);
      }

      public final class a implements hj.a<eg> {
         final boolean b;
         final boolean c;

         a(boolean $$1, boolean $$2) {
            this.b = $$1;
            this.c = $$2;
         }

         public eg a(dp $$0) {
            return new eg(this.b, this.c);
         }

         @Override
         public hj<eg, ?> a() {
            return a.this;
         }
      }
   }
}
