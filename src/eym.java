import javax.annotation.Nullable;

public abstract class eym extends eyc {
   protected final eqy<?>[] c;
   @Nullable
   private eso l;
   protected etn k;

   public eym(eyk $$0, eqz $$1, tl $$2, eqy<?>[] $$3) {
      super($$0, $$1, $$2);
      this.c = $$3;
   }

   @Override
   protected void aI_() {
      this.k = new etn(this.f, this.g, this.h, 32, this.h - 32, 25);
      this.k.a(this.c);
      this.e(this.k);
      this.f();
      this.l = this.k.b(this.b.ao());
      if (this.l != null) {
         this.l.i = this.f.aV().a();
      }
   }

   protected void f() {
      this.d(esq.a(tk.d, $$0 -> this.f.a(this.a)).a(this.g / 2 - 100, this.h - 27, 200, 20).a());
   }

   @Override
   public void a(esf $$0, int $$1, int $$2, float $$3) {
      this.a($$0, this.k, $$1, $$2, $$3);
   }

   @Override
   public void b(esf $$0, int $$1, int $$2, float $$3) {
      this.b($$0);
   }

   public void l() {
      if (this.l instanceof esx) {
         ((esx)this.l).a(this.b.ao().c());
      }
   }
}
