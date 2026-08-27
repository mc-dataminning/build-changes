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

public class es<T> implements ArgumentType<ib.c<T>> {
   private static final Collection<String> c = Arrays.asList("foo", "foo:bar", "012");
   private static final DynamicCommandExceptionType d = new DynamicCommandExceptionType($$0 -> ur.b("entity.not_summonable", $$0));
   public static final Dynamic2CommandExceptionType a = new Dynamic2CommandExceptionType(($$0, $$1) -> ur.b("argument.resource.not_found", $$0, $$1));
   public static final Dynamic3CommandExceptionType b = new Dynamic3CommandExceptionType(
      ($$0, $$1, $$2) -> ur.b("argument.resource.invalid_type", $$0, $$1, $$2)
   );
   final agf<? extends io<T>> e;
   private final id<T> f;

   public es(dp $$0, agf<? extends io<T>> $$1) {
      this.e = $$1;
      this.f = $$0.a($$1);
   }

   public static <T> es<T> a(dp $$0, agf<? extends io<T>> $$1) {
      return new es<>($$0, $$1);
   }

   public static <T> ib.c<T> a(CommandContext<du> $$0, String $$1, agf<io<T>> $$2) throws CommandSyntaxException {
      ib.c<T> $$3 = (ib.c<T>)$$0.getArgument($$1, ib.c.class);
      agf<?> $$4 = $$3.g();
      if ($$4.b($$2)) {
         return $$3;
      } else {
         throw b.create($$4.a(), $$4.b(), $$2.a());
      }
   }

   public static ib.c<blz> a(CommandContext<du> $$0, String $$1) throws CommandSyntaxException {
      return a($$0, $$1, jz.b);
   }

   public static ib.c<dow<?, ?>> b(CommandContext<du> $$0, String $$1) throws CommandSyntaxException {
      return a($$0, $$1, jz.au);
   }

   public static ib.c<dwv> c(CommandContext<du> $$0, String $$1) throws CommandSyntaxException {
      return a($$0, $$1, jz.aB);
   }

   public static ib.c<bkm<?>> d(CommandContext<du> $$0, String $$1) throws CommandSyntaxException {
      return a($$0, $$1, jz.t);
   }

   public static ib.c<bkm<?>> e(CommandContext<du> $$0, String $$1) throws CommandSyntaxException {
      ib.c<bkm<?>> $$2 = a($$0, $$1, jz.t);
      if (!$$2.a().c()) {
         throw d.create($$2.g().a().toString());
      } else {
         return $$2;
      }
   }

   public static ib.c<bjt> f(CommandContext<du> $$0, String $$1) throws CommandSyntaxException {
      return a($$0, $$1, jz.P);
   }

   public static ib.c<cpm> g(CommandContext<du> $$0, String $$1) throws CommandSyntaxException {
      return a($$0, $$1, jz.s);
   }

   public ib.c<T> a(StringReader $$0) throws CommandSyntaxException {
      agg $$1 = agg.a($$0);
      agf<T> $$2 = agf.a(this.e, $$1);
      return this.f.a($$2).orElseThrow(() -> a.create($$1, this.e.a()));
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return dy.a(this.f.c().map(agf::a), $$1);
   }

   public Collection<String> getExamples() {
      return c;
   }

   public static class a<T> implements hf<es<T>, es.a<T>.a> {
      public void a(es.a<T>.a $$0, tu $$1) {
         $$1.b($$0.b);
      }

      public es.a<T>.a a(tu $$0) {
         return new es.a.a($$0.u());
      }

      public void a(es.a<T>.a $$0, JsonObject $$1) {
         $$1.addProperty("registry", $$0.b.a().toString());
      }

      public es.a<T>.a a(es<T> $$0) {
         return new es.a.a($$0.e);
      }

      public final class a implements hf.a<es<T>> {
         final agf<? extends io<T>> b;

         a(agf<? extends io<T>> $$1) {
            this.b = $$1;
         }

         public es<T> a(dp $$0) {
            return new es<>($$0, this.b);
         }

         @Override
         public hf<es<T>, ?> a() {
            return a.this;
         }
      }
   }
}
