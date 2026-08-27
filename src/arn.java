import java.util.function.Consumer;

@FunctionalInterface
public interface arn<T> {
   arn.a accept(T var1);

   static <T> arn<T> forConsumer(Consumer<T> $$0) {
      return $$1 -> {
         $$0.accept($$1);
         return arn.a.a;
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
