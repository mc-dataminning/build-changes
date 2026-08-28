import java.util.Optional;

public interface bmq<S, T> {
   Optional<T> a(bmp<S> var1);

   static <S, T> bmq<S, T> a(bmt<S> $$0, bmq.a<S, T> $$1) {
      return new bmq.c<>($$1, $$0);
   }

   static <S, T> bmq<S, T> a(bmt<S> $$0, bmq.b<T> $$1) {
      return new bmq.c<>(($$1x, $$2) -> Optional.of($$1.run($$2)), $$0);
   }

   @FunctionalInterface
   public interface a<S, T> {
      Optional<T> run(bmp<S> var1, bmr var2);
   }

   @FunctionalInterface
   public interface b<T> {
      T run(bmr var1);
   }

   public static record c<S, T>(bmq.a<S, T> a, bmt<S> b) implements bmq<S, T> {
      @Override
      public Optional<T> a(bmp<S> $$0) {
         bmr $$1 = new bmr();
         return this.b.a($$0, $$1, bml.a) ? this.a.run($$0, $$1) : Optional.empty();
      }
   }
}
