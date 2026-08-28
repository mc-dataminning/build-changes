@FunctionalInterface
public interface fcf<T> {
   void handle(T var1, fch<T> var2, long var3);

   public abstract static class a<T, C extends fcf<T>> {
      private final ald a;
      private final Class<?> b;

      public a(ald $$0, Class<?> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public ald a() {
         return this.a;
      }

      public Class<?> b() {
         return this.b;
      }

      public abstract void a(tw var1, C var2);

      public abstract C b(tw var1);
   }
}
