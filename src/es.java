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
   private static final DynamicCommandExceptionType d = new DynamicCommandExceptionType($$0 -> ui.b("entity.not_summonable", $$0));
   public static final Dynamic2CommandExceptionType a = new Dynamic2CommandExceptionType(($$0, $$1) -> ui.b("argument.resource.not_found", $$0, $$1));
   public static final Dynamic3CommandExceptionType b = new Dynamic3CommandExceptionType(
      ($$0, $$1, $$2) -> ui.b("argument.resource.invalid_type", $$0, $$1, $$2)
   );
   final afv<? extends io<T>> e;
   private final id<T> f;

   public es(dp $$0, afv<? extends io<T>> $$1) {
      this.e = $$1;
      this.f = $$0.a($$1);
   }

   public static <T> es<T> a(dp $$0, afv<? extends io<T>> $$1) {
      return new es<>($$0, $$1);
   }

   public static <T> ib.c<T> a(CommandContext<du> $$0, String $$1, afv<io<T>> $$2) throws CommandSyntaxException {
      ib.c<T> $$3 = (ib.c<T>)$$0.getArgument($$1, ib.c.class);
      afv<?> $$4 = $$3.g();
      if ($$4.b($$2)) {
         return $$3;
      } else {
         throw b.create($$4.a(), $$4.b(), $$2.a());
      }
   }

   public static ib.c<blk> a(CommandContext<du> $$0, String $$1) throws CommandSyntaxException {
      return a($$0, $$1, jz.b);
   }

   public static ib.c<dob<?, ?>> b(CommandContext<du> $$0, String $$1) throws CommandSyntaxException {
      return a($$0, $$1, jz.at);
   }

   public static ib.c<dwa> c(CommandContext<du> $$0, String $$1) throws CommandSyntaxException {
      return a($$0, $$1, jz.aA);
   }

   public static ib.c<bjx<?>> d(CommandContext<du> $$0, String $$1) throws CommandSyntaxException {
      return a($$0, $$1, jz.t);
   }

   public static ib.c<bjx<?>> e(CommandContext<du> $$0, String $$1) throws CommandSyntaxException {
      ib.c<bjx<?>> $$2 = a($$0, $$1, jz.t);
      if (!$$2.a().c()) {
         throw d.create($$2.g().a().toString());
      } else {
         return $$2;
      }
   }

   public static ib.c<bje> f(CommandContext<du> $$0, String $$1) throws CommandSyntaxException {
      return a($$0, $$1, jz.P);
   }

   public static ib.c<cot> g(CommandContext<du> $$0, String $$1) throws CommandSyntaxException {
      return a($$0, $$1, jz.s);
   }

   public ib.c<T> a(StringReader $$0) throws CommandSyntaxException {
      afw $$1 = afw.a($$0);
      afv<T> $$2 = afv.a(this.e, $$1);
      return this.f.a($$2).orElseThrow(() -> a.create($$1, this.e.a()));
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return dy.a(this.f.c().map(afv::a), $$1);
   }

   public Collection<String> getExamples() {
      return c;
   }

   public static class a<T> implements hf<es<T>, es.a<T>.a> {
      public void a(es.a<T>.a $$0, tl $$1) {
         $$1.b($$0.b);
      }

      public es.a<T>.a a(tl $$0) {
         return new es.a.a($$0.u());
      }

      public void a(es.a<T>.a $$0, JsonObject $$1) {
         $$1.addProperty("registry", $$0.b.a().toString());
      }

      public es.a<T>.a a(es<T> $$0) {
         return new es.a.a($$0.e);
      }

      public final class a implements hf.a<es<T>> {
         final afv<? extends io<T>> b;

         a(afv<? extends io<T>> $$1) {
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
