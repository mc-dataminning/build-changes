public class ewm extends exz {
   private static final int a = 90;
   private final tf b;
   private eta c = eta.a;
   private final Runnable k;
   private final tf l;
   private final boolean m;

   public ewm(Runnable $$0, tf $$1, tf $$2) {
      this($$0, $$1, $$2, te.k, true);
   }

   public ewm(Runnable $$0, tf $$1, tf $$2, tf $$3, boolean $$4) {
      super($$1);
      this.k = $$0;
      this.b = $$2;
      this.l = $$3;
      this.m = $$4;
   }

   @Override
   public tf e() {
      return te.a(super.e(), this.b);
   }

   @Override
   protected void aE_() {
      super.aE_();
      this.c = eta.a(this.i, this.b, this.g - 50);
      int $$0 = this.c.a() * 9;
      int $$1 = arp.a(90 + $$0 + 12, this.h / 6 + 96, this.h - 24);
      int $$2 = 150;
      this.d(esh.a(this.l, $$0x -> this.k.run()).a((this.g - 150) / 2, $$1, 150, 20).a());
   }

   @Override
   public void a(erw $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 70, 16777215);
      this.c.a($$0, this.g / 2, 90);
   }

   @Override
   public boolean aA_() {
      return this.m;
   }
}
