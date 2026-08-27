import java.util.Optional;

public interface blg<S, T> {
   Optional<T> a(blf<S> var1);

   static <S, T> blg<S, T> a(blj<S> $$0, blg.a<S, T> $$1) {
      return new blg.c<>($$1, $$0);
   }

   static <S, T> blg<S, T> a(blj<S> $$0, blg.b<T> $$1) {
      return new blg.c<>(($$1x, $$2) -> Optional.of($$1.run($$2)), $$0);
   }

   @FunctionalInterface
   public interface a<S, T> {
      Optional<T> run(blf<S> var1, blh var2);
   }

   @FunctionalInterface
   public interface b<T> {
      T run(blh var1);
   }

   public static record c<S, T>(blg.a<S, T> a, blj<S> b) implements blg<S, T> {
      @Override
      public Optional<T> a(blf<S> $$0) {
         blh $$1 = new blh();
         return this.b.a($$0, $$1, blb.a) ? this.a.run($$0, $$1) : Optional.empty();
      }
   }
}
