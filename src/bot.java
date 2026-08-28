import java.util.Optional;

public interface bot<S, T> {
   Optional<T> a(bos<S> var1);

   static <S, T> bot<S, T> a(bow<S> $$0, bot.a<S, T> $$1) {
      return new bot.c<>($$1, $$0);
   }

   static <S, T> bot<S, T> a(bow<S> $$0, bot.b<T> $$1) {
      return new bot.c<>(($$1x, $$2) -> Optional.of($$1.run($$2)), $$0);
   }

   @FunctionalInterface
   public interface a<S, T> {
      Optional<T> run(bos<S> var1, bou var2);
   }

   @FunctionalInterface
   public interface b<T> {
      T run(bou var1);
   }

   public static record c<S, T>(bot.a<S, T> a, bow<S> b) implements bot<S, T> {
      @Override
      public Optional<T> a(bos<S> $$0) {
         bou $$1 = new bou();
         return this.b.a($$0, $$1, boo.a) ? this.a.run($$0, $$1) : Optional.empty();
      }
   }
}
