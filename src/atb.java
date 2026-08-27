import java.util.function.Consumer;

@FunctionalInterface
public interface atb<T> {
   atb.a accept(T var1);

   static <T> atb<T> forConsumer(Consumer<T> $$0) {
      return $$1 -> {
         $$0.accept($$1);
         return atb.a.a;
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
