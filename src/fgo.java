import javax.annotation.Nullable;

public class fgo extends fhh {
   private static final int a = 80;
   private static final int b = 120;
   private static final int c = 360;
   @Nullable
   private final vu k;
   private final vu l;
   private final Runnable m;
   @Nullable
   private fcb n;
   private fbi o;
   private int p;

   public static fgo a(vu $$0, vu $$1, Runnable $$2) {
      return new fgo($$0, null, $$1, $$2, 0);
   }

   public static fgo a(vu $$0, vu $$1, vu $$2, Runnable $$3) {
      return new fgo($$0, $$1, $$2, $$3, 20);
   }

   protected fgo(vu $$0, @Nullable vu $$1, vu $$2, Runnable $$3, int $$4) {
      super($$0);
      this.k = $$1;
      this.l = $$2;
      this.m = $$3;
      this.p = $$4;
   }

   @Override
   protected void aO_() {
      super.aO_();
      if (this.k != null) {
         this.n = fcb.a(this.i, this.k, 360);
      }

      int $$0 = 150;
      int $$1 = 20;
      int $$2 = this.n != null ? this.n.a() : 1;
      int $$3 = Math.max($$2, 5) * 9;
      int $$4 = Math.min(120 + $$3, this.h - 40);
      this.o = this.c(fbi.a(this.l, $$0x -> this.d()).a((this.g - 150) / 2, $$4, 150, 20).a());
   }

   @Override
   public void e() {
      if (this.p > 0) {
         this.p--;
      }

      this.o.j = this.p == 0;
   }

   @Override
   public void a(fav $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 80, 16777215);
      if (this.n == null) {
         String $$4 = fgs.a(ac.b());
         $$0.a(this.i, $$4, this.g / 2, 120, 10526880);
      } else {
         this.n.a($$0, this.g / 2, 120);
      }
   }

   @Override
   public boolean aM_() {
      return this.n != null && this.o.j;
   }

   @Override
   public void d() {
      this.m.run();
   }

   @Override
   public vu i() {
      return vt.a(this.e, this.k != null ? this.k : vt.a);
   }
}
