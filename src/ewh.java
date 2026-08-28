@FunctionalInterface
public interface ewh<T> {
   void handle(T var1, ewj<T> var2, long var3);

   public abstract static class a<T, C extends ewh<T>> {
      private final akq a;
      private final Class<?> b;

      public a(akq $$0, Class<?> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public akq a() {
         return this.a;
      }

      public Class<?> b() {
         return this.b;
      }

      public abstract void a(ua var1, C var2);

      public abstract C b(ua var1);
   }
}
