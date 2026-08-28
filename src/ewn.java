@FunctionalInterface
public interface ewn<T> {
   void handle(T var1, ewp<T> var2, long var3);

   public abstract static class a<T, C extends ewn<T>> {
      private final akr a;
      private final Class<?> b;

      public a(akr $$0, Class<?> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public akr a() {
         return this.a;
      }

      public Class<?> b() {
         return this.b;
      }

      public abstract void a(ub var1, C var2);

      public abstract C b(ub var1);
   }
}
