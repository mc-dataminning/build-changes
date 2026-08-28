import java.util.Optional;

public interface bnz<S, T> {
   Optional<T> a(bny<S> var1);

   static <S, T> bnz<S, T> a(boc<S> $$0, bnz.a<S, T> $$1) {
      return new bnz.c<>($$1, $$0);
   }

   static <S, T> bnz<S, T> a(boc<S> $$0, bnz.b<T> $$1) {
      return new bnz.c<>(($$1x, $$2) -> Optional.of($$1.run($$2)), $$0);
   }

   @FunctionalInterface
   public interface a<S, T> {
      Optional<T> run(bny<S> var1, boa var2);
   }

   @FunctionalInterface
   public interface b<T> {
      T run(boa var1);
   }

   public static record c<S, T>(bnz.a<S, T> a, boc<S> b) implements bnz<S, T> {
      @Override
      public Optional<T> a(bny<S> $$0) {
         boa $$1 = new boa();
         return this.b.a($$0, $$1, bnu.a) ? this.a.run($$0, $$1) : Optional.empty();
      }
   }
}
