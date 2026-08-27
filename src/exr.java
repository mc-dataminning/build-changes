public class exr extends ezd {
   private static final int a = 90;
   private final ui b;
   private euc c = euc.a;
   private final Runnable k;
   private final ui l;
   private final boolean m;

   public exr(Runnable $$0, ui $$1, ui $$2) {
      this($$0, $$1, $$2, uh.k, true);
   }

   public exr(Runnable $$0, ui $$1, ui $$2, ui $$3, boolean $$4) {
      super($$1);
      this.k = $$0;
      this.b = $$2;
      this.l = $$3;
      this.m = $$4;
   }

   @Override
   public ui h() {
      return uh.a(super.h(), this.b);
   }

   @Override
   protected void aM_() {
      super.aM_();
      this.c = euc.a(this.i, this.b, this.g - 50);
      int $$0 = this.c.a() * 9;
      int $$1 = asy.a(90 + $$0 + 12, this.h / 6 + 96, this.h - 24);
      int $$2 = 150;
      this.d(etj.a(this.l, $$0x -> this.k.run()).a((this.g - 150) / 2, $$1, 150, 20).a());
   }

   @Override
   public void a(esy $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 70, 16777215);
      this.c.a($$0, this.g / 2, 90);
   }

   @Override
   public boolean aB_() {
      return this.m;
   }
}
