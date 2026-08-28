import java.util.function.Consumer;

@FunctionalInterface
public interface ayb<T> {
   ayb.a accept(T var1);

   static <T> ayb<T> forConsumer(Consumer<T> $$0) {
      return $$1 -> {
         $$0.accept($$1);
         return ayb.a.a;
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
