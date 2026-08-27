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

public class eq<T> implements ArgumentType<ie.c<T>> {
   private static final Collection<String> c = Arrays.asList("foo", "foo:bar", "012");
   private static final DynamicCommandExceptionType d = new DynamicCommandExceptionType($$0 -> vb.b("entity.not_summonable", $$0));
   public static final Dynamic2CommandExceptionType a = new Dynamic2CommandExceptionType(($$0, $$1) -> vb.b("argument.resource.not_found", $$0, $$1));
   public static final Dynamic3CommandExceptionType b = new Dynamic3CommandExceptionType(
      ($$0, $$1, $$2) -> vb.b("argument.resource.invalid_type", $$0, $$1, $$2)
   );
   final ags<? extends ir<T>> e;
   private final ih<T> f;

   public eq(dn $$0, ags<? extends ir<T>> $$1) {
      this.e = $$1;
      this.f = $$0.a($$1);
   }

   public static <T> eq<T> a(dn $$0, ags<? extends ir<T>> $$1) {
      return new eq<>($$0, $$1);
   }

   public static <T> ie.c<T> a(CommandContext<ds> $$0, String $$1, ags<ir<T>> $$2) throws CommandSyntaxException {
      ie.c<T> $$3 = (ie.c<T>)$$0.getArgument($$1, ie.c.class);
      ags<?> $$4 = $$3.g();
      if ($$4.b($$2)) {
         return $$3;
      } else {
         throw b.create($$4.a(), $$4.b(), $$2.a());
      }
   }

   public static ie.c<bmw> a(CommandContext<ds> $$0, String $$1) throws CommandSyntaxException {
      return a($$0, $$1, kc.c);
   }

   public static ie.c<dqp<?, ?>> b(CommandContext<ds> $$0, String $$1) throws CommandSyntaxException {
      return a($$0, $$1, kc.av);
   }

   public static ie.c<dyo> c(CommandContext<ds> $$0, String $$1) throws CommandSyntaxException {
      return a($$0, $$1, kc.aC);
   }

   public static ie.c<blj<?>> d(CommandContext<ds> $$0, String $$1) throws CommandSyntaxException {
      return a($$0, $$1, kc.u);
   }

   public static ie.c<blj<?>> e(CommandContext<ds> $$0, String $$1) throws CommandSyntaxException {
      ie.c<blj<?>> $$2 = a($$0, $$1, kc.u);
      if (!$$2.a().c()) {
         throw d.create($$2.g().a().toString());
      } else {
         return $$2;
      }
   }

   public static ie.c<bkq> f(CommandContext<ds> $$0, String $$1) throws CommandSyntaxException {
      return a($$0, $$1, kc.Q);
   }

   public static ie.c<cqs> g(CommandContext<ds> $$0, String $$1) throws CommandSyntaxException {
      return a($$0, $$1, kc.t);
   }

   public ie.c<T> a(StringReader $$0) throws CommandSyntaxException {
      agt $$1 = agt.a($$0);
      ags<T> $$2 = ags.a(this.e, $$1);
      return this.f.a($$2).orElseThrow(() -> a.create($$1, this.e.a()));
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return dw.a(this.f.c().map(ags::a), $$1);
   }

   public Collection<String> getExamples() {
      return c;
   }

   public static class a<T> implements hh<eq<T>, eq.a<T>.a> {
      public void a(eq.a<T>.a $$0, ue $$1) {
         $$1.b($$0.b);
      }

      public eq.a<T>.a a(ue $$0) {
         return new eq.a.a($$0.u());
      }

      public void a(eq.a<T>.a $$0, JsonObject $$1) {
         $$1.addProperty("registry", $$0.b.a().toString());
      }

      public eq.a<T>.a a(eq<T> $$0) {
         return new eq.a.a($$0.e);
      }

      public final class a implements hh.a<eq<T>> {
         final ags<? extends ir<T>> b;

         a(ags<? extends ir<T>> $$1) {
            this.b = $$1;
         }

         public eq<T> a(dn $$0) {
            return new eq<>($$0, this.b);
         }

         @Override
         public hh<eq<T>, ?> a() {
            return a.this;
         }
      }
   }
}
