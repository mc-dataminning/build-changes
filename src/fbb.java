import javax.annotation.Nullable;

public abstract class fbb extends far {
   protected final etl<?>[] c;
   @Nullable
   private evc l;
   protected ewb k;

   public fbb(faz $$0, etm $$1, uv $$2, etl<?>[] $$3) {
      super($$0, $$1, $$2);
      this.c = $$3;
   }

   @Override
   protected void aQ_() {
      this.k = new ewb(this.f, this.g, this.h, 32, this.h - 32, 25);
      this.k.a(this.c);
      this.e(this.k);
      this.f();
      this.l = this.k.b(this.b.ap());
      if (this.l != null) {
         this.l.i = this.f.aU().a();
      }
   }

   protected void f() {
      this.d(eve.a(uu.d, $$0 -> this.f.a(this.a)).a(this.g / 2 - 100, this.h - 27, 200, 20).a());
   }

   @Override
   public void a(eut $$0, int $$1, int $$2, float $$3) {
      this.a($$0, this.k, $$1, $$2, $$3);
   }

   @Override
   public void b(eut $$0, int $$1, int $$2, float $$3) {
      this.b($$0);
   }

   public void l() {
      if (this.l instanceof evl) {
         ((evl)this.l).a(this.b.ap().c());
      }
   }
}
