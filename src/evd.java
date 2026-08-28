@FunctionalInterface
public interface evd<T> {
   void handle(T var1, evf<T> var2, long var3);

   public abstract static class a<T, C extends evd<T>> {
      private final alf a;
      private final Class<?> b;

      public a(alf $$0, Class<?> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public alf a() {
         return this.a;
      }

      public Class<?> b() {
         return this.b;
      }

      public abstract void a(us var1, C var2);

      public abstract C b(us var1);
   }
}
