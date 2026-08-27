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

public class fb<T> implements ArgumentType<iv.c<T>> {
   private static final Collection<String> c = Arrays.asList("foo", "foo:bar", "012");
   private static final DynamicCommandExceptionType d = new DynamicCommandExceptionType($$0 -> ws.b("entity.not_summonable", $$0));
   public static final Dynamic2CommandExceptionType a = new Dynamic2CommandExceptionType(($$0, $$1) -> ws.b("argument.resource.not_found", $$0, $$1));
   public static final Dynamic3CommandExceptionType b = new Dynamic3CommandExceptionType(
      ($$0, $$1, $$2) -> ws.b("argument.resource.invalid_type", $$0, $$1, $$2)
   );
   final ake<? extends ji<T>> e;
   private final ix<T> f;

   public fb(dy $$0, ake<? extends ji<T>> $$1) {
      this.e = $$1;
      this.f = $$0.b($$1);
   }

   public static <T> fb<T> a(dy $$0, ake<? extends ji<T>> $$1) {
      return new fb<>($$0, $$1);
   }

   public static <T> iv.c<T> a(CommandContext<ec> $$0, String $$1, ake<ji<T>> $$2) throws CommandSyntaxException {
      iv.c<T> $$3 = (iv.c<T>)$$0.getArgument($$1, iv.c.class);
      ake<?> $$4 = $$3.h();
      if ($$4.c($$2)) {
         return $$3;
      } else {
         throw b.create($$4.a(), $$4.b(), $$2.a());
      }
   }

   public static iv.c<bsg> a(CommandContext<ec> $$0, String $$1) throws CommandSyntaxException {
      return a($$0, $$1, ld.c);
   }

   public static iv.c<dyh<?, ?>> b(CommandContext<ec> $$0, String $$1) throws CommandSyntaxException {
      return a($$0, $$1, ld.aB);
   }

   public static iv.c<egg> c(CommandContext<ec> $$0, String $$1) throws CommandSyntaxException {
      return a($$0, $$1, ld.aI);
   }

   public static iv.c<bqr<?>> d(CommandContext<ec> $$0, String $$1) throws CommandSyntaxException {
      return a($$0, $$1, ld.v);
   }

   public static iv.c<bqr<?>> e(CommandContext<ec> $$0, String $$1) throws CommandSyntaxException {
      iv.c<bqr<?>> $$2 = a($$0, $$1, ld.v);
      if (!$$2.a().c()) {
         throw d.create($$2.h().a().toString());
      } else {
         return $$2;
      }
   }

   public static iv.c<bpv> f(CommandContext<ec> $$0, String $$1) throws CommandSyntaxException {
      return a($$0, $$1, ld.R);
   }

   public static iv.c<cxn> g(CommandContext<ec> $$0, String $$1) throws CommandSyntaxException {
      return a($$0, $$1, ld.u);
   }

   public iv.c<T> a(StringReader $$0) throws CommandSyntaxException {
      akf $$1 = akf.a($$0);
      ake<T> $$2 = ake.a(this.e, $$1);
      return this.f.a($$2).orElseThrow(() -> a.createWithContext($$0, $$1, this.e.a()));
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return eh.a(this.f.c().map(ake::a), $$1);
   }

   public Collection<String> getExamples() {
      return c;
   }

   public static class a<T> implements hw<fb<T>, fb.a<T>.a> {
      public void a(fb.a<T>.a $$0, vs $$1) {
         $$1.b($$0.b);
      }

      public fb.a<T>.a a(vs $$0) {
         return new fb.a.a($$0.r());
      }

      public void a(fb.a<T>.a $$0, JsonObject $$1) {
         $$1.addProperty("registry", $$0.b.a().toString());
      }

      public fb.a<T>.a a(fb<T> $$0) {
         return new fb.a.a($$0.e);
      }

      public final class a implements hw.a<fb<T>> {
         final ake<? extends ji<T>> b;

         a(ake<? extends ji<T>> $$1) {
            this.b = $$1;
         }

         public fb<T> a(dy $$0) {
            return new fb<>($$0, this.b);
         }

         @Override
         public hw<fb<T>, ?> a() {
            return a.this;
         }
      }
   }
}
