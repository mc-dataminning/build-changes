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

public class fh<T> implements ArgumentType<je.c<T>> {
   private static final Collection<String> c = Arrays.asList("foo", "foo:bar", "012");
   private static final DynamicCommandExceptionType d = new DynamicCommandExceptionType($$0 -> ww.b("entity.not_summonable", $$0));
   public static final Dynamic2CommandExceptionType a = new Dynamic2CommandExceptionType(($$0, $$1) -> ww.b("argument.resource.not_found", $$0, $$1));
   public static final Dynamic3CommandExceptionType b = new Dynamic3CommandExceptionType(
      ($$0, $$1, $$2) -> ww.b("argument.resource.invalid_type", $$0, $$1, $$2)
   );
   final ald<? extends jr<T>> e;
   private final jg<T> f;

   public fh(ee $$0, ald<? extends jr<T>> $$1) {
      this.e = $$1;
      this.f = $$0.e($$1);
   }

   public static <T> fh<T> a(ee $$0, ald<? extends jr<T>> $$1) {
      return new fh<>($$0, $$1);
   }

   public static <T> je.c<T> a(CommandContext<ei> $$0, String $$1, ald<jr<T>> $$2) throws CommandSyntaxException {
      je.c<T> $$3 = (je.c<T>)$$0.getArgument($$1, je.c.class);
      ald<?> $$4 = $$3.h();
      if ($$4.c($$2)) {
         return $$3;
      } else {
         throw b.create($$4.a(), $$4.b(), $$2.a());
      }
   }

   public static je.c<bya> a(CommandContext<ei> $$0, String $$1) throws CommandSyntaxException {
      return a($$0, $$1, mg.c);
   }

   public static je.c<eif<?, ?>> b(CommandContext<ei> $$0, String $$1) throws CommandSyntaxException {
      return a($$0, $$1, mg.aK);
   }

   public static je.c<eqi> c(CommandContext<ei> $$0, String $$1) throws CommandSyntaxException {
      return a($$0, $$1, mg.bc);
   }

   public static je.c<bwj<?>> d(CommandContext<ei> $$0, String $$1) throws CommandSyntaxException {
      return a($$0, $$1, mg.B);
   }

   public static je.c<bwj<?>> e(CommandContext<ei> $$0, String $$1) throws CommandSyntaxException {
      je.c<bwj<?>> $$2 = a($$0, $$1, mg.B);
      if (!$$2.a().c()) {
         throw d.create($$2.h().a().toString());
      } else {
         return $$2;
      }
   }

   public static je.c<bvc> f(CommandContext<ei> $$0, String $$1) throws CommandSyntaxException {
      return a($$0, $$1, mg.W);
   }

   public static je.c<dff> g(CommandContext<ei> $$0, String $$1) throws CommandSyntaxException {
      return a($$0, $$1, mg.aP);
   }

   public je.c<T> a(StringReader $$0) throws CommandSyntaxException {
      ale $$1 = ale.a($$0);
      ald<T> $$2 = ald.a(this.e, $$1);
      return this.f.a($$2).orElseThrow(() -> a.createWithContext($$0, $$1, this.e.a()));
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return en.a(this.f.c_().map(ald::a), $$1);
   }

   public Collection<String> getExamples() {
      return c;
   }

   public static class a<T> implements ie<fh<T>, fh.a<T>.a> {
      public void a(fh.a<T>.a $$0, vs $$1) {
         $$1.b($$0.b);
      }

      public fh.a<T>.a a(vs $$0) {
         return new fh.a.a($$0.r());
      }

      public void a(fh.a<T>.a $$0, JsonObject $$1) {
         $$1.addProperty("registry", $$0.b.a().toString());
      }

      public fh.a<T>.a a(fh<T> $$0) {
         return new fh.a.a($$0.e);
      }

      public final class a implements ie.a<fh<T>> {
         final ald<? extends jr<T>> b;

         a(final ald<? extends jr<T>> $$1) {
            this.b = $$1;
         }

         public fh<T> a(ee $$0) {
            return new fh<>($$0, this.b);
         }

         @Override
         public ie<fh<T>, ?> a() {
            return a.this;
         }
      }
   }
}
