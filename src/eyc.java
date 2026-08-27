import javax.annotation.Nullable;

public abstract class eyc extends exs {
   protected final eqo<?>[] c;
   @Nullable
   private ese l;
   protected etd k;

   public eyc(eya $$0, eqp $$1, tf $$2, eqo<?>[] $$3) {
      super($$0, $$1, $$2);
      this.c = $$3;
   }

   @Override
   protected void aC_() {
      this.k = new etd(this.f, this.g, this.h, 32, this.h - 32, 25);
      this.k.a(this.c);
      this.e(this.k);
      this.g();
      this.l = this.k.b(this.b.ao());
      if (this.l != null) {
         this.l.i = this.f.aV().a();
      }
   }

   protected void g() {
      this.d(esg.a(te.d, $$0 -> this.f.a(this.a)).a(this.g / 2 - 100, this.h - 27, 200, 20).a());
   }

   @Override
   public void a(erv $$0, int $$1, int $$2, float $$3) {
      this.a($$0, this.k, $$1, $$2, $$3);
   }

   @Override
   public void b(erv $$0, int $$1, int $$2, float $$3) {
      this.b($$0);
   }

   public void l() {
      if (this.l instanceof esn) {
         ((esn)this.l).a(this.b.ao().c());
      }
   }
}
