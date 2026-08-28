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

public class fj implements ArgumentType<fj.a> {
   private static final Collection<String> a = Arrays.asList("eyes", "feet");
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> wo.b("argument.anchor.invalid", $$0));

   public static fj.a a(CommandContext<ex> $$0, String $$1) {
      return (fj.a)$$0.getArgument($$1, fj.a.class);
   }

   public static fj a() {
      return new fj();
   }

   public fj.a a(StringReader $$0) throws CommandSyntaxException {
      int $$1 = $$0.getCursor();
      String $$2 = $$0.readUnquotedString();
      fj.a $$3 = fj.a.a($$2);
      if ($$3 == null) {
         $$0.setCursor($$1);
         throw b.createWithContext($$0, $$2);
      } else {
         return $$3;
      }
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return fc.b(fj.a.c.keySet(), $$1);
   }

   public Collection<String> getExamples() {
      return a;
   }

   public static enum a {
      a("feet", ($$0, $$1) -> $$0),
      b("eyes", ($$0, $$1) -> new fay($$0.d, $$0.e + (double)$$1.cS(), $$0.f));

      static final Map<String, fj.a> c = af.a(Maps.newHashMap(), $$0 -> {
         for (fj.a $$1 : values()) {
            $$0.put($$1.d, $$1);
         }
      });
      private final String d;
      private final BiFunction<fay, buj, fay> e;

      private a(final String $$0, final BiFunction<fay, buj, fay> $$1) {
         this.d = $$0;
         this.e = $$1;
      }

      @Nullable
      public static fj.a a(String $$0) {
         return c.get($$0);
      }

      public fay a(buj $$0) {
         return this.e.apply($$0.du(), $$0);
      }

      public fay a(ex $$0) {
         buj $$1 = $$0.f();
         return $$1 == null ? $$0.d() : this.e.apply($$0.d(), $$1);
      }
   }
}
