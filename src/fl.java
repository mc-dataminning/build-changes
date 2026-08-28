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

public class fl implements ArgumentType<fl.a> {
   private static final Collection<String> b = Arrays.asList("Player", "0123", "dd12be42-52a9-4a91-a8a1-11c01849e498", "@e");
   public static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(xj.c("argument.player.unknown"));

   public static Collection<GameProfile> a(CommandContext<ew> $$0, String $$1) throws CommandSyntaxException {
      return ((fl.a)$$0.getArgument($$1, fl.a.class)).getNames((ew)$$0.getSource());
   }

   public static fl a() {
      return new fl();
   }

   public <S> fl.a a(StringReader $$0, S $$1) throws CommandSyntaxException {
      return a($$0, hm.a($$1));
   }

   public fl.a a(StringReader $$0) throws CommandSyntaxException {
      return a($$0, true);
   }

   private static fl.a a(StringReader $$0, boolean $$1) throws CommandSyntaxException {
      if ($$0.canRead() && $$0.peek() == '@') {
         hm $$2 = new hm($$0, $$1);
         hl $$3 = $$2.t();
         if ($$3.b()) {
            throw fj.c.createWithContext($$0);
         } else {
            return new fl.b($$3);
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
      if ($$0.getSource() instanceof fb $$2) {
         StringReader $$3 = new StringReader($$1.getInput());
         $$3.setCursor($$1.getStart());
         hm $$4 = new hm($$3, hm.a($$2));

         try {
            $$4.t();
         } catch (CommandSyntaxException var7) {
         }

         return $$4.a($$1, $$1x -> fb.b($$2.q(), $$1x));
      } else {
         return Suggestions.empty();
      }
   }

   public Collection<String> getExamples() {
      return b;
   }

   @FunctionalInterface
   public interface a {
      Collection<GameProfile> getNames(ew var1) throws CommandSyntaxException;
   }

   public static class b implements fl.a {
      private final hl a;

      public b(hl $$0) {
         this.a = $$0;
      }

      @Override
      public Collection<GameProfile> getNames(ew $$0) throws CommandSyntaxException {
         List<arq> $$1 = this.a.d($$0);
         if ($$1.isEmpty()) {
            throw fj.e.create();
         } else {
            List<GameProfile> $$2 = Lists.newArrayList();

            for (arq $$3 : $$1) {
               $$2.add($$3.gf());
            }

            return $$2;
         }
      }
   }
}
