import java.util.Optional;

public interface bmj<S, T> {
   Optional<T> a(bmi<S> var1);

   static <S, T> bmj<S, T> a(bmm<S> $$0, bmj.a<S, T> $$1) {
      return new bmj.c<>($$1, $$0);
   }

   static <S, T> bmj<S, T> a(bmm<S> $$0, bmj.b<T> $$1) {
      return new bmj.c<>(($$1x, $$2) -> Optional.of($$1.run($$2)), $$0);
   }

   @FunctionalInterface
   public interface a<S, T> {
      Optional<T> run(bmi<S> var1, bmk var2);
   }

   @FunctionalInterface
   public interface b<T> {
      T run(bmk var1);
   }

   public static record c<S, T>(bmj.a<S, T> a, bmm<S> b) implements bmj<S, T> {
      @Override
      public Optional<T> a(bmi<S> $$0) {
         bmk $$1 = new bmk();
         return this.b.a($$0, $$1, bme.a) ? this.a.run($$0, $$1) : Optional.empty();
      }
   }
}
