import java.util.ArrayList;
import java.util.List;

public interface bmh<S> {
   void a(int var1, bmm<S> var2, Object var3);

   default void a(int $$0, Object $$1) {
      this.a($$0, bmm.b(), $$1);
   }

   void a(int var1);

   public static class a<S> implements bmh<S> {
      private final List<bmi<S>> a = new ArrayList<>();
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
      public void a(int $$0, bmm<S> $$1, Object $$2) {
         this.b($$0);
         if ($$0 == this.b) {
            this.a.add(new bmi<>($$0, $$1, $$2));
         }
      }

      public List<bmi<S>> a() {
         return this.a;
      }

      public int b() {
         return this.b;
      }
   }
}
