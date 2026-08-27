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

public class eb implements ArgumentType<aep> {
   private static final Collection<String> a = Stream.of(cpk.h, cpk.i).map($$0 -> $$0.a().toString()).collect(Collectors.toList());
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> te.a("argument.dimension.invalid", $$0));

   public aep a(StringReader $$0) throws CommandSyntaxException {
      return aep.a($$0);
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return $$0.getSource() instanceof dv ? dv.a(((dv)$$0.getSource()).u().stream().map(aeo::a), $$1) : Suggestions.empty();
   }

   public Collection<String> getExamples() {
      return a;
   }

   public static eb a() {
      return new eb();
   }

   public static aki a(CommandContext<ds> $$0, String $$1) throws CommandSyntaxException {
      aep $$2 = (aep)$$0.getArgument($$1, aep.class);
      aeo<cpk> $$3 = aeo.a(jd.aH, $$2);
      aki $$4 = ((ds)$$0.getSource()).l().a($$3);
      if ($$4 == null) {
         throw b.create($$2);
      } else {
         return $$4;
      }
   }
}
