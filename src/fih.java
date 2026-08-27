import javax.annotation.Nullable;

public abstract class fih extends ffe {
   private final vq b;
   @Nullable
   private final vq c;
   private final vq k;
   @Nullable
   protected ezj a;
   private faa l = faa.a;

   protected fih(vq $$0, vq $$1, vq $$2) {
      this($$0, $$1, null, $$2);
   }

   protected fih(vq $$0, vq $$1, @Nullable vq $$2, vq $$3) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
      this.k = $$3;
   }

   protected abstract void a(int var1);

   @Override
   protected void aQ_() {
      super.aQ_();
      this.l = faa.a(this.i, this.b, this.g - 100);
      int $$0 = (this.l.a() + 1) * this.o();
      if (this.c != null) {
         int $$1 = this.i.a(this.c);
         this.a = ezj.a(this.c, this.i).a(this.g / 2 - $$1 / 2 - 8, 76 + $$0).a();
         this.d(this.a);
      }

      this.a($$0);
   }

   @Override
   public vq i() {
      return this.k;
   }

   @Override
   public void a(eyu $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.c($$0);
      int $$4 = this.g / 2 - this.l.b() / 2;
      this.l.b($$0, $$4, 70, this.o(), 16777215);
   }

   protected void c(eyu $$0) {
      $$0.b(this.i, this.e, 25, 30, 16777215);
   }

   protected int o() {
      return 9 * 2;
   }
}
