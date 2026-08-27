import java.util.function.Consumer;

@FunctionalInterface
public interface ava<T> {
   ava.a accept(T var1);

   static <T> ava<T> forConsumer(Consumer<T> $$0) {
      return $$1 -> {
         $$0.accept($$1);
         return ava.a.a;
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
