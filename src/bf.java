import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Predicate;

public interface bf<T, P extends Predicate<T>> extends Predicate<Iterable<T>> {
   List<bf.a<T, P>> a();

   static <T, P extends Predicate<T>> Codec<bf<T, P>> a(Codec<P> $$0) {
      return bf.a.a($$0).listOf().xmap(bf::a, bf::a);
   }

   @SafeVarargs
   static <T, P extends Predicate<T>> bf<T, P> a(bf.a<T, P>... $$0) {
      return a(List.of($$0));
   }

   static <T, P extends Predicate<T>> bf<T, P> a(List<bf.a<T, P>> $$0) {
      return (bf<T, P>)(switch ($$0.size()) {
         case 0 -> new bf.d();
         case 1 -> new bf.c($$0.getFirst());
         default -> new bf.b($$0);
      });
   }

   public static record a<T, P extends Predicate<T>>(P a, cw.d b) {
      public static <T, P extends Predicate<T>> Codec<bf.a<T, P>> a(Codec<P> $$0) {
         return RecordCodecBuilder.create(
            $$1 -> $$1.group($$0.fieldOf("test").forGetter(bf.a::a), cw.d.d.fieldOf("count").forGetter(bf.a::b)).apply($$1, bf.a::new)
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

   public static record b<T, P extends Predicate<T>>(List<bf.a<T, P>> a) implements bf<T, P> {
      public boolean a(Iterable<T> $$0) {
         for (bf.a<T, P> $$1 : this.a) {
            if (!$$1.a($$0)) {
               return false;
            }
         }

         return true;
      }

      public List<bf.a<T, P>> b() {
         return this.a;
      }
   }

   public static record c<T, P extends Predicate<T>>(bf.a<T, P> a) implements bf<T, P> {
      public boolean a(Iterable<T> $$0) {
         return this.a.a($$0);
      }

      @Override
      public List<bf.a<T, P>> a() {
         return List.of(this.a);
      }

      public bf.a<T, P> b() {
         return this.a;
      }
   }

   public static class d<T, P extends Predicate<T>> implements bf<T, P> {
      public boolean a(Iterable<T> $$0) {
         return true;
      }

      @Override
      public List<bf.a<T, P>> a() {
         return List.of();
      }
   }
}
