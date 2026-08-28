@FunctionalInterface
public interface fbc<T> {
   void handle(T var1, fbe<T> var2, long var3);

   public abstract static class a<T, C extends fbc<T>> {
      private final alp a;
      private final Class<?> b;

      public a(alp $$0, Class<?> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public alp a() {
         return this.a;
      }

      public Class<?> b() {
         return this.b;
      }

      public abstract void a(um var1, C var2);

      public abstract C b(um var1);
   }
}
