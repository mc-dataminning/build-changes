import java.util.Optional;

public interface bmm<S, T> {
   Optional<T> a(bml<S> var1);

   static <S, T> bmm<S, T> a(bmp<S> $$0, bmm.a<S, T> $$1) {
      return new bmm.c<>($$1, $$0);
   }

   static <S, T> bmm<S, T> a(bmp<S> $$0, bmm.b<T> $$1) {
      return new bmm.c<>(($$1x, $$2) -> Optional.of($$1.run($$2)), $$0);
   }

   @FunctionalInterface
   public interface a<S, T> {
      Optional<T> run(bml<S> var1, bmn var2);
   }

   @FunctionalInterface
   public interface b<T> {
      T run(bmn var1);
   }

   public static record c<S, T>(bmm.a<S, T> a, bmp<S> b) implements bmm<S, T> {
      @Override
      public Optional<T> a(bml<S> $$0) {
         bmn $$1 = new bmn();
         return this.b.a($$0, $$1, bmh.a) ? this.a.run($$0, $$1) : Optional.empty();
      }
   }
}
