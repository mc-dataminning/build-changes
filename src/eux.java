@FunctionalInterface
public interface eux<T> {
   void handle(T var1, euz<T> var2, long var3);

   public abstract static class a<T, C extends eux<T>> {
      private final alb a;
      private final Class<?> b;

      public a(alb $$0, Class<?> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public alb a() {
         return this.a;
      }

      public Class<?> b() {
         return this.b;
      }

      public abstract void a(ur var1, C var2);

      public abstract C b(ur var1);
   }
}
