public class ezm extends faz {
   private static final int a = 90;
   private final uv b;
   private evx c = evx.a;
   private final Runnable k;
   private final uv l;
   private final boolean m;

   public ezm(Runnable $$0, uv $$1, uv $$2) {
      this($$0, $$1, $$2, uu.k, true);
   }

   public ezm(Runnable $$0, uv $$1, uv $$2, uv $$3, boolean $$4) {
      super($$1);
      this.k = $$0;
      this.b = $$2;
      this.l = $$3;
      this.m = $$4;
   }

   @Override
   public uv h() {
      return uu.a(super.h(), this.b);
   }

   @Override
   protected void aQ_() {
      super.aQ_();
      this.c = evx.a(this.i, this.b, this.g - 50);
      int $$0 = this.c.a() * 9;
      int $$1 = atq.a(90 + $$0 + 12, this.h / 6 + 96, this.h - 24);
      int $$2 = 150;
      this.d(eve.a(this.l, $$0x -> this.k.run()).a((this.g - 150) / 2, $$1, 150, 20).a());
   }

   @Override
   public void a(eut $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 70, 16777215);
      this.c.a($$0, this.g / 2, 90);
   }

   @Override
   public boolean aF_() {
      return this.m;
   }
}
