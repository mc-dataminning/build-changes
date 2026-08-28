import java.util.function.Consumer;

@FunctionalInterface
public interface aws<T> {
   aws.a accept(T var1);

   static <T> aws<T> forConsumer(Consumer<T> $$0) {
      return $$1 -> {
         $$0.accept($$1);
         return aws.a.a;
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
