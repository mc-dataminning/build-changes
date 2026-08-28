import java.util.function.Consumer;

@FunctionalInterface
public interface axr<T> {
   axr.a accept(T var1);

   static <T> axr<T> forConsumer(Consumer<T> $$0) {
      return $$1 -> {
         $$0.accept($$1);
         return axr.a.a;
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
