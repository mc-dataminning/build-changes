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

public class er implements ArgumentType<jx> {
   private static final Collection<String> b = Arrays.asList("foo", "foo:bar", "particle with options");
   public static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> vq.b("particle.notFound", $$0));
   private final il<jy<?>> c;

   public er(dq $$0) {
      this.c = $$0.a(kg.S);
   }

   public static er a(dq $$0) {
      return new er($$0);
   }

   public static jx a(CommandContext<du> $$0, String $$1) {
      return (jx)$$0.getArgument($$1, jx.class);
   }

   public jx a(StringReader $$0) throws CommandSyntaxException {
      return a($$0, this.c);
   }

   public Collection<String> getExamples() {
      return b;
   }

   public static jx a(StringReader $$0, il<jy<?>> $$1) throws CommandSyntaxException {
      jy<?> $$2 = b($$0, $$1);
      return a($$0, (jy<jx>)$$2);
   }

   private static jy<?> b(StringReader $$0, il<jy<?>> $$1) throws CommandSyntaxException {
      aiy $$2 = aiy.a($$0);
      aix<jy<?>> $$3 = aix.a(kg.S, $$2);
      return $$1.a($$3).orElseThrow(() -> a.create($$2)).a();
   }

   private static <T extends jx> T a(StringReader $$0, jy<T> $$1) throws CommandSyntaxException {
      return $$1.d().b($$1, $$0);
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return dz.a(this.c.c().map(aix::a), $$1);
   }
}
