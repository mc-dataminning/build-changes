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

public class ec implements ArgumentType<aey> {
   private static final Collection<String> a = Stream.of(cpx.h, cpx.i).map($$0 -> $$0.a().toString()).collect(Collectors.toList());
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> tn.a("argument.dimension.invalid", $$0));

   public aey a(StringReader $$0) throws CommandSyntaxException {
      return aey.a($$0);
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return $$0.getSource() instanceof dw ? dw.a(((dw)$$0.getSource()).u().stream().map(aex::a), $$1) : Suggestions.empty();
   }

   public Collection<String> getExamples() {
      return a;
   }

   public static ec a() {
      return new ec();
   }

   public static aks a(CommandContext<dt> $$0, String $$1) throws CommandSyntaxException {
      aey $$2 = (aey)$$0.getArgument($$1, aey.class);
      aex<cpx> $$3 = aex.a(je.aH, $$2);
      aks $$4 = ((dt)$$0.getSource()).l().a($$3);
      if ($$4 == null) {
         throw b.create($$2);
      } else {
         return $$4;
      }
   }
}
