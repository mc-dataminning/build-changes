import java.util.Optional;

public interface boo<S, T> {
   Optional<T> a(bon<S> var1);

   static <S, T> boo<S, T> a(bor<S> $$0, boo.a<S, T> $$1) {
      return new boo.c<>($$1, $$0);
   }

   static <S, T> boo<S, T> a(bor<S> $$0, boo.b<T> $$1) {
      return new boo.c<>(($$1x, $$2) -> Optional.of($$1.run($$2)), $$0);
   }

   @FunctionalInterface
   public interface a<S, T> {
      Optional<T> run(bon<S> var1, bop var2);
   }

   @FunctionalInterface
   public interface b<T> {
      T run(bop var1);
   }

   public static record c<S, T>(boo.a<S, T> a, bor<S> b) implements boo<S, T> {
      @Override
      public Optional<T> a(bon<S> $$0) {
         bop $$1 = new bop();
         return this.b.a($$0, $$1, boj.a) ? this.a.run($$0, $$1) : Optional.empty();
      }
   }
}
