import java.util.Optional;

public interface bmb<S, T> {
   Optional<T> a(bma<S> var1);

   static <S, T> bmb<S, T> a(bme<S> $$0, bmb.a<S, T> $$1) {
      return new bmb.c<>($$1, $$0);
   }

   static <S, T> bmb<S, T> a(bme<S> $$0, bmb.b<T> $$1) {
      return new bmb.c<>(($$1x, $$2) -> Optional.of($$1.run($$2)), $$0);
   }

   @FunctionalInterface
   public interface a<S, T> {
      Optional<T> run(bma<S> var1, bmc var2);
   }

   @FunctionalInterface
   public interface b<T> {
      T run(bmc var1);
   }

   public static record c<S, T>(bmb.a<S, T> a, bme<S> b) implements bmb<S, T> {
      @Override
      public Optional<T> a(bma<S> $$0) {
         bmc $$1 = new bmc();
         return this.b.a($$0, $$1, blw.a) ? this.a.run($$0, $$1) : Optional.empty();
      }
   }
}
