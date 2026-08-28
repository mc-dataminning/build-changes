import java.util.Optional;

public interface bmp<S, T> {
   Optional<T> a(bmo<S> var1);

   static <S, T> bmp<S, T> a(bms<S> $$0, bmp.a<S, T> $$1) {
      return new bmp.c<>($$1, $$0);
   }

   static <S, T> bmp<S, T> a(bms<S> $$0, bmp.b<T> $$1) {
      return new bmp.c<>(($$1x, $$2) -> Optional.of($$1.run($$2)), $$0);
   }

   @FunctionalInterface
   public interface a<S, T> {
      Optional<T> run(bmo<S> var1, bmq var2);
   }

   @FunctionalInterface
   public interface b<T> {
      T run(bmq var1);
   }

   public static record c<S, T>(bmp.a<S, T> a, bms<S> b) implements bmp<S, T> {
      @Override
      public Optional<T> a(bmo<S> $$0) {
         bmq $$1 = new bmq();
         return this.b.a($$0, $$1, bmk.a) ? this.a.run($$0, $$1) : Optional.empty();
      }
   }
}
