import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Predicate;

public interface bb<T, P extends Predicate<T>> extends Predicate<Iterable<T>> {
   List<bb.a<T, P>> a();

   static <T, P extends Predicate<T>> Codec<bb<T, P>> a(Codec<P> $$0) {
      return bb.a.a($$0).listOf().xmap(bb::a, bb::a);
   }

   @SafeVarargs
   static <T, P extends Predicate<T>> bb<T, P> a(bb.a<T, P>... $$0) {
      return a(List.of($$0));
   }

   static <T, P extends Predicate<T>> bb<T, P> a(List<bb.a<T, P>> $$0) {
      return (bb<T, P>)(switch ($$0.size()) {
         case 0 -> new bb.d();
         case 1 -> new bb.c($$0.getFirst());
         default -> new bb.b($$0);
      });
   }

   public static record a<T, P extends Predicate<T>>(P a, de.d b) {
      public static <T, P extends Predicate<T>> Codec<bb.a<T, P>> a(Codec<P> $$0) {
         return RecordCodecBuilder.create(
            $$1 -> $$1.group($$0.fieldOf("test").forGetter(bb.a::a), de.d.d.fieldOf("count").forGetter(bb.a::b)).apply($$1, bb.a::new)
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

   public static record b<T, P extends Predicate<T>>(List<bb.a<T, P>> a) implements bb<T, P> {
      public boolean a(Iterable<T> $$0) {
         for (bb.a<T, P> $$1 : this.a) {
            if (!$$1.a($$0)) {
               return false;
            }
         }

         return true;
      }

      public List<bb.a<T, P>> b() {
         return this.a;
      }
   }

   public static record c<T, P extends Predicate<T>>(bb.a<T, P> a) implements bb<T, P> {
      public boolean a(Iterable<T> $$0) {
         return this.a.a($$0);
      }

      @Override
      public List<bb.a<T, P>> a() {
         return List.of(this.a);
      }

      public bb.a<T, P> b() {
         return this.a;
      }
   }

   public static class d<T, P extends Predicate<T>> implements bb<T, P> {
      public boolean a(Iterable<T> $$0) {
         return true;
      }

      @Override
      public List<bb.a<T, P>> a() {
         return List.of();
      }
   }
}
