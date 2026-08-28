import javax.annotation.Nullable;

public class fnp extends fod {
   private static final int a = 80;
   private static final int b = 120;
   private static final int c = 360;
   @Nullable
   private final wz r;
   private final wz s;
   private final Runnable u;
   @Nullable
   private fjf v;
   private fim w;
   private int x;

   public static fnp a(wz $$0, wz $$1, Runnable $$2) {
      return new fnp($$0, null, $$1, $$2, 0);
   }

   public static fnp a(wz $$0, wz $$1, wz $$2, Runnable $$3) {
      return new fnp($$0, $$1, $$2, $$3, 20);
   }

   protected fnp(wz $$0, @Nullable wz $$1, wz $$2, Runnable $$3, int $$4) {
      super($$0);
      this.r = $$1;
      this.s = $$2;
      this.u = $$3;
      this.x = $$4;
   }

   @Override
   protected void aT_() {
      super.aT_();
      if (this.r != null) {
         this.v = fjf.a(this.o, this.r, 360);
      }

      int $$0 = 150;
      int $$1 = 20;
      int $$2 = this.v != null ? this.v.a() : 1;
      int $$3 = Math.max($$2, 5) * 9;
      int $$4 = Math.min(120 + $$3, this.n - 40);
      this.w = this.c(fim.a(this.s, $$0x -> this.d()).a((this.m - 150) / 2, $$4, 150, 20).a());
   }

   @Override
   public void e() {
      if (this.x > 0) {
         this.x--;
      }

      this.w.j = this.x == 0;
   }

   @Override
   public void a(fhz $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.o, this.k, this.m / 2, 80, 16777215);
      if (this.v == null) {
         String $$4 = fns.a(ad.c());
         $$0.a(this.o, $$4, this.m / 2, 120, 10526880);
      } else {
         this.v.a($$0, this.m / 2, 120);
      }
   }

   @Override
   public boolean aJ_() {
      return this.v != null && this.w.j;
   }

   @Override
   public void d() {
      this.u.run();
   }

   @Override
   public wz i() {
      return wy.a(this.k, this.r != null ? this.r : wy.a);
   }
}
