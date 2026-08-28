import java.util.Optional;

public interface boy<S, T> {
   Optional<T> a(box<S> var1);

   static <S, T> boy<S, T> a(bpb<S> $$0, boy.a<S, T> $$1) {
      return new boy.c<>($$1, $$0);
   }

   static <S, T> boy<S, T> a(bpb<S> $$0, boy.b<T> $$1) {
      return new boy.c<>(($$1x, $$2) -> Optional.of($$1.run($$2)), $$0);
   }

   @FunctionalInterface
   public interface a<S, T> {
      Optional<T> run(box<S> var1, boz var2);
   }

   @FunctionalInterface
   public interface b<T> {
      T run(boz var1);
   }

   public static record c<S, T>(boy.a<S, T> a, bpb<S> b) implements boy<S, T> {
      @Override
      public Optional<T> a(box<S> $$0) {
         boz $$1 = new boz();
         return this.b.a($$0, $$1, bot.a) ? this.a.run($$0, $$1) : Optional.empty();
      }
   }
}
