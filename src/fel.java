import javax.annotation.Nullable;

public class fel extends ffe {
   private static final int a = 80;
   private static final int b = 120;
   private static final int c = 360;
   @Nullable
   private final vq k;
   private final vq l;
   private final Runnable m;
   @Nullable
   private faa n;
   private ezh o;
   private int p;

   public static fel a(vq $$0, vq $$1, Runnable $$2) {
      return new fel($$0, null, $$1, $$2, 0);
   }

   public static fel a(vq $$0, vq $$1, vq $$2, Runnable $$3) {
      return new fel($$0, $$1, $$2, $$3, 20);
   }

   protected fel(vq $$0, @Nullable vq $$1, vq $$2, Runnable $$3, int $$4) {
      super($$0);
      this.k = $$1;
      this.l = $$2;
      this.m = $$3;
      this.p = $$4;
   }

   @Override
   protected void aQ_() {
      super.aQ_();
      if (this.k != null) {
         this.n = faa.a(this.i, this.k, 360);
      }

      int $$0 = 150;
      int $$1 = 20;
      int $$2 = this.n != null ? this.n.a() : 1;
      int $$3 = Math.max($$2, 5) * 9;
      int $$4 = Math.min(120 + $$3, this.h - 40);
      this.o = this.d(ezh.a(this.l, $$0x -> this.d()).a((this.g - 150) / 2, $$4, 150, 20).a());
   }

   @Override
   public void e() {
      if (this.p > 0) {
         this.p--;
      }

      this.o.j = this.p == 0;
   }

   @Override
   public void a(eyu $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 80, 16777215);
      if (this.n == null) {
         String $$4 = fep.a(ac.b());
         $$0.a(this.i, $$4, this.g / 2, 120, 10526880);
      } else {
         this.n.a($$0, this.g / 2, 120);
      }
   }

   @Override
   public boolean aO_() {
      return this.n != null && this.o.j;
   }

   @Override
   public void d() {
      this.m.run();
   }

   @Override
   public vq i() {
      return vp.a(this.e, this.k != null ? this.k : vp.a);
   }
}
