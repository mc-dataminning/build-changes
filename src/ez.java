import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.Arrays;
import java.util.Collection;
import java.util.concurrent.CompletableFuture;

public class ez implements ArgumentType<ku> {
   private static final Collection<String> b = Arrays.asList("foo", "foo:bar", "particle with options");
   public static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> ws.b("particle.notFound", $$0));
   private final ix.a c;

   public ez(dy $$0) {
      this.c = $$0;
   }

   public static ez a(dy $$0) {
      return new ez($$0);
   }

   public static ku a(CommandContext<ec> $$0, String $$1) {
      return (ku)$$0.getArgument($$1, ku.class);
   }

   public ku a(StringReader $$0) throws CommandSyntaxException {
      return a($$0, this.c);
   }

   public Collection<String> getExamples() {
      return b;
   }

   public static ku a(StringReader $$0, ix.a $$1) throws CommandSyntaxException {
      kv<?> $$2 = a($$0, $$1.b(ld.T));
      return a($$0, (kv<ku>)$$2, $$1);
   }

   private static kv<?> a(StringReader $$0, ix<kv<?>> $$1) throws CommandSyntaxException {
      akf $$2 = akf.a($$0);
      ake<kv<?>> $$3 = ake.a(ld.T, $$2);
      return $$1.a($$3).orElseThrow(() -> a.createWithContext($$0, $$2)).a();
   }

   private static <T extends ku> T a(StringReader $$0, kv<T> $$1, ix.a $$2) throws CommandSyntaxException {
      return $$1.c().fromCommand($$1, $$0, $$2);
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      ix.b<kv<?>> $$2 = this.c.b(ld.T);
      return eh.a($$2.c().map(ake::a), $$1);
   }
}
