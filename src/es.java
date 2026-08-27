import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.Collection;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class es implements ArgumentType<akt> {
   private static final Collection<String> a = Stream.of(dca.h, dca.i).map($$0 -> $$0.a().toString()).collect(Collectors.toList());
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> xe.b("argument.dimension.invalid", $$0));

   public akt a(StringReader $$0) throws CommandSyntaxException {
      return akt.a($$0);
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return $$0.getSource() instanceof em ? em.a(((em)$$0.getSource()).u().stream().map(aks::a), $$1) : Suggestions.empty();
   }

   public Collection<String> getExamples() {
      return a;
   }

   public static es a() {
      return new es();
   }

   public static aqt a(CommandContext<eh> $$0, String $$1) throws CommandSyntaxException {
      akt $$2 = (akt)$$0.getArgument($$1, akt.class);
      aks<dca> $$3 = aks.a(li.aS, $$2);
      aqt $$4 = ((eh)$$0.getSource()).l().a($$3);
      if ($$4 == null) {
         throw b.create($$2);
      } else {
         return $$4;
      }
   }
}
