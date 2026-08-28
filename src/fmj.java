import javax.annotation.Nullable;

public class fmj extends fnc {
   private static final int a = 80;
   private static final int b = 120;
   private static final int c = 360;
   @Nullable
   private final xo d;
   private final xo r;
   private final Runnable s;
   @Nullable
   private fhw u;
   private fhd v;
   private int w;

   public static fmj a(xo $$0, xo $$1, Runnable $$2) {
      return new fmj($$0, null, $$1, $$2, 0);
   }

   public static fmj a(xo $$0, xo $$1, xo $$2, Runnable $$3) {
      return new fmj($$0, $$1, $$2, $$3, 20);
   }

   protected fmj(xo $$0, @Nullable xo $$1, xo $$2, Runnable $$3, int $$4) {
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
         this.u = fhw.a(this.p, this.d, 360);
      }

      int $$0 = 150;
      int $$1 = 20;
      int $$2 = this.u != null ? this.u.a() : 1;
      int $$3 = Math.max($$2, 5) * 9;
      int $$4 = Math.min(120 + $$3, this.o - 40);
      this.v = this.c(fhd.a(this.r, $$0x -> this.d()).a((this.n - 150) / 2, $$4, 150, 20).a());
   }

   @Override
   public void e() {
      if (this.w > 0) {
         this.w--;
      }

      this.v.j = this.w == 0;
   }

   @Override
   public void a(fgq $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.l, this.n / 2, 80, 16777215);
      if (this.u == null) {
         String $$4 = fmn.a(ac.c());
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
   public xo i() {
      return xn.a(this.l, this.d != null ? this.d : xn.a);
   }
}
