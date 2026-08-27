import java.util.function.Consumer;

@FunctionalInterface
public interface auu<T> {
   auu.a accept(T var1);

   static <T> auu<T> forConsumer(Consumer<T> $$0) {
      return $$1 -> {
         $$0.accept($$1);
         return auu.a.a;
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
