import java.util.function.Consumer;

@FunctionalInterface
public interface awm<T> {
   awm.a accept(T var1);

   static <T> awm<T> forConsumer(Consumer<T> $$0) {
      return $$1 -> {
         $$0.accept($$1);
         return awm.a.a;
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
