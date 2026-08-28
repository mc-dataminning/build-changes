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

public class fo<T> implements ArgumentType<ji.c<T>> {
   private static final Collection<String> c = Arrays.asList("foo", "foo:bar", "012");
   private static final DynamicCommandExceptionType d = new DynamicCommandExceptionType($$0 -> xo.b("entity.not_summonable", $$0));
   public static final Dynamic2CommandExceptionType a = new Dynamic2CommandExceptionType(($$0, $$1) -> xo.b("argument.resource.not_found", $$0, $$1));
   public static final Dynamic3CommandExceptionType b = new Dynamic3CommandExceptionType(
      ($$0, $$1, $$2) -> xo.b("argument.resource.invalid_type", $$0, $$1, $$2)
   );
   final ald<? extends jv<T>> e;
   private final jk<T> f;

   public fo(el $$0, ald<? extends jv<T>> $$1) {
      this.e = $$1;
      this.f = $$0.b($$1);
   }

   public static <T> fo<T> a(el $$0, ald<? extends jv<T>> $$1) {
      return new fo<>($$0, $$1);
   }

   public static <T> ji.c<T> a(CommandContext<ep> $$0, String $$1, ald<jv<T>> $$2) throws CommandSyntaxException {
      ji.c<T> $$3 = (ji.c<T>)$$0.getArgument($$1, ji.c.class);
      ald<?> $$4 = $$3.h();
      if ($$4.c($$2)) {
         return $$3;
      } else {
         throw b.create($$4.a(), $$4.b(), $$2.a());
      }
   }

   public static ji.c<buq> a(CommandContext<ep> $$0, String $$1) throws CommandSyntaxException {
      return a($$0, $$1, lq.c);
   }

   public static ji.c<eaj<?, ?>> b(CommandContext<ep> $$0, String $$1) throws CommandSyntaxException {
      return a($$0, $$1, lq.aC);
   }

   public static ji.c<eii> c(CommandContext<ep> $$0, String $$1) throws CommandSyntaxException {
      return a($$0, $$1, lq.aJ);
   }

   public static ji.c<bsy<?>> d(CommandContext<ep> $$0, String $$1) throws CommandSyntaxException {
      return a($$0, $$1, lq.v);
   }

   public static ji.c<bsy<?>> e(CommandContext<ep> $$0, String $$1) throws CommandSyntaxException {
      ji.c<bsy<?>> $$2 = a($$0, $$1, lq.v);
      if (!$$2.a().c()) {
         throw d.create($$2.h().a().toString());
      } else {
         return $$2;
      }
   }

   public static ji.c<bry> f(CommandContext<ep> $$0, String $$1) throws CommandSyntaxException {
      return a($$0, $$1, lq.R);
   }

   public static ji.c<czy> g(CommandContext<ep> $$0, String $$1) throws CommandSyntaxException {
      return a($$0, $$1, lq.u);
   }

   public ji.c<T> a(StringReader $$0) throws CommandSyntaxException {
      ale $$1 = ale.a($$0);
      ald<T> $$2 = ald.a(this.e, $$1);
      return this.f.a($$2).orElseThrow(() -> a.createWithContext($$0, $$1, this.e.a()));
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return eu.a(this.f.c().map(ald::a), $$1);
   }

   public Collection<String> getExamples() {
      return c;
   }

   public static class a<T> implements ik<fo<T>, fo.a<T>.a> {
      public void a(fo.a<T>.a $$0, wl $$1) {
         $$1.b($$0.b);
      }

      public fo.a<T>.a a(wl $$0) {
         return new fo.a.a($$0.r());
      }

      public void a(fo.a<T>.a $$0, JsonObject $$1) {
         $$1.addProperty("registry", $$0.b.a().toString());
      }

      public fo.a<T>.a a(fo<T> $$0) {
         return new fo.a.a($$0.e);
      }

      public final class a implements ik.a<fo<T>> {
         final ald<? extends jv<T>> b;

         a(final ald<? extends jv<T>> $$1) {
            this.b = $$1;
         }

         public fo<T> a(el $$0) {
            return new fo<>($$0, this.b);
         }

         @Override
         public ik<fo<T>, ?> a() {
            return a.this;
         }
      }
   }
}
