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

public class fi implements ArgumentType<fi.a> {
   private static final Collection<String> b = Arrays.asList("Player", "0123", "dd12be42-52a9-4a91-a8a1-11c01849e498", "@e");
   public static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(wy.c("argument.player.unknown"));

   public static Collection<GameProfile> a(CommandContext<et> $$0, String $$1) throws CommandSyntaxException {
      return ((fi.a)$$0.getArgument($$1, fi.a.class)).getNames((et)$$0.getSource());
   }

   public static fi a() {
      return new fi();
   }

   public fi.a a(StringReader $$0) throws CommandSyntaxException {
      if ($$0.canRead() && $$0.peek() == '@') {
         hj $$1 = new hj($$0);
         hi $$2 = $$1.t();
         if ($$2.b()) {
            throw fg.c.createWithContext($$0);
         } else {
            return new fi.b($$2);
         }
      } else {
         int $$3 = $$0.getCursor();

         while ($$0.canRead() && $$0.peek() != ' ') {
            $$0.skip();
         }

         String $$4 = $$0.getString().substring($$3, $$0.getCursor());
         return $$1 -> {
            Optional<GameProfile> $$2 = $$1.l().au().a($$4);
            return Collections.singleton($$2.orElseThrow(a::create));
         };
      }
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      if ($$0.getSource() instanceof ey) {
         StringReader $$2 = new StringReader($$1.getInput());
         $$2.setCursor($$1.getStart());
         hj $$3 = new hj($$2);

         try {
            $$3.t();
         } catch (CommandSyntaxException var6) {
         }

         return $$3.a($$1, $$1x -> ey.b(((ey)$$0.getSource()).q(), $$1x));
      } else {
         return Suggestions.empty();
      }
   }

   public Collection<String> getExamples() {
      return b;
   }

   @FunctionalInterface
   public interface a {
      Collection<GameProfile> getNames(et var1) throws CommandSyntaxException;
   }

   public static class b implements fi.a {
      private final hi a;

      public b(hi $$0) {
         this.a = $$0;
      }

      @Override
      public Collection<GameProfile> getNames(et $$0) throws CommandSyntaxException {
         List<aqu> $$1 = this.a.d($$0);
         if ($$1.isEmpty()) {
            throw fg.e.create();
         } else {
            List<GameProfile> $$2 = Lists.newArrayList();

            for (aqu $$3 : $$1) {
               $$2.add($$3.fY());
            }

            return $$2;
         }
      }
   }
}
