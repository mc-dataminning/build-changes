import java.util.ArrayList;
import java.util.List;

public interface bmj<S> {
   void a(int var1, bmo<S> var2, Object var3);

   default void a(int $$0, Object $$1) {
      this.a($$0, bmo.b(), $$1);
   }

   void a(int var1);

   public static class a<S> implements bmj<S> {
      private final List<bmk<S>> a = new ArrayList<>();
      private int b = -1;

      private void b(int $$0) {
         if ($$0 > this.b) {
            this.b = $$0;
            this.a.clear();
         }
      }

      @Override
      public void a(int $$0) {
         this.b($$0);
      }

      @Override
      public void a(int $$0, bmo<S> $$1, Object $$2) {
         this.b($$0);
         if ($$0 == this.b) {
            this.a.add(new bmk<>($$0, $$1, $$2));
         }
      }

      public List<bmk<S>> a() {
         return this.a;
      }

      public int b() {
         return this.b;
      }
   }
}
