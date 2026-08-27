import javax.annotation.Nullable;

public abstract class eyo extends eye {
   protected final era<?>[] c;
   @Nullable
   private esq l;
   protected etp k;

   public eyo(eym $$0, erb $$1, tn $$2, era<?>[] $$3) {
      super($$0, $$1, $$2);
      this.c = $$3;
   }

   @Override
   protected void aH_() {
      this.k = new etp(this.f, this.g, this.h, 32, this.h - 32, 25);
      this.k.a(this.c);
      this.e(this.k);
      this.f();
      this.l = this.k.b(this.b.ao());
      if (this.l != null) {
         this.l.i = this.f.aV().a();
      }
   }

   protected void f() {
      this.d(ess.a(tm.d, $$0 -> this.f.a(this.a)).a(this.g / 2 - 100, this.h - 27, 200, 20).a());
   }

   @Override
   public void a(esh $$0, int $$1, int $$2, float $$3) {
      this.a($$0, this.k, $$1, $$2, $$3);
   }

   @Override
   public void b(esh $$0, int $$1, int $$2, float $$3) {
      this.b($$0);
   }

   public void l() {
      if (this.l instanceof esz) {
         ((esz)this.l).a(this.b.ao().c());
      }
   }
}
