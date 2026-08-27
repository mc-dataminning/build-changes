public class feu extends fgh {
   private static final int a = 90;
   private final vs b;
   private fbd c = fbd.a;
   private final Runnable k;
   private final vs l;
   private final boolean m;

   public feu(Runnable $$0, vs $$1, vs $$2) {
      this($$0, $$1, $$2, vr.k, true);
   }

   public feu(Runnable $$0, vs $$1, vs $$2, vs $$3, boolean $$4) {
      super($$1);
      this.k = $$0;
      this.b = $$2;
      this.l = $$3;
      this.m = $$4;
   }

   @Override
   public vs i() {
      return vr.a(super.i(), this.b);
   }

   @Override
   protected void aP_() {
      super.aP_();
      this.c = fbd.a(this.i, this.b, this.g - 50);
      int $$0 = this.c.a() * 9;
      int $$1 = awm.a(90 + $$0 + 12, this.h / 6 + 96, this.h - 24);
      int $$2 = 150;
      this.c(fak.a(this.l, $$0x -> this.k.run()).a((this.g - 150) / 2, $$1, 150, 20).a());
   }

   @Override
   public void a(ezx $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 70, 16777215);
      this.c.a($$0, this.g / 2, 90);
   }

   @Override
   public boolean aN_() {
      return this.m;
   }
}
