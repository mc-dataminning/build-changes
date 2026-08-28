import java.util.function.Consumer;

@FunctionalInterface
public interface ayg<T> {
   ayg.a accept(T var1);

   static <T> ayg<T> forConsumer(Consumer<T> $$0) {
      return $$1 -> {
         $$0.accept($$1);
         return ayg.a.a;
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
