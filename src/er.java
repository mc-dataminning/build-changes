import com.google.gson.JsonObject;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.exceptions.Dynamic3CommandExceptionType;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.Arrays;
import java.util.Collection;
import java.util.concurrent.CompletableFuture;

public class er<T> implements ArgumentType<ih.c<T>> {
   private static final Collection<String> c = Arrays.asList("foo", "foo:bar", "012");
   private static final DynamicCommandExceptionType d = new DynamicCommandExceptionType($$0 -> vd.b("entity.not_summonable", $$0));
   public static final Dynamic2CommandExceptionType a = new Dynamic2CommandExceptionType(($$0, $$1) -> vd.b("argument.resource.not_found", $$0, $$1));
   public static final Dynamic3CommandExceptionType b = new Dynamic3CommandExceptionType(
      ($$0, $$1, $$2) -> vd.b("argument.resource.invalid_type", $$0, $$1, $$2)
   );
   final ahc<? extends it<T>> e;
   private final ij<T> f;

   public er(dn $$0, ahc<? extends it<T>> $$1) {
      this.e = $$1;
      this.f = $$0.a($$1);
   }

   public static <T> er<T> a(dn $$0, ahc<? extends it<T>> $$1) {
      return new er<>($$0, $$1);
   }

   public static <T> ih.c<T> a(CommandContext<ds> $$0, String $$1, ahc<it<T>> $$2) throws CommandSyntaxException {
      ih.c<T> $$3 = (ih.c<T>)$$0.getArgument($$1, ih.c.class);
      ahc<?> $$4 = $$3.g();
      if ($$4.b($$2)) {
         return $$3;
      } else {
         throw b.create($$4.a(), $$4.b(), $$2.a());
      }
   }

   public static ih.c<bng> a(CommandContext<ds> $$0, String $$1) throws CommandSyntaxException {
      return a($$0, $$1, ke.c);
   }

   public static ih.c<dra<?, ?>> b(CommandContext<ds> $$0, String $$1) throws CommandSyntaxException {
      return a($$0, $$1, ke.aw);
   }

   public static ih.c<dyz> c(CommandContext<ds> $$0, String $$1) throws CommandSyntaxException {
      return a($$0, $$1, ke.aD);
   }

   public static ih.c<blt<?>> d(CommandContext<ds> $$0, String $$1) throws CommandSyntaxException {
      return a($$0, $$1, ke.u);
   }

   public static ih.c<blt<?>> e(CommandContext<ds> $$0, String $$1) throws CommandSyntaxException {
      ih.c<blt<?>> $$2 = a($$0, $$1, ke.u);
      if (!$$2.a().c()) {
         throw d.create($$2.g().a().toString());
      } else {
         return $$2;
      }
   }

   public static ih.c<bla> f(CommandContext<ds> $$0, String $$1) throws CommandSyntaxException {
      return a($$0, $$1, ke.Q);
   }

   public static ih.c<crc> g(CommandContext<ds> $$0, String $$1) throws CommandSyntaxException {
      return a($$0, $$1, ke.t);
   }

   public ih.c<T> a(StringReader $$0) throws CommandSyntaxException {
      ahd $$1 = ahd.a($$0);
      ahc<T> $$2 = ahc.a(this.e, $$1);
      return this.f.a($$2).orElseThrow(() -> a.create($$1, this.e.a()));
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return dx.a(this.f.c().map(ahc::a), $$1);
   }

   public Collection<String> getExamples() {
      return c;
   }

   public static class a<T> implements hj<er<T>, er.a<T>.a> {
      public void a(er.a<T>.a $$0, ug $$1) {
         $$1.b($$0.b);
      }

      public er.a<T>.a a(ug $$0) {
         return new er.a.a($$0.u());
      }

      public void a(er.a<T>.a $$0, JsonObject $$1) {
         $$1.addProperty("registry", $$0.b.a().toString());
      }

      public er.a<T>.a a(er<T> $$0) {
         return new er.a.a($$0.e);
      }

      public final class a implements hj.a<er<T>> {
         final ahc<? extends it<T>> b;

         a(ahc<? extends it<T>> $$1) {
            this.b = $$1;
         }

         public er<T> a(dn $$0) {
            return new er<>($$0, this.b);
         }

         @Override
         public hj<er<T>, ?> a() {
            return a.this;
         }
      }
   }
}
