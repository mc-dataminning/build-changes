public class fia extends fjo {
   private static final int a = 90;
   private final wg b;
   private fei c = fei.a;
   private final Runnable d;
   private final wg o;
   private final boolean p;

   public fia(Runnable $$0, wg $$1, wg $$2) {
      this($$0, $$1, $$2, wf.k, true);
   }

   public fia(Runnable $$0, wg $$1, wg $$2, wg $$3, boolean $$4) {
      super($$1);
      this.d = $$0;
      this.b = $$2;
      this.o = $$3;
      this.p = $$4;
   }

   @Override
   public wg i() {
      return wf.a(super.i(), this.b);
   }

   @Override
   protected void aN_() {
      super.aN_();
      this.c = fei.a(this.m, this.b, this.k - 50);
      int $$0 = this.c.a() * 9;
      int $$1 = axk.a(90 + $$0 + 12, this.l / 6 + 96, this.l - 24);
      int $$2 = 150;
      this.c(fdp.a(this.o, $$0x -> this.d.run()).a((this.k - 150) / 2, $$1, 150, 20).a());
   }

   @Override
   public void a(fdc $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.m, this.i, this.k / 2, 70, 16777215);
      this.c.a($$0, this.k / 2, 90);
   }

   @Override
   public boolean aE_() {
      return this.p;
   }
}
