import java.util.Optional;

public interface blq<S, T> {
   Optional<T> a(blp<S> var1);

   static <S, T> blq<S, T> a(blt<S> $$0, blq.a<S, T> $$1) {
      return new blq.c<>($$1, $$0);
   }

   static <S, T> blq<S, T> a(blt<S> $$0, blq.b<T> $$1) {
      return new blq.c<>(($$1x, $$2) -> Optional.of($$1.run($$2)), $$0);
   }

   @FunctionalInterface
   public interface a<S, T> {
      Optional<T> run(blp<S> var1, blr var2);
   }

   @FunctionalInterface
   public interface b<T> {
      T run(blr var1);
   }

   public static record c<S, T>(blq.a<S, T> a, blt<S> b) implements blq<S, T> {
      @Override
      public Optional<T> a(blp<S> $$0) {
         blr $$1 = new blr();
         return this.b.a($$0, $$1, bll.a) ? this.a.run($$0, $$1) : Optional.empty();
      }
   }
}
