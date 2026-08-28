import java.util.function.Consumer;

@FunctionalInterface
public interface axv<T> {
   axv.a accept(T var1);

   static <T> axv<T> forConsumer(Consumer<T> $$0) {
      return $$1 -> {
         $$0.accept($$1);
         return axv.a.a;
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
