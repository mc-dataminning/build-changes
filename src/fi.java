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

public class fi implements ArgumentType<ald> {
   private static final Collection<String> a = Stream.of(dhp.i, dhp.j).map($$0 -> $$0.a().toString()).collect(Collectors.toList());
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> wv.b("argument.dimension.invalid", $$0));

   public ald a(StringReader $$0) throws CommandSyntaxException {
      return ald.a($$0);
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return $$0.getSource() instanceof fc ? fc.a(((fc)$$0.getSource()).t().stream().map(alc::a), $$1) : Suggestions.empty();
   }

   public Collection<String> getExamples() {
      return a;
   }

   public static fi a() {
      return new fi();
   }

   public static arn a(CommandContext<ex> $$0, String $$1) throws CommandSyntaxException {
      ald $$2 = (ald)$$0.getArgument($$1, ald.class);
      alc<dhp> $$3 = alc.a(me.bl, $$2);
      arn $$4 = ((ex)$$0.getSource()).l().a($$3);
      if ($$4 == null) {
         throw b.create($$2);
      } else {
         return $$4;
      }
   }
}
