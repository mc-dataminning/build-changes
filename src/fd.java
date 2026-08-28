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

public class fd implements ArgumentType<hf> {
   private static final Collection<String> g = Arrays.asList("Player", "0123", "@e", "@e[type=foo]", "dd12be42-52a9-4a91-a8a1-11c01849e498");
   public static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(wu.c("argument.entity.toomany"));
   public static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(wu.c("argument.player.toomany"));
   public static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(wu.c("argument.player.entities"));
   public static final SimpleCommandExceptionType d = new SimpleCommandExceptionType(wu.c("argument.entity.notfound.entity"));
   public static final SimpleCommandExceptionType e = new SimpleCommandExceptionType(wu.c("argument.entity.notfound.player"));
   public static final SimpleCommandExceptionType f = new SimpleCommandExceptionType(wu.c("argument.entity.selector.not_allowed"));
   final boolean h;
   final boolean i;

   protected fd(boolean $$0, boolean $$1) {
      this.h = $$0;
      this.i = $$1;
   }

   public static fd a() {
      return new fd(true, false);
   }

   public static bsg a(CommandContext<eq> $$0, String $$1) throws CommandSyntaxException {
      return ((hf)$$0.getArgument($$1, hf.class)).a((eq)$$0.getSource());
   }

   public static fd b() {
      return new fd(false, false);
   }

   public static Collection<? extends bsg> b(CommandContext<eq> $$0, String $$1) throws CommandSyntaxException {
      Collection<? extends bsg> $$2 = c($$0, $$1);
      if ($$2.isEmpty()) {
         throw d.create();
      } else {
         return $$2;
      }
   }

   public static Collection<? extends bsg> c(CommandContext<eq> $$0, String $$1) throws CommandSyntaxException {
      return ((hf)$$0.getArgument($$1, hf.class)).b((eq)$$0.getSource());
   }

   public static Collection<aqn> d(CommandContext<eq> $$0, String $$1) throws CommandSyntaxException {
      return ((hf)$$0.getArgument($$1, hf.class)).d((eq)$$0.getSource());
   }

   public static fd c() {
      return new fd(true, true);
   }

   public static aqn e(CommandContext<eq> $$0, String $$1) throws CommandSyntaxException {
      return ((hf)$$0.getArgument($$1, hf.class)).c((eq)$$0.getSource());
   }

   public static fd d() {
      return new fd(false, true);
   }

   public static Collection<aqn> f(CommandContext<eq> $$0, String $$1) throws CommandSyntaxException {
      List<aqn> $$2 = ((hf)$$0.getArgument($$1, hf.class)).d((eq)$$0.getSource());
      if ($$2.isEmpty()) {
         throw e.create();
      } else {
         return $$2;
      }
   }

   public hf a(StringReader $$0) throws CommandSyntaxException {
      int $$1 = 0;
      hg $$2 = new hg($$0);
      hf $$3 = $$2.t();
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
      if ($$0.getSource() instanceof ev $$2) {
         StringReader $$3 = new StringReader($$1.getInput());
         $$3.setCursor($$1.getStart());
         hg $$4 = new hg($$3, $$2.c(2));

         try {
            $$4.t();
         } catch (CommandSyntaxException var7) {
         }

         return $$4.a($$1, $$1x -> {
            Collection<String> $$2x = $$2.q();
            Iterable<String> $$3x = (Iterable<String>)(this.i ? $$2x : Iterables.concat($$2x, $$2.A()));
            ev.b($$3x, $$1x);
         });
      } else {
         return Suggestions.empty();
      }
   }

   public Collection<String> getExamples() {
      return g;
   }

   public static class a implements il<fd, fd.a.a> {
      private static final byte a = 1;
      private static final byte b = 2;

      public void a(fd.a.a $$0, vr $$1) {
         int $$2 = 0;
         if ($$0.b) {
            $$2 |= 1;
         }

         if ($$0.c) {
            $$2 |= 2;
         }

         $$1.k($$2);
      }

      public fd.a.a a(vr $$0) {
         byte $$1 = $$0.readByte();
         return new fd.a.a(($$1 & 1) != 0, ($$1 & 2) != 0);
      }

      public void a(fd.a.a $$0, JsonObject $$1) {
         $$1.addProperty("amount", $$0.b ? "single" : "multiple");
         $$1.addProperty("type", $$0.c ? "players" : "entities");
      }

      public fd.a.a a(fd $$0) {
         return new fd.a.a($$0.h, $$0.i);
      }

      public final class a implements il.a<fd> {
         final boolean b;
         final boolean c;

         a(final boolean $$1, final boolean $$2) {
            this.b = $$1;
            this.c = $$2;
         }

         public fd a(em $$0) {
            return new fd(this.b, this.c);
         }

         @Override
         public il<fd, ?> a() {
            return a.this;
         }
      }
   }
}
