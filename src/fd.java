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

public class fd<T> implements ArgumentType<akg<T>> {
   private static final Collection<String> a = Arrays.asList("foo", "foo:bar", "012");
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> wu.b("commands.place.feature.invalid", $$0));
   private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> wu.b("commands.place.structure.invalid", $$0));
   private static final DynamicCommandExceptionType d = new DynamicCommandExceptionType($$0 -> wu.b("commands.place.jigsaw.invalid", $$0));
   final akg<? extends jj<T>> e;

   public fd(akg<? extends jj<T>> $$0) {
      this.e = $$0;
   }

   public static <T> fd<T> a(akg<? extends jj<T>> $$0) {
      return new fd<>($$0);
   }

   private static <T> akg<T> a(CommandContext<ed> $$0, String $$1, akg<jj<T>> $$2, DynamicCommandExceptionType $$3) throws CommandSyntaxException {
      akg<?> $$4 = (akg<?>)$$0.getArgument($$1, akg.class);
      Optional<akg<T>> $$5 = $$4.d($$2);
      return $$5.orElseThrow(() -> $$3.create($$4));
   }

   private static <T> jj<T> a(CommandContext<ed> $$0, akg<? extends jj<T>> $$1) {
      return ((ed)$$0.getSource()).l().bc().d($$1);
   }

   private static <T> iw.c<T> b(CommandContext<ed> $$0, String $$1, akg<jj<T>> $$2, DynamicCommandExceptionType $$3) throws CommandSyntaxException {
      akg<T> $$4 = a($$0, $$1, $$2, $$3);
      return a($$0, $$2).b($$4).orElseThrow(() -> $$3.create($$4.a()));
   }

   public static iw.c<dyq<?, ?>> a(CommandContext<ed> $$0, String $$1) throws CommandSyntaxException {
      return b($$0, $$1, le.aC, b);
   }

   public static iw.c<egp> b(CommandContext<ed> $$0, String $$1) throws CommandSyntaxException {
      return b($$0, $$1, le.aJ, c);
   }

   public static iw.c<ehy> c(CommandContext<ed> $$0, String $$1) throws CommandSyntaxException {
      return b($$0, $$1, le.aM, d);
   }

   public akg<T> a(StringReader $$0) throws CommandSyntaxException {
      akh $$1 = akh.a($$0);
      return akg.a(this.e, $$1);
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return $$0.getSource() instanceof ei $$2 ? $$2.a(this.e, ei.a.b, $$1, $$0) : $$1.buildFuture();
   }

   public Collection<String> getExamples() {
      return a;
   }

   public static class a<T> implements hx<fd<T>, fd.a<T>.a> {
      public void a(fd.a<T>.a $$0, vu $$1) {
         $$1.b($$0.b);
      }

      public fd.a<T>.a a(vu $$0) {
         return new fd.a.a($$0.r());
      }

      public void a(fd.a<T>.a $$0, JsonObject $$1) {
         $$1.addProperty("registry", $$0.b.a().toString());
      }

      public fd.a<T>.a a(fd<T> $$0) {
         return new fd.a.a($$0.e);
      }

      public final class a implements hx.a<fd<T>> {
         final akg<? extends jj<T>> b;

         a(akg<? extends jj<T>> $$1) {
            this.b = $$1;
         }

         public fd<T> a(dz $$0) {
            return new fd<>(this.b);
         }

         @Override
         public hx<fd<T>, ?> a() {
            return a.this;
         }
      }
   }
}
