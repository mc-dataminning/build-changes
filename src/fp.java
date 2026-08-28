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

public class fp<T> implements ArgumentType<Collection<jg.c<T>>> {
   private static final Collection<String> b = List.of("minecraft:*", "*:asset", "*");
   public static final Dynamic2CommandExceptionType a = new Dynamic2CommandExceptionType(($$0, $$1) -> xg.b("argument.resource_selector.not_found", $$0, $$1));
   final alq<? extends jt<T>> c;
   private final ji<T> d;

   fp(eg $$0, alq<? extends jt<T>> $$1) {
      this.c = $$1;
      this.d = $$0.e($$1);
   }

   public Collection<jg.c<T>> a(StringReader $$0) throws CommandSyntaxException {
      String $$1 = a(b($$0));
      List<jg.c<T>> $$2 = this.d.c().filter($$1x -> a($$1, $$1x.h().a())).toList();
      if ($$2.isEmpty()) {
         throw a.createWithContext($$0, $$1, this.c.a());
      } else {
         return $$2;
      }
   }

   public static <T> Collection<jg.c<T>> a(StringReader $$0, ji<T> $$1) {
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
      return alr.a($$0) || $$0 == '*' || $$0 == '?';
   }

   private static String a(String $$0) {
      return !$$0.contains(":") ? "minecraft:" + $$0 : $$0;
   }

   private static boolean a(String $$0, alr $$1) {
      return FilenameUtils.wildcardMatch($$1.toString(), $$0);
   }

   public static <T> fp<T> a(eg $$0, alq<? extends jt<T>> $$1) {
      return new fp<>($$0, $$1);
   }

   public static <T> Collection<jg.c<T>> a(CommandContext<ek> $$0, String $$1, alq<? extends jt<T>> $$2) {
      return (Collection<jg.c<T>>)$$0.getArgument($$1, Collection.class);
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return $$0.getSource() instanceof ep $$2 ? $$2.a(this.c, ep.a.b, $$1, $$0) : ep.b(this.d.c_().map(alq::a).map(alr::toString), $$1);
   }

   public Collection<String> getExamples() {
      return b;
   }

   public static class a<T> implements ih<fp<T>, fp.a<T>.a> {
      public void a(fp.a<T>.a $$0, vy $$1) {
         $$1.b($$0.b);
      }

      public fp.a<T>.a a(vy $$0) {
         return new fp.a.a($$0.r());
      }

      public void a(fp.a<T>.a $$0, JsonObject $$1) {
         $$1.addProperty("registry", $$0.b.a().toString());
      }

      public fp.a<T>.a a(fp<T> $$0) {
         return new fp.a.a($$0.c);
      }

      public final class a implements ih.a<fp<T>> {
         final alq<? extends jt<T>> b;

         a(final alq<? extends jt<T>> $$1) {
            this.b = $$1;
         }

         public fp<T> a(eg $$0) {
            return new fp<>($$0, this.b);
         }

         @Override
         public ih<fp<T>, ?> a() {
            return a.this;
         }
      }
   }
}
