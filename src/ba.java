import com.mojang.serialization.Codec;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public interface ba<T, P extends Predicate<T>> extends Predicate<Iterable<T>> {
   List<P> a();

   static <T, P extends Predicate<T>> Codec<ba<T, P>> a(Codec<P> $$0) {
      return $$0.listOf().xmap(ba::a, ba::a);
   }

   @SafeVarargs
   static <T, P extends Predicate<T>> ba<T, P> a(P... $$0) {
      return a(List.of($$0));
   }

   static <T, P extends Predicate<T>> ba<T, P> a(List<P> $$0) {
      return (ba<T, P>)(switch ($$0.size()) {
         case 0 -> new ba.c();
         case 1 -> new ba.b($$0.getFirst());
         default -> new ba.a($$0);
      });
   }

   public static record a<T, P extends Predicate<T>>(List<P> a) implements ba<T, P> {
      public boolean a(Iterable<T> $$0) {
         List<Predicate<T>> $$1 = new ArrayList<>(this.a);

         for (T $$2 : $$0) {
            $$1.removeIf($$1x -> $$1x.test($$2));
            if ($$1.isEmpty()) {
               return true;
            }
         }

         return false;
      }

      public List<P> b() {
         return this.a;
      }
   }

   public static record b<T, P extends Predicate<T>>(P a) implements ba<T, P> {
      public boolean a(Iterable<T> $$0) {
         for (T $$1 : $$0) {
            if (this.a.test($$1)) {
               return true;
            }
         }

         return false;
      }

      @Override
      public List<P> a() {
         return List.of(this.a);
      }

      public P b() {
         return this.a;
      }
   }

   public static class c<T, P extends Predicate<T>> implements ba<T, P> {
      public boolean a(Iterable<T> $$0) {
         return true;
      }

      @Override
      public List<P> a() {
         return List.of();
      }
   }
}
