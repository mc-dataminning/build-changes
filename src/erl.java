@FunctionalInterface
public interface erl<T> {
   void handle(T var1, ern<T> var2, long var3);

   public abstract static class a<T, C extends erl<T>> {
      private final ajt a;
      private final Class<?> b;

      public a(ajt $$0, Class<?> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public ajt a() {
         return this.a;
      }

      public Class<?> b() {
         return this.b;
      }

      public abstract void a(tm var1, C var2);

      public abstract C b(tm var1);
   }
}
