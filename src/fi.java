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

public class fi implements ArgumentType<hk> {
   private static final Collection<String> g = Arrays.asList("Player", "0123", "@e", "@e[type=foo]", "dd12be42-52a9-4a91-a8a1-11c01849e498");
   public static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(xh.c("argument.entity.toomany"));
   public static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(xh.c("argument.player.toomany"));
   public static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(xh.c("argument.player.entities"));
   public static final SimpleCommandExceptionType d = new SimpleCommandExceptionType(xh.c("argument.entity.notfound.entity"));
   public static final SimpleCommandExceptionType e = new SimpleCommandExceptionType(xh.c("argument.entity.notfound.player"));
   public static final SimpleCommandExceptionType f = new SimpleCommandExceptionType(xh.c("argument.entity.selector.not_allowed"));
   final boolean h;
   final boolean i;

   protected fi(boolean $$0, boolean $$1) {
      this.h = $$0;
      this.i = $$1;
   }

   public static fi a() {
      return new fi(true, false);
   }

   public static btz a(CommandContext<ev> $$0, String $$1) throws CommandSyntaxException {
      return ((hk)$$0.getArgument($$1, hk.class)).a((ev)$$0.getSource());
   }

   public static fi b() {
      return new fi(false, false);
   }

   public static Collection<? extends btz> b(CommandContext<ev> $$0, String $$1) throws CommandSyntaxException {
      Collection<? extends btz> $$2 = c($$0, $$1);
      if ($$2.isEmpty()) {
         throw d.create();
      } else {
         return $$2;
      }
   }

   public static Collection<? extends btz> c(CommandContext<ev> $$0, String $$1) throws CommandSyntaxException {
      return ((hk)$$0.getArgument($$1, hk.class)).b((ev)$$0.getSource());
   }

   public static Collection<arn> d(CommandContext<ev> $$0, String $$1) throws CommandSyntaxException {
      return ((hk)$$0.getArgument($$1, hk.class)).d((ev)$$0.getSource());
   }

   public static fi c() {
      return new fi(true, true);
   }

   public static arn e(CommandContext<ev> $$0, String $$1) throws CommandSyntaxException {
      return ((hk)$$0.getArgument($$1, hk.class)).c((ev)$$0.getSource());
   }

   public static fi d() {
      return new fi(false, true);
   }

   public static Collection<arn> f(CommandContext<ev> $$0, String $$1) throws CommandSyntaxException {
      List<arn> $$2 = ((hk)$$0.getArgument($$1, hk.class)).d((ev)$$0.getSource());
      if ($$2.isEmpty()) {
         throw e.create();
      } else {
         return $$2;
      }
   }

   public hk a(StringReader $$0) throws CommandSyntaxException {
      return this.a($$0, true);
   }

   public <S> hk a(StringReader $$0, S $$1) throws CommandSyntaxException {
      return this.a($$0, hl.a($$1));
   }

   private hk a(StringReader $$0, boolean $$1) throws CommandSyntaxException {
      int $$2 = 0;
      hl $$3 = new hl($$0, $$1);
      hk $$4 = $$3.t();
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
      if ($$0.getSource() instanceof fa $$2) {
         StringReader $$3 = new StringReader($$1.getInput());
         $$3.setCursor($$1.getStart());
         hl $$4 = new hl($$3, hl.a($$2));

         try {
            $$4.t();
         } catch (CommandSyntaxException var7) {
         }

         return $$4.a($$1, $$1x -> {
            Collection<String> $$2x = $$2.q();
            Iterable<String> $$3x = (Iterable<String>)(this.i ? $$2x : Iterables.concat($$2x, $$2.A()));
            fa.b($$3x, $$1x);
         });
      } else {
         return Suggestions.empty();
      }
   }

   public Collection<String> getExamples() {
      return g;
   }

   public static class a implements ir<fi, fi.a.a> {
      private static final byte a = 1;
      private static final byte b = 2;

      public void a(fi.a.a $$0, we $$1) {
         int $$2 = 0;
         if ($$0.b) {
            $$2 |= 1;
         }

         if ($$0.c) {
            $$2 |= 2;
         }

         $$1.l($$2);
      }

      public fi.a.a a(we $$0) {
         byte $$1 = $$0.readByte();
         return new fi.a.a(($$1 & 1) != 0, ($$1 & 2) != 0);
      }

      public void a(fi.a.a $$0, JsonObject $$1) {
         $$1.addProperty("amount", $$0.b ? "single" : "multiple");
         $$1.addProperty("type", $$0.c ? "players" : "entities");
      }

      public fi.a.a a(fi $$0) {
         return new fi.a.a($$0.h, $$0.i);
      }

      public final class a implements ir.a<fi> {
         final boolean b;
         final boolean c;

         a(final boolean $$1, final boolean $$2) {
            this.b = $$1;
            this.c = $$2;
         }

         public fi a(er $$0) {
            return new fi(this.b, this.c);
         }

         @Override
         public ir<fi, ?> a() {
            return a.this;
         }
      }
   }
}
