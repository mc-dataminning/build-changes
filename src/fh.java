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

public class fh<T> implements ArgumentType<aks<T>> {
   private static final Collection<String> a = Arrays.asList("foo", "foo:bar", "012");
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> xe.b("commands.place.feature.invalid", $$0));
   private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> xe.b("commands.place.structure.invalid", $$0));
   private static final DynamicCommandExceptionType d = new DynamicCommandExceptionType($$0 -> xe.b("commands.place.jigsaw.invalid", $$0));
   final aks<? extends jn<T>> e;

   public fh(aks<? extends jn<T>> $$0) {
      this.e = $$0;
   }

   public static <T> fh<T> a(aks<? extends jn<T>> $$0) {
      return new fh<>($$0);
   }

   private static <T> aks<T> a(CommandContext<eh> $$0, String $$1, aks<jn<T>> $$2, DynamicCommandExceptionType $$3) throws CommandSyntaxException {
      aks<?> $$4 = (aks<?>)$$0.getArgument($$1, aks.class);
      Optional<aks<T>> $$5 = $$4.d($$2);
      return $$5.orElseThrow(() -> $$3.create($$4));
   }

   private static <T> jn<T> a(CommandContext<eh> $$0, aks<? extends jn<T>> $$1) {
      return ((eh)$$0.getSource()).l().bc().d($$1);
   }

   private static <T> ja.c<T> b(CommandContext<eh> $$0, String $$1, aks<jn<T>> $$2, DynamicCommandExceptionType $$3) throws CommandSyntaxException {
      aks<T> $$4 = a($$0, $$1, $$2, $$3);
      return a($$0, $$2).b($$4).orElseThrow(() -> $$3.create($$4.a()));
   }

   public static ja.c<ebm<?, ?>> a(CommandContext<eh> $$0, String $$1) throws CommandSyntaxException {
      return b($$0, $$1, li.aC, b);
   }

   public static ja.c<ejt> b(CommandContext<eh> $$0, String $$1) throws CommandSyntaxException {
      return b($$0, $$1, li.aJ, c);
   }

   public static ja.c<elc> c(CommandContext<eh> $$0, String $$1) throws CommandSyntaxException {
      return b($$0, $$1, li.aM, d);
   }

   public aks<T> a(StringReader $$0) throws CommandSyntaxException {
      akt $$1 = akt.a($$0);
      return aks.a(this.e, $$1);
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return $$0.getSource() instanceof em $$2 ? $$2.a(this.e, em.a.b, $$1, $$0) : $$1.buildFuture();
   }

   public Collection<String> getExamples() {
      return a;
   }

   public static class a<T> implements ib<fh<T>, fh.a<T>.a> {
      public void a(fh.a<T>.a $$0, we $$1) {
         $$1.b($$0.b);
      }

      public fh.a<T>.a a(we $$0) {
         return new fh.a.a($$0.r());
      }

      public void a(fh.a<T>.a $$0, JsonObject $$1) {
         $$1.addProperty("registry", $$0.b.a().toString());
      }

      public fh.a<T>.a a(fh<T> $$0) {
         return new fh.a.a($$0.e);
      }

      public final class a implements ib.a<fh<T>> {
         final aks<? extends jn<T>> b;

         a(aks<? extends jn<T>> $$1) {
            this.b = $$1;
         }

         public fh<T> a(ed $$0) {
            return new fh<>(this.b);
         }

         @Override
         public ib<fh<T>, ?> a() {
            return a.this;
         }
      }
   }
}
