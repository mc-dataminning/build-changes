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

public class et<T> implements ArgumentType<agl<T>> {
   private static final Collection<String> a = Arrays.asList("foo", "foo:bar", "012");
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> uv.b("commands.place.feature.invalid", $$0));
   private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> uv.b("commands.place.structure.invalid", $$0));
   private static final DynamicCommandExceptionType d = new DynamicCommandExceptionType($$0 -> uv.b("commands.place.jigsaw.invalid", $$0));
   final agl<? extends is<T>> e;

   public et(agl<? extends is<T>> $$0) {
      this.e = $$0;
   }

   public static <T> et<T> a(agl<? extends is<T>> $$0) {
      return new et<>($$0);
   }

   private static <T> agl<T> a(CommandContext<du> $$0, String $$1, agl<is<T>> $$2, DynamicCommandExceptionType $$3) throws CommandSyntaxException {
      agl<?> $$4 = (agl<?>)$$0.getArgument($$1, agl.class);
      Optional<agl<T>> $$5 = $$4.c($$2);
      return $$5.orElseThrow(() -> $$3.create($$4));
   }

   private static <T> is<T> a(CommandContext<du> $$0, agl<? extends is<T>> $$1) {
      return ((du)$$0.getSource()).l().aZ().d($$1);
   }

   private static <T> ig.c<T> b(CommandContext<du> $$0, String $$1, agl<is<T>> $$2, DynamicCommandExceptionType $$3) throws CommandSyntaxException {
      agl<T> $$4 = a($$0, $$1, $$2, $$3);
      return a($$0, $$2).b($$4).orElseThrow(() -> $$3.create($$4.a()));
   }

   public static ig.c<dpn<?, ?>> a(CommandContext<du> $$0, String $$1) throws CommandSyntaxException {
      return b($$0, $$1, kd.au, b);
   }

   public static ig.c<dxm> b(CommandContext<du> $$0, String $$1) throws CommandSyntaxException {
      return b($$0, $$1, kd.aB, c);
   }

   public static ig.c<dyv> c(CommandContext<du> $$0, String $$1) throws CommandSyntaxException {
      return b($$0, $$1, kd.aE, d);
   }

   public agl<T> a(StringReader $$0) throws CommandSyntaxException {
      agm $$1 = agm.a($$0);
      return agl.a(this.e, $$1);
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return $$0.getSource() instanceof dy $$2 ? $$2.a(this.e, dy.a.b, $$1, $$0) : $$1.buildFuture();
   }

   public Collection<String> getExamples() {
      return a;
   }

   public static class a<T> implements hj<et<T>, et.a<T>.a> {
      public void a(et.a<T>.a $$0, ty $$1) {
         $$1.b($$0.b);
      }

      public et.a<T>.a a(ty $$0) {
         return new et.a.a($$0.u());
      }

      public void a(et.a<T>.a $$0, JsonObject $$1) {
         $$1.addProperty("registry", $$0.b.a().toString());
      }

      public et.a<T>.a a(et<T> $$0) {
         return new et.a.a($$0.e);
      }

      public final class a implements hj.a<et<T>> {
         final agl<? extends is<T>> b;

         a(agl<? extends is<T>> $$1) {
            this.b = $$1;
         }

         public et<T> a(dp $$0) {
            return new et<>(this.b);
         }

         @Override
         public hj<et<T>, ?> a() {
            return a.this;
         }
      }
   }
}
