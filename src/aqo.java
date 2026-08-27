import java.util.function.Consumer;

@FunctionalInterface
public interface aqo<T> {
   aqo.a accept(T var1);

   static <T> aqo<T> forConsumer(Consumer<T> $$0) {
      return $$1 -> {
         $$0.accept($$1);
         return aqo.a.a;
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
