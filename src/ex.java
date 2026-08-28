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

public class ex implements ArgumentType<ha> {
   private static final Collection<String> g = Arrays.asList("Player", "0123", "@e", "@e[type=foo]", "dd12be42-52a9-4a91-a8a1-11c01849e498");
   public static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(xc.c("argument.entity.toomany"));
   public static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(xc.c("argument.player.toomany"));
   public static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(xc.c("argument.player.entities"));
   public static final SimpleCommandExceptionType d = new SimpleCommandExceptionType(xc.c("argument.entity.notfound.entity"));
   public static final SimpleCommandExceptionType e = new SimpleCommandExceptionType(xc.c("argument.entity.notfound.player"));
   public static final SimpleCommandExceptionType f = new SimpleCommandExceptionType(xc.c("argument.entity.selector.not_allowed"));
   final boolean h;
   final boolean i;

   protected ex(boolean $$0, boolean $$1) {
      this.h = $$0;
      this.i = $$1;
   }

   public static ex a() {
      return new ex(true, false);
   }

   public static bwv a(CommandContext<ek> $$0, String $$1) throws CommandSyntaxException {
      return ((ha)$$0.getArgument($$1, ha.class)).a((ek)$$0.getSource());
   }

   public static ex b() {
      return new ex(false, false);
   }

   public static Collection<? extends bwv> b(CommandContext<ek> $$0, String $$1) throws CommandSyntaxException {
      Collection<? extends bwv> $$2 = c($$0, $$1);
      if ($$2.isEmpty()) {
         throw d.create();
      } else {
         return $$2;
      }
   }

   public static Collection<? extends bwv> c(CommandContext<ek> $$0, String $$1) throws CommandSyntaxException {
      return ((ha)$$0.getArgument($$1, ha.class)).b((ek)$$0.getSource());
   }

   public static Collection<arv> d(CommandContext<ek> $$0, String $$1) throws CommandSyntaxException {
      return ((ha)$$0.getArgument($$1, ha.class)).d((ek)$$0.getSource());
   }

   public static ex c() {
      return new ex(true, true);
   }

   public static arv e(CommandContext<ek> $$0, String $$1) throws CommandSyntaxException {
      return ((ha)$$0.getArgument($$1, ha.class)).c((ek)$$0.getSource());
   }

   public static ex d() {
      return new ex(false, true);
   }

   public static Collection<arv> f(CommandContext<ek> $$0, String $$1) throws CommandSyntaxException {
      List<arv> $$2 = ((ha)$$0.getArgument($$1, ha.class)).d((ek)$$0.getSource());
      if ($$2.isEmpty()) {
         throw e.create();
      } else {
         return $$2;
      }
   }

   public ha a(StringReader $$0) throws CommandSyntaxException {
      return this.a($$0, true);
   }

   public <S> ha a(StringReader $$0, S $$1) throws CommandSyntaxException {
      return this.a($$0, hb.a($$1));
   }

   private ha a(StringReader $$0, boolean $$1) throws CommandSyntaxException {
      int $$2 = 0;
      hb $$3 = new hb($$0, $$1);
      ha $$4 = $$3.t();
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
      if ($$0.getSource() instanceof ep $$2) {
         StringReader $$3 = new StringReader($$1.getInput());
         $$3.setCursor($$1.getStart());
         hb $$4 = new hb($$3, hb.a($$2));

         try {
            $$4.t();
         } catch (CommandSyntaxException var7) {
         }

         return $$4.a($$1, $$1x -> {
            Collection<String> $$2x = $$2.q();
            Iterable<String> $$3x = (Iterable<String>)(this.i ? $$2x : Iterables.concat($$2x, $$2.z()));
            ep.b($$3x, $$1x);
         });
      } else {
         return Suggestions.empty();
      }
   }

   public Collection<String> getExamples() {
      return g;
   }

   public static class a implements ih<ex, ex.a.a> {
      private static final byte a = 1;
      private static final byte b = 2;

      public void a(ex.a.a $$0, vy $$1) {
         int $$2 = 0;
         if ($$0.b) {
            $$2 |= 1;
         }

         if ($$0.c) {
            $$2 |= 2;
         }

         $$1.l($$2);
      }

      public ex.a.a a(vy $$0) {
         byte $$1 = $$0.readByte();
         return new ex.a.a(($$1 & 1) != 0, ($$1 & 2) != 0);
      }

      public void a(ex.a.a $$0, JsonObject $$1) {
         $$1.addProperty("amount", $$0.b ? "single" : "multiple");
         $$1.addProperty("type", $$0.c ? "players" : "entities");
      }

      public ex.a.a a(ex $$0) {
         return new ex.a.a($$0.h, $$0.i);
      }

      public final class a implements ih.a<ex> {
         final boolean b;
         final boolean c;

         a(final boolean $$1, final boolean $$2) {
            this.b = $$1;
            this.c = $$2;
         }

         public ex a(eg $$0) {
            return new ex(this.b, this.c);
         }

         @Override
         public ih<ex, ?> a() {
            return a.this;
         }
      }
   }
}
