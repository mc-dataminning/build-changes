import java.util.Optional;

public interface bpo<S, T> {
   Optional<T> a(bpn<S> var1);

   static <S, T> bpo<S, T> a(bpr<S> $$0, bpo.a<S, T> $$1) {
      return new bpo.c<>($$1, $$0);
   }

   static <S, T> bpo<S, T> a(bpr<S> $$0, bpo.b<T> $$1) {
      return new bpo.c<>(($$1x, $$2) -> Optional.of($$1.run($$2)), $$0);
   }

   @FunctionalInterface
   public interface a<S, T> {
      Optional<T> run(bpn<S> var1, bpp var2);
   }

   @FunctionalInterface
   public interface b<T> {
      T run(bpp var1);
   }

   public static record c<S, T>(bpo.a<S, T> a, bpr<S> b) implements bpo<S, T> {
      @Override
      public Optional<T> a(bpn<S> $$0) {
         bpp $$1 = new bpp();
         return this.b.a($$0, $$1, bpj.a) ? this.a.run($$0, $$1) : Optional.empty();
      }
   }
}
