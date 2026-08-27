import javax.annotation.Nullable;

public abstract class fgc extends fcz {
   private final vf b;
   @Nullable
   private final vf c;
   private final vf k;
   @Nullable
   protected exg a;
   private exx l = exx.a;

   protected fgc(vf $$0, vf $$1, vf $$2) {
      this($$0, $$1, null, $$2);
   }

   protected fgc(vf $$0, vf $$1, @Nullable vf $$2, vf $$3) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
      this.k = $$3;
   }

   protected abstract void a(int var1);

   @Override
   protected void aN_() {
      super.aN_();
      this.l = exx.a(this.i, this.b, this.g - 100);
      int $$0 = (this.l.a() + 1) * this.n();
      if (this.c != null) {
         int $$1 = this.i.a(this.c);
         this.a = exg.a(this.c, this.i).a(this.g / 2 - $$1 / 2 - 8, 76 + $$0).a();
         this.d(this.a);
      }

      this.a($$0);
   }

   @Override
   public vf h() {
      return this.k;
   }

   @Override
   public void a(ews $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.c($$0);
      int $$4 = this.g / 2 - this.l.b() / 2;
      this.l.b($$0, $$4, 70, this.n(), 16777215);
   }

   protected void c(ews $$0) {
      $$0.b(this.i, this.e, 25, 30, 16777215);
   }

   protected int n() {
      return 9 * 2;
   }
}
