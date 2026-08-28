import java.util.Optional;

public interface bnq<S, T> {
   Optional<T> a(bnp<S> var1);

   static <S, T> bnq<S, T> a(bnt<S> $$0, bnq.a<S, T> $$1) {
      return new bnq.c<>($$1, $$0);
   }

   static <S, T> bnq<S, T> a(bnt<S> $$0, bnq.b<T> $$1) {
      return new bnq.c<>(($$1x, $$2) -> Optional.of($$1.run($$2)), $$0);
   }

   @FunctionalInterface
   public interface a<S, T> {
      Optional<T> run(bnp<S> var1, bnr var2);
   }

   @FunctionalInterface
   public interface b<T> {
      T run(bnr var1);
   }

   public static record c<S, T>(bnq.a<S, T> a, bnt<S> b) implements bnq<S, T> {
      @Override
      public Optional<T> a(bnp<S> $$0) {
         bnr $$1 = new bnr();
         return this.b.a($$0, $$1, bnl.a) ? this.a.run($$0, $$1) : Optional.empty();
      }
   }
}
