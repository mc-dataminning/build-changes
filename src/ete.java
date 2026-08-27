public class ete extends euq {
   private static final int a = 90;
   private final sw b;
   private epz c = epz.a;
   private final Runnable k;
   private final sw l;
   private final boolean m;

   public ete(Runnable $$0, sw $$1, sw $$2) {
      this($$0, $$1, $$2, sv.k, true);
   }

   public ete(Runnable $$0, sw $$1, sw $$2, sw $$3, boolean $$4) {
      super($$1);
      this.k = $$0;
      this.b = $$2;
      this.l = $$3;
      this.m = $$4;
   }

   @Override
   public sw au_() {
      return sv.a(super.au_(), this.b);
   }

   @Override
   protected void b() {
      super.b();
      this.c = epz.a(this.i, this.b, this.g - 50);
      int $$0 = this.c.a() * 9;
      int $$1 = apa.a(90 + $$0 + 12, this.h / 6 + 96, this.h - 24);
      int $$2 = 150;
      this.d(epi.a(this.l, $$0x -> this.k.run()).a((this.g - 150) / 2, $$1, 150, 20).a());
   }

   @Override
   public void a(eox $$0, int $$1, int $$2, float $$3) {
      this.a($$0);
      $$0.a(this.i, this.e, this.g / 2, 70, 16777215);
      this.c.a($$0, this.g / 2, 90);
      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean av_() {
      return this.m;
   }
}
