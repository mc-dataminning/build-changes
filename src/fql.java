import javax.annotation.Nullable;

public abstract class fql extends fnj {
   protected final fnj b;
   protected final ffx c;
   @Nullable
   protected fip q;
   public final flf r = new flf(this);

   public fql(fnj $$0, ffx $$1, wu $$2) {
      super($$2);
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   protected void aP_() {
      this.G();
      this.aQ_();
      this.E();
      this.r.a($$1 -> {
         fhq var10000 = this.c($$1);
      });
      this.c();
   }

   protected void G() {
      this.r.a(this.k, this.o);
   }

   protected void aQ_() {
      this.q = this.r.c(new fip(this.l, this.m, this));
      this.m();
   }

   protected abstract void m();

   protected void E() {
      this.r.b(fhs.a(wt.d, $$0 -> this.d()).a(200).a());
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
