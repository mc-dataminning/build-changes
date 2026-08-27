import java.util.function.Consumer;

@FunctionalInterface
public interface asw<T> {
   asw.a accept(T var1);

   static <T> asw<T> forConsumer(Consumer<T> $$0) {
      return $$1 -> {
         $$0.accept($$1);
         return asw.a.a;
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
