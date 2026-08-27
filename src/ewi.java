public class ewi extends exv {
   private static final int a = 90;
   private final te b;
   private etb c = etb.a;
   private final Runnable k;
   private final te l;
   private final boolean m;

   public ewi(Runnable $$0, te $$1, te $$2) {
      this($$0, $$1, $$2, td.k, true);
   }

   public ewi(Runnable $$0, te $$1, te $$2, te $$3, boolean $$4) {
      super($$1);
      this.k = $$0;
      this.b = $$2;
      this.l = $$3;
      this.m = $$4;
   }

   @Override
   public te e() {
      return td.a(super.e(), this.b);
   }

   @Override
   protected void aE_() {
      super.aE_();
      this.c = etb.a(this.i, this.b, this.g - 50);
      int $$0 = this.c.a() * 9;
      int $$1 = aro.a(90 + $$0 + 12, this.h / 6 + 96, this.h - 24);
      int $$2 = 150;
      this.d(esi.a(this.l, $$0x -> this.k.run()).a((this.g - 150) / 2, $$1, 150, 20).a());
   }

   @Override
   public void a(erx $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 70, 16777215);
      this.c.a($$0, this.g / 2, 90);
   }

   @Override
   public boolean aA_() {
      return this.m;
   }
}
