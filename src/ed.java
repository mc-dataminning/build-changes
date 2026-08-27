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

public class ed implements ArgumentType<ahh> {
   private static final Collection<String> a = Stream.of(ctx.h, ctx.i).map($$0 -> $$0.a().toString()).collect(Collectors.toList());
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> vg.b("argument.dimension.invalid", $$0));

   public ahh a(StringReader $$0) throws CommandSyntaxException {
      return ahh.a($$0);
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return $$0.getSource() instanceof dx ? dx.a(((dx)$$0.getSource()).u().stream().map(ahg::a), $$1) : Suggestions.empty();
   }

   public Collection<String> getExamples() {
      return a;
   }

   public static ed a() {
      return new ed();
   }

   public static ane a(CommandContext<ds> $$0, String $$1) throws CommandSyntaxException {
      ahh $$2 = (ahh)$$0.getArgument($$1, ahh.class);
      ahg<ctx> $$3 = ahg.a(ke.aM, $$2);
      ane $$4 = ((ds)$$0.getSource()).l().a($$3);
      if ($$4 == null) {
         throw b.create($$2);
      } else {
         return $$4;
      }
   }
}
