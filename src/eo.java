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

public class eo<T> implements ArgumentType<he.c<T>> {
   private static final Collection<String> c = Arrays.asList("foo", "foo:bar", "012");
   private static final DynamicCommandExceptionType d = new DynamicCommandExceptionType($$0 -> sw.a("entity.not_summonable", $$0));
   public static final Dynamic2CommandExceptionType a = new Dynamic2CommandExceptionType(($$0, $$1) -> sw.a("argument.resource.not_found", $$0, $$1));
   public static final Dynamic3CommandExceptionType b = new Dynamic3CommandExceptionType(
      ($$0, $$1, $$2) -> sw.a("argument.resource.invalid_type", $$0, $$1, $$2)
   );
   final acp<? extends hr<T>> e;
   private final hg<T> f;

   public eo(dm $$0, acp<? extends hr<T>> $$1) {
      this.e = $$1;
      this.f = $$0.a($$1);
   }

   public static <T> eo<T> a(dm $$0, acp<? extends hr<T>> $$1) {
      return new eo<>($$0, $$1);
   }

   public static <T> he.c<T> a(CommandContext<ds> $$0, String $$1, acp<hr<T>> $$2) throws CommandSyntaxException {
      he.c<T> $$3 = (he.c<T>)$$0.getArgument($$1, he.c.class);
      acp<?> $$4 = $$3.g();
      if ($$4.b($$2)) {
         return $$3;
      } else {
         throw b.create($$4.a(), $$4.b(), $$2.a());
      }
   }

   public static he.c<bhb> a(CommandContext<ds> $$0, String $$1) throws CommandSyntaxException {
      return a($$0, $$1, jc.b);
   }

   public static he.c<dkb<?, ?>> b(CommandContext<ds> $$0, String $$1) throws CommandSyntaxException {
      return a($$0, $$1, jc.as);
   }

   public static he.c<dsa> c(CommandContext<ds> $$0, String $$1) throws CommandSyntaxException {
      return a($$0, $$1, jc.az);
   }

   public static he.c<bfn<?>> d(CommandContext<ds> $$0, String $$1) throws CommandSyntaxException {
      return a($$0, $$1, jc.s);
   }

   public static he.c<bfn<?>> e(CommandContext<ds> $$0, String $$1) throws CommandSyntaxException {
      he.c<bfn<?>> $$2 = a($$0, $$1, jc.s);
      if (!$$2.a().c()) {
         throw d.create($$2.g().a().toString());
      } else {
         return $$2;
      }
   }

   public static he.c<bey> f(CommandContext<ds> $$0, String $$1) throws CommandSyntaxException {
      return a($$0, $$1, jc.O);
   }

   public static he.c<ckg> g(CommandContext<ds> $$0, String $$1) throws CommandSyntaxException {
      return a($$0, $$1, jc.r);
   }

   public he.c<T> a(StringReader $$0) throws CommandSyntaxException {
      acq $$1 = acq.a($$0);
      acp<T> $$2 = acp.a(this.e, $$1);
      return this.f.a($$2).orElseThrow(() -> a.create($$1, this.e.a()));
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return du.a(this.f.c().map(acp::a), $$1);
   }

   public Collection<String> getExamples() {
      return c;
   }

   public static class a<T> implements gg<eo<T>, eo.a<T>.a> {
      public void a(eo.a<T>.a $$0, sf $$1) {
         $$1.a($$0.b.a());
      }

      public eo.a<T>.a a(sf $$0) {
         acq $$1 = $$0.t();
         return new eo.a.a(acp.a($$1));
      }

      public void a(eo.a<T>.a $$0, JsonObject $$1) {
         $$1.addProperty("registry", $$0.b.a().toString());
      }

      public eo.a<T>.a a(eo<T> $$0) {
         return new eo.a.a($$0.e);
      }

      public final class a implements gg.a<eo<T>> {
         final acp<? extends hr<T>> b;

         a(acp<? extends hr<T>> $$1) {
            this.b = $$1;
         }

         public eo<T> a(dm $$0) {
            return new eo<>($$0, this.b);
         }

         @Override
         public gg<eo<T>, ?> a() {
            return a.this;
         }
      }
   }
}
