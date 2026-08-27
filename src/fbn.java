import javax.annotation.Nullable;

public abstract class fbn extends eym {
   private final tn b;
   @Nullable
   private final tn c;
   private final tn k;
   @Nullable
   protected esu a;
   private etl l = etl.a;

   protected fbn(tn $$0, tn $$1, tn $$2) {
      this($$0, $$1, null, $$2);
   }

   protected fbn(tn $$0, tn $$1, @Nullable tn $$2, tn $$3) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
      this.k = $$3;
   }

   protected abstract void a(int var1);

   @Override
   protected void aH_() {
      super.aH_();
      this.l = etl.a(this.i, this.b, this.g - 100);
      int $$0 = (this.l.a() + 1) * this.l();
      if (this.c != null) {
         int $$1 = this.i.a(this.c);
         this.a = new esu(this.g / 2 - $$1 / 2 - 8, 76 + $$0, $$1 + 24, 20, this.c, false);
         this.d(this.a);
      }

      this.a($$0);
   }

   @Override
   public tn g() {
      return this.k;
   }

   @Override
   public void a(esh $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.c($$0);
      int $$4 = this.g / 2 - this.l.b() / 2;
      this.l.b($$0, $$4, 70, this.l(), 16777215);
   }

   protected void c(esh $$0) {
      $$0.b(this.i, this.e, 25, 30, 16777215);
   }

   protected int l() {
      return 9 * 2;
   }
}
