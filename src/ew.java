import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.Arrays;
import java.util.Collection;
import java.util.concurrent.CompletableFuture;

public class ew implements ArgumentType<eik> {
   private static final Collection<String> b = Arrays.asList("sidebar", "foo.bar");
   public static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> tn.a("argument.scoreboardDisplaySlot.invalid", $$0));

   private ew() {
   }

   public static ew a() {
      return new ew();
   }

   public static eik a(CommandContext<dt> $$0, String $$1) {
      return (eik)$$0.getArgument($$1, eik.class);
   }

   public eik a(StringReader $$0) throws CommandSyntaxException {
      String $$1 = $$0.readUnquotedString();
      eik $$2 = eik.t.a($$1);
      if ($$2 == null) {
         throw a.create($$1);
      } else {
         return $$2;
      }
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return dw.b(Arrays.stream(eik.values()).map(eik::c), $$1);
   }

   public Collection<String> getExamples() {
      return b;
   }
}
