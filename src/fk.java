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

public class fk implements ArgumentType<hm> {
   private static final Collection<String> g = Arrays.asList("Player", "0123", "@e", "@e[type=foo]", "dd12be42-52a9-4a91-a8a1-11c01849e498");
   public static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(wp.c("argument.entity.toomany"));
   public static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(wp.c("argument.player.toomany"));
   public static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(wp.c("argument.player.entities"));
   public static final SimpleCommandExceptionType d = new SimpleCommandExceptionType(wp.c("argument.entity.notfound.entity"));
   public static final SimpleCommandExceptionType e = new SimpleCommandExceptionType(wp.c("argument.entity.notfound.player"));
   public static final SimpleCommandExceptionType f = new SimpleCommandExceptionType(wp.c("argument.entity.selector.not_allowed"));
   final boolean h;
   final boolean i;

   protected fk(boolean $$0, boolean $$1) {
      this.h = $$0;
      this.i = $$1;
   }

   public static fk a() {
      return new fk(true, false);
   }

   public static bul a(CommandContext<ex> $$0, String $$1) throws CommandSyntaxException {
      return ((hm)$$0.getArgument($$1, hm.class)).a((ex)$$0.getSource());
   }

   public static fk b() {
      return new fk(false, false);
   }

   public static Collection<? extends bul> b(CommandContext<ex> $$0, String $$1) throws CommandSyntaxException {
      Collection<? extends bul> $$2 = c($$0, $$1);
      if ($$2.isEmpty()) {
         throw d.create();
      } else {
         return $$2;
      }
   }

   public static Collection<? extends bul> c(CommandContext<ex> $$0, String $$1) throws CommandSyntaxException {
      return ((hm)$$0.getArgument($$1, hm.class)).b((ex)$$0.getSource());
   }

   public static Collection<are> d(CommandContext<ex> $$0, String $$1) throws CommandSyntaxException {
      return ((hm)$$0.getArgument($$1, hm.class)).d((ex)$$0.getSource());
   }

   public static fk c() {
      return new fk(true, true);
   }

   public static are e(CommandContext<ex> $$0, String $$1) throws CommandSyntaxException {
      return ((hm)$$0.getArgument($$1, hm.class)).c((ex)$$0.getSource());
   }

   public static fk d() {
      return new fk(false, true);
   }

   public static Collection<are> f(CommandContext<ex> $$0, String $$1) throws CommandSyntaxException {
      List<are> $$2 = ((hm)$$0.getArgument($$1, hm.class)).d((ex)$$0.getSource());
      if ($$2.isEmpty()) {
         throw e.create();
      } else {
         return $$2;
      }
   }

   public hm a(StringReader $$0) throws CommandSyntaxException {
      return this.a($$0, true);
   }

   public <S> hm a(StringReader $$0, S $$1) throws CommandSyntaxException {
      return this.a($$0, hn.a($$1));
   }

   private hm a(StringReader $$0, boolean $$1) throws CommandSyntaxException {
      int $$2 = 0;
      hn $$3 = new hn($$0, $$1);
      hm $$4 = $$3.t();
      if ($$4.a() > 1 && this.h) {
         if (this.i) {
            $$0.setCursor(0);
            throw b.createWithContext($$0);
         } else {
            $$0.setCursor(0);
            throw a.createWithContext($$0);
         }
      } else if ($$4.b() && this.i && !$$4.c()) {
         $$0.setCursor(0);
         throw c.createWithContext($$0);
      } else {
         return $$4;
      }
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      if ($$0.getSource() instanceof fc $$2) {
         StringReader $$3 = new StringReader($$1.getInput());
         $$3.setCursor($$1.getStart());
         hn $$4 = new hn($$3, hn.a($$2));

         try {
            $$4.t();
         } catch (CommandSyntaxException var7) {
         }

         return $$4.a($$1, $$1x -> {
            Collection<String> $$2x = $$2.q();
            Iterable<String> $$3x = (Iterable<String>)(this.i ? $$2x : Iterables.concat($$2x, $$2.z()));
            fc.b($$3x, $$1x);
         });
      } else {
         return Suggestions.empty();
      }
   }

   public Collection<String> getExamples() {
      return g;
   }

   public static class a implements it<fk, fk.a.a> {
      private static final byte a = 1;
      private static final byte b = 2;

      public void a(fk.a.a $$0, vl $$1) {
         int $$2 = 0;
         if ($$0.b) {
            $$2 |= 1;
         }

         if ($$0.c) {
            $$2 |= 2;
         }

         $$1.l($$2);
      }

      public fk.a.a a(vl $$0) {
         byte $$1 = $$0.readByte();
         return new fk.a.a(($$1 & 1) != 0, ($$1 & 2) != 0);
      }

      public void a(fk.a.a $$0, JsonObject $$1) {
         $$1.addProperty("amount", $$0.b ? "single" : "multiple");
         $$1.addProperty("type", $$0.c ? "players" : "entities");
      }

      public fk.a.a a(fk $$0) {
         return new fk.a.a($$0.h, $$0.i);
      }

      public final class a implements it.a<fk> {
         final boolean b;
         final boolean c;

         a(final boolean $$1, final boolean $$2) {
            this.b = $$1;
            this.c = $$2;
         }

         public fk a(et $$0) {
            return new fk(this.b, this.c);
         }

         @Override
         public it<fk, ?> a() {
            return a.this;
         }
      }
   }
}
