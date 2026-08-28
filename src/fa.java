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

public class fa implements ArgumentType<alf> {
   private static final Collection<String> a = Stream.of(dca.h, dca.i).map($$0 -> $$0.a().toString()).collect(Collectors.toList());
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> xp.b("argument.dimension.invalid", $$0));

   public alf a(StringReader $$0) throws CommandSyntaxException {
      return alf.a($$0);
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return $$0.getSource() instanceof eu ? eu.a(((eu)$$0.getSource()).u().stream().map(ale::a), $$1) : Suggestions.empty();
   }

   public Collection<String> getExamples() {
      return a;
   }

   public static fa a() {
      return new fa();
   }

   public static arf a(CommandContext<ep> $$0, String $$1) throws CommandSyntaxException {
      alf $$2 = (alf)$$0.getArgument($$1, alf.class);
      ale<dca> $$3 = ale.a(lq.aS, $$2);
      arf $$4 = ((ep)$$0.getSource()).l().a($$3);
      if ($$4 == null) {
         throw b.create($$2);
      } else {
         return $$4;
      }
   }
}
