import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.concurrent.CompletableFuture;

public abstract class bqj<T> implements ArgumentType<T> {
   private final bqe<T> a;

   public bqj(bqe<T> $$0) {
      this.a = $$0;
   }

   public T parse(StringReader $$0) throws CommandSyntaxException {
      return this.a.a($$0);
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return this.a.a($$1);
   }
}
