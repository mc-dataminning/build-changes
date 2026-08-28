import java.util.Optional;

public interface box<S, T> {
   Optional<T> a(bow<S> var1);

   static <S, T> box<S, T> a(bpa<S> $$0, box.a<S, T> $$1) {
      return new box.c<>($$1, $$0);
   }

   static <S, T> box<S, T> a(bpa<S> $$0, box.b<T> $$1) {
      return new box.c<>(($$1x, $$2) -> Optional.of($$1.run($$2)), $$0);
   }

   @FunctionalInterface
   public interface a<S, T> {
      Optional<T> run(bow<S> var1, boy var2);
   }

   @FunctionalInterface
   public interface b<T> {
      T run(boy var1);
   }

   public static record c<S, T>(box.a<S, T> a, bpa<S> b) implements box<S, T> {
      @Override
      public Optional<T> a(bow<S> $$0) {
         boy $$1 = new boy();
         return this.b.a($$0, $$1, bos.a) ? this.a.run($$0, $$1) : Optional.empty();
      }
   }
}
