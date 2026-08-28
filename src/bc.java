import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Predicate;

public interface bc<T, P extends Predicate<T>> extends Predicate<Iterable<T>> {
   List<bc.a<T, P>> a();

   static <T, P extends Predicate<T>> Codec<bc<T, P>> a(Codec<P> $$0) {
      return bc.a.a($$0).listOf().xmap(bc::a, bc::a);
   }

   @SafeVarargs
   static <T, P extends Predicate<T>> bc<T, P> a(bc.a<T, P>... $$0) {
      return a(List.of($$0));
   }

   static <T, P extends Predicate<T>> bc<T, P> a(List<bc.a<T, P>> $$0) {
      return (bc<T, P>)(switch ($$0.size()) {
         case 0 -> new bc.d();
         case 1 -> new bc.c($$0.getFirst());
         default -> new bc.b($$0);
      });
   }

   public static record a<T, P extends Predicate<T>>(P a, dh.d b) {
      public static <T, P extends Predicate<T>> Codec<bc.a<T, P>> a(Codec<P> $$0) {
         return RecordCodecBuilder.create(
            $$1 -> $$1.group($$0.fieldOf("test").forGetter(bc.a::a), dh.d.d.fieldOf("count").forGetter(bc.a::b)).apply($$1, bc.a::new)
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

   public static record b<T, P extends Predicate<T>>(List<bc.a<T, P>> a) implements bc<T, P> {
      public boolean a(Iterable<T> $$0) {
         for (bc.a<T, P> $$1 : this.a) {
            if (!$$1.a($$0)) {
               return false;
            }
         }

         return true;
      }

      public List<bc.a<T, P>> b() {
         return this.a;
      }
   }

   public static record c<T, P extends Predicate<T>>(bc.a<T, P> a) implements bc<T, P> {
      public boolean a(Iterable<T> $$0) {
         return this.a.a($$0);
      }

      @Override
      public List<bc.a<T, P>> a() {
         return List.of(this.a);
      }

      public bc.a<T, P> b() {
         return this.a;
      }
   }

   public static class d<T, P extends Predicate<T>> implements bc<T, P> {
      public boolean a(Iterable<T> $$0) {
         return true;
      }

      @Override
      public List<bc.a<T, P>> a() {
         return List.of();
      }
   }
}
