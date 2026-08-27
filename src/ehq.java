@FunctionalInterface
public interface ehq<T> {
   void handle(T var1, ehs<T> var2, long var3);

   public abstract static class a<T, C extends ehq<T>> {
      private final afw a;
      private final Class<?> b;

      public a(afw $$0, Class<?> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public afw a() {
         return this.a;
      }

      public Class<?> b() {
         return this.b;
      }

      public abstract void a(rt var1, C var2);

      public abstract C b(rt var1);
   }
}
