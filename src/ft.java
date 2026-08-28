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

public class ft<T> implements ArgumentType<alb<T>> {
   private static final Collection<String> a = Arrays.asList("foo", "foo:bar", "012");
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> xd.b("commands.place.feature.invalid", $$0));
   private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> xd.b("commands.place.structure.invalid", $$0));
   private static final DynamicCommandExceptionType d = new DynamicCommandExceptionType($$0 -> xd.b("commands.place.jigsaw.invalid", $$0));
   final alb<? extends ka<T>> e;

   public ft(alb<? extends ka<T>> $$0) {
      this.e = $$0;
   }

   public static <T> ft<T> a(alb<? extends ka<T>> $$0) {
      return new ft<>($$0);
   }

   private static <T> alb<T> a(CommandContext<et> $$0, String $$1, alb<ka<T>> $$2, DynamicCommandExceptionType $$3) throws CommandSyntaxException {
      alb<?> $$4 = (alb<?>)$$0.getArgument($$1, alb.class);
      Optional<alb<T>> $$5 = $$4.d($$2);
      return $$5.orElseThrow(() -> $$3.create($$4));
   }

   private static <T> ka<T> a(CommandContext<et> $$0, alb<? extends ka<T>> $$1) {
      return ((et)$$0.getSource()).l().bb().d($$1);
   }

   private static <T> jn.c<T> b(CommandContext<et> $$0, String $$1, alb<ka<T>> $$2, DynamicCommandExceptionType $$3) throws CommandSyntaxException {
      alb<T> $$4 = a($$0, $$1, $$2, $$3);
      return a($$0, $$2).b($$4).orElseThrow(() -> $$3.create($$4.a()));
   }

   public static jn.c<edc<?, ?>> a(CommandContext<et> $$0, String $$1) throws CommandSyntaxException {
      return b($$0, $$1, lv.aJ, b);
   }

   public static jn.c<elc> b(CommandContext<et> $$0, String $$1) throws CommandSyntaxException {
      return b($$0, $$1, lv.aS, c);
   }

   public static jn.c<emm> c(CommandContext<et> $$0, String $$1) throws CommandSyntaxException {
      return b($$0, $$1, lv.aV, d);
   }

   public alb<T> a(StringReader $$0) throws CommandSyntaxException {
      alc $$1 = alc.a($$0);
      return alb.a(this.e, $$1);
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return $$0.getSource() instanceof ey $$2 ? $$2.a(this.e, ey.a.b, $$1, $$0) : $$1.buildFuture();
   }

   public Collection<String> getExamples() {
      return a;
   }

   public static class a<T> implements ip<ft<T>, ft.a<T>.a> {
      public void a(ft.a<T>.a $$0, wa $$1) {
         $$1.b($$0.b);
      }

      public ft.a<T>.a a(wa $$0) {
         return new ft.a.a($$0.r());
      }

      public void a(ft.a<T>.a $$0, JsonObject $$1) {
         $$1.addProperty("registry", $$0.b.a().toString());
      }

      public ft.a<T>.a a(ft<T> $$0) {
         return new ft.a.a($$0.e);
      }

      public final class a implements ip.a<ft<T>> {
         final alb<? extends ka<T>> b;

         a(final alb<? extends ka<T>> $$1) {
            this.b = $$1;
         }

         public ft<T> a(ep $$0) {
            return new ft<>(this.b);
         }

         @Override
         public ip<ft<T>, ?> a() {
            return a.this;
         }
      }
   }
}
