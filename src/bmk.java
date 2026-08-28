import java.util.Optional;

public interface bmk<S, T> {
   Optional<T> a(bmj<S> var1);

   static <S, T> bmk<S, T> a(bmn<S> $$0, bmk.a<S, T> $$1) {
      return new bmk.c<>($$1, $$0);
   }

   static <S, T> bmk<S, T> a(bmn<S> $$0, bmk.b<T> $$1) {
      return new bmk.c<>(($$1x, $$2) -> Optional.of($$1.run($$2)), $$0);
   }

   @FunctionalInterface
   public interface a<S, T> {
      Optional<T> run(bmj<S> var1, bml var2);
   }

   @FunctionalInterface
   public interface b<T> {
      T run(bml var1);
   }

   public static record c<S, T>(bmk.a<S, T> a, bmn<S> b) implements bmk<S, T> {
      @Override
      public Optional<T> a(bmj<S> $$0) {
         bml $$1 = new bml();
         return this.b.a($$0, $$1, bmf.a) ? this.a.run($$0, $$1) : Optional.empty();
      }
   }
}
