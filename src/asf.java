import java.util.function.Consumer;

@FunctionalInterface
public interface asf<T> {
   asf.a accept(T var1);

   static <T> asf<T> forConsumer(Consumer<T> $$0) {
      return $$1 -> {
         $$0.accept($$1);
         return asf.a.a;
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
