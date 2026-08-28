@FunctionalInterface
public interface ezj<T> {
   void handle(T var1, ezl<T> var2, long var3);

   public abstract static class a<T, C extends ezj<T>> {
      private final alj a;
      private final Class<?> b;

      public a(alj $$0, Class<?> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public alj a() {
         return this.a;
      }

      public Class<?> b() {
         return this.b;
      }

      public abstract void a(ul var1, C var2);

      public abstract C b(ul var1);
   }
}
