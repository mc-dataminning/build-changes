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

public class ef implements ArgumentType<ajt> {
   private static final Collection<String> a = Stream.of(cyx.h, cyx.i).map($$0 -> $$0.a().toString()).collect(Collectors.toList());
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> wg.b("argument.dimension.invalid", $$0));

   public ajt a(StringReader $$0) throws CommandSyntaxException {
      return ajt.a($$0);
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return $$0.getSource() instanceof dz ? dz.a(((dz)$$0.getSource()).u().stream().map(ajs::a), $$1) : Suggestions.empty();
   }

   public Collection<String> getExamples() {
      return a;
   }

   public static ef a() {
      return new ef();
   }

   public static aps a(CommandContext<du> $$0, String $$1) throws CommandSyntaxException {
      ajt $$2 = (ajt)$$0.getArgument($$1, ajt.class);
      ajs<cyx> $$3 = ajs.a(ks.aO, $$2);
      aps $$4 = ((du)$$0.getSource()).l().a($$3);
      if ($$4 == null) {
         throw b.create($$2);
      } else {
         return $$4;
      }
   }
}
