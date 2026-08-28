import java.util.Optional;

public interface bpt<S, T> {
   Optional<T> a(bps<S> var1);

   static <S, T> bpt<S, T> a(bpw<S> $$0, bpt.a<S, T> $$1) {
      return new bpt.c<>($$1, $$0);
   }

   static <S, T> bpt<S, T> a(bpw<S> $$0, bpt.b<T> $$1) {
      return new bpt.c<>(($$1x, $$2) -> Optional.of($$1.run($$2)), $$0);
   }

   @FunctionalInterface
   public interface a<S, T> {
      Optional<T> run(bps<S> var1, bpu var2);
   }

   @FunctionalInterface
   public interface b<T> {
      T run(bpu var1);
   }

   public static record c<S, T>(bpt.a<S, T> a, bpw<S> b) implements bpt<S, T> {
      @Override
      public Optional<T> a(bps<S> $$0) {
         bpu $$1 = new bpu();
         return this.b.a($$0, $$1, bpo.a) ? this.a.run($$0, $$1) : Optional.empty();
      }
   }
}
