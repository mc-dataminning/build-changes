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

public class ee implements ArgumentType<afw> {
   private static final Collection<String> a = Stream.of(cqz.h, cqz.i).map($$0 -> $$0.a().toString()).collect(Collectors.toList());
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> ui.b("argument.dimension.invalid", $$0));

   public afw a(StringReader $$0) throws CommandSyntaxException {
      return afw.a($$0);
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return $$0.getSource() instanceof dy ? dy.a(((dy)$$0.getSource()).u().stream().map(afv::a), $$1) : Suggestions.empty();
   }

   public Collection<String> getExamples() {
      return a;
   }

   public static ee a() {
      return new ee();
   }

   public static alq a(CommandContext<du> $$0, String $$1) throws CommandSyntaxException {
      afw $$2 = (afw)$$0.getArgument($$1, afw.class);
      afv<cqz> $$3 = afv.a(jz.aI, $$2);
      alq $$4 = ((du)$$0.getSource()).m().a($$3);
      if ($$4 == null) {
         throw b.create($$2);
      } else {
         return $$4;
      }
   }
}
