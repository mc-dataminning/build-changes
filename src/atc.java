import java.util.function.Consumer;

@FunctionalInterface
public interface atc<T> {
   atc.a accept(T var1);

   static <T> atc<T> forConsumer(Consumer<T> $$0) {
      return $$1 -> {
         $$0.accept($$1);
         return atc.a.a;
      };
   }

   public static enum a {
      a,
      b;

      public boolean a() {
         return this == b;
      }
   }
}
