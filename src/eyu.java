public class eyu extends fah {
   private static final int a = 90;
   private final ur b;
   private evf c = evf.a;
   private final Runnable k;
   private final ur l;
   private final boolean m;

   public eyu(Runnable $$0, ur $$1, ur $$2) {
      this($$0, $$1, $$2, uq.k, true);
   }

   public eyu(Runnable $$0, ur $$1, ur $$2, ur $$3, boolean $$4) {
      super($$1);
      this.k = $$0;
      this.b = $$2;
      this.l = $$3;
      this.m = $$4;
   }

   @Override
   public ur h() {
      return uq.a(super.h(), this.b);
   }

   @Override
   protected void aO_() {
      super.aO_();
      this.c = evf.a(this.i, this.b, this.g - 50);
      int $$0 = this.c.a() * 9;
      int $$1 = ati.a(90 + $$0 + 12, this.h / 6 + 96, this.h - 24);
      int $$2 = 150;
      this.d(eum.a(this.l, $$0x -> this.k.run()).a((this.g - 150) / 2, $$1, 150, 20).a());
   }

   @Override
   public void a(eub $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 70, 16777215);
      this.c.a($$0, this.g / 2, 90);
   }

   @Override
   public boolean aD_() {
      return this.m;
   }
}
