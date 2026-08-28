@FunctionalInterface
public interface fbd<T> {
   void handle(T var1, fbf<T> var2, long var3);

   public abstract static class a<T, C extends fbd<T>> {
      private final alz a;
      private final Class<?> b;

      public a(alz $$0, Class<?> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public alz a() {
         return this.a;
      }

      public Class<?> b() {
         return this.b;
      }

      public abstract void a(ux var1, C var2);

      public abstract C b(ux var1);
   }
}
