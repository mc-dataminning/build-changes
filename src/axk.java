import java.util.function.Consumer;

@FunctionalInterface
public interface axk<T> {
   axk.a accept(T var1);

   static <T> axk<T> forConsumer(Consumer<T> $$0) {
      return $$1 -> {
         $$0.accept($$1);
         return axk.a.a;
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
