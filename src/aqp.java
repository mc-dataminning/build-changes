import java.util.function.Consumer;

@FunctionalInterface
public interface aqp<T> {
   aqp.a accept(T var1);

   static <T> aqp<T> forConsumer(Consumer<T> $$0) {
      return $$1 -> {
         $$0.accept($$1);
         return aqp.a.a;
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
