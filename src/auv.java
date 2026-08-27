import java.util.function.Consumer;

@FunctionalInterface
public interface auv<T> {
   auv.a accept(T var1);

   static <T> auv<T> forConsumer(Consumer<T> $$0) {
      return $$1 -> {
         $$0.accept($$1);
         return auv.a.a;
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
