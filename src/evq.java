@FunctionalInterface
public interface evq<T> {
   void handle(T var1, evs<T> var2, long var3);

   public abstract static class a<T, C extends evq<T>> {
      private final akk a;
      private final Class<?> b;

      public a(akk $$0, Class<?> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public akk a() {
         return this.a;
      }

      public Class<?> b() {
         return this.b;
      }

      public abstract void a(tx var1, C var2);

      public abstract C b(tx var1);
   }
}
