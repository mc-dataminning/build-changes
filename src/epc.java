@FunctionalInterface
public interface epc<T> {
   void handle(T var1, epe<T> var2, long var3);

   public abstract static class a<T, C extends epc<T>> {
      private final ajh a;
      private final Class<?> b;

      public a(ajh $$0, Class<?> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public ajh a() {
         return this.a;
      }

      public Class<?> b() {
         return this.b;
      }

      public abstract void a(ta var1, C var2);

      public abstract C b(ta var1);
   }
}
