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

public class fa implements ArgumentType<alb> {
   private static final Collection<String> a = Stream.of(dbt.h, dbt.i).map($$0 -> $$0.a().toString()).collect(Collectors.toList());
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> xl.b("argument.dimension.invalid", $$0));

   public alb a(StringReader $$0) throws CommandSyntaxException {
      return alb.a($$0);
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return $$0.getSource() instanceof eu ? eu.a(((eu)$$0.getSource()).u().stream().map(ala::a), $$1) : Suggestions.empty();
   }

   public Collection<String> getExamples() {
      return a;
   }

   public static fa a() {
      return new fa();
   }

   public static arb a(CommandContext<ep> $$0, String $$1) throws CommandSyntaxException {
      alb $$2 = (alb)$$0.getArgument($$1, alb.class);
      ala<dbt> $$3 = ala.a(lq.aS, $$2);
      arb $$4 = ((ep)$$0.getSource()).l().a($$3);
      if ($$4 == null) {
         throw b.create($$2);
      } else {
         return $$4;
      }
   }
}
