import java.util.ArrayList;
import java.util.List;

public interface bpw<S> {
   void a(int var1, bqc<S> var2, Object var3);

   default void a(int $$0, Object $$1) {
      this.a($$0, bqc.b(), $$1);
   }

   void a(int var1);

   public static class a<S> implements bpw<S> {
      private bpw.a.a<S>[] a = new bpw.a.a[16];
      private int b;
      private int c = -1;

      private void b(int $$0) {
         if ($$0 > this.c) {
            this.c = $$0;
            this.b = 0;
         }
      }

      @Override
      public void a(int $$0) {
         this.b($$0);
      }

      @Override
      public void a(int $$0, bqc<S> $$1, Object $$2) {
         this.b($$0);
         if ($$0 == this.c) {
            this.a($$1, $$2);
         }
      }

      private void a(bqc<S> $$0, Object $$1) {
         int $$2 = this.a.length;
         if (this.b >= $$2) {
            int $$3 = ag.a($$2, this.b + 1);
            bpw.a.a<S>[] $$4 = new bpw.a.a[$$3];
            System.arraycopy(this.a, 0, $$4, 0, $$2);
            this.a = $$4;
         }

         int $$5 = this.b++;
         bpw.a.a<S> $$6 = this.a[$$5];
         if ($$6 == null) {
            $$6 = new bpw.a.a<>();
            this.a[$$5] = $$6;
         }

         $$6.a = $$0;
         $$6.b = $$1;
      }

      public List<bpx<S>> a() {
         int $$0 = this.b;
         if ($$0 == 0) {
            return List.of();
         } else {
            List<bpx<S>> $$1 = new ArrayList<>($$0);

            for (int $$2 = 0; $$2 < $$0; $$2++) {
               bpw.a.a<S> $$3 = this.a[$$2];
               $$1.add(new bpx<>(this.c, $$3.a, $$3.b));
            }

            return $$1;
         }
      }

      public int b() {
         return this.c;
      }

      static class a<S> {
         bqc<S> a = bqc.b();
         Object b = "empty";
      }
   }

   public static class b<S> implements bpw<S> {
      @Override
      public void a(int $$0, bqc<S> $$1, Object $$2) {
      }

      @Override
      public void a(int $$0) {
      }
   }
}
