public class fkl extends fkt {
   protected final fkt b;
   protected final fcy c;
   public final fih d = new fih(this);

   public fkl(fkt $$0, fcy $$1, ws $$2) {
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
      this.d.b(feu.a(wr.d, $$0 -> this.d()).a(200).a());
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
