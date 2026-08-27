@FunctionalInterface
public interface ejk<T> {
   void handle(T var1, ejm<T> var2, long var3);

   public abstract static class a<T, C extends ejk<T>> {
      private final agm a;
      private final Class<?> b;

      public a(agm $$0, Class<?> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public agm a() {
         return this.a;
      }

      public Class<?> b() {
         return this.b;
      }

      public abstract void a(sd var1, C var2);

      public abstract C b(sd var1);
   }
}
