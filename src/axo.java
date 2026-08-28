import java.util.function.Consumer;

@FunctionalInterface
public interface axo<T> {
   axo.a accept(T var1);

   static <T> axo<T> forConsumer(Consumer<T> $$0) {
      return $$1 -> {
         $$0.accept($$1);
         return axo.a.a;
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
