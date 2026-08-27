import javax.annotation.Nullable;

public abstract class exr extends euq {
   private final sw b;
   @Nullable
   private final sw c;
   private final sw k;
   @Nullable
   protected epk a;
   private epz l = epz.a;

   protected exr(sw $$0, sw $$1, sw $$2) {
      this($$0, $$1, null, $$2);
   }

   protected exr(sw $$0, sw $$1, @Nullable sw $$2, sw $$3) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
      this.k = $$3;
   }

   protected abstract void a(int var1);

   @Override
   protected void b() {
      super.b();
      this.l = epz.a(this.i, this.b, this.g - 100);
      int $$0 = (this.l.a() + 1) * this.l();
      if (this.c != null) {
         int $$1 = this.i.a(this.c);
         this.a = new epk(this.g / 2 - $$1 / 2 - 8, 76 + $$0, $$1 + 24, 20, this.c, false);
         this.d(this.a);
      }

      this.a($$0);
   }

   @Override
   public sw au_() {
      return this.k;
   }

   @Override
   public void a(eox $$0, int $$1, int $$2, float $$3) {
      this.a($$0);
      this.c($$0);
      int $$4 = this.g / 2 - this.l.b() / 2;
      this.l.b($$0, $$4, 70, this.l(), 16777215);
      super.a($$0, $$1, $$2, $$3);
   }

   protected void c(eox $$0) {
      $$0.b(this.i, this.e, 25, 30, 16777215);
   }

   protected int l() {
      return 9 * 2;
   }
}
