import javax.annotation.Nullable;

public class fmf extends fmy {
   private static final int a = 80;
   private static final int b = 120;
   private static final int c = 360;
   @Nullable
   private final xl d;
   private final xl r;
   private final Runnable s;
   @Nullable
   private fhs u;
   private fgz v;
   private int w;

   public static fmf a(xl $$0, xl $$1, Runnable $$2) {
      return new fmf($$0, null, $$1, $$2, 0);
   }

   public static fmf a(xl $$0, xl $$1, xl $$2, Runnable $$3) {
      return new fmf($$0, $$1, $$2, $$3, 20);
   }

   protected fmf(xl $$0, @Nullable xl $$1, xl $$2, Runnable $$3, int $$4) {
      super($$0);
      this.d = $$1;
      this.r = $$2;
      this.s = $$3;
      this.w = $$4;
   }

   @Override
   protected void aN_() {
      super.aN_();
      if (this.d != null) {
         this.u = fhs.a(this.p, this.d, 360);
      }

      int $$0 = 150;
      int $$1 = 20;
      int $$2 = this.u != null ? this.u.a() : 1;
      int $$3 = Math.max($$2, 5) * 9;
      int $$4 = Math.min(120 + $$3, this.o - 40);
      this.v = this.c(fgz.a(this.r, $$0x -> this.d()).a((this.n - 150) / 2, $$4, 150, 20).a());
   }

   @Override
   public void e() {
      if (this.w > 0) {
         this.w--;
      }

      this.v.j = this.w == 0;
   }

   @Override
   public void a(fgm $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.l, this.n / 2, 80, 16777215);
      if (this.u == null) {
         String $$4 = fmj.a(ac.c());
         $$0.a(this.p, $$4, this.n / 2, 120, 10526880);
      } else {
         this.u.a($$0, this.n / 2, 120);
      }
   }

   @Override
   public boolean aE_() {
      return this.u != null && this.v.j;
   }

   @Override
   public void d() {
      this.s.run();
   }

   @Override
   public xl i() {
      return xk.a(this.l, this.d != null ? this.d : xk.a);
   }
}
