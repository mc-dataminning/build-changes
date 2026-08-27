public class fij extends fjx {
   private static final int a = 90;
   private final wi b;
   private fer c = fer.a;
   private final Runnable d;
   private final wi o;
   private final boolean p;

   public fij(Runnable $$0, wi $$1, wi $$2) {
      this($$0, $$1, $$2, wh.k, true);
   }

   public fij(Runnable $$0, wi $$1, wi $$2, wi $$3, boolean $$4) {
      super($$1);
      this.d = $$0;
      this.b = $$2;
      this.o = $$3;
      this.p = $$4;
   }

   @Override
   public wi i() {
      return wh.a(super.i(), this.b);
   }

   @Override
   protected void aM_() {
      super.aM_();
      this.c = fer.a(this.m, this.b, this.k - 50);
      int $$0 = this.c.a() * 9;
      int $$1 = axm.a(90 + $$0 + 12, this.l / 6 + 96, this.l - 24);
      int $$2 = 150;
      this.c(fdy.a(this.o, $$0x -> this.d.run()).a((this.k - 150) / 2, $$1, 150, 20).a());
   }

   @Override
   public void a(fdl $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.m, this.i, this.k / 2, 70, 16777215);
      this.c.a($$0, this.k / 2, 90);
   }

   @Override
   public boolean aD_() {
      return this.p;
   }
}
