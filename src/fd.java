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

public class fd<T> implements ArgumentType<ix.c<T>> {
   private static final Collection<String> c = Arrays.asList("foo", "foo:bar", "012");
   private static final DynamicCommandExceptionType d = new DynamicCommandExceptionType($$0 -> wx.b("entity.not_summonable", $$0));
   public static final Dynamic2CommandExceptionType a = new Dynamic2CommandExceptionType(($$0, $$1) -> wx.b("argument.resource.not_found", $$0, $$1));
   public static final Dynamic3CommandExceptionType b = new Dynamic3CommandExceptionType(
      ($$0, $$1, $$2) -> wx.b("argument.resource.invalid_type", $$0, $$1, $$2)
   );
   final akm<? extends jk<T>> e;
   private final iz<T> f;

   public fd(ea $$0, akm<? extends jk<T>> $$1) {
      this.e = $$1;
      this.f = $$0.b($$1);
   }

   public static <T> fd<T> a(ea $$0, akm<? extends jk<T>> $$1) {
      return new fd<>($$0, $$1);
   }

   public static <T> ix.c<T> a(CommandContext<ee> $$0, String $$1, akm<jk<T>> $$2) throws CommandSyntaxException {
      ix.c<T> $$3 = (ix.c<T>)$$0.getArgument($$1, ix.c.class);
      akm<?> $$4 = $$3.h();
      if ($$4.c($$2)) {
         return $$3;
      } else {
         throw b.create($$4.a(), $$4.b(), $$2.a());
      }
   }

   public static ix.c<btt> a(CommandContext<ee> $$0, String $$1) throws CommandSyntaxException {
      return a($$0, $$1, lf.c);
   }

   public static ix.c<dzm<?, ?>> b(CommandContext<ee> $$0, String $$1) throws CommandSyntaxException {
      return a($$0, $$1, lf.aC);
   }

   public static ix.c<ehl> c(CommandContext<ee> $$0, String $$1) throws CommandSyntaxException {
      return a($$0, $$1, lf.aJ);
   }

   public static ix.c<bsc<?>> d(CommandContext<ee> $$0, String $$1) throws CommandSyntaxException {
      return a($$0, $$1, lf.v);
   }

   public static ix.c<bsc<?>> e(CommandContext<ee> $$0, String $$1) throws CommandSyntaxException {
      ix.c<bsc<?>> $$2 = a($$0, $$1, lf.v);
      if (!$$2.a().c()) {
         throw d.create($$2.h().a().toString());
      } else {
         return $$2;
      }
   }

   public static ix.c<brc> f(CommandContext<ee> $$0, String $$1) throws CommandSyntaxException {
      return a($$0, $$1, lf.R);
   }

   public static ix.c<czb> g(CommandContext<ee> $$0, String $$1) throws CommandSyntaxException {
      return a($$0, $$1, lf.u);
   }

   public ix.c<T> a(StringReader $$0) throws CommandSyntaxException {
      akn $$1 = akn.a($$0);
      akm<T> $$2 = akm.a(this.e, $$1);
      return this.f.a($$2).orElseThrow(() -> a.createWithContext($$0, $$1, this.e.a()));
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return ej.a(this.f.c().map(akm::a), $$1);
   }

   public Collection<String> getExamples() {
      return c;
   }

   public static class a<T> implements hy<fd<T>, fd.a<T>.a> {
      public void a(fd.a<T>.a $$0, vx $$1) {
         $$1.b($$0.b);
      }

      public fd.a<T>.a a(vx $$0) {
         return new fd.a.a($$0.r());
      }

      public void a(fd.a<T>.a $$0, JsonObject $$1) {
         $$1.addProperty("registry", $$0.b.a().toString());
      }

      public fd.a<T>.a a(fd<T> $$0) {
         return new fd.a.a($$0.e);
      }

      public final class a implements hy.a<fd<T>> {
         final akm<? extends jk<T>> b;

         a(akm<? extends jk<T>> $$1) {
            this.b = $$1;
         }

         public fd<T> a(ea $$0) {
            return new fd<>($$0, this.b);
         }

         @Override
         public hy<fd<T>, ?> a() {
            return a.this;
         }
      }
   }
}
