@FunctionalInterface
public interface ejf<T> {
   void handle(T var1, ejh<T> var2, long var3);

   public abstract static class a<T, C extends ejf<T>> {
      private final agi a;
      private final Class<?> b;

      public a(agi $$0, Class<?> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public agi a() {
         return this.a;
      }

      public Class<?> b() {
         return this.b;
      }

      public abstract void a(rz var1, C var2);

      public abstract C b(rz var1);
   }
}
