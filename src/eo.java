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

public class eo implements ArgumentType<jt> {
   private static final Collection<String> b = Arrays.asList("foo", "foo:bar", "particle with options");
   public static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> vb.b("particle.notFound", $$0));
   private final ih<ju<?>> c;

   public eo(dn $$0) {
      this.c = $$0.a(kc.S);
   }

   public static eo a(dn $$0) {
      return new eo($$0);
   }

   public static jt a(CommandContext<ds> $$0, String $$1) {
      return (jt)$$0.getArgument($$1, jt.class);
   }

   public jt a(StringReader $$0) throws CommandSyntaxException {
      return a($$0, this.c);
   }

   public Collection<String> getExamples() {
      return b;
   }

   public static jt a(StringReader $$0, ih<ju<?>> $$1) throws CommandSyntaxException {
      ju<?> $$2 = b($$0, $$1);
      return a($$0, (ju<jt>)$$2);
   }

   private static ju<?> b(StringReader $$0, ih<ju<?>> $$1) throws CommandSyntaxException {
      agt $$2 = agt.a($$0);
      ags<ju<?>> $$3 = ags.a(kc.S, $$2);
      return $$1.a($$3).orElseThrow(() -> a.create($$2)).a();
   }

   private static <T extends jt> T a(StringReader $$0, ju<T> $$1) throws CommandSyntaxException {
      return $$1.d().b($$1, $$0);
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return dw.a(this.c.c().map(ags::a), $$1);
   }
}
