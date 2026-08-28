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

public class fh implements ArgumentType<fh.a> {
   private static final Collection<String> a = Arrays.asList("eyes", "feet");
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> xh.b("argument.anchor.invalid", $$0));

   public static fh.a a(CommandContext<ev> $$0, String $$1) {
      return (fh.a)$$0.getArgument($$1, fh.a.class);
   }

   public static fh a() {
      return new fh();
   }

   public fh.a a(StringReader $$0) throws CommandSyntaxException {
      int $$1 = $$0.getCursor();
      String $$2 = $$0.readUnquotedString();
      fh.a $$3 = fh.a.a($$2);
      if ($$3 == null) {
         $$0.setCursor($$1);
         throw b.createWithContext($$0, $$2);
      } else {
         return $$3;
      }
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return fa.b(fh.a.c.keySet(), $$1);
   }

   public Collection<String> getExamples() {
      return a;
   }

   public static enum a {
      a("feet", ($$0, $$1) -> $$0),
      b("eyes", ($$0, $$1) -> new ezh($$0.d, $$0.e + (double)$$1.cT(), $$0.f));

      static final Map<String, fh.a> c = ad.a(Maps.newHashMap(), $$0 -> {
         for (fh.a $$1 : values()) {
            $$0.put($$1.d, $$1);
         }
      });
      private final String d;
      private final BiFunction<ezh, btz, ezh> e;

      private a(final String $$0, final BiFunction<ezh, btz, ezh> $$1) {
         this.d = $$0;
         this.e = $$1;
      }

      @Nullable
      public static fh.a a(String $$0) {
         return c.get($$0);
      }

      public ezh a(btz $$0) {
         return this.e.apply($$0.dv(), $$0);
      }

      public ezh a(ev $$0) {
         btz $$1 = $$0.f();
         return $$1 == null ? $$0.d() : this.e.apply($$0.d(), $$1);
      }
   }
}
