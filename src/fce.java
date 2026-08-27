import javax.annotation.Nullable;

public abstract class fce extends fbu {
   protected final eun<?>[] c;
   @Nullable
   private ewf l;
   protected exe k;

   public fce(fcc $$0, euo $$1, vb $$2, eun<?>[] $$3) {
      super($$0, $$1, $$2);
      this.c = $$3;
   }

   @Override
   protected void aP_() {
      this.k = new exe(this.f, this.g, this.h, 32, this.h - 32, 25);
      this.k.a(this.c);
      this.e(this.k);
      this.f();
      this.l = this.k.b(this.b.ap());
      if (this.l != null) {
         this.l.i = this.f.aU().a();
      }
   }

   protected void f() {
      this.d(ewh.a(va.d, $$0 -> this.f.a(this.a)).a(this.g / 2 - 100, this.h - 27, 200, 20).a());
   }

   @Override
   public void a(evw $$0, int $$1, int $$2, float $$3) {
      this.a($$0, this.k, $$1, $$2, $$3);
   }

   @Override
   public void b(evw $$0, int $$1, int $$2, float $$3) {
      this.b($$0);
   }

   public void l() {
      if (this.l instanceof ewo) {
         ((ewo)this.l).a(this.b.ap().c());
      }
   }
}
