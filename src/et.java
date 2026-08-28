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

public class et implements ArgumentType<alg> {
   private static final Collection<String> a = Stream.of(div.i, div.j).map($$0 -> $$0.a().toString()).collect(Collectors.toList());
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> wy.b("argument.dimension.invalid", $$0));

   public alg a(StringReader $$0) throws CommandSyntaxException {
      return alg.a($$0);
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return $$0.getSource() instanceof en ? en.a(((en)$$0.getSource()).t().stream().map(alf::a), $$1) : Suggestions.empty();
   }

   public Collection<String> getExamples() {
      return a;
   }

   public static et a() {
      return new et();
   }

   public static arq a(CommandContext<ei> $$0, String $$1) throws CommandSyntaxException {
      alg $$2 = (alg)$$0.getArgument($$1, alg.class);
      alf<div> $$3 = alf.a(mg.bn, $$2);
      arq $$4 = ((ei)$$0.getSource()).l().a($$3);
      if ($$4 == null) {
         throw b.create($$2);
      } else {
         return $$4;
      }
   }
}
