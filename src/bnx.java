import java.util.Optional;

public interface bnx<S, T> {
   Optional<T> a(bnw<S> var1);

   static <S, T> bnx<S, T> a(boa<S> $$0, bnx.a<S, T> $$1) {
      return new bnx.c<>($$1, $$0);
   }

   static <S, T> bnx<S, T> a(boa<S> $$0, bnx.b<T> $$1) {
      return new bnx.c<>(($$1x, $$2) -> Optional.of($$1.run($$2)), $$0);
   }

   @FunctionalInterface
   public interface a<S, T> {
      Optional<T> run(bnw<S> var1, bny var2);
   }

   @FunctionalInterface
   public interface b<T> {
      T run(bny var1);
   }

   public static record c<S, T>(bnx.a<S, T> a, boa<S> b) implements bnx<S, T> {
      @Override
      public Optional<T> a(bnw<S> $$0) {
         bny $$1 = new bny();
         return this.b.a($$0, $$1, bns.a) ? this.a.run($$0, $$1) : Optional.empty();
      }
   }
}
