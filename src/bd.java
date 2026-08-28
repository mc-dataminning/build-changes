import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Predicate;

public interface bd<T, P extends Predicate<T>> extends Predicate<Iterable<T>> {
   List<bd.a<T, P>> a();

   static <T, P extends Predicate<T>> Codec<bd<T, P>> a(Codec<P> $$0) {
      return bd.a.a($$0).listOf().xmap(bd::a, bd::a);
   }

   @SafeVarargs
   static <T, P extends Predicate<T>> bd<T, P> a(bd.a<T, P>... $$0) {
      return a(List.of($$0));
   }

   static <T, P extends Predicate<T>> bd<T, P> a(List<bd.a<T, P>> $$0) {
      return (bd<T, P>)(switch ($$0.size()) {
         case 0 -> new bd.d();
         case 1 -> new bd.c($$0.getFirst());
         default -> new bd.b($$0);
      });
   }

   public static record a<T, P extends Predicate<T>>(P a, dj.d b) {
      public static <T, P extends Predicate<T>> Codec<bd.a<T, P>> a(Codec<P> $$0) {
         return RecordCodecBuilder.create(
            $$1 -> $$1.group($$0.fieldOf("test").forGetter(bd.a::a), dj.d.d.fieldOf("count").forGetter(bd.a::b)).apply($$1, bd.a::new)
         );
      }

      public boolean a(Iterable<T> $$0) {
         int $$1 = 0;

         for (T $$2 : $$0) {
            if (this.a.test($$2)) {
               $$1++;
            }
         }

         return this.b.d($$1);
      }
   }

   public static record b<T, P extends Predicate<T>>(List<bd.a<T, P>> a) implements bd<T, P> {
      public boolean a(Iterable<T> $$0) {
         for (bd.a<T, P> $$1 : this.a) {
            if (!$$1.a($$0)) {
               return false;
            }
         }

         return true;
      }

      public List<bd.a<T, P>> b() {
         return this.a;
      }
   }

   public static record c<T, P extends Predicate<T>>(bd.a<T, P> a) implements bd<T, P> {
      public boolean a(Iterable<T> $$0) {
         return this.a.a($$0);
      }

      @Override
      public List<bd.a<T, P>> a() {
         return List.of(this.a);
      }

      public bd.a<T, P> b() {
         return this.a;
      }
   }

   public static class d<T, P extends Predicate<T>> implements bd<T, P> {
      public boolean a(Iterable<T> $$0) {
         return true;
      }

      @Override
      public List<bd.a<T, P>> a() {
         return List.of();
      }
   }
}
