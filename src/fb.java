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

public class fb implements ArgumentType<akk> {
   private static final Collection<String> a = Stream.of(dcf.h, dcf.i).map($$0 -> $$0.a().toString()).collect(Collectors.toList());
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> wu.b("argument.dimension.invalid", $$0));

   public akk a(StringReader $$0) throws CommandSyntaxException {
      return akk.a($$0);
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return $$0.getSource() instanceof ev ? ev.a(((ev)$$0.getSource()).u().stream().map(akj::a), $$1) : Suggestions.empty();
   }

   public Collection<String> getExamples() {
      return a;
   }

   public static fb a() {
      return new fb();
   }

   public static aqm a(CommandContext<eq> $$0, String $$1) throws CommandSyntaxException {
      akk $$2 = (akk)$$0.getArgument($$1, akk.class);
      akj<dcf> $$3 = akj.a(lr.aZ, $$2);
      aqm $$4 = ((eq)$$0.getSource()).l().a($$3);
      if ($$4 == null) {
         throw b.create($$2);
      } else {
         return $$4;
      }
   }
}
