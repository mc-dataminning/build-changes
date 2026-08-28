@FunctionalInterface
public interface fak<T> {
   void handle(T var1, fam<T> var2, long var3);

   public abstract static class a<T, C extends fak<T>> {
      private final akv a;
      private final Class<?> b;

      public a(akv $$0, Class<?> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public akv a() {
         return this.a;
      }

      public Class<?> b() {
         return this.b;
      }

      public abstract void a(tq var1, C var2);

      public abstract C b(tq var1);
   }
}
