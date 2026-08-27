import java.util.function.Consumer;

@FunctionalInterface
public interface awz<T> {
   awz.a accept(T var1);

   static <T> awz<T> forConsumer(Consumer<T> $$0) {
      return $$1 -> {
         $$0.accept($$1);
         return awz.a.a;
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
