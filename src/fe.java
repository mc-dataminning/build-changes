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

public class fe implements ArgumentType<alc> {
   private static final Collection<String> a = Stream.of(deg.h, deg.i).map($$0 -> $$0.a().toString()).collect(Collectors.toList());
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> xd.b("argument.dimension.invalid", $$0));

   public alc a(StringReader $$0) throws CommandSyntaxException {
      return alc.a($$0);
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return $$0.getSource() instanceof ey ? ey.a(((ey)$$0.getSource()).u().stream().map(alb::a), $$1) : Suggestions.empty();
   }

   public Collection<String> getExamples() {
      return a;
   }

   public static fe a() {
      return new fe();
   }

   public static arh a(CommandContext<et> $$0, String $$1) throws CommandSyntaxException {
      alc $$2 = (alc)$$0.getArgument($$1, alc.class);
      alb<deg> $$3 = alb.a(lv.bb, $$2);
      arh $$4 = ((et)$$0.getSource()).l().a($$3);
      if ($$4 == null) {
         throw b.create($$2);
      } else {
         return $$4;
      }
   }
}
