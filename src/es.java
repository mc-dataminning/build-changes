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

public class es<T> implements ArgumentType<ig.c<T>> {
   private static final Collection<String> c = Arrays.asList("foo", "foo:bar", "012");
   private static final DynamicCommandExceptionType d = new DynamicCommandExceptionType($$0 -> uv.b("entity.not_summonable", $$0));
   public static final Dynamic2CommandExceptionType a = new Dynamic2CommandExceptionType(($$0, $$1) -> uv.b("argument.resource.not_found", $$0, $$1));
   public static final Dynamic3CommandExceptionType b = new Dynamic3CommandExceptionType(
      ($$0, $$1, $$2) -> uv.b("argument.resource.invalid_type", $$0, $$1, $$2)
   );
   final agl<? extends is<T>> e;
   private final ii<T> f;

   public es(dp $$0, agl<? extends is<T>> $$1) {
      this.e = $$1;
      this.f = $$0.a($$1);
   }

   public static <T> es<T> a(dp $$0, agl<? extends is<T>> $$1) {
      return new es<>($$0, $$1);
   }

   public static <T> ig.c<T> a(CommandContext<du> $$0, String $$1, agl<is<T>> $$2) throws CommandSyntaxException {
      ig.c<T> $$3 = (ig.c<T>)$$0.getArgument($$1, ig.c.class);
      agl<?> $$4 = $$3.g();
      if ($$4.b($$2)) {
         return $$3;
      } else {
         throw b.create($$4.a(), $$4.b(), $$2.a());
      }
   }

   public static ig.c<bmm> a(CommandContext<du> $$0, String $$1) throws CommandSyntaxException {
      return a($$0, $$1, kd.b);
   }

   public static ig.c<dpn<?, ?>> b(CommandContext<du> $$0, String $$1) throws CommandSyntaxException {
      return a($$0, $$1, kd.au);
   }

   public static ig.c<dxm> c(CommandContext<du> $$0, String $$1) throws CommandSyntaxException {
      return a($$0, $$1, kd.aB);
   }

   public static ig.c<bkz<?>> d(CommandContext<du> $$0, String $$1) throws CommandSyntaxException {
      return a($$0, $$1, kd.t);
   }

   public static ig.c<bkz<?>> e(CommandContext<du> $$0, String $$1) throws CommandSyntaxException {
      ig.c<bkz<?>> $$2 = a($$0, $$1, kd.t);
      if (!$$2.a().c()) {
         throw d.create($$2.g().a().toString());
      } else {
         return $$2;
      }
   }

   public static ig.c<bkg> f(CommandContext<du> $$0, String $$1) throws CommandSyntaxException {
      return a($$0, $$1, kd.P);
   }

   public static ig.c<cpz> g(CommandContext<du> $$0, String $$1) throws CommandSyntaxException {
      return a($$0, $$1, kd.s);
   }

   public ig.c<T> a(StringReader $$0) throws CommandSyntaxException {
      agm $$1 = agm.a($$0);
      agl<T> $$2 = agl.a(this.e, $$1);
      return this.f.a($$2).orElseThrow(() -> a.create($$1, this.e.a()));
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return dy.a(this.f.c().map(agl::a), $$1);
   }

   public Collection<String> getExamples() {
      return c;
   }

   public static class a<T> implements hj<es<T>, es.a<T>.a> {
      public void a(es.a<T>.a $$0, ty $$1) {
         $$1.b($$0.b);
      }

      public es.a<T>.a a(ty $$0) {
         return new es.a.a($$0.u());
      }

      public void a(es.a<T>.a $$0, JsonObject $$1) {
         $$1.addProperty("registry", $$0.b.a().toString());
      }

      public es.a<T>.a a(es<T> $$0) {
         return new es.a.a($$0.e);
      }

      public final class a implements hj.a<es<T>> {
         final agl<? extends is<T>> b;

         a(agl<? extends is<T>> $$1) {
            this.b = $$1;
         }

         public es<T> a(dp $$0) {
            return new es<>($$0, this.b);
         }

         @Override
         public hj<es<T>, ?> a() {
            return a.this;
         }
      }
   }
}
