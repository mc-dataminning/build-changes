import javax.annotation.Nullable;

public class fpp extends fqd {
   private static final int a = 80;
   private static final int b = 120;
   private static final int c = 360;
   @Nullable
   private final xd d;
   private final xd s;
   private final Runnable u;
   @Nullable
   private fld v;
   private fkk w;
   private int x;

   public static fpp a(xd $$0, xd $$1, Runnable $$2) {
      return new fpp($$0, null, $$1, $$2, 0);
   }

   public static fpp a(xd $$0, xd $$1, xd $$2, Runnable $$3) {
      return new fpp($$0, $$1, $$2, $$3, 20);
   }

   protected fpp(xd $$0, @Nullable xd $$1, xd $$2, Runnable $$3, int $$4) {
      super($$0);
      this.d = $$1;
      this.s = $$2;
      this.u = $$3;
      this.x = $$4;
   }

   @Override
   protected void aR_() {
      super.aR_();
      if (this.d != null) {
         this.v = fld.a(this.p, this.d, 360);
      }

      int $$0 = 150;
      int $$1 = 20;
      int $$2 = this.v != null ? this.v.a() : 1;
      int $$3 = Math.max($$2, 5) * 9;
      int $$4 = Math.min(120 + $$3, this.o - 40);
      this.w = this.c(fkk.a(this.s, $$0x -> this.d()).a((this.n - 150) / 2, $$4, 150, 20).a());
   }

   @Override
   public void e() {
      if (this.x > 0) {
         this.x--;
      }

      this.w.j = this.x == 0;
   }

   @Override
   public void a(fjx $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.l, this.n / 2, 80, 16777215);
      if (this.v == null) {
         String $$4 = fps.a(ad.c());
         $$0.a(this.p, $$4, this.n / 2, 120, 10526880);
      } else {
         this.v.a($$0, this.n / 2, 120);
      }
   }

   @Override
   public boolean aH_() {
      return this.v != null && this.w.j;
   }

   @Override
   public void d() {
      this.u.run();
   }

   @Override
   public xd i() {
      return xc.a(this.l, this.d != null ? this.d : xc.a);
   }
}
