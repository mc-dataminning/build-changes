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

public class eu implements ArgumentType<eu.a> {
   private static final Collection<String> a = Arrays.asList("eyes", "feet");
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> wy.b("argument.anchor.invalid", $$0));

   public static eu.a a(CommandContext<ei> $$0, String $$1) {
      return (eu.a)$$0.getArgument($$1, eu.a.class);
   }

   public static eu a() {
      return new eu();
   }

   public eu.a a(StringReader $$0) throws CommandSyntaxException {
      int $$1 = $$0.getCursor();
      String $$2 = $$0.readUnquotedString();
      eu.a $$3 = eu.a.a($$2);
      if ($$3 == null) {
         $$0.setCursor($$1);
         throw b.createWithContext($$0, $$2);
      } else {
         return $$3;
      }
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return en.b(eu.a.c.keySet(), $$1);
   }

   public Collection<String> getExamples() {
      return a;
   }

   public static enum a {
      a("feet", ($$0, $$1) -> $$0),
      b("eyes", ($$0, $$1) -> new fei($$0.d, $$0.e + (double)$$1.cS(), $$0.f));

      static final Map<String, eu.a> c = af.a(Maps.newHashMap(), $$0 -> {
         for (eu.a $$1 : values()) {
            $$0.put($$1.d, $$1);
         }
      });
      private final String d;
      private final BiFunction<fei, bwd, fei> e;

      private a(final String $$0, final BiFunction<fei, bwd, fei> $$1) {
         this.d = $$0;
         this.e = $$1;
      }

      @Nullable
      public static eu.a a(String $$0) {
         return c.get($$0);
      }

      public fei a(bwd $$0) {
         return this.e.apply($$0.dt(), $$0);
      }

      public fei a(ei $$0) {
         bwd $$1 = $$0.f();
         return $$1 == null ? $$0.d() : this.e.apply($$0.d(), $$1);
      }
   }
}
