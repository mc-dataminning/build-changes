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

public class ec implements ArgumentType<aew> {
   private static final Collection<String> a = Stream.of(cpv.h, cpv.i).map($$0 -> $$0.a().toString()).collect(Collectors.toList());
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> tl.a("argument.dimension.invalid", $$0));

   public aew a(StringReader $$0) throws CommandSyntaxException {
      return aew.a($$0);
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return $$0.getSource() instanceof dw ? dw.a(((dw)$$0.getSource()).u().stream().map(aev::a), $$1) : Suggestions.empty();
   }

   public Collection<String> getExamples() {
      return a;
   }

   public static ec a() {
      return new ec();
   }

   public static akq a(CommandContext<dt> $$0, String $$1) throws CommandSyntaxException {
      aew $$2 = (aew)$$0.getArgument($$1, aew.class);
      aev<cpv> $$3 = aev.a(jc.aH, $$2);
      akq $$4 = ((dt)$$0.getSource()).l().a($$3);
      if ($$4 == null) {
         throw b.create($$2);
      } else {
         return $$4;
      }
   }
}
