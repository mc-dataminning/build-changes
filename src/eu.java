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

public class eu<T> implements ArgumentType<ajg<T>> {
   private static final Collection<String> a = Arrays.asList("foo", "foo:bar", "012");
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> vu.b("commands.place.feature.invalid", $$0));
   private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> vu.b("commands.place.structure.invalid", $$0));
   private static final DynamicCommandExceptionType d = new DynamicCommandExceptionType($$0 -> vu.b("commands.place.jigsaw.invalid", $$0));
   final ajg<? extends iy<T>> e;

   public eu(ajg<? extends iy<T>> $$0) {
      this.e = $$0;
   }

   public static <T> eu<T> a(ajg<? extends iy<T>> $$0) {
      return new eu<>($$0);
   }

   private static <T> ajg<T> a(CommandContext<du> $$0, String $$1, ajg<iy<T>> $$2, DynamicCommandExceptionType $$3) throws CommandSyntaxException {
      ajg<?> $$4 = (ajg<?>)$$0.getArgument($$1, ajg.class);
      Optional<ajg<T>> $$5 = $$4.d($$2);
      return $$5.orElseThrow(() -> $$3.create($$4));
   }

   private static <T> iy<T> a(CommandContext<du> $$0, ajg<? extends iy<T>> $$1) {
      return ((du)$$0.getSource()).l().bd().d($$1);
   }

   private static <T> il.c<T> b(CommandContext<du> $$0, String $$1, ajg<iy<T>> $$2, DynamicCommandExceptionType $$3) throws CommandSyntaxException {
      ajg<T> $$4 = a($$0, $$1, $$2, $$3);
      return a($$0, $$2).b($$4).orElseThrow(() -> $$3.create($$4.a()));
   }

   public static il.c<dvd<?, ?>> a(CommandContext<du> $$0, String $$1) throws CommandSyntaxException {
      return b($$0, $$1, kj.ax, b);
   }

   public static il.c<edc> b(CommandContext<du> $$0, String $$1) throws CommandSyntaxException {
      return b($$0, $$1, kj.aE, c);
   }

   public static il.c<eel> c(CommandContext<du> $$0, String $$1) throws CommandSyntaxException {
      return b($$0, $$1, kj.aH, d);
   }

   public ajg<T> a(StringReader $$0) throws CommandSyntaxException {
      ajh $$1 = ajh.a($$0);
      return ajg.a(this.e, $$1);
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return $$0.getSource() instanceof dz $$2 ? $$2.a(this.e, dz.a.b, $$1, $$0) : $$1.buildFuture();
   }

   public Collection<String> getExamples() {
      return a;
   }

   public static class a<T> implements hn<eu<T>, eu.a<T>.a> {
      public void a(eu.a<T>.a $$0, uu $$1) {
         $$1.b($$0.b);
      }

      public eu.a<T>.a a(uu $$0) {
         return new eu.a.a($$0.r());
      }

      public void a(eu.a<T>.a $$0, JsonObject $$1) {
         $$1.addProperty("registry", $$0.b.a().toString());
      }

      public eu.a<T>.a a(eu<T> $$0) {
         return new eu.a.a($$0.e);
      }

      public final class a implements hn.a<eu<T>> {
         final ajg<? extends iy<T>> b;

         a(ajg<? extends iy<T>> $$1) {
            this.b = $$1;
         }

         public eu<T> a(dq $$0) {
            return new eu<>(this.b);
         }

         @Override
         public hn<eu<T>, ?> a() {
            return a.this;
         }
      }
   }
}
