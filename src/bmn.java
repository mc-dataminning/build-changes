import java.util.Optional;

public interface bmn<S, T> {
   Optional<T> a(bmm<S> var1);

   static <S, T> bmn<S, T> a(bmq<S> $$0, bmn.a<S, T> $$1) {
      return new bmn.c<>($$1, $$0);
   }

   static <S, T> bmn<S, T> a(bmq<S> $$0, bmn.b<T> $$1) {
      return new bmn.c<>(($$1x, $$2) -> Optional.of($$1.run($$2)), $$0);
   }

   @FunctionalInterface
   public interface a<S, T> {
      Optional<T> run(bmm<S> var1, bmo var2);
   }

   @FunctionalInterface
   public interface b<T> {
      T run(bmo var1);
   }

   public static record c<S, T>(bmn.a<S, T> a, bmq<S> b) implements bmn<S, T> {
      @Override
      public Optional<T> a(bmm<S> $$0) {
         bmo $$1 = new bmo();
         return this.b.a($$0, $$1, bmi.a) ? this.a.run($$0, $$1) : Optional.empty();
      }
   }
}
