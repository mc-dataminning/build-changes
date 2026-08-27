import javax.annotation.Nullable;

public abstract class fgp extends fdm {
   private final vg b;
   @Nullable
   private final vg c;
   private final vg k;
   @Nullable
   protected ext a;
   private eyk l = eyk.a;

   protected fgp(vg $$0, vg $$1, vg $$2) {
      this($$0, $$1, null, $$2);
   }

   protected fgp(vg $$0, vg $$1, @Nullable vg $$2, vg $$3) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
      this.k = $$3;
   }

   protected abstract void a(int var1);

   @Override
   protected void aP_() {
      super.aP_();
      this.l = eyk.a(this.i, this.b, this.g - 100);
      int $$0 = (this.l.a() + 1) * this.o();
      if (this.c != null) {
         int $$1 = this.i.a(this.c);
         this.a = ext.a(this.c, this.i).a(this.g / 2 - $$1 / 2 - 8, 76 + $$0).a();
         this.d(this.a);
      }

      this.a($$0);
   }

   @Override
   public vg i() {
      return this.k;
   }

   @Override
   public void a(exe $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.c($$0);
      int $$4 = this.g / 2 - this.l.b() / 2;
      this.l.b($$0, $$4, 70, this.o(), 16777215);
   }

   protected void c(exe $$0) {
      $$0.b(this.i, this.e, 25, 30, 16777215);
   }

   protected int o() {
      return 9 * 2;
   }
}
