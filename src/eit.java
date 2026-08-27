@FunctionalInterface
public interface eit<T> {
   void handle(T var1, eiv<T> var2, long var3);

   public abstract static class a<T, C extends eit<T>> {
      private final agg a;
      private final Class<?> b;

      public a(agg $$0, Class<?> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public agg a() {
         return this.a;
      }

      public Class<?> b() {
         return this.b;
      }

      public abstract void a(rz var1, C var2);

      public abstract C b(rz var1);
   }
}
