import javax.annotation.Nullable;

public abstract class fcv extends fcl {
   protected final evd<?>[] c;
   @Nullable
   private eww l;
   protected exv k;

   public fcv(fct $$0, eve $$1, vd $$2, evd<?>[] $$3) {
      super($$0, $$1, $$2);
      this.c = $$3;
   }

   @Override
   protected void aN_() {
      this.k = this.d(new exv(this.f, this.g, this.h - 64, 32, 25));
      this.k.a(this.c);
      this.i();
      this.l = this.k.b(this.b.ap());
      if (this.l != null) {
         this.l.j = this.f.aU().a();
      }
   }

   protected void i() {
      this.d(ewy.a(vc.d, $$0 -> this.f.a(this.a)).a(this.g / 2 - 100, this.h - 27, 200, 20).a());
   }

   @Override
   public void a(ewm $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 20, 16777215);
   }

   @Override
   public void b(ewm $$0, int $$1, int $$2, float $$3) {
      this.b($$0);
   }

   public void n() {
      if (this.l instanceof exf) {
         ((exf)this.l).a(this.b.ap().c());
      }
   }
}
