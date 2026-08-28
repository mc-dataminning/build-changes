public class ftd extends fuk {
   private static final int a = 90;
   private final wo b;
   private fpl c = fpl.a;
   private final Runnable d;
   private final wo s;
   private final boolean u;

   public ftd(Runnable $$0, wo $$1, wo $$2) {
      this($$0, $$1, $$2, wn.k, true);
   }

   public ftd(Runnable $$0, wo $$1, wo $$2, wo $$3, boolean $$4) {
      super($$1);
      this.d = $$0;
      this.b = $$2;
      this.s = $$3;
      this.u = $$4;
   }

   @Override
   public wo i() {
      return wn.a(super.i(), this.b);
   }

   @Override
   protected void aR_() {
      super.aR_();
      this.c = fpl.a(this.p, this.b, this.n - 50);
      int $$0 = this.c.a() * 9;
      int $$1 = ayz.a(90 + $$0 + 12, this.o / 6 + 96, this.o - 24);
      int $$2 = 150;
      this.c(fos.a(this.s, $$0x -> this.d.run()).a((this.n - 150) / 2, $$1, 150, 20).a());
   }

   @Override
   public void a(fod $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.l, this.n / 2, 70, 16777215);
      this.c.a($$0, this.n / 2, 90);
   }

   @Override
   public boolean aG_() {
      return this.u;
   }
}
