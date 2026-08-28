import java.util.function.Consumer;

@FunctionalInterface
public interface ayq<T> {
   ayq.a accept(T var1);

   static <T> ayq<T> forConsumer(Consumer<T> $$0) {
      return $$1 -> {
         $$0.accept($$1);
         return ayq.a.a;
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
