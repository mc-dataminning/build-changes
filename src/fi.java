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

public class fi implements ArgumentType<fi.a> {
   private static final Collection<String> a = Arrays.asList("eyes", "feet");
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> xk.b("argument.anchor.invalid", $$0));

   public static fi.a a(CommandContext<ew> $$0, String $$1) {
      return (fi.a)$$0.getArgument($$1, fi.a.class);
   }

   public static fi a() {
      return new fi();
   }

   public fi.a a(StringReader $$0) throws CommandSyntaxException {
      int $$1 = $$0.getCursor();
      String $$2 = $$0.readUnquotedString();
      fi.a $$3 = fi.a.a($$2);
      if ($$3 == null) {
         $$0.setCursor($$1);
         throw b.createWithContext($$0, $$2);
      } else {
         return $$3;
      }
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return fb.b(fi.a.c.keySet(), $$1);
   }

   public Collection<String> getExamples() {
      return a;
   }

   public static enum a {
      a("feet", ($$0, $$1) -> $$0),
      b("eyes", ($$0, $$1) -> new fbr($$0.d, $$0.e + (double)$$1.cS(), $$0.f));

      static final Map<String, fi.a> c = ae.a(Maps.newHashMap(), $$0 -> {
         for (fi.a $$1 : values()) {
            $$0.put($$1.d, $$1);
         }
      });
      private final String d;
      private final BiFunction<fbr, bvb, fbr> e;

      private a(final String $$0, final BiFunction<fbr, bvb, fbr> $$1) {
         this.d = $$0;
         this.e = $$1;
      }

      @Nullable
      public static fi.a a(String $$0) {
         return c.get($$0);
      }

      public fbr a(bvb $$0) {
         return this.e.apply($$0.du(), $$0);
      }

      public fbr a(ew $$0) {
         bvb $$1 = $$0.f();
         return $$1 == null ? $$0.d() : this.e.apply($$0.d(), $$1);
      }
   }
}
