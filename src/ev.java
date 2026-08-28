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

public class ev implements ArgumentType<alk> {
   private static final Collection<String> a = Stream.of(djz.i, djz.j).map($$0 -> $$0.a().toString()).collect(Collectors.toList());
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> xc.b("argument.dimension.invalid", $$0));

   public alk a(StringReader $$0) throws CommandSyntaxException {
      return alk.a($$0);
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return $$0.getSource() instanceof ep ? ep.a(((ep)$$0.getSource()).t().stream().map(alj::a), $$1) : Suggestions.empty();
   }

   public Collection<String> getExamples() {
      return a;
   }

   public static ev a() {
      return new ev();
   }

   public static aru a(CommandContext<ek> $$0, String $$1) throws CommandSyntaxException {
      alk $$2 = (alk)$$0.getArgument($$1, alk.class);
      alj<djz> $$3 = alj.a(mi.bp, $$2);
      aru $$4 = ((ek)$$0.getSource()).l().a($$3);
      if ($$4 == null) {
         throw b.create($$2);
      } else {
         return $$4;
      }
   }
}
