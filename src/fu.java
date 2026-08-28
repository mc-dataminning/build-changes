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

public class fu<T> implements ArgumentType<jp.c<T>> {
   private static final Collection<String> c = Arrays.asList("foo", "foo:bar", "012");
   private static final DynamicCommandExceptionType d = new DynamicCommandExceptionType($$0 -> xh.b("entity.not_summonable", $$0));
   public static final Dynamic2CommandExceptionType a = new Dynamic2CommandExceptionType(($$0, $$1) -> xh.b("argument.resource.not_found", $$0, $$1));
   public static final Dynamic3CommandExceptionType b = new Dynamic3CommandExceptionType(
      ($$0, $$1, $$2) -> xh.b("argument.resource.invalid_type", $$0, $$1, $$2)
   );
   final alg<? extends kc<T>> e;
   private final jr<T> f;

   public fu(er $$0, alg<? extends kc<T>> $$1) {
      this.e = $$1;
      this.f = $$0.d($$1);
   }

   public static <T> fu<T> a(er $$0, alg<? extends kc<T>> $$1) {
      return new fu<>($$0, $$1);
   }

   public static <T> jp.c<T> a(CommandContext<ev> $$0, String $$1, alg<kc<T>> $$2) throws CommandSyntaxException {
      jp.c<T> $$3 = (jp.c<T>)$$0.getArgument($$1, jp.c.class);
      alg<?> $$4 = $$3.h();
      if ($$4.c($$2)) {
         return $$3;
      } else {
         throw b.create($$4.a(), $$4.b(), $$2.a());
      }
   }

   public static jp.c<bvy> a(CommandContext<ev> $$0, String $$1) throws CommandSyntaxException {
      return a($$0, $$1, ly.c);
   }

   public static jp.c<edr<?, ?>> b(CommandContext<ev> $$0, String $$1) throws CommandSyntaxException {
      return a($$0, $$1, ly.aJ);
   }

   public static jp.c<elr> c(CommandContext<ev> $$0, String $$1) throws CommandSyntaxException {
      return a($$0, $$1, ly.aS);
   }

   public static jp.c<bug<?>> d(CommandContext<ev> $$0, String $$1) throws CommandSyntaxException {
      return a($$0, $$1, ly.z);
   }

   public static jp.c<bug<?>> e(CommandContext<ev> $$0, String $$1) throws CommandSyntaxException {
      jp.c<bug<?>> $$2 = a($$0, $$1, ly.z);
      if (!$$2.a().c()) {
         throw d.create($$2.h().a().toString());
      } else {
         return $$2;
      }
   }

   public static jp.c<btc> f(CommandContext<ev> $$0, String $$1) throws CommandSyntaxException {
      return a($$0, $$1, ly.W);
   }

   public static jp.c<dbm> g(CommandContext<ev> $$0, String $$1) throws CommandSyntaxException {
      return a($$0, $$1, ly.aM);
   }

   public jp.c<T> a(StringReader $$0) throws CommandSyntaxException {
      alh $$1 = alh.a($$0);
      alg<T> $$2 = alg.a(this.e, $$1);
      return this.f.a($$2).orElseThrow(() -> a.createWithContext($$0, $$1, this.e.a()));
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return fa.a(this.f.c_().map(alg::a), $$1);
   }

   public Collection<String> getExamples() {
      return c;
   }

   public static class a<T> implements ir<fu<T>, fu.a<T>.a> {
      public void a(fu.a<T>.a $$0, we $$1) {
         $$1.b($$0.b);
      }

      public fu.a<T>.a a(we $$0) {
         return new fu.a.a($$0.r());
      }

      public void a(fu.a<T>.a $$0, JsonObject $$1) {
         $$1.addProperty("registry", $$0.b.a().toString());
      }

      public fu.a<T>.a a(fu<T> $$0) {
         return new fu.a.a($$0.e);
      }

      public final class a implements ir.a<fu<T>> {
         final alg<? extends kc<T>> b;

         a(final alg<? extends kc<T>> $$1) {
            this.b = $$1;
         }

         public fu<T> a(er $$0) {
            return new fu<>($$0, this.b);
         }

         @Override
         public ir<fu<T>, ?> a() {
            return a.this;
         }
      }
   }
}
