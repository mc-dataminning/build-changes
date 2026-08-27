import javax.annotation.Nullable;

public abstract class eyg extends exx {
   protected final eqs<?>[] c;
   @Nullable
   private esi l;
   protected eth k;

   public eyg(eye $$0, eqt $$1, tl $$2, eqs<?>[] $$3) {
      super($$0, $$1, $$2);
      this.c = $$3;
   }

   @Override
   protected void aH_() {
      this.k = new eth(this.f, this.g, this.h, 32, this.h - 32, 25);
      this.k.a(this.c);
      this.e(this.k);
      this.f();
      this.l = this.k.b(this.b.ao());
      if (this.l != null) {
         this.l.i = this.f.aV().a();
      }
   }

   protected void f() {
      this.d(esk.a(tk.d, $$0 -> this.f.a(this.a)).a(this.g / 2 - 100, this.h - 27, 200, 20).a());
   }

   @Override
   public void a(erz $$0, int $$1, int $$2, float $$3) {
      this.a($$0, this.k, $$1, $$2, $$3);
   }

   @Override
   public void b(erz $$0, int $$1, int $$2, float $$3) {
      this.b($$0);
   }

   public void l() {
      if (this.l instanceof esr) {
         ((esr)this.l).a(this.b.ao().c());
      }
   }
}
