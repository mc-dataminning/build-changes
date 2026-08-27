@FunctionalInterface
public interface ekm<T> {
   void handle(T var1, eko<T> var2, long var3);

   public abstract static class a<T, C extends ekm<T>> {
      private final agt a;
      private final Class<?> b;

      public a(agt $$0, Class<?> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public agt a() {
         return this.a;
      }

      public Class<?> b() {
         return this.b;
      }

      public abstract void a(sj var1, C var2);

      public abstract C b(sj var1);
   }
}
