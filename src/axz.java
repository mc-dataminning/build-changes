import java.util.function.Consumer;

@FunctionalInterface
public interface axz<T> {
   axz.a accept(T var1);

   static <T> axz<T> forConsumer(Consumer<T> $$0) {
      return $$1 -> {
         $$0.accept($$1);
         return axz.a.a;
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
