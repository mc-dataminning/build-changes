import java.util.List;

public abstract class dzc {
   private static final int a = 5;
   private int b;
   private double c;

   protected abstract void a(dkj var1, iw var2, ebq var3);

   protected abstract void b(dkj var1, iw var2, ebq var3);

   protected abstract void a(dkj var1, iw var2, ebq var3, int var4, int var5);

   protected abstract boolean a(csi var1);

   public void a(csi $$0, dkj $$1, iw $$2, ebq $$3) {
      int $$4 = this.b++;
      if ($$4 == 0) {
         this.a($$1, $$2, $$3);
         $$1.a($$0, egq.k, $$2);
         d($$1, $$2, $$3);
      }

      this.a($$1, $$2, $$3, $$4, this.b);
      this.c = Math.max($$0.gL(), this.c);
   }

   public void b(csi $$0, dkj $$1, iw $$2, ebq $$3) {
      int $$4 = this.b--;
      if (this.b == 0) {
         this.b($$1, $$2, $$3);
         $$1.a($$0, egq.j, $$2);
         this.c = 0.0;
      }

      this.a($$1, $$2, $$3, $$4, this.b);
   }

   private List<csi> a(dkj $$0, iw $$1) {
      double $$2 = this.c + 4.0;
      ffx $$3 = new ffx($$1).g($$2);
      return $$0.a(egc.a(csi.class), $$3, this::a);
   }

   public void c(dkj $$0, iw $$1, ebq $$2) {
      List<csi> $$3 = this.a($$0, $$1);
      this.c = 0.0;

      for (csi $$4 : $$3) {
         this.c = Math.max($$4.gL(), this.c);
      }

      int $$5 = $$3.size();
      int $$6 = this.b;
      if ($$6 != $$5) {
         boolean $$7 = $$5 != 0;
         boolean $$8 = $$6 != 0;
         if ($$7 && !$$8) {
            this.a($$0, $$1, $$2);
            $$0.a(null, egq.k, $$1);
         } else if (!$$7) {
            this.b($$0, $$1, $$2);
            $$0.a(null, egq.j, $$1);
         }

         this.b = $$5;
      }

      this.a($$0, $$1, $$2, $$6, $$5);
      if ($$5 > 0) {
         d($$0, $$1, $$2);
      }
   }

   public int a() {
      return this.b;
   }

   private static void d(dkj $$0, iw $$1, ebq $$2) {
      $$0.a($$1, $$2.b(), 5);
   }
}
