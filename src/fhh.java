import javax.annotation.Nullable;

public abstract class fhh extends fgx {
   protected final ezj<?>[] c;
   @Nullable
   private fbe l;
   protected fcd k;

   public fhh(fhf $$0, ezk $$1, vu $$2, ezj<?>[] $$3) {
      super($$0, $$1, $$2);
      this.c = $$3;
   }

   @Override
   protected void aO_() {
      this.k = this.c(new fcd(this.f, this.g, this.h - 64, 32, 25));
      this.k.a(this.c);
      this.j();
      this.l = this.k.b(this.b.aq());
      if (this.l != null) {
         this.l.j = this.f.aY().a();
      }
   }

   protected void j() {
      this.c(fbg.a(vt.d, $$0 -> this.f.a(this.a)).a(this.g / 2 - 100, this.h - 27, 200, 20).a());
   }

   @Override
   public void a(fat $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 20, 16777215);
   }

   @Override
   public void b(fat $$0, int $$1, int $$2, float $$3) {
      this.b($$0);
   }

   public void o() {
      if (this.l instanceof fbn) {
         ((fbn)this.l).a(this.b.aq().c());
      }
   }
}
