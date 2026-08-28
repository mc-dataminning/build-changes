import javax.annotation.Nullable;

public class fmm extends fnf {
   private static final int a = 80;
   private static final int b = 120;
   private static final int c = 360;
   @Nullable
   private final xp d;
   private final xp r;
   private final Runnable s;
   @Nullable
   private fhz u;
   private fhg v;
   private int w;

   public static fmm a(xp $$0, xp $$1, Runnable $$2) {
      return new fmm($$0, null, $$1, $$2, 0);
   }

   public static fmm a(xp $$0, xp $$1, xp $$2, Runnable $$3) {
      return new fmm($$0, $$1, $$2, $$3, 20);
   }

   protected fmm(xp $$0, @Nullable xp $$1, xp $$2, Runnable $$3, int $$4) {
      super($$0);
      this.d = $$1;
      this.r = $$2;
      this.s = $$3;
      this.w = $$4;
   }

   @Override
   protected void aM_() {
      super.aM_();
      if (this.d != null) {
         this.u = fhz.a(this.p, this.d, 360);
      }

      int $$0 = 150;
      int $$1 = 20;
      int $$2 = this.u != null ? this.u.a() : 1;
      int $$3 = Math.max($$2, 5) * 9;
      int $$4 = Math.min(120 + $$3, this.o - 40);
      this.v = this.c(fhg.a(this.r, $$0x -> this.d()).a((this.n - 150) / 2, $$4, 150, 20).a());
   }

   @Override
   public void e() {
      if (this.w > 0) {
         this.w--;
      }

      this.v.j = this.w == 0;
   }

   @Override
   public void a(fgt $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.l, this.n / 2, 80, 16777215);
      if (this.u == null) {
         String $$4 = fmq.a(ac.c());
         $$0.a(this.p, $$4, this.n / 2, 120, 10526880);
      } else {
         this.u.a($$0, this.n / 2, 120);
      }
   }

   @Override
   public boolean aC_() {
      return this.u != null && this.v.j;
   }

   @Override
   public void d() {
      this.s.run();
   }

   @Override
   public xp i() {
      return xo.a(this.l, this.d != null ? this.d : xo.a);
   }
}
