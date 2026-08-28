import com.google.gson.JsonObject;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import org.apache.commons.io.FilenameUtils;

public class fn<T> implements ArgumentType<Collection<je.c<T>>> {
   private static final Collection<String> b = List.of("minecraft:*", "*:asset", "*");
   public static final Dynamic2CommandExceptionType a = new Dynamic2CommandExceptionType(($$0, $$1) -> wy.b("argument.resource_selector.not_found", $$0, $$1));
   final alf<? extends jr<T>> c;
   private final jg<T> d;

   fn(ee $$0, alf<? extends jr<T>> $$1) {
      this.c = $$1;
      this.d = $$0.e($$1);
   }

   public Collection<je.c<T>> a(StringReader $$0) throws CommandSyntaxException {
      String $$1 = a(b($$0));
      List<je.c<T>> $$2 = this.d.c().filter($$1x -> a($$1, $$1x.h().a())).toList();
      if ($$2.isEmpty()) {
         throw a.createWithContext($$0, $$1, this.c.a());
      } else {
         return $$2;
      }
   }

   public static <T> Collection<je.c<T>> a(StringReader $$0, jg<T> $$1) {
      String $$2 = a(b($$0));
      return $$1.c().filter($$1x -> a($$2, $$1x.h().a())).toList();
   }

   private static String b(StringReader $$0) {
      int $$1 = $$0.getCursor();

      while ($$0.canRead() && a($$0.peek())) {
         $$0.skip();
      }

      return $$0.getString().substring($$1, $$0.getCursor());
   }

   private static boolean a(char $$0) {
      return alg.a($$0) || $$0 == '*' || $$0 == '?';
   }

   private static String a(String $$0) {
      return !$$0.contains(":") ? "minecraft:" + $$0 : $$0;
   }

   private static boolean a(String $$0, alg $$1) {
      return FilenameUtils.wildcardMatch($$1.toString(), $$0);
   }

   public static <T> fn<T> a(ee $$0, alf<? extends jr<T>> $$1) {
      return new fn<>($$0, $$1);
   }

   public static <T> Collection<je.c<T>> a(CommandContext<ei> $$0, String $$1, alf<? extends jr<T>> $$2) {
      return (Collection<je.c<T>>)$$0.getArgument($$1, Collection.class);
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return en.b(this.d.c_().map(alf::a).map(alg::toString), $$1);
   }

   public Collection<String> getExamples() {
      return b;
   }

   public static class a<T> implements ie<fn<T>, fn.a<T>.a> {
      public void a(fn.a<T>.a $$0, vu $$1) {
         $$1.b($$0.b);
      }

      public fn.a<T>.a a(vu $$0) {
         return new fn.a.a($$0.r());
      }

      public void a(fn.a<T>.a $$0, JsonObject $$1) {
         $$1.addProperty("registry", $$0.b.a().toString());
      }

      public fn.a<T>.a a(fn<T> $$0) {
         return new fn.a.a($$0.c);
      }

      public final class a implements ie.a<fn<T>> {
         final alf<? extends jr<T>> b;

         a(final alf<? extends jr<T>> $$1) {
            this.b = $$1;
         }

         public fn<T> a(ee $$0) {
            return new fn<>($$0, this.b);
         }

         @Override
         public ie<fn<T>, ?> a() {
            return a.this;
         }
      }
   }
}
