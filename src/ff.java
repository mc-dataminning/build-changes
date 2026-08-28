import com.google.common.collect.Maps;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.function.BiFunction;
import javax.annotation.Nullable;

public class ff implements ArgumentType<ff.a> {
   private static final Collection<String> a = Arrays.asList("eyes", "feet");
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> xd.b("argument.anchor.invalid", $$0));

   public static ff.a a(CommandContext<et> $$0, String $$1) {
      return (ff.a)$$0.getArgument($$1, ff.a.class);
   }

   public static ff a() {
      return new ff();
   }

   public ff.a a(StringReader $$0) throws CommandSyntaxException {
      int $$1 = $$0.getCursor();
      String $$2 = $$0.readUnquotedString();
      ff.a $$3 = ff.a.a($$2);
      if ($$3 == null) {
         $$0.setCursor($$1);
         throw b.createWithContext($$0, $$2);
      } else {
         return $$3;
      }
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return ey.b(ff.a.c.keySet(), $$1);
   }

   public Collection<String> getExamples() {
      return a;
   }

   public static enum a {
      a("feet", ($$0, $$1) -> $$0),
      b("eyes", ($$0, $$1) -> new eys($$0.d, $$0.e + (double)$$1.cP(), $$0.f));

      static final Map<String, ff.a> c = ad.a(Maps.newHashMap(), $$0 -> {
         for (ff.a $$1 : values()) {
            $$0.put($$1.d, $$1);
         }
      });
      private final String d;
      private final BiFunction<eys, bto, eys> e;

      private a(final String $$0, final BiFunction<eys, bto, eys> $$1) {
         this.d = $$0;
         this.e = $$1;
      }

      @Nullable
      public static ff.a a(String $$0) {
         return c.get($$0);
      }

      public eys a(bto $$0) {
         return this.e.apply($$0.dq(), $$0);
      }

      public eys a(et $$0) {
         bto $$1 = $$0.f();
         return $$1 == null ? $$0.d() : this.e.apply($$0.d(), $$1);
      }
   }
}
