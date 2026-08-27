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

public class fb implements ArgumentType<kw> {
   private static final Collection<String> b = Arrays.asList("foo", "foo:bar", "particle with options");
   public static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> wx.b("particle.notFound", $$0));
   private final iz.a c;

   public fb(ea $$0) {
      this.c = $$0;
   }

   public static fb a(ea $$0) {
      return new fb($$0);
   }

   public static kw a(CommandContext<ee> $$0, String $$1) {
      return (kw)$$0.getArgument($$1, kw.class);
   }

   public kw a(StringReader $$0) throws CommandSyntaxException {
      return a($$0, this.c);
   }

   public Collection<String> getExamples() {
      return b;
   }

   public static kw a(StringReader $$0, iz.a $$1) throws CommandSyntaxException {
      kx<?> $$2 = a($$0, $$1.b(lf.T));
      return a($$0, (kx<kw>)$$2, $$1);
   }

   private static kx<?> a(StringReader $$0, iz<kx<?>> $$1) throws CommandSyntaxException {
      akn $$2 = akn.a($$0);
      akm<kx<?>> $$3 = akm.a(lf.T, $$2);
      return $$1.a($$3).orElseThrow(() -> a.createWithContext($$0, $$2)).a();
   }

   private static <T extends kw> T a(StringReader $$0, kx<T> $$1, iz.a $$2) throws CommandSyntaxException {
      return $$1.c().b($$1, $$0, $$2);
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      iz.b<kx<?>> $$2 = this.c.b(lf.T);
      return ej.a($$2.c().map(akm::a), $$1);
   }
}
