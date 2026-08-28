import java.util.Optional;

public interface blx<S, T> {
   Optional<T> a(blw<S> var1);

   static <S, T> blx<S, T> a(bma<S> $$0, blx.a<S, T> $$1) {
      return new blx.c<>($$1, $$0);
   }

   static <S, T> blx<S, T> a(bma<S> $$0, blx.b<T> $$1) {
      return new blx.c<>(($$1x, $$2) -> Optional.of($$1.run($$2)), $$0);
   }

   @FunctionalInterface
   public interface a<S, T> {
      Optional<T> run(blw<S> var1, bly var2);
   }

   @FunctionalInterface
   public interface b<T> {
      T run(bly var1);
   }

   public static record c<S, T>(blx.a<S, T> a, bma<S> b) implements blx<S, T> {
      @Override
      public Optional<T> a(blw<S> $$0) {
         bly $$1 = new bly();
         return this.b.a($$0, $$1, bls.a) ? this.a.run($$0, $$1) : Optional.empty();
      }
   }
}
