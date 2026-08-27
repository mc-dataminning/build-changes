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

public class ev<T> implements ArgumentType<aju<T>> {
   private static final Collection<String> a = Arrays.asList("foo", "foo:bar", "012");
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> wi.b("commands.place.feature.invalid", $$0));
   private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> wi.b("commands.place.structure.invalid", $$0));
   private static final DynamicCommandExceptionType d = new DynamicCommandExceptionType($$0 -> wi.b("commands.place.jigsaw.invalid", $$0));
   final aju<? extends ja<T>> e;

   public ev(aju<? extends ja<T>> $$0) {
      this.e = $$0;
   }

   public static <T> ev<T> a(aju<? extends ja<T>> $$0) {
      return new ev<>($$0);
   }

   private static <T> aju<T> a(CommandContext<dv> $$0, String $$1, aju<ja<T>> $$2, DynamicCommandExceptionType $$3) throws CommandSyntaxException {
      aju<?> $$4 = (aju<?>)$$0.getArgument($$1, aju.class);
      Optional<aju<T>> $$5 = $$4.d($$2);
      return $$5.orElseThrow(() -> $$3.create($$4));
   }

   private static <T> ja<T> a(CommandContext<dv> $$0, aju<? extends ja<T>> $$1) {
      return ((dv)$$0.getSource()).l().bd().d($$1);
   }

   private static <T> in.c<T> b(CommandContext<dv> $$0, String $$1, aju<ja<T>> $$2, DynamicCommandExceptionType $$3) throws CommandSyntaxException {
      aju<T> $$4 = a($$0, $$1, $$2, $$3);
      return a($$0, $$2).b($$4).orElseThrow(() -> $$3.create($$4.a()));
   }

   public static in.c<dxr<?, ?>> a(CommandContext<dv> $$0, String $$1) throws CommandSyntaxException {
      return b($$0, $$1, ku.az, b);
   }

   public static in.c<efq> b(CommandContext<dv> $$0, String $$1) throws CommandSyntaxException {
      return b($$0, $$1, ku.aG, c);
   }

   public static in.c<egz> c(CommandContext<dv> $$0, String $$1) throws CommandSyntaxException {
      return b($$0, $$1, ku.aJ, d);
   }

   public aju<T> a(StringReader $$0) throws CommandSyntaxException {
      ajv $$1 = ajv.a($$0);
      return aju.a(this.e, $$1);
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return $$0.getSource() instanceof ea $$2 ? $$2.a(this.e, ea.a.b, $$1, $$0) : $$1.buildFuture();
   }

   public Collection<String> getExamples() {
      return a;
   }

   public static class a<T> implements hp<ev<T>, ev.a<T>.a> {
      public void a(ev.a<T>.a $$0, vi $$1) {
         $$1.b($$0.b);
      }

      public ev.a<T>.a a(vi $$0) {
         return new ev.a.a($$0.r());
      }

      public void a(ev.a<T>.a $$0, JsonObject $$1) {
         $$1.addProperty("registry", $$0.b.a().toString());
      }

      public ev.a<T>.a a(ev<T> $$0) {
         return new ev.a.a($$0.e);
      }

      public final class a implements hp.a<ev<T>> {
         final aju<? extends ja<T>> b;

         a(aju<? extends ja<T>> $$1) {
            this.b = $$1;
         }

         public ev<T> a(dr $$0) {
            return new ev<>(this.b);
         }

         @Override
         public hp<ev<T>, ?> a() {
            return a.this;
         }
      }
   }
}
