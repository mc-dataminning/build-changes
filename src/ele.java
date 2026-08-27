@FunctionalInterface
public interface ele<T> {
   void handle(T var1, elg<T> var2, long var3);

   public abstract static class a<T, C extends ele<T>> {
      private final ahg a;
      private final Class<?> b;

      public a(ahg $$0, Class<?> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public ahg a() {
         return this.a;
      }

      public Class<?> b() {
         return this.b;
      }

      public abstract void a(sn var1, C var2);

      public abstract C b(sn var1);
   }
}
