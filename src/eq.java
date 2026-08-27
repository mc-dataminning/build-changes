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

public class eq implements ArgumentType<eq.a> {
   private static final Collection<String> a = Arrays.asList("eyes", "feet");
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> wx.b("argument.anchor.invalid", $$0));

   public static eq.a a(CommandContext<ee> $$0, String $$1) {
      return (eq.a)$$0.getArgument($$1, eq.a.class);
   }

   public static eq a() {
      return new eq();
   }

   public eq.a a(StringReader $$0) throws CommandSyntaxException {
      int $$1 = $$0.getCursor();
      String $$2 = $$0.readUnquotedString();
      eq.a $$3 = eq.a.a($$2);
      if ($$3 == null) {
         $$0.setCursor($$1);
         throw b.createWithContext($$0, $$2);
      } else {
         return $$3;
      }
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return ej.b(eq.a.c.keySet(), $$1);
   }

   public Collection<String> getExamples() {
      return a;
   }

   public static enum a {
      a("feet", ($$0, $$1) -> $$0),
      b("eyes", ($$0, $$1) -> new eum($$0.c, $$0.d + (double)$$1.cL(), $$0.e));

      static final Map<String, eq.a> c = ac.a(Maps.newHashMap(), $$0 -> {
         for (eq.a $$1 : values()) {
            $$0.put($$1.d, $$1);
         }
      });
      private final String d;
      private final BiFunction<eum, brw, eum> e;

      private a(String $$0, BiFunction<eum, brw, eum> $$1) {
         this.d = $$0;
         this.e = $$1;
      }

      @Nullable
      public static eq.a a(String $$0) {
         return c.get($$0);
      }

      public eum a(brw $$0) {
         return this.e.apply($$0.dn(), $$0);
      }

      public eum a(ee $$0) {
         brw $$1 = $$0.f();
         return $$1 == null ? $$0.d() : this.e.apply($$0.d(), $$1);
      }
   }
}
