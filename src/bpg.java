import java.util.Optional;

public interface bpg<S, T> {
   Optional<T> a(bpf<S> var1);

   static <S, T> bpg<S, T> a(bpj<S> $$0, bpg.a<S, T> $$1) {
      return new bpg.c<>($$1, $$0);
   }

   static <S, T> bpg<S, T> a(bpj<S> $$0, bpg.b<T> $$1) {
      return new bpg.c<>(($$1x, $$2) -> Optional.of($$1.run($$2)), $$0);
   }

   @FunctionalInterface
   public interface a<S, T> {
      Optional<T> run(bpf<S> var1, bph var2);
   }

   @FunctionalInterface
   public interface b<T> {
      T run(bph var1);
   }

   public static record c<S, T>(bpg.a<S, T> a, bpj<S> b) implements bpg<S, T> {
      @Override
      public Optional<T> a(bpf<S> $$0) {
         bph $$1 = new bph();
         return this.b.a($$0, $$1, bpb.a) ? this.a.run($$0, $$1) : Optional.empty();
      }
   }
}
