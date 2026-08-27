import com.google.gson.JsonObject;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.Arrays;
import java.util.Collection;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;

public class ep<T> implements ArgumentType<acp<T>> {
   private static final Collection<String> a = Arrays.asList("foo", "foo:bar", "012");
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> sw.a("commands.place.feature.invalid", $$0));
   private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> sw.a("commands.place.structure.invalid", $$0));
   private static final DynamicCommandExceptionType d = new DynamicCommandExceptionType($$0 -> sw.a("commands.place.jigsaw.invalid", $$0));
   final acp<? extends hr<T>> e;

   public ep(acp<? extends hr<T>> $$0) {
      this.e = $$0;
   }

   public static <T> ep<T> a(acp<? extends hr<T>> $$0) {
      return new ep<>($$0);
   }

   private static <T> acp<T> a(CommandContext<ds> $$0, String $$1, acp<hr<T>> $$2, DynamicCommandExceptionType $$3) throws CommandSyntaxException {
      acp<?> $$4 = (acp<?>)$$0.getArgument($$1, acp.class);
      Optional<acp<T>> $$5 = $$4.c($$2);
      return $$5.orElseThrow(() -> $$3.create($$4));
   }

   private static <T> hr<T> a(CommandContext<ds> $$0, acp<? extends hr<T>> $$1) {
      return ((ds)$$0.getSource()).l().aV().d($$1);
   }

   private static <T> he.c<T> b(CommandContext<ds> $$0, String $$1, acp<hr<T>> $$2, DynamicCommandExceptionType $$3) throws CommandSyntaxException {
      acp<T> $$4 = a($$0, $$1, $$2, $$3);
      return a($$0, $$2).b($$4).orElseThrow(() -> $$3.create($$4.a()));
   }

   public static he.c<dkb<?, ?>> a(CommandContext<ds> $$0, String $$1) throws CommandSyntaxException {
      return b($$0, $$1, jc.as, b);
   }

   public static he.c<dsa> b(CommandContext<ds> $$0, String $$1) throws CommandSyntaxException {
      return b($$0, $$1, jc.az, c);
   }

   public static he.c<dtj> c(CommandContext<ds> $$0, String $$1) throws CommandSyntaxException {
      return b($$0, $$1, jc.aC, d);
   }

   public acp<T> a(StringReader $$0) throws CommandSyntaxException {
      acq $$1 = acq.a($$0);
      return acp.a(this.e, $$1);
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return $$0.getSource() instanceof du $$2 ? $$2.a(this.e, du.a.b, $$1, $$0) : $$1.buildFuture();
   }

   public Collection<String> getExamples() {
      return a;
   }

   public static class a<T> implements gg<ep<T>, ep.a<T>.a> {
      public void a(ep.a<T>.a $$0, sf $$1) {
         $$1.a($$0.b.a());
      }

      public ep.a<T>.a a(sf $$0) {
         acq $$1 = $$0.t();
         return new ep.a.a(acp.a($$1));
      }

      public void a(ep.a<T>.a $$0, JsonObject $$1) {
         $$1.addProperty("registry", $$0.b.a().toString());
      }

      public ep.a<T>.a a(ep<T> $$0) {
         return new ep.a.a($$0.e);
      }

      public final class a implements gg.a<ep<T>> {
         final acp<? extends hr<T>> b;

         a(acp<? extends hr<T>> $$1) {
            this.b = $$1;
         }

         public ep<T> a(dm $$0) {
            return new ep<>(this.b);
         }

         @Override
         public gg<ep<T>, ?> a() {
            return a.this;
         }
      }
   }
}
