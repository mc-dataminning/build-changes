import java.util.function.Consumer;

@FunctionalInterface
public interface axl<T> {
   axl.a accept(T var1);

   static <T> axl<T> forConsumer(Consumer<T> $$0) {
      return $$1 -> {
         $$0.accept($$1);
         return axl.a.a;
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
