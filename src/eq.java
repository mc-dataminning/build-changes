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

public class eq<T> implements ArgumentType<aeo<T>> {
   private static final Collection<String> a = Arrays.asList("foo", "foo:bar", "012");
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> te.a("commands.place.feature.invalid", $$0));
   private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> te.a("commands.place.structure.invalid", $$0));
   private static final DynamicCommandExceptionType d = new DynamicCommandExceptionType($$0 -> te.a("commands.place.jigsaw.invalid", $$0));
   final aeo<? extends hs<T>> e;

   public eq(aeo<? extends hs<T>> $$0) {
      this.e = $$0;
   }

   public static <T> eq<T> a(aeo<? extends hs<T>> $$0) {
      return new eq<>($$0);
   }

   private static <T> aeo<T> a(CommandContext<ds> $$0, String $$1, aeo<hs<T>> $$2, DynamicCommandExceptionType $$3) throws CommandSyntaxException {
      aeo<?> $$4 = (aeo<?>)$$0.getArgument($$1, aeo.class);
      Optional<aeo<T>> $$5 = $$4.c($$2);
      return $$5.orElseThrow(() -> $$3.create($$4));
   }

   private static <T> hs<T> a(CommandContext<ds> $$0, aeo<? extends hs<T>> $$1) {
      return ((ds)$$0.getSource()).l().aV().d($$1);
   }

   private static <T> hf.c<T> b(CommandContext<ds> $$0, String $$1, aeo<hs<T>> $$2, DynamicCommandExceptionType $$3) throws CommandSyntaxException {
      aeo<T> $$4 = a($$0, $$1, $$2, $$3);
      return a($$0, $$2).b($$4).orElseThrow(() -> $$3.create($$4.a()));
   }

   public static hf.c<dmy<?, ?>> a(CommandContext<ds> $$0, String $$1) throws CommandSyntaxException {
      return b($$0, $$1, jd.as, b);
   }

   public static hf.c<dux> b(CommandContext<ds> $$0, String $$1) throws CommandSyntaxException {
      return b($$0, $$1, jd.az, c);
   }

   public static hf.c<dwg> c(CommandContext<ds> $$0, String $$1) throws CommandSyntaxException {
      return b($$0, $$1, jd.aC, d);
   }

   public aeo<T> a(StringReader $$0) throws CommandSyntaxException {
      aep $$1 = aep.a($$0);
      return aeo.a(this.e, $$1);
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return $$0.getSource() instanceof dv $$2 ? $$2.a(this.e, dv.a.b, $$1, $$0) : $$1.buildFuture();
   }

   public Collection<String> getExamples() {
      return a;
   }

   public static class a<T> implements gh<eq<T>, eq.a<T>.a> {
      public void a(eq.a<T>.a $$0, sh $$1) {
         $$1.b($$0.b);
      }

      public eq.a<T>.a a(sh $$0) {
         return new eq.a.a($$0.t());
      }

      public void a(eq.a<T>.a $$0, JsonObject $$1) {
         $$1.addProperty("registry", $$0.b.a().toString());
      }

      public eq.a<T>.a a(eq<T> $$0) {
         return new eq.a.a($$0.e);
      }

      public final class a implements gh.a<eq<T>> {
         final aeo<? extends hs<T>> b;

         a(aeo<? extends hs<T>> $$1) {
            this.b = $$1;
         }

         public eq<T> a(dm $$0) {
            return new eq<>(this.b);
         }

         @Override
         public gh<eq<T>, ?> a() {
            return a.this;
         }
      }
   }
}
