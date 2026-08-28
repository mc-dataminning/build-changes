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

public class fe implements ArgumentType<akr> {
   private static final Collection<String> a = Stream.of(dcw.h, dcw.i).map($$0 -> $$0.a().toString()).collect(Collectors.toList());
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> wz.b("argument.dimension.invalid", $$0));

   public akr a(StringReader $$0) throws CommandSyntaxException {
      return akr.a($$0);
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return $$0.getSource() instanceof ey ? ey.a(((ey)$$0.getSource()).u().stream().map(akq::a), $$1) : Suggestions.empty();
   }

   public Collection<String> getExamples() {
      return a;
   }

   public static fe a() {
      return new fe();
   }

   public static aqu a(CommandContext<et> $$0, String $$1) throws CommandSyntaxException {
      akr $$2 = (akr)$$0.getArgument($$1, akr.class);
      akq<dcw> $$3 = akq.a(lu.ba, $$2);
      aqu $$4 = ((et)$$0.getSource()).l().a($$3);
      if ($$4 == null) {
         throw b.create($$2);
      } else {
         return $$4;
      }
   }
}
