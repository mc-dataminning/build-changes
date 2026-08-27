public class fft extends fhh {
   private static final int a = 90;
   private final vu b;
   private fcb c = fcb.a;
   private final Runnable k;
   private final vu l;
   private final boolean m;

   public fft(Runnable $$0, vu $$1, vu $$2) {
      this($$0, $$1, $$2, vt.k, true);
   }

   public fft(Runnable $$0, vu $$1, vu $$2, vu $$3, boolean $$4) {
      super($$1);
      this.k = $$0;
      this.b = $$2;
      this.l = $$3;
      this.m = $$4;
   }

   @Override
   public vu i() {
      return vt.a(super.i(), this.b);
   }

   @Override
   protected void aO_() {
      super.aO_();
      this.c = fcb.a(this.i, this.b, this.g - 50);
      int $$0 = this.c.a() * 9;
      int $$1 = aww.a(90 + $$0 + 12, this.h / 6 + 96, this.h - 24);
      int $$2 = 150;
      this.c(fbi.a(this.l, $$0x -> this.k.run()).a((this.g - 150) / 2, $$1, 150, 20).a());
   }

   @Override
   public void a(fav $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 70, 16777215);
      this.c.a($$0, this.g / 2, 90);
   }

   @Override
   public boolean aM_() {
      return this.m;
   }
}
