import java.util.function.Consumer;

@FunctionalInterface
public interface axy<T> {
   axy.a accept(T var1);

   static <T> axy<T> forConsumer(Consumer<T> $$0) {
      return $$1 -> {
         $$0.accept($$1);
         return axy.a.a;
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
