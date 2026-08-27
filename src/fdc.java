import javax.annotation.Nullable;

public abstract class fdc extends fcs {
   protected final evk<?>[] c;
   @Nullable
   private exd l;
   protected eyc k;

   public fdc(fda $$0, evl $$1, vf $$2, evk<?>[] $$3) {
      super($$0, $$1, $$2);
      this.c = $$3;
   }

   @Override
   protected void aN_() {
      this.k = this.d(new eyc(this.f, this.g, this.h - 64, 32, 25));
      this.k.a(this.c);
      this.i();
      this.l = this.k.b(this.b.ap());
      if (this.l != null) {
         this.l.j = this.f.aV().a();
      }
   }

   protected void i() {
      this.d(exf.a(ve.d, $$0 -> this.f.a(this.a)).a(this.g / 2 - 100, this.h - 27, 200, 20).a());
   }

   @Override
   public void a(ewt $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 20, 16777215);
   }

   @Override
   public void b(ewt $$0, int $$1, int $$2, float $$3) {
      this.b($$0);
   }

   public void n() {
      if (this.l instanceof exm) {
         ((exm)this.l).a(this.b.ap().c());
      }
   }
}
