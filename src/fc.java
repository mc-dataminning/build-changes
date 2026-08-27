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

public class fc<T> implements ArgumentType<iw.c<T>> {
   private static final Collection<String> c = Arrays.asList("foo", "foo:bar", "012");
   private static final DynamicCommandExceptionType d = new DynamicCommandExceptionType($$0 -> wu.b("entity.not_summonable", $$0));
   public static final Dynamic2CommandExceptionType a = new Dynamic2CommandExceptionType(($$0, $$1) -> wu.b("argument.resource.not_found", $$0, $$1));
   public static final Dynamic3CommandExceptionType b = new Dynamic3CommandExceptionType(
      ($$0, $$1, $$2) -> wu.b("argument.resource.invalid_type", $$0, $$1, $$2)
   );
   final akg<? extends jj<T>> e;
   private final iy<T> f;

   public fc(dz $$0, akg<? extends jj<T>> $$1) {
      this.e = $$1;
      this.f = $$0.b($$1);
   }

   public static <T> fc<T> a(dz $$0, akg<? extends jj<T>> $$1) {
      return new fc<>($$0, $$1);
   }

   public static <T> iw.c<T> a(CommandContext<ed> $$0, String $$1, akg<jj<T>> $$2) throws CommandSyntaxException {
      iw.c<T> $$3 = (iw.c<T>)$$0.getArgument($$1, iw.c.class);
      akg<?> $$4 = $$3.h();
      if ($$4.c($$2)) {
         return $$3;
      } else {
         throw b.create($$4.a(), $$4.b(), $$2.a());
      }
   }

   public static iw.c<btc> a(CommandContext<ed> $$0, String $$1) throws CommandSyntaxException {
      return a($$0, $$1, le.c);
   }

   public static iw.c<dyq<?, ?>> b(CommandContext<ed> $$0, String $$1) throws CommandSyntaxException {
      return a($$0, $$1, le.aC);
   }

   public static iw.c<egp> c(CommandContext<ed> $$0, String $$1) throws CommandSyntaxException {
      return a($$0, $$1, le.aJ);
   }

   public static iw.c<brn<?>> d(CommandContext<ed> $$0, String $$1) throws CommandSyntaxException {
      return a($$0, $$1, le.v);
   }

   public static iw.c<brn<?>> e(CommandContext<ed> $$0, String $$1) throws CommandSyntaxException {
      iw.c<brn<?>> $$2 = a($$0, $$1, le.v);
      if (!$$2.a().c()) {
         throw d.create($$2.h().a().toString());
      } else {
         return $$2;
      }
   }

   public static iw.c<bqr> f(CommandContext<ed> $$0, String $$1) throws CommandSyntaxException {
      return a($$0, $$1, le.R);
   }

   public static iw.c<cyg> g(CommandContext<ed> $$0, String $$1) throws CommandSyntaxException {
      return a($$0, $$1, le.u);
   }

   public iw.c<T> a(StringReader $$0) throws CommandSyntaxException {
      akh $$1 = akh.a($$0);
      akg<T> $$2 = akg.a(this.e, $$1);
      return this.f.a($$2).orElseThrow(() -> a.createWithContext($$0, $$1, this.e.a()));
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return ei.a(this.f.c().map(akg::a), $$1);
   }

   public Collection<String> getExamples() {
      return c;
   }

   public static class a<T> implements hx<fc<T>, fc.a<T>.a> {
      public void a(fc.a<T>.a $$0, vu $$1) {
         $$1.b($$0.b);
      }

      public fc.a<T>.a a(vu $$0) {
         return new fc.a.a($$0.r());
      }

      public void a(fc.a<T>.a $$0, JsonObject $$1) {
         $$1.addProperty("registry", $$0.b.a().toString());
      }

      public fc.a<T>.a a(fc<T> $$0) {
         return new fc.a.a($$0.e);
      }

      public final class a implements hx.a<fc<T>> {
         final akg<? extends jj<T>> b;

         a(akg<? extends jj<T>> $$1) {
            this.b = $$1;
         }

         public fc<T> a(dz $$0) {
            return new fc<>($$0, this.b);
         }

         @Override
         public hx<fc<T>, ?> a() {
            return a.this;
         }
      }
   }
}
