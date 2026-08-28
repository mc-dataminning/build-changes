import java.util.Optional;

public interface bma<S, T> {
   Optional<T> a(blz<S> var1);

   static <S, T> bma<S, T> a(bmd<S> $$0, bma.a<S, T> $$1) {
      return new bma.c<>($$1, $$0);
   }

   static <S, T> bma<S, T> a(bmd<S> $$0, bma.b<T> $$1) {
      return new bma.c<>(($$1x, $$2) -> Optional.of($$1.run($$2)), $$0);
   }

   @FunctionalInterface
   public interface a<S, T> {
      Optional<T> run(blz<S> var1, bmb var2);
   }

   @FunctionalInterface
   public interface b<T> {
      T run(bmb var1);
   }

   public static record c<S, T>(bma.a<S, T> a, bmd<S> b) implements bma<S, T> {
      @Override
      public Optional<T> a(blz<S> $$0) {
         bmb $$1 = new bmb();
         return this.b.a($$0, $$1, blv.a) ? this.a.run($$0, $$1) : Optional.empty();
      }
   }
}
