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

public class fh implements ArgumentType<alz> {
   private static final Collection<String> a = Stream.of(dhh.i, dhh.j).map($$0 -> $$0.a().toString()).collect(Collectors.toList());
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> xv.b("argument.dimension.invalid", $$0));

   public alz a(StringReader $$0) throws CommandSyntaxException {
      return alz.a($$0);
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return $$0.getSource() instanceof fb ? fb.a(((fb)$$0.getSource()).t().stream().map(aly::a), $$1) : Suggestions.empty();
   }

   public Collection<String> getExamples() {
      return a;
   }

   public static fh a() {
      return new fh();
   }

   public static ash a(CommandContext<ew> $$0, String $$1) throws CommandSyntaxException {
      alz $$2 = (alz)$$0.getArgument($$1, alz.class);
      aly<dhh> $$3 = aly.a(mb.be, $$2);
      ash $$4 = ((ew)$$0.getSource()).l().a($$3);
      if ($$4 == null) {
         throw b.create($$2);
      } else {
         return $$4;
      }
   }
}
