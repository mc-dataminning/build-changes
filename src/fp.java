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

public class fp<T> implements ArgumentType<ald<T>> {
   private static final Collection<String> a = Arrays.asList("foo", "foo:bar", "012");
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> xo.b("commands.place.feature.invalid", $$0));
   private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> xo.b("commands.place.structure.invalid", $$0));
   private static final DynamicCommandExceptionType d = new DynamicCommandExceptionType($$0 -> xo.b("commands.place.jigsaw.invalid", $$0));
   final ald<? extends jv<T>> e;

   public fp(ald<? extends jv<T>> $$0) {
      this.e = $$0;
   }

   public static <T> fp<T> a(ald<? extends jv<T>> $$0) {
      return new fp<>($$0);
   }

   private static <T> ald<T> a(CommandContext<ep> $$0, String $$1, ald<jv<T>> $$2, DynamicCommandExceptionType $$3) throws CommandSyntaxException {
      ald<?> $$4 = (ald<?>)$$0.getArgument($$1, ald.class);
      Optional<ald<T>> $$5 = $$4.d($$2);
      return $$5.orElseThrow(() -> $$3.create($$4));
   }

   private static <T> jv<T> a(CommandContext<ep> $$0, ald<? extends jv<T>> $$1) {
      return ((ep)$$0.getSource()).l().bc().d($$1);
   }

   private static <T> ji.c<T> b(CommandContext<ep> $$0, String $$1, ald<jv<T>> $$2, DynamicCommandExceptionType $$3) throws CommandSyntaxException {
      ald<T> $$4 = a($$0, $$1, $$2, $$3);
      return a($$0, $$2).b($$4).orElseThrow(() -> $$3.create($$4.a()));
   }

   public static ji.c<eaj<?, ?>> a(CommandContext<ep> $$0, String $$1) throws CommandSyntaxException {
      return b($$0, $$1, lq.aC, b);
   }

   public static ji.c<eii> b(CommandContext<ep> $$0, String $$1) throws CommandSyntaxException {
      return b($$0, $$1, lq.aJ, c);
   }

   public static ji.c<ejr> c(CommandContext<ep> $$0, String $$1) throws CommandSyntaxException {
      return b($$0, $$1, lq.aM, d);
   }

   public ald<T> a(StringReader $$0) throws CommandSyntaxException {
      ale $$1 = ale.a($$0);
      return ald.a(this.e, $$1);
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return $$0.getSource() instanceof eu $$2 ? $$2.a(this.e, eu.a.b, $$1, $$0) : $$1.buildFuture();
   }

   public Collection<String> getExamples() {
      return a;
   }

   public static class a<T> implements ik<fp<T>, fp.a<T>.a> {
      public void a(fp.a<T>.a $$0, wl $$1) {
         $$1.b($$0.b);
      }

      public fp.a<T>.a a(wl $$0) {
         return new fp.a.a($$0.r());
      }

      public void a(fp.a<T>.a $$0, JsonObject $$1) {
         $$1.addProperty("registry", $$0.b.a().toString());
      }

      public fp.a<T>.a a(fp<T> $$0) {
         return new fp.a.a($$0.e);
      }

      public final class a implements ik.a<fp<T>> {
         final ald<? extends jv<T>> b;

         a(final ald<? extends jv<T>> $$1) {
            this.b = $$1;
         }

         public fp<T> a(el $$0) {
            return new fp<>(this.b);
         }

         @Override
         public ik<fp<T>, ?> a() {
            return a.this;
         }
      }
   }
}
