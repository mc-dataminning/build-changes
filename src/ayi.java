import java.util.function.Consumer;

@FunctionalInterface
public interface ayi<T> {
   ayi.a accept(T var1);

   static <T> ayi<T> forConsumer(Consumer<T> $$0) {
      return $$1 -> {
         $$0.accept($$1);
         return ayi.a.a;
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
