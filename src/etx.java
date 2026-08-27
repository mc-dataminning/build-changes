@FunctionalInterface
public interface etx<T> {
   void handle(T var1, etz<T> var2, long var3);

   public abstract static class a<T, C extends etx<T>> {
      private final akn a;
      private final Class<?> b;

      public a(akn $$0, Class<?> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public akn a() {
         return this.a;
      }

      public Class<?> b() {
         return this.b;
      }

      public abstract void a(ud var1, C var2);

      public abstract C b(ud var1);
   }
}
