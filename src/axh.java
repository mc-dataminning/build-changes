import java.util.function.Consumer;

@FunctionalInterface
public interface axh<T> {
   axh.a accept(T var1);

   static <T> axh<T> forConsumer(Consumer<T> $$0) {
      return $$1 -> {
         $$0.accept($$1);
         return axh.a.a;
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
