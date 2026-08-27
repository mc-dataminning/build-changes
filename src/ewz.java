public class ewz extends eym {
   private static final int a = 90;
   private final tn b;
   private etl c = etl.a;
   private final Runnable k;
   private final tn l;
   private final boolean m;

   public ewz(Runnable $$0, tn $$1, tn $$2) {
      this($$0, $$1, $$2, tm.k, true);
   }

   public ewz(Runnable $$0, tn $$1, tn $$2, tn $$3, boolean $$4) {
      super($$1);
      this.k = $$0;
      this.b = $$2;
      this.l = $$3;
      this.m = $$4;
   }

   @Override
   public tn g() {
      return tm.a(super.g(), this.b);
   }

   @Override
   protected void aH_() {
      super.aH_();
      this.c = etl.a(this.i, this.b, this.g - 50);
      int $$0 = this.c.a() * 9;
      int $$1 = ary.a(90 + $$0 + 12, this.h / 6 + 96, this.h - 24);
      int $$2 = 150;
      this.d(ess.a(this.l, $$0x -> this.k.run()).a((this.g - 150) / 2, $$1, 150, 20).a());
   }

   @Override
   public void a(esh $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 70, 16777215);
      this.c.a($$0, this.g / 2, 90);
   }

   @Override
   public boolean ay_() {
      return this.m;
   }
}
