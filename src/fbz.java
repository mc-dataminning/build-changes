public class fbz extends fdm {
   private static final int a = 90;
   private final vg b;
   private eyk c = eyk.a;
   private final Runnable k;
   private final vg l;
   private final boolean m;

   public fbz(Runnable $$0, vg $$1, vg $$2) {
      this($$0, $$1, $$2, vf.k, true);
   }

   public fbz(Runnable $$0, vg $$1, vg $$2, vg $$3, boolean $$4) {
      super($$1);
      this.k = $$0;
      this.b = $$2;
      this.l = $$3;
      this.m = $$4;
   }

   @Override
   public vg i() {
      return vf.a(super.i(), this.b);
   }

   @Override
   protected void aP_() {
      super.aP_();
      this.c = eyk.a(this.i, this.b, this.g - 50);
      int $$0 = this.c.a() * 9;
      int $$1 = aup.a(90 + $$0 + 12, this.h / 6 + 96, this.h - 24);
      int $$2 = 150;
      this.d(exr.a(this.l, $$0x -> this.k.run()).a((this.g - 150) / 2, $$1, 150, 20).a());
   }

   @Override
   public void a(exe $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 70, 16777215);
      this.c.a($$0, this.g / 2, 90);
   }

   @Override
   public boolean aN_() {
      return this.m;
   }
}
