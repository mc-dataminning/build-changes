import com.google.common.collect.Lists;
import com.mojang.authlib.GameProfile;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;

public class ez implements ArgumentType<ez.a> {
   private static final Collection<String> b = Arrays.asList("Player", "0123", "dd12be42-52a9-4a91-a8a1-11c01849e498", "@e");
   public static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(xg.c("argument.player.unknown"));

   public static Collection<GameProfile> a(CommandContext<ek> $$0, String $$1) throws CommandSyntaxException {
      return ((ez.a)$$0.getArgument($$1, ez.a.class)).getNames((ek)$$0.getSource());
   }

   public static ez a() {
      return new ez();
   }

   public <S> ez.a a(StringReader $$0, S $$1) throws CommandSyntaxException {
      return a($$0, hb.a($$1));
   }

   public ez.a a(StringReader $$0) throws CommandSyntaxException {
      return a($$0, true);
   }

   private static ez.a a(StringReader $$0, boolean $$1) throws CommandSyntaxException {
      if ($$0.canRead() && $$0.peek() == '@') {
         hb $$2 = new hb($$0, $$1);
         ha $$3 = $$2.t();
         if ($$3.b()) {
            throw ex.c.createWithContext($$0);
         } else {
            return new ez.b($$3);
         }
      } else {
         int $$4 = $$0.getCursor();

         while ($$0.canRead() && $$0.peek() != ' ') {
            $$0.skip();
         }

         String $$5 = $$0.getString().substring($$4, $$0.getCursor());
         return $$1x -> {
            Optional<GameProfile> $$2 = $$1x.l().at().a($$5);
            return Collections.singleton($$2.orElseThrow(a::create));
         };
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

         return $$4.a($$1, $$1x -> ep.b($$2.q(), $$1x));
      } else {
         return Suggestions.empty();
      }
   }

   public Collection<String> getExamples() {
      return b;
   }

   @FunctionalInterface
   public interface a {
      Collection<GameProfile> getNames(ek var1) throws CommandSyntaxException;
   }

   public static class b implements ez.a {
      private final ha a;

      public b(ha $$0) {
         this.a = $$0;
      }

      @Override
      public Collection<GameProfile> getNames(ek $$0) throws CommandSyntaxException {
         List<asc> $$1 = this.a.d($$0);
         if ($$1.isEmpty()) {
            throw ex.e.create();
         } else {
            List<GameProfile> $$2 = Lists.newArrayList();

            for (asc $$3 : $$1) {
               $$2.add($$3.gi());
            }

            return $$2;
         }
      }
   }
}
