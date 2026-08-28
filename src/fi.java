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

public class fi implements ArgumentType<aku> {
   private static final Collection<String> a = Stream.of(dgg.i, dgg.j).map($$0 -> $$0.a().toString()).collect(Collectors.toList());
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> wo.b("argument.dimension.invalid", $$0));

   public aku a(StringReader $$0) throws CommandSyntaxException {
      return aku.a($$0);
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return $$0.getSource() instanceof fc ? fc.a(((fc)$$0.getSource()).t().stream().map(akt::a), $$1) : Suggestions.empty();
   }

   public Collection<String> getExamples() {
      return a;
   }

   public static fi a() {
      return new fi();
   }

   public static arc a(CommandContext<ex> $$0, String $$1) throws CommandSyntaxException {
      aku $$2 = (aku)$$0.getArgument($$1, aku.class);
      akt<dgg> $$3 = akt.a(mc.be, $$2);
      arc $$4 = ((ex)$$0.getSource()).l().a($$3);
      if ($$4 == null) {
         throw b.create($$2);
      } else {
         return $$4;
      }
   }
}
