@FunctionalInterface
public interface fdh<T> {
   void handle(T var1, fdj<T> var2, long var3);

   public abstract static class a<T, C extends fdh<T>> {
      private final ale a;
      private final Class<?> b;

      public a(ale $$0, Class<?> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public ale a() {
         return this.a;
      }

      public Class<?> b() {
         return this.b;
      }

      public abstract void a(tx var1, C var2);

      public abstract C b(tx var1);
   }
}
