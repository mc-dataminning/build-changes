public class fbg extends fct {
   private static final int a = 90;
   private final vd b;
   private exr c = exr.a;
   private final Runnable k;
   private final vd l;
   private final boolean m;

   public fbg(Runnable $$0, vd $$1, vd $$2) {
      this($$0, $$1, $$2, vc.k, true);
   }

   public fbg(Runnable $$0, vd $$1, vd $$2, vd $$3, boolean $$4) {
      super($$1);
      this.k = $$0;
      this.b = $$2;
      this.l = $$3;
      this.m = $$4;
   }

   @Override
   public vd h() {
      return vc.a(super.h(), this.b);
   }

   @Override
   protected void aN_() {
      super.aN_();
      this.c = exr.a(this.i, this.b, this.g - 50);
      int $$0 = this.c.a() * 9;
      int $$1 = aui.a(90 + $$0 + 12, this.h / 6 + 96, this.h - 24);
      int $$2 = 150;
      this.d(ewy.a(this.l, $$0x -> this.k.run()).a((this.g - 150) / 2, $$1, 150, 20).a());
   }

   @Override
   public void a(ewm $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 70, 16777215);
      this.c.a($$0, this.g / 2, 90);
   }

   @Override
   public boolean aL_() {
      return this.m;
   }
}
