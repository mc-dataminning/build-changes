@FunctionalInterface
public interface ekx<T> {
   void handle(T var1, ekz<T> var2, long var3);

   public abstract static class a<T, C extends ekx<T>> {
      private final ahd a;
      private final Class<?> b;

      public a(ahd $$0, Class<?> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public ahd a() {
         return this.a;
      }

      public Class<?> b() {
         return this.b;
      }

      public abstract void a(sl var1, C var2);

      public abstract C b(sl var1);
   }
}
