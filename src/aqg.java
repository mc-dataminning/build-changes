import java.util.function.Consumer;

@FunctionalInterface
public interface aqg<T> {
   aqg.a accept(T var1);

   static <T> aqg<T> forConsumer(Consumer<T> $$0) {
      return $$1 -> {
         $$0.accept($$1);
         return aqg.a.a;
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
