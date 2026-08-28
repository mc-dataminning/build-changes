import com.google.gson.JsonObject;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.Arrays;
import java.util.Collection;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;

public class fq<T> implements ArgumentType<akj<T>> {
   private static final Collection<String> a = Arrays.asList("foo", "foo:bar", "012");
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> wu.b("commands.place.feature.invalid", $$0));
   private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> wu.b("commands.place.structure.invalid", $$0));
   private static final DynamicCommandExceptionType d = new DynamicCommandExceptionType($$0 -> wu.b("commands.place.jigsaw.invalid", $$0));
   final akj<? extends jw<T>> e;

   public fq(akj<? extends jw<T>> $$0) {
      this.e = $$0;
   }

   public static <T> fq<T> a(akj<? extends jw<T>> $$0) {
      return new fq<>($$0);
   }

   private static <T> akj<T> a(CommandContext<eq> $$0, String $$1, akj<jw<T>> $$2, DynamicCommandExceptionType $$3) throws CommandSyntaxException {
      akj<?> $$4 = (akj<?>)$$0.getArgument($$1, akj.class);
      Optional<akj<T>> $$5 = $$4.d($$2);
      return $$5.orElseThrow(() -> $$3.create($$4));
   }

   private static <T> jw<T> a(CommandContext<eq> $$0, akj<? extends jw<T>> $$1) {
      return ((eq)$$0.getSource()).l().bd().d($$1);
   }

   private static <T> jj.c<T> b(CommandContext<eq> $$0, String $$1, akj<jw<T>> $$2, DynamicCommandExceptionType $$3) throws CommandSyntaxException {
      akj<T> $$4 = a($$0, $$1, $$2, $$3);
      return a($$0, $$2).b($$4).orElseThrow(() -> $$3.create($$4.a()));
   }

   public static jj.c<eax<?, ?>> a(CommandContext<eq> $$0, String $$1) throws CommandSyntaxException {
      return b($$0, $$1, lr.aH, b);
   }

   public static jj.c<eiw> b(CommandContext<eq> $$0, String $$1) throws CommandSyntaxException {
      return b($$0, $$1, lr.aQ, c);
   }

   public static jj.c<ekf> c(CommandContext<eq> $$0, String $$1) throws CommandSyntaxException {
      return b($$0, $$1, lr.aT, d);
   }

   public akj<T> a(StringReader $$0) throws CommandSyntaxException {
      akk $$1 = akk.a($$0);
      return akj.a(this.e, $$1);
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return $$0.getSource() instanceof ev $$2 ? $$2.a(this.e, ev.a.b, $$1, $$0) : $$1.buildFuture();
   }

   public Collection<String> getExamples() {
      return a;
   }

   public static class a<T> implements il<fq<T>, fq.a<T>.a> {
      public void a(fq.a<T>.a $$0, vr $$1) {
         $$1.b($$0.b);
      }

      public fq.a<T>.a a(vr $$0) {
         return new fq.a.a($$0.r());
      }

      public void a(fq.a<T>.a $$0, JsonObject $$1) {
         $$1.addProperty("registry", $$0.b.a().toString());
      }

      public fq.a<T>.a a(fq<T> $$0) {
         return new fq.a.a($$0.e);
      }

      public final class a implements il.a<fq<T>> {
         final akj<? extends jw<T>> b;

         a(final akj<? extends jw<T>> $$1) {
            this.b = $$1;
         }

         public fq<T> a(em $$0) {
            return new fq<>(this.b);
         }

         @Override
         public il<fq<T>, ?> a() {
            return a.this;
         }
      }
   }
}
