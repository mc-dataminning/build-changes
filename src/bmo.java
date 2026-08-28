import java.util.Optional;

public interface bmo<S, T> {
   Optional<T> a(bmn<S> var1);

   static <S, T> bmo<S, T> a(bmr<S> $$0, bmo.a<S, T> $$1) {
      return new bmo.c<>($$1, $$0);
   }

   static <S, T> bmo<S, T> a(bmr<S> $$0, bmo.b<T> $$1) {
      return new bmo.c<>(($$1x, $$2) -> Optional.of($$1.run($$2)), $$0);
   }

   @FunctionalInterface
   public interface a<S, T> {
      Optional<T> run(bmn<S> var1, bmp var2);
   }

   @FunctionalInterface
   public interface b<T> {
      T run(bmp var1);
   }

   public static record c<S, T>(bmo.a<S, T> a, bmr<S> b) implements bmo<S, T> {
      @Override
      public Optional<T> a(bmn<S> $$0) {
         bmp $$1 = new bmp();
         return this.b.a($$0, $$1, bmj.a) ? this.a.run($$0, $$1) : Optional.empty();
      }
   }
}
