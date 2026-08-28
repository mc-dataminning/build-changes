public class fol extends fpt {
   private static final int a = 90;
   private final xd b;
   private fkt c = fkt.a;
   private final Runnable d;
   private final xd s;
   private final boolean u;

   public fol(Runnable $$0, xd $$1, xd $$2) {
      this($$0, $$1, $$2, xc.k, true);
   }

   public fol(Runnable $$0, xd $$1, xd $$2, xd $$3, boolean $$4) {
      super($$1);
      this.d = $$0;
      this.b = $$2;
      this.s = $$3;
      this.u = $$4;
   }

   @Override
   public xd i() {
      return xc.a(super.i(), this.b);
   }

   @Override
   protected void aT_() {
      super.aT_();
      this.c = fkt.a(this.p, this.b, this.n - 50);
      int $$0 = this.c.a() * 9;
      int $$1 = azc.a(90 + $$0 + 12, this.o / 6 + 96, this.o - 24);
      int $$2 = 150;
      this.c(fka.a(this.s, $$0x -> this.d.run()).a((this.n - 150) / 2, $$1, 150, 20).a());
   }

   @Override
   public void a(fjn $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.l, this.n / 2, 70, 16777215);
      this.c.a($$0, this.n / 2, 90);
   }

   @Override
   public boolean aJ_() {
      return this.u;
   }
}
