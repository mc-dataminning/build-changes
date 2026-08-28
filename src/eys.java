@FunctionalInterface
public interface eys<T> {
   void handle(T var1, eyu<T> var2, long var3);

   public abstract static class a<T, C extends eys<T>> {
      private final alh a;
      private final Class<?> b;

      public a(alh $$0, Class<?> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public alh a() {
         return this.a;
      }

      public Class<?> b() {
         return this.b;
      }

      public abstract void a(uj var1, C var2);

      public abstract C b(uj var1);
   }
}
