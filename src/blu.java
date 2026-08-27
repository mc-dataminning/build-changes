import java.util.Optional;

public interface blu<S, T> {
   Optional<T> a(blt<S> var1);

   static <S, T> blu<S, T> a(blx<S> $$0, blu.a<S, T> $$1) {
      return new blu.c<>($$1, $$0);
   }

   static <S, T> blu<S, T> a(blx<S> $$0, blu.b<T> $$1) {
      return new blu.c<>(($$1x, $$2) -> Optional.of($$1.run($$2)), $$0);
   }

   @FunctionalInterface
   public interface a<S, T> {
      Optional<T> run(blt<S> var1, blv var2);
   }

   @FunctionalInterface
   public interface b<T> {
      T run(blv var1);
   }

   public static record c<S, T>(blu.a<S, T> a, blx<S> b) implements blu<S, T> {
      @Override
      public Optional<T> a(blt<S> $$0) {
         blv $$1 = new blv();
         return this.b.a($$0, $$1, blp.a) ? this.a.run($$0, $$1) : Optional.empty();
      }
   }
}
