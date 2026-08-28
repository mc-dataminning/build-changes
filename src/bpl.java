import java.util.ArrayList;
import java.util.List;

public interface bpl<S> {
   void a(int var1, bpq<S> var2, Object var3);

   default void a(int $$0, Object $$1) {
      this.a($$0, bpq.b(), $$1);
   }

   void a(int var1);

   public static class a<S> implements bpl<S> {
      private final List<bpm<S>> a = new ArrayList<>();
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
      public void a(int $$0, bpq<S> $$1, Object $$2) {
         this.b($$0);
         if ($$0 == this.b) {
            this.a.add(new bpm<>($$0, $$1, $$2));
         }
      }

      public List<bpm<S>> a() {
         return this.a;
      }

      public int b() {
         return this.b;
      }
   }
}
