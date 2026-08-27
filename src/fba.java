import javax.annotation.Nullable;

public abstract class fba extends exz {
   private final tf b;
   @Nullable
   private final tf c;
   private final tf k;
   @Nullable
   protected esj a;
   private eta l = eta.a;

   protected fba(tf $$0, tf $$1, tf $$2) {
      this($$0, $$1, null, $$2);
   }

   protected fba(tf $$0, tf $$1, @Nullable tf $$2, tf $$3) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
      this.k = $$3;
   }

   protected abstract void a(int var1);

   @Override
   protected void aE_() {
      super.aE_();
      this.l = eta.a(this.i, this.b, this.g - 100);
      int $$0 = (this.l.a() + 1) * this.l();
      if (this.c != null) {
         int $$1 = this.i.a(this.c);
         this.a = new esj(this.g / 2 - $$1 / 2 - 8, 76 + $$0, $$1 + 24, 20, this.c, false);
         this.d(this.a);
      }

      this.a($$0);
   }

   @Override
   public tf e() {
      return this.k;
   }

   @Override
   public void a(erw $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.c($$0);
      int $$4 = this.g / 2 - this.l.b() / 2;
      this.l.b($$0, $$4, 70, this.l(), 16777215);
   }

   protected void c(erw $$0) {
      $$0.b(this.i, this.e, 25, 30, 16777215);
   }

   protected int l() {
      return 9 * 2;
   }
}
