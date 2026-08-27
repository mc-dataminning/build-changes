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

public class eg implements ArgumentType<ajv> {
   private static final Collection<String> a = Stream.of(czg.h, czg.i).map($$0 -> $$0.a().toString()).collect(Collectors.toList());
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> wi.b("argument.dimension.invalid", $$0));

   public ajv a(StringReader $$0) throws CommandSyntaxException {
      return ajv.a($$0);
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return $$0.getSource() instanceof ea ? ea.a(((ea)$$0.getSource()).u().stream().map(aju::a), $$1) : Suggestions.empty();
   }

   public Collection<String> getExamples() {
      return a;
   }

   public static eg a() {
      return new eg();
   }

   public static apu a(CommandContext<dv> $$0, String $$1) throws CommandSyntaxException {
      ajv $$2 = (ajv)$$0.getArgument($$1, ajv.class);
      aju<czg> $$3 = aju.a(ku.aP, $$2);
      apu $$4 = ((dv)$$0.getSource()).l().a($$3);
      if ($$4 == null) {
         throw b.create($$2);
      } else {
         return $$4;
      }
   }
}
