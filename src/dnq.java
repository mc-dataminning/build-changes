import java.util.List;

public abstract class dnq {
   private static final int a = 5;
   private int b;
   private double c;

   protected abstract void a(czu var1, im var2, dpy var3);

   protected abstract void b(czu var1, im var2, dpy var3);

   protected abstract void a(czu var1, im var2, dpy var3, int var4, int var5);

   protected abstract boolean a(ckl var1);

   public void a(ckl $$0, czu $$1, im $$2, dpy $$3) {
      int $$4 = this.b++;
      if ($$4 == 0) {
         this.a($$1, $$2, $$3);
         $$1.a($$0, dur.k, $$2);
         d($$1, $$2, $$3);
      }

      this.a($$1, $$2, $$3, $$4, this.b);
      this.c = Math.max($$0.gA(), this.c);
   }

   public void b(ckl $$0, czu $$1, im $$2, dpy $$3) {
      int $$4 = this.b--;
      if (this.b == 0) {
         this.b($$1, $$2, $$3);
         $$1.a($$0, dur.j, $$2);
         this.c = 0.0;
      }

      this.a($$1, $$2, $$3, $$4, this.b);
   }

   private List<ckl> a(czu $$0, im $$1) {
      double $$2 = this.c + 4.0;
      eta $$3 = new eta($$1).g($$2);
      return $$0.a(duf.a(ckl.class), $$3, this::a);
   }

   public void c(czu $$0, im $$1, dpy $$2) {
      List<ckl> $$3 = this.a($$0, $$1);
      this.c = 0.0;

      for (ckl $$4 : $$3) {
         this.c = Math.max($$4.gA(), this.c);
      }

      int $$5 = $$3.size();
      int $$6 = this.b;
      if ($$6 != $$5) {
         boolean $$7 = $$5 != 0;
         boolean $$8 = $$6 != 0;
         if ($$7 && !$$8) {
            this.a($$0, $$1, $$2);
            $$0.a(null, dur.k, $$1);
         } else if (!$$7) {
            this.b($$0, $$1, $$2);
            $$0.a(null, dur.j, $$1);
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

   private static void d(czu $$0, im $$1, dpy $$2) {
      $$0.a($$1, $$2.b(), 5);
   }
}
