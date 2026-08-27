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

public class et implements ArgumentType<et.a> {
   private static final Collection<String> a = Arrays.asList("eyes", "feet");
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> xe.b("argument.anchor.invalid", $$0));

   public static et.a a(CommandContext<eh> $$0, String $$1) {
      return (et.a)$$0.getArgument($$1, et.a.class);
   }

   public static et a() {
      return new et();
   }

   public et.a a(StringReader $$0) throws CommandSyntaxException {
      int $$1 = $$0.getCursor();
      String $$2 = $$0.readUnquotedString();
      et.a $$3 = et.a.a($$2);
      if ($$3 == null) {
         $$0.setCursor($$1);
         throw b.createWithContext($$0, $$2);
      } else {
         return $$3;
      }
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return em.b(et.a.c.keySet(), $$1);
   }

   public Collection<String> getExamples() {
      return a;
   }

   public static enum a {
      a("feet", ($$0, $$1) -> $$0),
      b("eyes", ($$0, $$1) -> new ewu($$0.c, $$0.d + (double)$$1.cQ(), $$0.e));

      static final Map<String, et.a> c = ad.a(Maps.newHashMap(), $$0 -> {
         for (et.a $$1 : values()) {
            $$0.put($$1.d, $$1);
         }
      });
      private final String d;
      private final BiFunction<ewu, brv, ewu> e;

      private a(String $$0, BiFunction<ewu, brv, ewu> $$1) {
         this.d = $$0;
         this.e = $$1;
      }

      @Nullable
      public static et.a a(String $$0) {
         return c.get($$0);
      }

      public ewu a(brv $$0) {
         return this.e.apply($$0.ds(), $$0);
      }

      public ewu a(eh $$0) {
         brv $$1 = $$0.f();
         return $$1 == null ? $$0.d() : this.e.apply($$0.d(), $$1);
      }
   }
}
