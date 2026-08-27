import java.util.function.Consumer;

@FunctionalInterface
public interface aqj<T> {
   aqj.a accept(T var1);

   static <T> aqj<T> forConsumer(Consumer<T> $$0) {
      return $$1 -> {
         $$0.accept($$1);
         return aqj.a.a;
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
