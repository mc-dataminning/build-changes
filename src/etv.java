@FunctionalInterface
public interface etv<T> {
   void handle(T var1, etx<T> var2, long var3);

   public abstract static class a<T, C extends etv<T>> {
      private final akm a;
      private final Class<?> b;

      public a(akm $$0, Class<?> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public akm a() {
         return this.a;
      }

      public Class<?> b() {
         return this.b;
      }

      public abstract void a(ud var1, C var2);

      public abstract C b(ud var1);
   }
}
