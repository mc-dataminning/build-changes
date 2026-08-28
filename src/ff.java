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

public class ff implements ArgumentType<ale> {
   private static final Collection<String> a = Stream.of(dej.h, dej.i).map($$0 -> $$0.a().toString()).collect(Collectors.toList());
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> xe.b("argument.dimension.invalid", $$0));

   public ale a(StringReader $$0) throws CommandSyntaxException {
      return ale.a($$0);
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return $$0.getSource() instanceof ez ? ez.a(((ez)$$0.getSource()).u().stream().map(ald::a), $$1) : Suggestions.empty();
   }

   public Collection<String> getExamples() {
      return a;
   }

   public static ff a() {
      return new ff();
   }

   public static arj a(CommandContext<eu> $$0, String $$1) throws CommandSyntaxException {
      ale $$2 = (ale)$$0.getArgument($$1, ale.class);
      ald<dej> $$3 = ald.a(lw.bc, $$2);
      arj $$4 = ((eu)$$0.getSource()).l().a($$3);
      if ($$4 == null) {
         throw b.create($$2);
      } else {
         return $$4;
      }
   }
}
