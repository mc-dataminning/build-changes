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

public class fh implements ArgumentType<ali> {
   private static final Collection<String> a = Stream.of(dfb.i, dfb.j).map($$0 -> $$0.a().toString()).collect(Collectors.toList());
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> xi.b("argument.dimension.invalid", $$0));

   public ali a(StringReader $$0) throws CommandSyntaxException {
      return ali.a($$0);
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return $$0.getSource() instanceof fb ? fb.a(((fb)$$0.getSource()).u().stream().map(alh::a), $$1) : Suggestions.empty();
   }

   public Collection<String> getExamples() {
      return a;
   }

   public static fh a() {
      return new fh();
   }

   public static arn a(CommandContext<ew> $$0, String $$1) throws CommandSyntaxException {
      ali $$2 = (ali)$$0.getArgument($$1, ali.class);
      alh<dfb> $$3 = alh.a(lz.bb, $$2);
      arn $$4 = ((ew)$$0.getSource()).l().a($$3);
      if ($$4 == null) {
         throw b.create($$2);
      } else {
         return $$4;
      }
   }
}
