import java.util.ArrayList;
import java.util.List;

public interface bnt<S> {
   void a(int var1, bny<S> var2, Object var3);

   default void a(int $$0, Object $$1) {
      this.a($$0, bny.b(), $$1);
   }

   void a(int var1);

   public static class a<S> implements bnt<S> {
      private final List<bnu<S>> a = new ArrayList<>();
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
      public void a(int $$0, bny<S> $$1, Object $$2) {
         this.b($$0);
         if ($$0 == this.b) {
            this.a.add(new bnu<>($$0, $$1, $$2));
         }
      }

      public List<bnu<S>> a() {
         return this.a;
      }

      public int b() {
         return this.b;
      }
   }
}
