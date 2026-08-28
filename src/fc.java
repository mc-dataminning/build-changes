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

public class fc implements ArgumentType<he> {
   private static final Collection<String> g = Arrays.asList("Player", "0123", "@e", "@e[type=foo]", "dd12be42-52a9-4a91-a8a1-11c01849e498");
   public static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(xl.c("argument.entity.toomany"));
   public static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(xl.c("argument.player.toomany"));
   public static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(xl.c("argument.player.entities"));
   public static final SimpleCommandExceptionType d = new SimpleCommandExceptionType(xl.c("argument.entity.notfound.entity"));
   public static final SimpleCommandExceptionType e = new SimpleCommandExceptionType(xl.c("argument.entity.notfound.player"));
   public static final SimpleCommandExceptionType f = new SimpleCommandExceptionType(xl.c("argument.entity.selector.not_allowed"));
   final boolean h;
   final boolean i;

   protected fc(boolean $$0, boolean $$1) {
      this.h = $$0;
      this.i = $$1;
   }

   public static fc a() {
      return new fc(true, false);
   }

   public static bsp a(CommandContext<ep> $$0, String $$1) throws CommandSyntaxException {
      return ((he)$$0.getArgument($$1, he.class)).a((ep)$$0.getSource());
   }

   public static fc b() {
      return new fc(false, false);
   }

   public static Collection<? extends bsp> b(CommandContext<ep> $$0, String $$1) throws CommandSyntaxException {
      Collection<? extends bsp> $$2 = c($$0, $$1);
      if ($$2.isEmpty()) {
         throw d.create();
      } else {
         return $$2;
      }
   }

   public static Collection<? extends bsp> c(CommandContext<ep> $$0, String $$1) throws CommandSyntaxException {
      return ((he)$$0.getArgument($$1, he.class)).b((ep)$$0.getSource());
   }

   public static Collection<arc> d(CommandContext<ep> $$0, String $$1) throws CommandSyntaxException {
      return ((he)$$0.getArgument($$1, he.class)).d((ep)$$0.getSource());
   }

   public static fc c() {
      return new fc(true, true);
   }

   public static arc e(CommandContext<ep> $$0, String $$1) throws CommandSyntaxException {
      return ((he)$$0.getArgument($$1, he.class)).c((ep)$$0.getSource());
   }

   public static fc d() {
      return new fc(false, true);
   }

   public static Collection<arc> f(CommandContext<ep> $$0, String $$1) throws CommandSyntaxException {
      List<arc> $$2 = ((he)$$0.getArgument($$1, he.class)).d((ep)$$0.getSource());
      if ($$2.isEmpty()) {
         throw e.create();
      } else {
         return $$2;
      }
   }

   public he a(StringReader $$0) throws CommandSyntaxException {
      int $$1 = 0;
      hf $$2 = new hf($$0);
      he $$3 = $$2.t();
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
      if ($$0.getSource() instanceof eu $$2) {
         StringReader $$3 = new StringReader($$1.getInput());
         $$3.setCursor($$1.getStart());
         hf $$4 = new hf($$3, $$2.c(2));

         try {
            $$4.t();
         } catch (CommandSyntaxException var7) {
         }

         return $$4.a($$1, $$1x -> {
            Collection<String> $$2x = $$2.q();
            Iterable<String> $$3x = (Iterable<String>)(this.i ? $$2x : Iterables.concat($$2x, $$2.A()));
            eu.b($$3x, $$1x);
         });
      } else {
         return Suggestions.empty();
      }
   }

   public Collection<String> getExamples() {
      return g;
   }

   public static class a implements ik<fc, fc.a.a> {
      private static final byte a = 1;
      private static final byte b = 2;

      public void a(fc.a.a $$0, wl $$1) {
         int $$2 = 0;
         if ($$0.b) {
            $$2 |= 1;
         }

         if ($$0.c) {
            $$2 |= 2;
         }

         $$1.k($$2);
      }

      public fc.a.a a(wl $$0) {
         byte $$1 = $$0.readByte();
         return new fc.a.a(($$1 & 1) != 0, ($$1 & 2) != 0);
      }

      public void a(fc.a.a $$0, JsonObject $$1) {
         $$1.addProperty("amount", $$0.b ? "single" : "multiple");
         $$1.addProperty("type", $$0.c ? "players" : "entities");
      }

      public fc.a.a a(fc $$0) {
         return new fc.a.a($$0.h, $$0.i);
      }

      public final class a implements ik.a<fc> {
         final boolean b;
         final boolean c;

         a(final boolean $$1, final boolean $$2) {
            this.b = $$1;
            this.c = $$2;
         }

         public fc a(el $$0) {
            return new fc(this.b, this.c);
         }

         @Override
         public ik<fc, ?> a() {
            return a.this;
         }
      }
   }
}
