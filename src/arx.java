import java.util.function.Consumer;

@FunctionalInterface
public interface arx<T> {
   arx.a accept(T var1);

   static <T> arx<T> forConsumer(Consumer<T> $$0) {
      return $$1 -> {
         $$0.accept($$1);
         return arx.a.a;
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
