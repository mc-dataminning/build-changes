import javax.annotation.Nullable;

public class fje extends fjx {
   private static final int a = 80;
   private static final int b = 120;
   private static final int c = 360;
   @Nullable
   private final wi d;
   private final wi o;
   private final Runnable p;
   @Nullable
   private fer q;
   private fdy r;
   private int s;

   public static fje a(wi $$0, wi $$1, Runnable $$2) {
      return new fje($$0, null, $$1, $$2, 0);
   }

   public static fje a(wi $$0, wi $$1, wi $$2, Runnable $$3) {
      return new fje($$0, $$1, $$2, $$3, 20);
   }

   protected fje(wi $$0, @Nullable wi $$1, wi $$2, Runnable $$3, int $$4) {
      super($$0);
      this.d = $$1;
      this.o = $$2;
      this.p = $$3;
      this.s = $$4;
   }

   @Override
   protected void aM_() {
      super.aM_();
      if (this.d != null) {
         this.q = fer.a(this.m, this.d, 360);
      }

      int $$0 = 150;
      int $$1 = 20;
      int $$2 = this.q != null ? this.q.a() : 1;
      int $$3 = Math.max($$2, 5) * 9;
      int $$4 = Math.min(120 + $$3, this.l - 40);
      this.r = this.c(fdy.a(this.o, $$0x -> this.d()).a((this.k - 150) / 2, $$4, 150, 20).a());
   }

   @Override
   public void e() {
      if (this.s > 0) {
         this.s--;
      }

      this.r.j = this.s == 0;
   }

   @Override
   public void a(fdl $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.m, this.i, this.k / 2, 80, 16777215);
      if (this.q == null) {
         String $$4 = fji.a(ac.b());
         $$0.a(this.m, $$4, this.k / 2, 120, 10526880);
      } else {
         this.q.a($$0, this.k / 2, 120);
      }
   }

   @Override
   public boolean aD_() {
      return this.q != null && this.r.j;
   }

   @Override
   public void d() {
      this.p.run();
   }

   @Override
   public wi i() {
      return wh.a(this.i, this.d != null ? this.d : wh.a);
   }
}
