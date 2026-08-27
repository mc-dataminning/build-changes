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

public class ep implements ArgumentType<akm> {
   private static final Collection<String> a = Stream.of(dax.h, dax.i).map($$0 -> $$0.a().toString()).collect(Collectors.toList());
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> wx.b("argument.dimension.invalid", $$0));

   public akm a(StringReader $$0) throws CommandSyntaxException {
      return akm.a($$0);
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return $$0.getSource() instanceof ej ? ej.a(((ej)$$0.getSource()).u().stream().map(akl::a), $$1) : Suggestions.empty();
   }

   public Collection<String> getExamples() {
      return a;
   }

   public static ep a() {
      return new ep();
   }

   public static aqm a(CommandContext<ee> $$0, String $$1) throws CommandSyntaxException {
      akm $$2 = (akm)$$0.getArgument($$1, akm.class);
      akl<dax> $$3 = akl.a(lf.aS, $$2);
      aqm $$4 = ((ee)$$0.getSource()).l().a($$3);
      if ($$4 == null) {
         throw b.create($$2);
      } else {
         return $$4;
      }
   }
}
