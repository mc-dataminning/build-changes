import java.util.Optional;

public interface bns<S, T> {
   Optional<T> a(bnr<S> var1);

   static <S, T> bns<S, T> a(bnv<S> $$0, bns.a<S, T> $$1) {
      return new bns.c<>($$1, $$0);
   }

   static <S, T> bns<S, T> a(bnv<S> $$0, bns.b<T> $$1) {
      return new bns.c<>(($$1x, $$2) -> Optional.of($$1.run($$2)), $$0);
   }

   @FunctionalInterface
   public interface a<S, T> {
      Optional<T> run(bnr<S> var1, bnt var2);
   }

   @FunctionalInterface
   public interface b<T> {
      T run(bnt var1);
   }

   public static record c<S, T>(bns.a<S, T> a, bnv<S> b) implements bns<S, T> {
      @Override
      public Optional<T> a(bnr<S> $$0) {
         bnt $$1 = new bnt();
         return this.b.a($$0, $$1, bnn.a) ? this.a.run($$0, $$1) : Optional.empty();
      }
   }
}
