@FunctionalInterface
public interface eru<T> {
   void handle(T var1, erw<T> var2, long var3);

   public abstract static class a<T, C extends eru<T>> {
      private final ajv a;
      private final Class<?> b;

      public a(ajv $$0, Class<?> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public ajv a() {
         return this.a;
      }

      public Class<?> b() {
         return this.b;
      }

      public abstract void a(to var1, C var2);

      public abstract C b(to var1);
   }
}
