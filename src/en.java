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

public class en implements ArgumentType<iu> {
   private static final Collection<String> b = Arrays.asList("foo", "foo:bar", "particle with options");
   public static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> te.a("particle.notFound", $$0));
   private final hh<iv<?>> c;

   public en(dm $$0) {
      this.c = $$0.a(jd.Q);
   }

   public static en a(dm $$0) {
      return new en($$0);
   }

   public static iu a(CommandContext<ds> $$0, String $$1) {
      return (iu)$$0.getArgument($$1, iu.class);
   }

   public iu a(StringReader $$0) throws CommandSyntaxException {
      return a($$0, this.c);
   }

   public Collection<String> getExamples() {
      return b;
   }

   public static iu a(StringReader $$0, hh<iv<?>> $$1) throws CommandSyntaxException {
      iv<?> $$2 = b($$0, $$1);
      return a($$0, (iv<iu>)$$2);
   }

   private static iv<?> b(StringReader $$0, hh<iv<?>> $$1) throws CommandSyntaxException {
      aep $$2 = aep.a($$0);
      aeo<iv<?>> $$3 = aeo.a(jd.Q, $$2);
      return $$1.a($$3).orElseThrow(() -> a.create($$2)).a();
   }

   private static <T extends iu> T a(StringReader $$0, iv<T> $$1) throws CommandSyntaxException {
      return $$1.d().b($$1, $$0);
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return dv.a(this.c.c().map(aeo::a), $$1);
   }
}
