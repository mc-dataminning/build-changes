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

public class er implements ArgumentType<gt> {
   private static final Collection<String> g = Arrays.asList("Player", "0123", "@e", "@e[type=foo]", "dd12be42-52a9-4a91-a8a1-11c01849e498");
   public static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(wx.c("argument.entity.toomany"));
   public static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(wx.c("argument.player.toomany"));
   public static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(wx.c("argument.player.entities"));
   public static final SimpleCommandExceptionType d = new SimpleCommandExceptionType(wx.c("argument.entity.notfound.entity"));
   public static final SimpleCommandExceptionType e = new SimpleCommandExceptionType(wx.c("argument.entity.notfound.player"));
   public static final SimpleCommandExceptionType f = new SimpleCommandExceptionType(wx.c("argument.entity.selector.not_allowed"));
   final boolean h;
   final boolean i;

   protected er(boolean $$0, boolean $$1) {
      this.h = $$0;
      this.i = $$1;
   }

   public static er a() {
      return new er(true, false);
   }

   public static brw a(CommandContext<ee> $$0, String $$1) throws CommandSyntaxException {
      return ((gt)$$0.getArgument($$1, gt.class)).a((ee)$$0.getSource());
   }

   public static er b() {
      return new er(false, false);
   }

   public static Collection<? extends brw> b(CommandContext<ee> $$0, String $$1) throws CommandSyntaxException {
      Collection<? extends brw> $$2 = c($$0, $$1);
      if ($$2.isEmpty()) {
         throw d.create();
      } else {
         return $$2;
      }
   }

   public static Collection<? extends brw> c(CommandContext<ee> $$0, String $$1) throws CommandSyntaxException {
      return ((gt)$$0.getArgument($$1, gt.class)).b((ee)$$0.getSource());
   }

   public static Collection<aqo> d(CommandContext<ee> $$0, String $$1) throws CommandSyntaxException {
      return ((gt)$$0.getArgument($$1, gt.class)).d((ee)$$0.getSource());
   }

   public static er c() {
      return new er(true, true);
   }

   public static aqo e(CommandContext<ee> $$0, String $$1) throws CommandSyntaxException {
      return ((gt)$$0.getArgument($$1, gt.class)).c((ee)$$0.getSource());
   }

   public static er d() {
      return new er(false, true);
   }

   public static Collection<aqo> f(CommandContext<ee> $$0, String $$1) throws CommandSyntaxException {
      List<aqo> $$2 = ((gt)$$0.getArgument($$1, gt.class)).d((ee)$$0.getSource());
      if ($$2.isEmpty()) {
         throw e.create();
      } else {
         return $$2;
      }
   }

   public gt a(StringReader $$0) throws CommandSyntaxException {
      int $$1 = 0;
      gu $$2 = new gu($$0);
      gt $$3 = $$2.t();
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
      if ($$0.getSource() instanceof ej $$2) {
         StringReader $$3 = new StringReader($$1.getInput());
         $$3.setCursor($$1.getStart());
         gu $$4 = new gu($$3, $$2.c(2));

         try {
            $$4.t();
         } catch (CommandSyntaxException var7) {
         }

         return $$4.a($$1, $$1x -> {
            Collection<String> $$2x = $$2.q();
            Iterable<String> $$3x = (Iterable<String>)(this.i ? $$2x : Iterables.concat($$2x, $$2.A()));
            ej.b($$3x, $$1x);
         });
      } else {
         return Suggestions.empty();
      }
   }

   public Collection<String> getExamples() {
      return g;
   }

   public static class a implements hy<er, er.a.a> {
      private static final byte a = 1;
      private static final byte b = 2;

      public void a(er.a.a $$0, vx $$1) {
         int $$2 = 0;
         if ($$0.b) {
            $$2 |= 1;
         }

         if ($$0.c) {
            $$2 |= 2;
         }

         $$1.k($$2);
      }

      public er.a.a a(vx $$0) {
         byte $$1 = $$0.readByte();
         return new er.a.a(($$1 & 1) != 0, ($$1 & 2) != 0);
      }

      public void a(er.a.a $$0, JsonObject $$1) {
         $$1.addProperty("amount", $$0.b ? "single" : "multiple");
         $$1.addProperty("type", $$0.c ? "players" : "entities");
      }

      public er.a.a a(er $$0) {
         return new er.a.a($$0.h, $$0.i);
      }

      public final class a implements hy.a<er> {
         final boolean b;
         final boolean c;

         a(boolean $$1, boolean $$2) {
            this.b = $$1;
            this.c = $$2;
         }

         public er a(ea $$0) {
            return new er(this.b, this.c);
         }

         @Override
         public hy<er, ?> a() {
            return a.this;
         }
      }
   }
}
