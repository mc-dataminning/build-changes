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

public class et implements ArgumentType<ale> {
   private static final Collection<String> a = Stream.of(dip.i, dip.j).map($$0 -> $$0.a().toString()).collect(Collectors.toList());
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> ww.b("argument.dimension.invalid", $$0));

   public ale a(StringReader $$0) throws CommandSyntaxException {
      return ale.a($$0);
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return $$0.getSource() instanceof en ? en.a(((en)$$0.getSource()).t().stream().map(ald::a), $$1) : Suggestions.empty();
   }

   public Collection<String> getExamples() {
      return a;
   }

   public static et a() {
      return new et();
   }

   public static aro a(CommandContext<ei> $$0, String $$1) throws CommandSyntaxException {
      ale $$2 = (ale)$$0.getArgument($$1, ale.class);
      ald<dip> $$3 = ald.a(mg.bm, $$2);
      aro $$4 = ((ei)$$0.getSource()).l().a($$3);
      if ($$4 == null) {
         throw b.create($$2);
      } else {
         return $$4;
      }
   }
}
