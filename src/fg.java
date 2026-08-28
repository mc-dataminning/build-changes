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

public class fg implements ArgumentType<alh> {
   private static final Collection<String> a = Stream.of(dev.i, dev.j).map($$0 -> $$0.a().toString()).collect(Collectors.toList());
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> xh.b("argument.dimension.invalid", $$0));

   public alh a(StringReader $$0) throws CommandSyntaxException {
      return alh.a($$0);
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return $$0.getSource() instanceof fa ? fa.a(((fa)$$0.getSource()).u().stream().map(alg::a), $$1) : Suggestions.empty();
   }

   public Collection<String> getExamples() {
      return a;
   }

   public static fg a() {
      return new fg();
   }

   public static arm a(CommandContext<ev> $$0, String $$1) throws CommandSyntaxException {
      alh $$2 = (alh)$$0.getArgument($$1, alh.class);
      alg<dev> $$3 = alg.a(ly.bb, $$2);
      arm $$4 = ((ev)$$0.getSource()).l().a($$3);
      if ($$4 == null) {
         throw b.create($$2);
      } else {
         return $$4;
      }
   }
}
