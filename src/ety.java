import javax.annotation.Nullable;

public class ety extends euq {
   private static final int a = 80;
   private static final int b = 120;
   private static final int c = 360;
   @Nullable
   private final sw k;
   private final sw l;
   private final Runnable m;
   @Nullable
   private epz n;
   private epi o;
   private int p;

   public static ety a(sw $$0, sw $$1, Runnable $$2) {
      return new ety($$0, null, $$1, $$2, 0);
   }

   public static ety a(sw $$0, sw $$1, sw $$2, Runnable $$3) {
      return new ety($$0, $$1, $$2, $$3, 20);
   }

   protected ety(sw $$0, @Nullable sw $$1, sw $$2, Runnable $$3, int $$4) {
      super($$0);
      this.k = $$1;
      this.l = $$2;
      this.m = $$3;
      this.p = $$4;
   }

   @Override
   protected void b() {
      super.b();
      if (this.k != null) {
         this.n = epz.a(this.i, this.k, 360);
      }

      int $$0 = 150;
      int $$1 = 20;
      int $$2 = this.n != null ? this.n.a() : 1;
      int $$3 = Math.max($$2, 5) * 9;
      int $$4 = Math.min(120 + $$3, this.h - 40);
      this.o = this.d(epi.a(this.l, $$0x -> this.aw_()).a((this.g - 150) / 2, $$4, 150, 20).a());
   }

   @Override
   public void f() {
      if (this.p > 0) {
         this.p--;
      }

      this.o.r = this.p == 0;
   }

   @Override
   public void a(eox $$0, int $$1, int $$2, float $$3) {
      this.a($$0);
      $$0.a(this.i, this.e, this.g / 2, 80, 16777215);
      if (this.n == null) {
         String $$4 = euc.a(ac.b());
         $$0.a(this.i, $$4, this.g / 2, 120, 10526880);
      } else {
         this.n.a($$0, this.g / 2, 120);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean av_() {
      return this.n != null && this.o.r;
   }

   @Override
   public void aw_() {
      this.m.run();
   }

   @Override
   public sw au_() {
      return sv.a(this.e, this.k != null ? this.k : sv.a);
   }
}
