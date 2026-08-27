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

public class fe<T> implements ArgumentType<akm<T>> {
   private static final Collection<String> a = Arrays.asList("foo", "foo:bar", "012");
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> wx.b("commands.place.feature.invalid", $$0));
   private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> wx.b("commands.place.structure.invalid", $$0));
   private static final DynamicCommandExceptionType d = new DynamicCommandExceptionType($$0 -> wx.b("commands.place.jigsaw.invalid", $$0));
   final akm<? extends jk<T>> e;

   public fe(akm<? extends jk<T>> $$0) {
      this.e = $$0;
   }

   public static <T> fe<T> a(akm<? extends jk<T>> $$0) {
      return new fe<>($$0);
   }

   private static <T> akm<T> a(CommandContext<ee> $$0, String $$1, akm<jk<T>> $$2, DynamicCommandExceptionType $$3) throws CommandSyntaxException {
      akm<?> $$4 = (akm<?>)$$0.getArgument($$1, akm.class);
      Optional<akm<T>> $$5 = $$4.d($$2);
      return $$5.orElseThrow(() -> $$3.create($$4));
   }

   private static <T> jk<T> a(CommandContext<ee> $$0, akm<? extends jk<T>> $$1) {
      return ((ee)$$0.getSource()).l().bc().d($$1);
   }

   private static <T> ix.c<T> b(CommandContext<ee> $$0, String $$1, akm<jk<T>> $$2, DynamicCommandExceptionType $$3) throws CommandSyntaxException {
      akm<T> $$4 = a($$0, $$1, $$2, $$3);
      return a($$0, $$2).b($$4).orElseThrow(() -> $$3.create($$4.a()));
   }

   public static ix.c<dzm<?, ?>> a(CommandContext<ee> $$0, String $$1) throws CommandSyntaxException {
      return b($$0, $$1, lf.aC, b);
   }

   public static ix.c<ehl> b(CommandContext<ee> $$0, String $$1) throws CommandSyntaxException {
      return b($$0, $$1, lf.aJ, c);
   }

   public static ix.c<eiu> c(CommandContext<ee> $$0, String $$1) throws CommandSyntaxException {
      return b($$0, $$1, lf.aM, d);
   }

   public akm<T> a(StringReader $$0) throws CommandSyntaxException {
      akn $$1 = akn.a($$0);
      return akm.a(this.e, $$1);
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return $$0.getSource() instanceof ej $$2 ? $$2.a(this.e, ej.a.b, $$1, $$0) : $$1.buildFuture();
   }

   public Collection<String> getExamples() {
      return a;
   }

   public static class a<T> implements hy<fe<T>, fe.a<T>.a> {
      public void a(fe.a<T>.a $$0, vx $$1) {
         $$1.b($$0.b);
      }

      public fe.a<T>.a a(vx $$0) {
         return new fe.a.a($$0.r());
      }

      public void a(fe.a<T>.a $$0, JsonObject $$1) {
         $$1.addProperty("registry", $$0.b.a().toString());
      }

      public fe.a<T>.a a(fe<T> $$0) {
         return new fe.a.a($$0.e);
      }

      public final class a implements hy.a<fe<T>> {
         final akm<? extends jk<T>> b;

         a(akm<? extends jk<T>> $$1) {
            this.b = $$1;
         }

         public fe<T> a(ea $$0) {
            return new fe<>(this.b);
         }

         @Override
         public hy<fe<T>, ?> a() {
            return a.this;
         }
      }
   }
}
