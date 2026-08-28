import java.util.Optional;

public interface bnw<S, T> {
   Optional<T> a(bnv<S> var1);

   static <S, T> bnw<S, T> a(bnz<S> $$0, bnw.a<S, T> $$1) {
      return new bnw.c<>($$1, $$0);
   }

   static <S, T> bnw<S, T> a(bnz<S> $$0, bnw.b<T> $$1) {
      return new bnw.c<>(($$1x, $$2) -> Optional.of($$1.run($$2)), $$0);
   }

   @FunctionalInterface
   public interface a<S, T> {
      Optional<T> run(bnv<S> var1, bnx var2);
   }

   @FunctionalInterface
   public interface b<T> {
      T run(bnx var1);
   }

   public static record c<S, T>(bnw.a<S, T> a, bnz<S> b) implements bnw<S, T> {
      @Override
      public Optional<T> a(bnv<S> $$0) {
         bnx $$1 = new bnx();
         return this.b.a($$0, $$1, bnr.a) ? this.a.run($$0, $$1) : Optional.empty();
      }
   }
}
