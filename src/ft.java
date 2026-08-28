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

public class ft<T> implements ArgumentType<akp<T>> {
   private static final Collection<String> a = Arrays.asList("foo", "foo:bar", "012");
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> wy.b("commands.place.feature.invalid", $$0));
   private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> wy.b("commands.place.structure.invalid", $$0));
   private static final DynamicCommandExceptionType d = new DynamicCommandExceptionType($$0 -> wy.b("commands.place.jigsaw.invalid", $$0));
   final akp<? extends jz<T>> e;

   public ft(akp<? extends jz<T>> $$0) {
      this.e = $$0;
   }

   public static <T> ft<T> a(akp<? extends jz<T>> $$0) {
      return new ft<>($$0);
   }

   private static <T> akp<T> a(CommandContext<et> $$0, String $$1, akp<jz<T>> $$2, DynamicCommandExceptionType $$3) throws CommandSyntaxException {
      akp<?> $$4 = (akp<?>)$$0.getArgument($$1, akp.class);
      Optional<akp<T>> $$5 = $$4.d($$2);
      return $$5.orElseThrow(() -> $$3.create($$4));
   }

   private static <T> jz<T> a(CommandContext<et> $$0, akp<? extends jz<T>> $$1) {
      return ((et)$$0.getSource()).l().bc().d($$1);
   }

   private static <T> jm.c<T> b(CommandContext<et> $$0, String $$1, akp<jz<T>> $$2, DynamicCommandExceptionType $$3) throws CommandSyntaxException {
      akp<T> $$4 = a($$0, $$1, $$2, $$3);
      return a($$0, $$2).b($$4).orElseThrow(() -> $$3.create($$4.a()));
   }

   public static jm.c<ebn<?, ?>> a(CommandContext<et> $$0, String $$1) throws CommandSyntaxException {
      return b($$0, $$1, lu.aI, b);
   }

   public static jm.c<ejm> b(CommandContext<et> $$0, String $$1) throws CommandSyntaxException {
      return b($$0, $$1, lu.aR, c);
   }

   public static jm.c<ekw> c(CommandContext<et> $$0, String $$1) throws CommandSyntaxException {
      return b($$0, $$1, lu.aU, d);
   }

   public akp<T> a(StringReader $$0) throws CommandSyntaxException {
      akq $$1 = akq.a($$0);
      return akp.a(this.e, $$1);
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return $$0.getSource() instanceof ey $$2 ? $$2.a(this.e, ey.a.b, $$1, $$0) : $$1.buildFuture();
   }

   public Collection<String> getExamples() {
      return a;
   }

   public static class a<T> implements io<ft<T>, ft.a<T>.a> {
      public void a(ft.a<T>.a $$0, vv $$1) {
         $$1.b($$0.b);
      }

      public ft.a<T>.a a(vv $$0) {
         return new ft.a.a($$0.r());
      }

      public void a(ft.a<T>.a $$0, JsonObject $$1) {
         $$1.addProperty("registry", $$0.b.a().toString());
      }

      public ft.a<T>.a a(ft<T> $$0) {
         return new ft.a.a($$0.e);
      }

      public final class a implements io.a<ft<T>> {
         final akp<? extends jz<T>> b;

         a(final akp<? extends jz<T>> $$1) {
            this.b = $$1;
         }

         public ft<T> a(ep $$0) {
            return new ft<>(this.b);
         }

         @Override
         public io<ft<T>, ?> a() {
            return a.this;
         }
      }
   }
}
