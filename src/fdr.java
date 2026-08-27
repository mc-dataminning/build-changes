public class fdr extends ffe {
   private static final int a = 90;
   private final vq b;
   private faa c = faa.a;
   private final Runnable k;
   private final vq l;
   private final boolean m;

   public fdr(Runnable $$0, vq $$1, vq $$2) {
      this($$0, $$1, $$2, vp.k, true);
   }

   public fdr(Runnable $$0, vq $$1, vq $$2, vq $$3, boolean $$4) {
      super($$1);
      this.k = $$0;
      this.b = $$2;
      this.l = $$3;
      this.m = $$4;
   }

   @Override
   public vq i() {
      return vp.a(super.i(), this.b);
   }

   @Override
   protected void aQ_() {
      super.aQ_();
      this.c = faa.a(this.i, this.b, this.g - 50);
      int $$0 = this.c.a() * 9;
      int $$1 = awh.a(90 + $$0 + 12, this.h / 6 + 96, this.h - 24);
      int $$2 = 150;
      this.d(ezh.a(this.l, $$0x -> this.k.run()).a((this.g - 150) / 2, $$1, 150, 20).a());
   }

   @Override
   public void a(eyu $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 70, 16777215);
      this.c.a($$0, this.g / 2, 90);
   }

   @Override
   public boolean aO_() {
      return this.m;
   }
}
