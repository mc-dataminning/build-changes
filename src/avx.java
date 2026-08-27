import java.util.function.Consumer;

@FunctionalInterface
public interface avx<T> {
   avx.a accept(T var1);

   static <T> avx<T> forConsumer(Consumer<T> $$0) {
      return $$1 -> {
         $$0.accept($$1);
         return avx.a.a;
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
