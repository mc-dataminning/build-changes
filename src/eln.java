@FunctionalInterface
public interface eln<T> {
   void handle(T var1, elp<T> var2, long var3);

   public abstract static class a<T, C extends eln<T>> {
      private final ahh a;
      private final Class<?> b;

      public a(ahh $$0, Class<?> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public ahh a() {
         return this.a;
      }

      public Class<?> b() {
         return this.b;
      }

      public abstract void a(so var1, C var2);

      public abstract C b(so var1);
   }
}
