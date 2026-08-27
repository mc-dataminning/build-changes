@FunctionalInterface
public interface egq<T> {
   void handle(T var1, egs<T> var2, long var3);

   public abstract static class a<T, C extends egq<T>> {
      private final aep a;
      private final Class<?> b;

      public a(aep $$0, Class<?> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public aep a() {
         return this.a;
      }

      public Class<?> b() {
         return this.b;
      }

      public abstract void a(qs var1, C var2);

      public abstract C b(qs var1);
   }
}
