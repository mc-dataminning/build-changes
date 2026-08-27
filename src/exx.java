import javax.annotation.Nullable;

public abstract class exx extends exn {
   protected final eqq<?>[] c;
   @Nullable
   private esg l;
   protected etf k;

   public exx(exv $$0, eqr $$1, te $$2, eqq<?>[] $$3) {
      super($$0, $$1, $$2);
      this.c = $$3;
   }

   @Override
   protected void aE_() {
      this.k = new etf(this.f, this.g, this.h, 32, this.h - 32, 25);
      this.k.a(this.c);
      this.e(this.k);
      this.g();
      this.l = this.k.b(this.b.an());
      if (this.l != null) {
         this.l.i = this.f.aU().a();
      }
   }

   protected void g() {
      this.d(esi.a(td.d, $$0 -> this.f.a(this.a)).a(this.g / 2 - 100, this.h - 27, 200, 20).a());
   }

   @Override
   public void a(erx $$0, int $$1, int $$2, float $$3) {
      this.a($$0, this.k, $$1, $$2, $$3);
   }

   @Override
   public void b(erx $$0, int $$1, int $$2, float $$3) {
      this.b($$0);
   }

   public void l() {
      if (this.l instanceof esp) {
         ((esp)this.l).a(this.b.an().c());
      }
   }
}
