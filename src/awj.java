import java.util.function.Consumer;

@FunctionalInterface
public interface awj<T> {
   awj.a accept(T var1);

   static <T> awj<T> forConsumer(Consumer<T> $$0) {
      return $$1 -> {
         $$0.accept($$1);
         return awj.a.a;
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
