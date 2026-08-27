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

public class eu<T> implements ArgumentType<in.c<T>> {
   private static final Collection<String> c = Arrays.asList("foo", "foo:bar", "012");
   private static final DynamicCommandExceptionType d = new DynamicCommandExceptionType($$0 -> wi.b("entity.not_summonable", $$0));
   public static final Dynamic2CommandExceptionType a = new Dynamic2CommandExceptionType(($$0, $$1) -> wi.b("argument.resource.not_found", $$0, $$1));
   public static final Dynamic3CommandExceptionType b = new Dynamic3CommandExceptionType(
      ($$0, $$1, $$2) -> wi.b("argument.resource.invalid_type", $$0, $$1, $$2)
   );
   final aju<? extends ja<T>> e;
   private final ip<T> f;

   public eu(dr $$0, aju<? extends ja<T>> $$1) {
      this.e = $$1;
      this.f = $$0.b($$1);
   }

   public static <T> eu<T> a(dr $$0, aju<? extends ja<T>> $$1) {
      return new eu<>($$0, $$1);
   }

   public static <T> in.c<T> a(CommandContext<dv> $$0, String $$1, aju<ja<T>> $$2) throws CommandSyntaxException {
      in.c<T> $$3 = (in.c<T>)$$0.getArgument($$1, in.c.class);
      aju<?> $$4 = $$3.h();
      if ($$4.c($$2)) {
         return $$3;
      } else {
         throw b.create($$4.a(), $$4.b(), $$2.a());
      }
   }

   public static in.c<brv> a(CommandContext<dv> $$0, String $$1) throws CommandSyntaxException {
      return a($$0, $$1, ku.c);
   }

   public static in.c<dxr<?, ?>> b(CommandContext<dv> $$0, String $$1) throws CommandSyntaxException {
      return a($$0, $$1, ku.az);
   }

   public static in.c<efq> c(CommandContext<dv> $$0, String $$1) throws CommandSyntaxException {
      return a($$0, $$1, ku.aG);
   }

   public static in.c<bqg<?>> d(CommandContext<dv> $$0, String $$1) throws CommandSyntaxException {
      return a($$0, $$1, ku.v);
   }

   public static in.c<bqg<?>> e(CommandContext<dv> $$0, String $$1) throws CommandSyntaxException {
      in.c<bqg<?>> $$2 = a($$0, $$1, ku.v);
      if (!$$2.a().c()) {
         throw d.create($$2.h().a().toString());
      } else {
         return $$2;
      }
   }

   public static in.c<bpk> f(CommandContext<dv> $$0, String $$1) throws CommandSyntaxException {
      return a($$0, $$1, ku.R);
   }

   public static in.c<cwz> g(CommandContext<dv> $$0, String $$1) throws CommandSyntaxException {
      return a($$0, $$1, ku.u);
   }

   public in.c<T> a(StringReader $$0) throws CommandSyntaxException {
      ajv $$1 = ajv.a($$0);
      aju<T> $$2 = aju.a(this.e, $$1);
      return this.f.a($$2).orElseThrow(() -> a.createWithContext($$0, $$1, this.e.a()));
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return ea.a(this.f.c().map(aju::a), $$1);
   }

   public Collection<String> getExamples() {
      return c;
   }

   public static class a<T> implements hp<eu<T>, eu.a<T>.a> {
      public void a(eu.a<T>.a $$0, vi $$1) {
         $$1.b($$0.b);
      }

      public eu.a<T>.a a(vi $$0) {
         return new eu.a.a($$0.r());
      }

      public void a(eu.a<T>.a $$0, JsonObject $$1) {
         $$1.addProperty("registry", $$0.b.a().toString());
      }

      public eu.a<T>.a a(eu<T> $$0) {
         return new eu.a.a($$0.e);
      }

      public final class a implements hp.a<eu<T>> {
         final aju<? extends ja<T>> b;

         a(aju<? extends ja<T>> $$1) {
            this.b = $$1;
         }

         public eu<T> a(dr $$0) {
            return new eu<>($$0, this.b);
         }

         @Override
         public hp<eu<T>, ?> a() {
            return a.this;
         }
      }
   }
}
