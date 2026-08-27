public class fap extends fcc {
   private static final int a = 90;
   private final vb b;
   private exa c = exa.a;
   private final Runnable k;
   private final vb l;
   private final boolean m;

   public fap(Runnable $$0, vb $$1, vb $$2) {
      this($$0, $$1, $$2, va.k, true);
   }

   public fap(Runnable $$0, vb $$1, vb $$2, vb $$3, boolean $$4) {
      super($$1);
      this.k = $$0;
      this.b = $$2;
      this.l = $$3;
      this.m = $$4;
   }

   @Override
   public vb h() {
      return va.a(super.h(), this.b);
   }

   @Override
   protected void aP_() {
      super.aP_();
      this.c = exa.a(this.i, this.b, this.g - 50);
      int $$0 = this.c.a() * 9;
      int $$1 = aty.a(90 + $$0 + 12, this.h / 6 + 96, this.h - 24);
      int $$2 = 150;
      this.d(ewh.a(this.l, $$0x -> this.k.run()).a((this.g - 150) / 2, $$1, 150, 20).a());
   }

   @Override
   public void a(evw $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 70, 16777215);
      this.c.a($$0, this.g / 2, 90);
   }

   @Override
   public boolean aE_() {
      return this.m;
   }
}
