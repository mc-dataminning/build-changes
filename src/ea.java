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

public class ea implements ArgumentType<aer> {
   private static final Collection<String> a = Stream.of(cpm.h, cpm.i).map($$0 -> $$0.a().toString()).collect(Collectors.toList());
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> tf.a("argument.dimension.invalid", $$0));

   public aer a(StringReader $$0) throws CommandSyntaxException {
      return aer.a($$0);
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return $$0.getSource() instanceof du ? du.a(((du)$$0.getSource()).u().stream().map(aeq::a), $$1) : Suggestions.empty();
   }

   public Collection<String> getExamples() {
      return a;
   }

   public static ea a() {
      return new ea();
   }

   public static akk a(CommandContext<dr> $$0, String $$1) throws CommandSyntaxException {
      aer $$2 = (aer)$$0.getArgument($$1, aer.class);
      aeq<cpm> $$3 = aeq.a(jc.aH, $$2);
      akk $$4 = ((dr)$$0.getSource()).l().a($$3);
      if ($$4 == null) {
         throw b.create($$2);
      } else {
         return $$4;
      }
   }
}
