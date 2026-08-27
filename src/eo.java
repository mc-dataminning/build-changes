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

public class eo implements ArgumentType<eo.a> {
   private static final Collection<String> a = Arrays.asList("eyes", "feet");
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> ws.b("argument.anchor.invalid", $$0));

   public static eo.a a(CommandContext<ec> $$0, String $$1) {
      return (eo.a)$$0.getArgument($$1, eo.a.class);
   }

   public static eo a() {
      return new eo();
   }

   public eo.a a(StringReader $$0) throws CommandSyntaxException {
      int $$1 = $$0.getCursor();
      String $$2 = $$0.readUnquotedString();
      eo.a $$3 = eo.a.a($$2);
      if ($$3 == null) {
         $$0.setCursor($$1);
         throw b.createWithContext($$0, $$2);
      } else {
         return $$3;
      }
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return eh.b(eo.a.c.keySet(), $$1);
   }

   public Collection<String> getExamples() {
      return a;
   }

   public static enum a {
      a("feet", ($$0, $$1) -> $$0),
      b("eyes", ($$0, $$1) -> new etf($$0.c, $$0.d + (double)$$1.cJ(), $$0.e));

      static final Map<String, eo.a> c = ac.a(Maps.newHashMap(), $$0 -> {
         for (eo.a $$1 : values()) {
            $$0.put($$1.d, $$1);
         }
      });
      private final String d;
      private final BiFunction<etf, bql, etf> e;

      private a(String $$0, BiFunction<etf, bql, etf> $$1) {
         this.d = $$0;
         this.e = $$1;
      }

      @Nullable
      public static eo.a a(String $$0) {
         return c.get($$0);
      }

      public etf a(bql $$0) {
         return this.e.apply($$0.dl(), $$0);
      }

      public etf a(ec $$0) {
         bql $$1 = $$0.f();
         return $$1 == null ? $$0.d() : this.e.apply($$0.d(), $$1);
      }
   }
}
