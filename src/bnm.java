import java.util.Optional;

public interface bnm<S, T> {
   Optional<T> a(bnl<S> var1);

   static <S, T> bnm<S, T> a(bnp<S> $$0, bnm.a<S, T> $$1) {
      return new bnm.c<>($$1, $$0);
   }

   static <S, T> bnm<S, T> a(bnp<S> $$0, bnm.b<T> $$1) {
      return new bnm.c<>(($$1x, $$2) -> Optional.of($$1.run($$2)), $$0);
   }

   @FunctionalInterface
   public interface a<S, T> {
      Optional<T> run(bnl<S> var1, bnn var2);
   }

   @FunctionalInterface
   public interface b<T> {
      T run(bnn var1);
   }

   public static record c<S, T>(bnm.a<S, T> a, bnp<S> b) implements bnm<S, T> {
      @Override
      public Optional<T> a(bnl<S> $$0) {
         bnn $$1 = new bnn();
         return this.b.a($$0, $$1, bnh.a) ? this.a.run($$0, $$1) : Optional.empty();
      }
   }
}
