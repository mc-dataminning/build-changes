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

public class fh implements ArgumentType<alj> {
   private static final Collection<String> a = Stream.of(dfm.i, dfm.j).map($$0 -> $$0.a().toString()).collect(Collectors.toList());
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> xj.b("argument.dimension.invalid", $$0));

   public alj a(StringReader $$0) throws CommandSyntaxException {
      return alj.a($$0);
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return $$0.getSource() instanceof fb ? fb.a(((fb)$$0.getSource()).u().stream().map(ali::a), $$1) : Suggestions.empty();
   }

   public Collection<String> getExamples() {
      return a;
   }

   public static fh a() {
      return new fh();
   }

   public static arp a(CommandContext<ew> $$0, String $$1) throws CommandSyntaxException {
      alj $$2 = (alj)$$0.getArgument($$1, alj.class);
      ali<dfm> $$3 = ali.a(ma.bb, $$2);
      arp $$4 = ((ew)$$0.getSource()).l().a($$3);
      if ($$4 == null) {
         throw b.create($$2);
      } else {
         return $$4;
      }
   }
}
