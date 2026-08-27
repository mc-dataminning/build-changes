import javax.annotation.Nullable;

public abstract class fdx extends fau {
   private final ur b;
   @Nullable
   private final ur c;
   private final ur k;
   @Nullable
   protected evb a;
   private evs l = evs.a;

   protected fdx(ur $$0, ur $$1, ur $$2) {
      this($$0, $$1, null, $$2);
   }

   protected fdx(ur $$0, ur $$1, @Nullable ur $$2, ur $$3) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
      this.k = $$3;
   }

   protected abstract void a(int var1);

   @Override
   protected void aP_() {
      super.aP_();
      this.l = evs.a(this.i, this.b, this.g - 100);
      int $$0 = (this.l.a() + 1) * this.l();
      if (this.c != null) {
         int $$1 = this.i.a(this.c);
         this.a = evb.a(this.c, this.i).a(this.g / 2 - $$1 / 2 - 8, 76 + $$0).a();
         this.d(this.a);
      }

      this.a($$0);
   }

   @Override
   public ur h() {
      return this.k;
   }

   @Override
   public void a(euo $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.c($$0);
      int $$4 = this.g / 2 - this.l.b() / 2;
      this.l.b($$0, $$4, 70, this.l(), 16777215);
   }

   protected void c(euo $$0) {
      $$0.b(this.i, this.e, 25, 30, 16777215);
   }

   protected int l() {
      return 9 * 2;
   }
}
