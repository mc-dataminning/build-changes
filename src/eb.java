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

public class eb implements ArgumentType<eb.a> {
   private static final Collection<String> a = Arrays.asList("eyes", "feet");
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> tf.a("argument.anchor.invalid", $$0));

   public static eb.a a(CommandContext<dr> $$0, String $$1) {
      return (eb.a)$$0.getArgument($$1, eb.a.class);
   }

   public static eb a() {
      return new eb();
   }

   public eb.a a(StringReader $$0) throws CommandSyntaxException {
      int $$1 = $$0.getCursor();
      String $$2 = $$0.readUnquotedString();
      eb.a $$3 = eb.a.a($$2);
      if ($$3 == null) {
         $$0.setCursor($$1);
         throw b.createWithContext($$0, $$2);
      } else {
         return $$3;
      }
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return du.b(eb.a.c.keySet(), $$1);
   }

   public Collection<String> getExamples() {
      return a;
   }

   public static enum a {
      a("feet", ($$0, $$1) -> $$0),
      b("eyes", ($$0, $$1) -> new ehe($$0.c, $$0.d + (double)$$1.cH(), $$0.e));

      static final Map<String, eb.a> c = ac.a(Maps.newHashMap(), $$0 -> {
         for (eb.a $$1 : values()) {
            $$0.put($$1.d, $$1);
         }
      });
      private final String d;
      private final BiFunction<ehe, bii, ehe> e;

      private a(String $$0, BiFunction<ehe, bii, ehe> $$1) {
         this.d = $$0;
         this.e = $$1;
      }

      @Nullable
      public static eb.a a(String $$0) {
         return c.get($$0);
      }

      public ehe a(bii $$0) {
         return this.e.apply($$0.di(), $$0);
      }

      public ehe a(dr $$0) {
         bii $$1 = $$0.f();
         return $$1 == null ? $$0.d() : this.e.apply($$0.d(), $$1);
      }
   }
}
