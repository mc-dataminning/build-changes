import java.util.function.Consumer;

@FunctionalInterface
public interface aqq<T> {
   aqq.a accept(T var1);

   static <T> aqq<T> forConsumer(Consumer<T> $$0) {
      return $$1 -> {
         $$0.accept($$1);
         return aqq.a.a;
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
