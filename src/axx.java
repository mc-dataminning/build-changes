import java.util.function.Consumer;

@FunctionalInterface
public interface axx<T> {
   axx.a accept(T var1);

   static <T> axx<T> forConsumer(Consumer<T> $$0) {
      return $$1 -> {
         $$0.accept($$1);
         return axx.a.a;
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
