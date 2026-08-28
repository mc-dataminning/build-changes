@FunctionalInterface
public interface fbi<T> {
   void handle(T var1, fbk<T> var2, long var3);

   public abstract static class a<T, C extends fbi<T>> {
      private final aku a;
      private final Class<?> b;

      public a(aku $$0, Class<?> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public aku a() {
         return this.a;
      }

      public Class<?> b() {
         return this.b;
      }

      public abstract void a(tq var1, C var2);

      public abstract C b(tq var1);
   }
}
