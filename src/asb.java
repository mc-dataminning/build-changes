import java.util.function.Consumer;

@FunctionalInterface
public interface asb<T> {
   asb.a accept(T var1);

   static <T> asb<T> forConsumer(Consumer<T> $$0) {
      return $$1 -> {
         $$0.accept($$1);
         return asb.a.a;
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
