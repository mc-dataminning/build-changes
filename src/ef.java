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

public class ef implements ArgumentType<ajc> {
   private static final Collection<String> a = Stream.of(cwe.h, cwe.i).map($$0 -> $$0.a().toString()).collect(Collectors.toList());
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> vs.b("argument.dimension.invalid", $$0));

   public ajc a(StringReader $$0) throws CommandSyntaxException {
      return ajc.a($$0);
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return $$0.getSource() instanceof dz ? dz.a(((dz)$$0.getSource()).u().stream().map(ajb::a), $$1) : Suggestions.empty();
   }

   public Collection<String> getExamples() {
      return a;
   }

   public static ef a() {
      return new ef();
   }

   public static apa a(CommandContext<du> $$0, String $$1) throws CommandSyntaxException {
      ajc $$2 = (ajc)$$0.getArgument($$1, ajc.class);
      ajb<cwe> $$3 = ajb.a(ki.aN, $$2);
      apa $$4 = ((du)$$0.getSource()).l().a($$3);
      if ($$4 == null) {
         throw b.create($$2);
      } else {
         return $$4;
      }
   }
}
