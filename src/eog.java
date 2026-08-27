@FunctionalInterface
public interface eog<T> {
   void handle(T var1, eoi<T> var2, long var3);

   public abstract static class a<T, C extends eog<T>> {
      private final ajc a;
      private final Class<?> b;

      public a(ajc $$0, Class<?> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public ajc a() {
         return this.a;
      }

      public Class<?> b() {
         return this.b;
      }

      public abstract void a(sy var1, C var2);

      public abstract C b(sy var1);
   }
}
