@FunctionalInterface
public interface eyd<T> {
   void handle(T var1, eyf<T> var2, long var3);

   public abstract static class a<T, C extends eyd<T>> {
      private final alc a;
      private final Class<?> b;

      public a(alc $$0, Class<?> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public alc a() {
         return this.a;
      }

      public Class<?> b() {
         return this.b;
      }

      public abstract void a(uf var1, C var2);

      public abstract C b(uf var1);
   }
}
