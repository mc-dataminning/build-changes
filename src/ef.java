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

public class ef implements ArgumentType<ef.a> {
   private static final Collection<String> a = Arrays.asList("eyes", "feet");
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> ur.b("argument.anchor.invalid", $$0));

   public static ef.a a(CommandContext<du> $$0, String $$1) {
      return (ef.a)$$0.getArgument($$1, ef.a.class);
   }

   public static ef a() {
      return new ef();
   }

   public ef.a a(StringReader $$0) throws CommandSyntaxException {
      int $$1 = $$0.getCursor();
      String $$2 = $$0.readUnquotedString();
      ef.a $$3 = ef.a.a($$2);
      if ($$3 == null) {
         $$0.setCursor($$1);
         throw b.createWithContext($$0, $$2);
      } else {
         return $$3;
      }
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return dy.b(ef.a.c.keySet(), $$1);
   }

   public Collection<String> getExamples() {
      return a;
   }

   public static enum a {
      a("feet", ($$0, $$1) -> $$0),
      b("eyes", ($$0, $$1) -> new eji($$0.c, $$0.d + (double)$$1.cH(), $$0.e));

      static final Map<String, ef.a> c = ac.a(Maps.newHashMap(), $$0 -> {
         for (ef.a $$1 : values()) {
            $$0.put($$1.d, $$1);
         }
      });
      private final String d;
      private final BiFunction<eji, bki, eji> e;

      private a(String $$0, BiFunction<eji, bki, eji> $$1) {
         this.d = $$0;
         this.e = $$1;
      }

      @Nullable
      public static ef.a a(String $$0) {
         return c.get($$0);
      }

      public eji a(bki $$0) {
         return this.e.apply($$0.dj(), $$0);
      }

      public eji a(du $$0) {
         bki $$1 = $$0.g();
         return $$1 == null ? $$0.e() : this.e.apply($$0.e(), $$1);
      }
   }
}
