import javax.annotation.Nullable;

public class fiv extends fjo {
   private static final int a = 80;
   private static final int b = 120;
   private static final int c = 360;
   @Nullable
   private final wg d;
   private final wg o;
   private final Runnable p;
   @Nullable
   private fei q;
   private fdp r;
   private int s;

   public static fiv a(wg $$0, wg $$1, Runnable $$2) {
      return new fiv($$0, null, $$1, $$2, 0);
   }

   public static fiv a(wg $$0, wg $$1, wg $$2, Runnable $$3) {
      return new fiv($$0, $$1, $$2, $$3, 20);
   }

   protected fiv(wg $$0, @Nullable wg $$1, wg $$2, Runnable $$3, int $$4) {
      super($$0);
      this.d = $$1;
      this.o = $$2;
      this.p = $$3;
      this.s = $$4;
   }

   @Override
   protected void aN_() {
      super.aN_();
      if (this.d != null) {
         this.q = fei.a(this.m, this.d, 360);
      }

      int $$0 = 150;
      int $$1 = 20;
      int $$2 = this.q != null ? this.q.a() : 1;
      int $$3 = Math.max($$2, 5) * 9;
      int $$4 = Math.min(120 + $$3, this.l - 40);
      this.r = this.c(fdp.a(this.o, $$0x -> this.d()).a((this.k - 150) / 2, $$4, 150, 20).a());
   }

   @Override
   public void e() {
      if (this.s > 0) {
         this.s--;
      }

      this.r.j = this.s == 0;
   }

   @Override
   public void a(fdc $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.m, this.i, this.k / 2, 80, 16777215);
      if (this.q == null) {
         String $$4 = fiz.a(ac.b());
         $$0.a(this.m, $$4, this.k / 2, 120, 10526880);
      } else {
         this.q.a($$0, this.k / 2, 120);
      }
   }

   @Override
   public boolean aE_() {
      return this.q != null && this.r.j;
   }

   @Override
   public void d() {
      this.p.run();
   }

   @Override
   public wg i() {
      return wf.a(this.i, this.d != null ? this.d : wf.a);
   }
}
