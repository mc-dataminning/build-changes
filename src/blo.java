import java.util.Optional;

public interface blo<S, T> {
   Optional<T> a(bln<S> var1);

   static <S, T> blo<S, T> a(blr<S> $$0, blo.a<S, T> $$1) {
      return new blo.c<>($$1, $$0);
   }

   static <S, T> blo<S, T> a(blr<S> $$0, blo.b<T> $$1) {
      return new blo.c<>(($$1x, $$2) -> Optional.of($$1.run($$2)), $$0);
   }

   @FunctionalInterface
   public interface a<S, T> {
      Optional<T> run(bln<S> var1, blp var2);
   }

   @FunctionalInterface
   public interface b<T> {
      T run(blp var1);
   }

   public static record c<S, T>(blo.a<S, T> a, blr<S> b) implements blo<S, T> {
      @Override
      public Optional<T> a(bln<S> $$0) {
         blp $$1 = new blp();
         return this.b.a($$0, $$1, blj.a) ? this.a.run($$0, $$1) : Optional.empty();
      }
   }
}
