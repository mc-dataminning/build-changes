import java.util.Optional;

public interface bml<S, T> {
   Optional<T> a(bmk<S> var1);

   static <S, T> bml<S, T> a(bmo<S> $$0, bml.a<S, T> $$1) {
      return new bml.c<>($$1, $$0);
   }

   static <S, T> bml<S, T> a(bmo<S> $$0, bml.b<T> $$1) {
      return new bml.c<>(($$1x, $$2) -> Optional.of($$1.run($$2)), $$0);
   }

   @FunctionalInterface
   public interface a<S, T> {
      Optional<T> run(bmk<S> var1, bmm var2);
   }

   @FunctionalInterface
   public interface b<T> {
      T run(bmm var1);
   }

   public static record c<S, T>(bml.a<S, T> a, bmo<S> b) implements bml<S, T> {
      @Override
      public Optional<T> a(bmk<S> $$0) {
         bmm $$1 = new bmm();
         return this.b.a($$0, $$1, bmg.a) ? this.a.run($$0, $$1) : Optional.empty();
      }
   }
}
