import java.util.Optional;

public interface bnj<S, T> {
   Optional<T> a(bni<S> var1);

   static <S, T> bnj<S, T> a(bnm<S> $$0, bnj.a<S, T> $$1) {
      return new bnj.c<>($$1, $$0);
   }

   static <S, T> bnj<S, T> a(bnm<S> $$0, bnj.b<T> $$1) {
      return new bnj.c<>(($$1x, $$2) -> Optional.of($$1.run($$2)), $$0);
   }

   @FunctionalInterface
   public interface a<S, T> {
      Optional<T> run(bni<S> var1, bnk var2);
   }

   @FunctionalInterface
   public interface b<T> {
      T run(bnk var1);
   }

   public static record c<S, T>(bnj.a<S, T> a, bnm<S> b) implements bnj<S, T> {
      @Override
      public Optional<T> a(bni<S> $$0) {
         bnk $$1 = new bnk();
         return this.b.a($$0, $$1, bne.a) ? this.a.run($$0, $$1) : Optional.empty();
      }
   }
}
