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

public class eq implements ArgumentType<jq> {
   private static final Collection<String> b = Arrays.asList("foo", "foo:bar", "particle with options");
   public static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> ur.b("particle.notFound", $$0));
   private final id<jr<?>> c;

   public eq(dp $$0) {
      this.c = $$0.a(jz.R);
   }

   public static eq a(dp $$0) {
      return new eq($$0);
   }

   public static jq a(CommandContext<du> $$0, String $$1) {
      return (jq)$$0.getArgument($$1, jq.class);
   }

   public jq a(StringReader $$0) throws CommandSyntaxException {
      return a($$0, this.c);
   }

   public Collection<String> getExamples() {
      return b;
   }

   public static jq a(StringReader $$0, id<jr<?>> $$1) throws CommandSyntaxException {
      jr<?> $$2 = b($$0, $$1);
      return a($$0, (jr<jq>)$$2);
   }

   private static jr<?> b(StringReader $$0, id<jr<?>> $$1) throws CommandSyntaxException {
      agg $$2 = agg.a($$0);
      agf<jr<?>> $$3 = agf.a(jz.R, $$2);
      return $$1.a($$3).orElseThrow(() -> a.create($$2)).a();
   }

   private static <T extends jq> T a(StringReader $$0, jr<T> $$1) throws CommandSyntaxException {
      return $$1.d().b($$1, $$0);
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return dy.a(this.c.c().map(agf::a), $$1);
   }
}
