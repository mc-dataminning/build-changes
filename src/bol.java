import java.util.ArrayList;
import java.util.List;

public interface bol<S> {
   void a(int var1, boq<S> var2, Object var3);

   default void a(int $$0, Object $$1) {
      this.a($$0, boq.b(), $$1);
   }

   void a(int var1);

   public static class a<S> implements bol<S> {
      private final List<bom<S>> a = new ArrayList<>();
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
      public void a(int $$0, boq<S> $$1, Object $$2) {
         this.b($$0);
         if ($$0 == this.b) {
            this.a.add(new bom<>($$0, $$1, $$2));
         }
      }

      public List<bom<S>> a() {
         return this.a;
      }

      public int b() {
         return this.b;
      }
   }
}
