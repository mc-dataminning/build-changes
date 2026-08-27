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

public class eq implements ArgumentType<ju> {
   private static final Collection<String> b = Arrays.asList("foo", "foo:bar", "particle with options");
   public static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> uv.b("particle.notFound", $$0));
   private final ii<jv<?>> c;

   public eq(dp $$0) {
      this.c = $$0.a(kd.R);
   }

   public static eq a(dp $$0) {
      return new eq($$0);
   }

   public static ju a(CommandContext<du> $$0, String $$1) {
      return (ju)$$0.getArgument($$1, ju.class);
   }

   public ju a(StringReader $$0) throws CommandSyntaxException {
      return a($$0, this.c);
   }

   public Collection<String> getExamples() {
      return b;
   }

   public static ju a(StringReader $$0, ii<jv<?>> $$1) throws CommandSyntaxException {
      jv<?> $$2 = b($$0, $$1);
      return a($$0, (jv<ju>)$$2);
   }

   private static jv<?> b(StringReader $$0, ii<jv<?>> $$1) throws CommandSyntaxException {
      agm $$2 = agm.a($$0);
      agl<jv<?>> $$3 = agl.a(kd.R, $$2);
      return $$1.a($$3).orElseThrow(() -> a.create($$2)).a();
   }

   private static <T extends ju> T a(StringReader $$0, jv<T> $$1) throws CommandSyntaxException {
      return $$1.d().b($$1, $$0);
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return dy.a(this.c.c().map(agl::a), $$1);
   }
}
