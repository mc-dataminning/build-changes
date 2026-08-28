import java.util.function.Consumer;

@FunctionalInterface
public interface awq<T> {
   awq.a accept(T var1);

   static <T> awq<T> forConsumer(Consumer<T> $$0) {
      return $$1 -> {
         $$0.accept($$1);
         return awq.a.a;
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
