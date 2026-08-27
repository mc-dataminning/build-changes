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

public class ep implements ArgumentType<ep.a> {
   private static final Collection<String> a = Arrays.asList("eyes", "feet");
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> wu.b("argument.anchor.invalid", $$0));

   public static ep.a a(CommandContext<ed> $$0, String $$1) {
      return (ep.a)$$0.getArgument($$1, ep.a.class);
   }

   public static ep a() {
      return new ep();
   }

   public ep.a a(StringReader $$0) throws CommandSyntaxException {
      int $$1 = $$0.getCursor();
      String $$2 = $$0.readUnquotedString();
      ep.a $$3 = ep.a.a($$2);
      if ($$3 == null) {
         $$0.setCursor($$1);
         throw b.createWithContext($$0, $$2);
      } else {
         return $$3;
      }
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return ei.b(ep.a.c.keySet(), $$1);
   }

   public Collection<String> getExamples() {
      return a;
   }

   public static enum a {
      a("feet", ($$0, $$1) -> $$0),
      b("eyes", ($$0, $$1) -> new etp($$0.c, $$0.d + (double)$$1.cJ(), $$0.e));

      static final Map<String, ep.a> c = ac.a(Maps.newHashMap(), $$0 -> {
         for (ep.a $$1 : values()) {
            $$0.put($$1.d, $$1);
         }
      });
      private final String d;
      private final BiFunction<etp, brh, etp> e;

      private a(String $$0, BiFunction<etp, brh, etp> $$1) {
         this.d = $$0;
         this.e = $$1;
      }

      @Nullable
      public static ep.a a(String $$0) {
         return c.get($$0);
      }

      public etp a(brh $$0) {
         return this.e.apply($$0.dl(), $$0);
      }

      public etp a(ed $$0) {
         brh $$1 = $$0.f();
         return $$1 == null ? $$0.d() : this.e.apply($$0.d(), $$1);
      }
   }
}
