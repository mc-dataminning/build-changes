import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Predicate;

public interface be<T, P extends Predicate<T>> extends Predicate<Iterable<T>> {
   List<be.a<T, P>> a();

   static <T, P extends Predicate<T>> Codec<be<T, P>> a(Codec<P> $$0) {
      return be.a.a($$0).listOf().xmap(be::a, be::a);
   }

   @SafeVarargs
   static <T, P extends Predicate<T>> be<T, P> a(be.a<T, P>... $$0) {
      return a(List.of($$0));
   }

   static <T, P extends Predicate<T>> be<T, P> a(List<be.a<T, P>> $$0) {
      return (be<T, P>)(switch ($$0.size()) {
         case 0 -> new be.d();
         case 1 -> new be.c($$0.getFirst());
         default -> new be.b($$0);
      });
   }

   public static record a<T, P extends Predicate<T>>(P a, cv.d b) {
      public static <T, P extends Predicate<T>> Codec<be.a<T, P>> a(Codec<P> $$0) {
         return RecordCodecBuilder.create(
            $$1 -> $$1.group($$0.fieldOf("test").forGetter(be.a::a), cv.d.d.fieldOf("count").forGetter(be.a::b)).apply($$1, be.a::new)
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

   public static record b<T, P extends Predicate<T>>(List<be.a<T, P>> a) implements be<T, P> {
      public boolean a(Iterable<T> $$0) {
         for (be.a<T, P> $$1 : this.a) {
            if (!$$1.a($$0)) {
               return false;
            }
         }

         return true;
      }

      public List<be.a<T, P>> b() {
         return this.a;
      }
   }

   public static record c<T, P extends Predicate<T>>(be.a<T, P> a) implements be<T, P> {
      public boolean a(Iterable<T> $$0) {
         return this.a.a($$0);
      }

      @Override
      public List<be.a<T, P>> a() {
         return List.of(this.a);
      }

      public be.a<T, P> b() {
         return this.a;
      }
   }

   public static class d<T, P extends Predicate<T>> implements be<T, P> {
      public boolean a(Iterable<T> $$0) {
         return true;
      }

      @Override
      public List<be.a<T, P>> a() {
         return List.of();
      }
   }
}
