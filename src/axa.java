import java.util.function.Consumer;

@FunctionalInterface
public interface axa<T> {
   axa.a accept(T var1);

   static <T> axa<T> forConsumer(Consumer<T> $$0) {
      return $$1 -> {
         $$0.accept($$1);
         return axa.a.a;
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
