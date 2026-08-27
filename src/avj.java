import java.util.function.Consumer;

@FunctionalInterface
public interface avj<T> {
   avj.a accept(T var1);

   static <T> avj<T> forConsumer(Consumer<T> $$0) {
      return $$1 -> {
         $$0.accept($$1);
         return avj.a.a;
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
