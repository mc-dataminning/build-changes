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

public class eo implements ArgumentType<akh> {
   private static final Collection<String> a = Stream.of(dad.h, dad.i).map($$0 -> $$0.a().toString()).collect(Collectors.toList());
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> wu.b("argument.dimension.invalid", $$0));

   public akh a(StringReader $$0) throws CommandSyntaxException {
      return akh.a($$0);
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return $$0.getSource() instanceof ei ? ei.a(((ei)$$0.getSource()).u().stream().map(akg::a), $$1) : Suggestions.empty();
   }

   public Collection<String> getExamples() {
      return a;
   }

   public static eo a() {
      return new eo();
   }

   public static aqh a(CommandContext<ed> $$0, String $$1) throws CommandSyntaxException {
      akh $$2 = (akh)$$0.getArgument($$1, akh.class);
      akg<dad> $$3 = akg.a(le.aS, $$2);
      aqh $$4 = ((ed)$$0.getSource()).l().a($$3);
      if ($$4 == null) {
         throw b.create($$2);
      } else {
         return $$4;
      }
   }
}
