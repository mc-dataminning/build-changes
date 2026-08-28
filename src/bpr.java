import java.util.Optional;

public interface bpr<S, T> {
   Optional<T> a(bpq<S> var1);

   static <S, T> bpr<S, T> a(bpu<S> $$0, bpr.a<S, T> $$1) {
      return new bpr.c<>($$1, $$0);
   }

   static <S, T> bpr<S, T> a(bpu<S> $$0, bpr.b<T> $$1) {
      return new bpr.c<>(($$1x, $$2) -> Optional.of($$1.run($$2)), $$0);
   }

   @FunctionalInterface
   public interface a<S, T> {
      Optional<T> run(bpq<S> var1, bps var2);
   }

   @FunctionalInterface
   public interface b<T> {
      T run(bps var1);
   }

   public static record c<S, T>(bpr.a<S, T> a, bpu<S> b) implements bpr<S, T> {
      @Override
      public Optional<T> a(bpq<S> $$0) {
         bps $$1 = new bps();
         return this.b.a($$0, $$1, bpm.a) ? this.a.run($$0, $$1) : Optional.empty();
      }
   }
}
