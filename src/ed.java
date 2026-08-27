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

public class ed implements ArgumentType<ahg> {
   private static final Collection<String> a = Stream.of(ctp.h, ctp.i).map($$0 -> $$0.a().toString()).collect(Collectors.toList());
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> vf.b("argument.dimension.invalid", $$0));

   public ahg a(StringReader $$0) throws CommandSyntaxException {
      return ahg.a($$0);
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return $$0.getSource() instanceof dx ? dx.a(((dx)$$0.getSource()).u().stream().map(ahf::a), $$1) : Suggestions.empty();
   }

   public Collection<String> getExamples() {
      return a;
   }

   public static ed a() {
      return new ed();
   }

   public static and a(CommandContext<ds> $$0, String $$1) throws CommandSyntaxException {
      ahg $$2 = (ahg)$$0.getArgument($$1, ahg.class);
      ahf<ctp> $$3 = ahf.a(ke.aM, $$2);
      and $$4 = ((ds)$$0.getSource()).l().a($$3);
      if ($$4 == null) {
         throw b.create($$2);
      } else {
         return $$4;
      }
   }
}
