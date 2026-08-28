@FunctionalInterface
public interface ezc<T> {
   void handle(T var1, eze<T> var2, long var3);

   public abstract static class a<T, C extends ezc<T>> {
      private final all a;
      private final Class<?> b;

      public a(all $$0, Class<?> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public all a() {
         return this.a;
      }

      public Class<?> b() {
         return this.b;
      }

      public abstract void a(un var1, C var2);

      public abstract C b(un var1);
   }
}
