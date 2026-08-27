@FunctionalInterface
public interface ego<T> {
   void handle(T var1, egq<T> var2, long var3);

   public abstract static class a<T, C extends ego<T>> {
      private final aer a;
      private final Class<?> b;

      public a(aer $$0, Class<?> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public aer a() {
         return this.a;
      }

      public Class<?> b() {
         return this.b;
      }

      public abstract void a(qr var1, C var2);

      public abstract C b(qr var1);
   }
}
