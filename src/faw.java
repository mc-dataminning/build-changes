import javax.annotation.Nullable;

public abstract class faw extends fam {
   protected final etg<?>[] c;
   @Nullable
   private eux l;
   protected evw k;

   public faw(fau $$0, eth $$1, ur $$2, etg<?>[] $$3) {
      super($$0, $$1, $$2);
      this.c = $$3;
   }

   @Override
   protected void aP_() {
      this.k = new evw(this.f, this.g, this.h, 32, this.h - 32, 25);
      this.k.a(this.c);
      this.e(this.k);
      this.f();
      this.l = this.k.b(this.b.ap());
      if (this.l != null) {
         this.l.i = this.f.aU().a();
      }
   }

   protected void f() {
      this.d(euz.a(uq.d, $$0 -> this.f.a(this.a)).a(this.g / 2 - 100, this.h - 27, 200, 20).a());
   }

   @Override
   public void a(euo $$0, int $$1, int $$2, float $$3) {
      this.a($$0, this.k, $$1, $$2, $$3);
   }

   @Override
   public void b(euo $$0, int $$1, int $$2, float $$3) {
      this.b($$0);
   }

   public void l() {
      if (this.l instanceof evg) {
         ((evg)this.l).a(this.b.ap().c());
      }
   }
}
