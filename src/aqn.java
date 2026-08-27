import java.util.function.Consumer;

@FunctionalInterface
public interface aqn<T> {
   aqn.a accept(T var1);

   static <T> aqn<T> forConsumer(Consumer<T> $$0) {
      return $$1 -> {
         $$0.accept($$1);
         return aqn.a.a;
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
