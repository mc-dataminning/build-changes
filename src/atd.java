import java.util.function.Consumer;

@FunctionalInterface
public interface atd<T> {
   atd.a accept(T var1);

   static <T> atd<T> forConsumer(Consumer<T> $$0) {
      return $$1 -> {
         $$0.accept($$1);
         return atd.a.a;
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
