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

public class eu<T> implements ArgumentType<ajb<T>> {
   private static final Collection<String> a = Arrays.asList("foo", "foo:bar", "012");
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> vs.b("commands.place.feature.invalid", $$0));
   private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> vs.b("commands.place.structure.invalid", $$0));
   private static final DynamicCommandExceptionType d = new DynamicCommandExceptionType($$0 -> vs.b("commands.place.jigsaw.invalid", $$0));
   final ajb<? extends ix<T>> e;

   public eu(ajb<? extends ix<T>> $$0) {
      this.e = $$0;
   }

   public static <T> eu<T> a(ajb<? extends ix<T>> $$0) {
      return new eu<>($$0);
   }

   private static <T> ajb<T> a(CommandContext<du> $$0, String $$1, ajb<ix<T>> $$2, DynamicCommandExceptionType $$3) throws CommandSyntaxException {
      ajb<?> $$4 = (ajb<?>)$$0.getArgument($$1, ajb.class);
      Optional<ajb<T>> $$5 = $$4.d($$2);
      return $$5.orElseThrow(() -> $$3.create($$4));
   }

   private static <T> ix<T> a(CommandContext<du> $$0, ajb<? extends ix<T>> $$1) {
      return ((du)$$0.getSource()).l().bd().d($$1);
   }

   private static <T> il.c<T> b(CommandContext<du> $$0, String $$1, ajb<ix<T>> $$2, DynamicCommandExceptionType $$3) throws CommandSyntaxException {
      ajb<T> $$4 = a($$0, $$1, $$2, $$3);
      return a($$0, $$2).b($$4).orElseThrow(() -> $$3.create($$4.a()));
   }

   public static il.c<duh<?, ?>> a(CommandContext<du> $$0, String $$1) throws CommandSyntaxException {
      return b($$0, $$1, ki.ax, b);
   }

   public static il.c<ecg> b(CommandContext<du> $$0, String $$1) throws CommandSyntaxException {
      return b($$0, $$1, ki.aE, c);
   }

   public static il.c<edp> c(CommandContext<du> $$0, String $$1) throws CommandSyntaxException {
      return b($$0, $$1, ki.aH, d);
   }

   public ajb<T> a(StringReader $$0) throws CommandSyntaxException {
      ajc $$1 = ajc.a($$0);
      return ajb.a(this.e, $$1);
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return $$0.getSource() instanceof dz $$2 ? $$2.a(this.e, dz.a.b, $$1, $$0) : $$1.buildFuture();
   }

   public Collection<String> getExamples() {
      return a;
   }

   public static class a<T> implements hn<eu<T>, eu.a<T>.a> {
      public void a(eu.a<T>.a $$0, us $$1) {
         $$1.b($$0.b);
      }

      public eu.a<T>.a a(us $$0) {
         return new eu.a.a($$0.r());
      }

      public void a(eu.a<T>.a $$0, JsonObject $$1) {
         $$1.addProperty("registry", $$0.b.a().toString());
      }

      public eu.a<T>.a a(eu<T> $$0) {
         return new eu.a.a($$0.e);
      }

      public final class a implements hn.a<eu<T>> {
         final ajb<? extends ix<T>> b;

         a(ajb<? extends ix<T>> $$1) {
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
