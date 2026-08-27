@FunctionalInterface
public interface egt<T> {
   void handle(T var1, egv<T> var2, long var3);

   public abstract static class a<T, C extends egt<T>> {
      private final aeu a;
      private final Class<?> b;

      public a(aeu $$0, Class<?> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public aeu a() {
         return this.a;
      }

      public Class<?> b() {
         return this.b;
      }

      public abstract void a(qu var1, C var2);

      public abstract C b(qu var1);
   }
}
