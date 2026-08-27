import java.util.function.Consumer;

@FunctionalInterface
public interface anr<T> {
   anr.a accept(T var1);

   static <T> anr<T> forConsumer(Consumer<T> $$0) {
      return $$1 -> {
         $$0.accept($$1);
         return anr.a.a;
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
