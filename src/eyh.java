import javax.annotation.Nullable;

public abstract class eyh extends exx {
   protected final eqt<?>[] c;
   @Nullable
   private esj l;
   protected eti k;

   public eyh(eyf $$0, equ $$1, ti $$2, eqt<?>[] $$3) {
      super($$0, $$1, $$2);
      this.c = $$3;
   }

   @Override
   protected void aD_() {
      this.k = new eti(this.f, this.g, this.h, 32, this.h - 32, 25);
      this.k.a(this.c);
      this.e(this.k);
      this.f();
      this.l = this.k.b(this.b.ao());
      if (this.l != null) {
         this.l.i = this.f.aV().a();
      }
   }

   protected void f() {
      this.d(esl.a(th.d, $$0 -> this.f.a(this.a)).a(this.g / 2 - 100, this.h - 27, 200, 20).a());
   }

   @Override
   public void a(esa $$0, int $$1, int $$2, float $$3) {
      this.a($$0, this.k, $$1, $$2, $$3);
   }

   @Override
   public void b(esa $$0, int $$1, int $$2, float $$3) {
      this.b($$0);
   }

   public void l() {
      if (this.l instanceof ess) {
         ((ess)this.l).a(this.b.ao().c());
      }
   }
}
