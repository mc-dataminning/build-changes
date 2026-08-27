import javax.annotation.Nullable;

public abstract class eyb extends exr {
   protected final eqp<?>[] c;
   @Nullable
   private esf l;
   protected ete k;

   public eyb(exz $$0, eqq $$1, tf $$2, eqp<?>[] $$3) {
      super($$0, $$1, $$2);
      this.c = $$3;
   }

   @Override
   protected void aE_() {
      this.k = new ete(this.f, this.g, this.h, 32, this.h - 32, 25);
      this.k.a(this.c);
      this.e(this.k);
      this.g();
      this.l = this.k.b(this.b.an());
      if (this.l != null) {
         this.l.i = this.f.aV().a();
      }
   }

   protected void g() {
      this.d(esh.a(te.d, $$0 -> this.f.a(this.a)).a(this.g / 2 - 100, this.h - 27, 200, 20).a());
   }

   @Override
   public void a(erw $$0, int $$1, int $$2, float $$3) {
      this.a($$0, this.k, $$1, $$2, $$3);
   }

   @Override
   public void b(erw $$0, int $$1, int $$2, float $$3) {
      this.b($$0);
   }

   public void l() {
      if (this.l instanceof eso) {
         ((eso)this.l).a(this.b.an().c());
      }
   }
}
