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

public class ev implements ArgumentType<gy> {
   private static final Collection<String> g = Arrays.asList("Player", "0123", "@e", "@e[type=foo]", "dd12be42-52a9-4a91-a8a1-11c01849e498");
   public static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(wy.c("argument.entity.toomany"));
   public static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(wy.c("argument.player.toomany"));
   public static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(wy.c("argument.player.entities"));
   public static final SimpleCommandExceptionType d = new SimpleCommandExceptionType(wy.c("argument.entity.notfound.entity"));
   public static final SimpleCommandExceptionType e = new SimpleCommandExceptionType(wy.c("argument.entity.notfound.player"));
   public static final SimpleCommandExceptionType f = new SimpleCommandExceptionType(wy.c("argument.entity.selector.not_allowed"));
   final boolean h;
   final boolean i;

   protected ev(boolean $$0, boolean $$1) {
      this.h = $$0;
      this.i = $$1;
   }

   public static ev a() {
      return new ev(true, false);
   }

   public static bwf a(CommandContext<ei> $$0, String $$1) throws CommandSyntaxException {
      return ((gy)$$0.getArgument($$1, gy.class)).a((ei)$$0.getSource());
   }

   public static ev b() {
      return new ev(false, false);
   }

   public static Collection<? extends bwf> b(CommandContext<ei> $$0, String $$1) throws CommandSyntaxException {
      Collection<? extends bwf> $$2 = c($$0, $$1);
      if ($$2.isEmpty()) {
         throw d.create();
      } else {
         return $$2;
      }
   }

   public static Collection<? extends bwf> c(CommandContext<ei> $$0, String $$1) throws CommandSyntaxException {
      return ((gy)$$0.getArgument($$1, gy.class)).b((ei)$$0.getSource());
   }

   public static Collection<arr> d(CommandContext<ei> $$0, String $$1) throws CommandSyntaxException {
      return ((gy)$$0.getArgument($$1, gy.class)).d((ei)$$0.getSource());
   }

   public static ev c() {
      return new ev(true, true);
   }

   public static arr e(CommandContext<ei> $$0, String $$1) throws CommandSyntaxException {
      return ((gy)$$0.getArgument($$1, gy.class)).c((ei)$$0.getSource());
   }

   public static ev d() {
      return new ev(false, true);
   }

   public static Collection<arr> f(CommandContext<ei> $$0, String $$1) throws CommandSyntaxException {
      List<arr> $$2 = ((gy)$$0.getArgument($$1, gy.class)).d((ei)$$0.getSource());
      if ($$2.isEmpty()) {
         throw e.create();
      } else {
         return $$2;
      }
   }

   public gy a(StringReader $$0) throws CommandSyntaxException {
      return this.a($$0, true);
   }

   public <S> gy a(StringReader $$0, S $$1) throws CommandSyntaxException {
      return this.a($$0, gz.a($$1));
   }

   private gy a(StringReader $$0, boolean $$1) throws CommandSyntaxException {
      int $$2 = 0;
      gz $$3 = new gz($$0, $$1);
      gy $$4 = $$3.t();
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
      if ($$0.getSource() instanceof en $$2) {
         StringReader $$3 = new StringReader($$1.getInput());
         $$3.setCursor($$1.getStart());
         gz $$4 = new gz($$3, gz.a($$2));

         try {
            $$4.t();
         } catch (CommandSyntaxException var7) {
         }

         return $$4.a($$1, $$1x -> {
            Collection<String> $$2x = $$2.q();
            Iterable<String> $$3x = (Iterable<String>)(this.i ? $$2x : Iterables.concat($$2x, $$2.z()));
            en.b($$3x, $$1x);
         });
      } else {
         return Suggestions.empty();
      }
   }

   public Collection<String> getExamples() {
      return g;
   }

   public static class a implements ie<ev, ev.a.a> {
      private static final byte a = 1;
      private static final byte b = 2;

      public void a(ev.a.a $$0, vu $$1) {
         int $$2 = 0;
         if ($$0.b) {
            $$2 |= 1;
         }

         if ($$0.c) {
            $$2 |= 2;
         }

         $$1.l($$2);
      }

      public ev.a.a a(vu $$0) {
         byte $$1 = $$0.readByte();
         return new ev.a.a(($$1 & 1) != 0, ($$1 & 2) != 0);
      }

      public void a(ev.a.a $$0, JsonObject $$1) {
         $$1.addProperty("amount", $$0.b ? "single" : "multiple");
         $$1.addProperty("type", $$0.c ? "players" : "entities");
      }

      public ev.a.a a(ev $$0) {
         return new ev.a.a($$0.h, $$0.i);
      }

      public final class a implements ie.a<ev> {
         final boolean b;
         final boolean c;

         a(final boolean $$1, final boolean $$2) {
            this.b = $$1;
            this.c = $$2;
         }

         public ev a(ee $$0) {
            return new ev(this.b, this.c);
         }

         @Override
         public ie<ev, ?> a() {
            return a.this;
         }
      }
   }
}
