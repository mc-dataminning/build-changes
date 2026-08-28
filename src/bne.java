import java.util.Optional;

public interface bne<S, T> {
   Optional<T> a(bnd<S> var1);

   static <S, T> bne<S, T> a(bnh<S> $$0, bne.a<S, T> $$1) {
      return new bne.c<>($$1, $$0);
   }

   static <S, T> bne<S, T> a(bnh<S> $$0, bne.b<T> $$1) {
      return new bne.c<>(($$1x, $$2) -> Optional.of($$1.run($$2)), $$0);
   }

   @FunctionalInterface
   public interface a<S, T> {
      Optional<T> run(bnd<S> var1, bnf var2);
   }

   @FunctionalInterface
   public interface b<T> {
      T run(bnf var1);
   }

   public static record c<S, T>(bne.a<S, T> a, bnh<S> b) implements bne<S, T> {
      @Override
      public Optional<T> a(bnd<S> $$0) {
         bnf $$1 = new bnf();
         return this.b.a($$0, $$1, bmz.a) ? this.a.run($$0, $$1) : Optional.empty();
      }
   }
}
