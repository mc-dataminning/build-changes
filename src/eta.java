@FunctionalInterface
public interface eta<T> {
   void handle(T var1, etc<T> var2, long var3);

   public abstract static class a<T, C extends eta<T>> {
      private final akh a;
      private final Class<?> b;

      public a(akh $$0, Class<?> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public akh a() {
         return this.a;
      }

      public Class<?> b() {
         return this.b;
      }

      public abstract void a(ua var1, C var2);

      public abstract C b(ua var1);
   }
}
