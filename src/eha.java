@FunctionalInterface
public interface eha<T> {
   void handle(T var1, ehc<T> var2, long var3);

   public abstract static class a<T, C extends eha<T>> {
      private final aey a;
      private final Class<?> b;

      public a(aey $$0, Class<?> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public aey a() {
         return this.a;
      }

      public Class<?> b() {
         return this.b;
      }

      public abstract void a(qy var1, C var2);

      public abstract C b(qy var1);
   }
}
