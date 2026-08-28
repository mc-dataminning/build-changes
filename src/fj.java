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

public class fj implements ArgumentType<hl> {
   private static final Collection<String> g = Arrays.asList("Player", "0123", "@e", "@e[type=foo]", "dd12be42-52a9-4a91-a8a1-11c01849e498");
   public static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(xk.c("argument.entity.toomany"));
   public static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(xk.c("argument.player.toomany"));
   public static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(xk.c("argument.player.entities"));
   public static final SimpleCommandExceptionType d = new SimpleCommandExceptionType(xk.c("argument.entity.notfound.entity"));
   public static final SimpleCommandExceptionType e = new SimpleCommandExceptionType(xk.c("argument.entity.notfound.player"));
   public static final SimpleCommandExceptionType f = new SimpleCommandExceptionType(xk.c("argument.entity.selector.not_allowed"));
   final boolean h;
   final boolean i;

   protected fj(boolean $$0, boolean $$1) {
      this.h = $$0;
      this.i = $$1;
   }

   public static fj a() {
      return new fj(true, false);
   }

   public static bvb a(CommandContext<ew> $$0, String $$1) throws CommandSyntaxException {
      return ((hl)$$0.getArgument($$1, hl.class)).a((ew)$$0.getSource());
   }

   public static fj b() {
      return new fj(false, false);
   }

   public static Collection<? extends bvb> b(CommandContext<ew> $$0, String $$1) throws CommandSyntaxException {
      Collection<? extends bvb> $$2 = c($$0, $$1);
      if ($$2.isEmpty()) {
         throw d.create();
      } else {
         return $$2;
      }
   }

   public static Collection<? extends bvb> c(CommandContext<ew> $$0, String $$1) throws CommandSyntaxException {
      return ((hl)$$0.getArgument($$1, hl.class)).b((ew)$$0.getSource());
   }

   public static Collection<ary> d(CommandContext<ew> $$0, String $$1) throws CommandSyntaxException {
      return ((hl)$$0.getArgument($$1, hl.class)).d((ew)$$0.getSource());
   }

   public static fj c() {
      return new fj(true, true);
   }

   public static ary e(CommandContext<ew> $$0, String $$1) throws CommandSyntaxException {
      return ((hl)$$0.getArgument($$1, hl.class)).c((ew)$$0.getSource());
   }

   public static fj d() {
      return new fj(false, true);
   }

   public static Collection<ary> f(CommandContext<ew> $$0, String $$1) throws CommandSyntaxException {
      List<ary> $$2 = ((hl)$$0.getArgument($$1, hl.class)).d((ew)$$0.getSource());
      if ($$2.isEmpty()) {
         throw e.create();
      } else {
         return $$2;
      }
   }

   public hl a(StringReader $$0) throws CommandSyntaxException {
      return this.a($$0, true);
   }

   public <S> hl a(StringReader $$0, S $$1) throws CommandSyntaxException {
      return this.a($$0, hm.a($$1));
   }

   private hl a(StringReader $$0, boolean $$1) throws CommandSyntaxException {
      int $$2 = 0;
      hm $$3 = new hm($$0, $$1);
      hl $$4 = $$3.t();
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
      if ($$0.getSource() instanceof fb $$2) {
         StringReader $$3 = new StringReader($$1.getInput());
         $$3.setCursor($$1.getStart());
         hm $$4 = new hm($$3, hm.a($$2));

         try {
            $$4.t();
         } catch (CommandSyntaxException var7) {
         }

         return $$4.a($$1, $$1x -> {
            Collection<String> $$2x = $$2.q();
            Iterable<String> $$3x = (Iterable<String>)(this.i ? $$2x : Iterables.concat($$2x, $$2.z()));
            fb.b($$3x, $$1x);
         });
      } else {
         return Suggestions.empty();
      }
   }

   public Collection<String> getExamples() {
      return g;
   }

   public static class a implements is<fj, fj.a.a> {
      private static final byte a = 1;
      private static final byte b = 2;

      public void a(fj.a.a $$0, wh $$1) {
         int $$2 = 0;
         if ($$0.b) {
            $$2 |= 1;
         }

         if ($$0.c) {
            $$2 |= 2;
         }

         $$1.l($$2);
      }

      public fj.a.a a(wh $$0) {
         byte $$1 = $$0.readByte();
         return new fj.a.a(($$1 & 1) != 0, ($$1 & 2) != 0);
      }

      public void a(fj.a.a $$0, JsonObject $$1) {
         $$1.addProperty("amount", $$0.b ? "single" : "multiple");
         $$1.addProperty("type", $$0.c ? "players" : "entities");
      }

      public fj.a.a a(fj $$0) {
         return new fj.a.a($$0.h, $$0.i);
      }

      public final class a implements is.a<fj> {
         final boolean b;
         final boolean c;

         a(final boolean $$1, final boolean $$2) {
            this.b = $$1;
            this.c = $$2;
         }

         public fj a(es $$0) {
            return new fj(this.b, this.c);
         }

         @Override
         public is<fj, ?> a() {
            return a.this;
         }
      }
   }
}
