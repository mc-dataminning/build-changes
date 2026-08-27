public class fkv extends fld {
   protected final fld b;
   protected final fdi c;
   public final fir d = new fir(this);

   public fkv(fld $$0, fdi $$1, wu $$2) {
      super($$2);
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   protected void aM_() {
      this.m();
      this.h();
      this.d.a(this::c);
      this.c();
   }

   protected void m() {
      this.d.a(this.l, this.p);
   }

   protected void h() {
      this.d.b(ffe.a(wt.d, $$0 -> this.d()).a(200).a());
   }

   @Override
   protected void c() {
      this.d.a();
   }

   @Override
   public void j() {
      this.m.m.av();
   }

   @Override
   public void d() {
      this.m.a(this.b);
   }
}
