import javax.annotation.Nullable;

public abstract class fqf extends fnd {
   protected final fnd b;
   protected final ffr c;
   @Nullable
   protected fij q;
   public final fkz r = new fkz(this);

   public fqf(fnd $$0, ffr $$1, wu $$2) {
      super($$2);
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   protected void aO_() {
      this.G();
      this.aP_();
      this.E();
      this.r.a($$1 -> {
         fhk var10000 = this.c($$1);
      });
      this.c();
   }

   protected void G() {
      this.r.a(this.k, this.o);
   }

   protected void aP_() {
      this.q = this.r.c(new fij(this.l, this.m, this));
      this.m();
   }

   protected abstract void m();

   protected void E() {
      this.r.b(fhm.a(wt.d, $$0 -> this.d()).a(200).a());
   }

   @Override
   protected void c() {
      this.r.a();
      if (this.q != null) {
         this.q.a(this.m, this.r);
      }
   }

   @Override
   public void j() {
      this.l.m.av();
   }

   @Override
   public void d() {
      if (this.q != null) {
         this.q.c();
      }

      this.l.a(this.b);
   }
}
