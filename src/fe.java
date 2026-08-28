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

public class fe implements ArgumentType<akq> {
   private static final Collection<String> a = Stream.of(dcu.h, dcu.i).map($$0 -> $$0.a().toString()).collect(Collectors.toList());
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> wy.b("argument.dimension.invalid", $$0));

   public akq a(StringReader $$0) throws CommandSyntaxException {
      return akq.a($$0);
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return $$0.getSource() instanceof ey ? ey.a(((ey)$$0.getSource()).u().stream().map(akp::a), $$1) : Suggestions.empty();
   }

   public Collection<String> getExamples() {
      return a;
   }

   public static fe a() {
      return new fe();
   }

   public static aqt a(CommandContext<et> $$0, String $$1) throws CommandSyntaxException {
      akq $$2 = (akq)$$0.getArgument($$1, akq.class);
      akp<dcu> $$3 = akp.a(lu.ba, $$2);
      aqt $$4 = ((et)$$0.getSource()).l().a($$3);
      if ($$4 == null) {
         throw b.create($$2);
      } else {
         return $$4;
      }
   }
}
