import java.util.Optional;

public interface bny<S, T> {
   Optional<T> a(bnx<S> var1);

   static <S, T> bny<S, T> a(bob<S> $$0, bny.a<S, T> $$1) {
      return new bny.c<>($$1, $$0);
   }

   static <S, T> bny<S, T> a(bob<S> $$0, bny.b<T> $$1) {
      return new bny.c<>(($$1x, $$2) -> Optional.of($$1.run($$2)), $$0);
   }

   @FunctionalInterface
   public interface a<S, T> {
      Optional<T> run(bnx<S> var1, bnz var2);
   }

   @FunctionalInterface
   public interface b<T> {
      T run(bnz var1);
   }

   public static record c<S, T>(bny.a<S, T> a, bob<S> b) implements bny<S, T> {
      @Override
      public Optional<T> a(bnx<S> $$0) {
         bnz $$1 = new bnz();
         return this.b.a($$0, $$1, bnt.a) ? this.a.run($$0, $$1) : Optional.empty();
      }
   }
}
