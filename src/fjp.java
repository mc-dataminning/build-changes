public class fjp extends fjx {
   protected final fjx b;
   protected final fcc c;
   public final fhl d = new fhl(this);

   public fjp(fjx $$0, fcc $$1, wi $$2) {
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
      this.d.a(this.i, this.m);
   }

   protected void h() {
      this.d.b(fdy.a(wh.d, $$0 -> this.d()).a(200).a());
   }

   @Override
   protected void c() {
      this.d.a();
   }

   @Override
   public void j() {
      this.j.m.av();
   }

   @Override
   public void d() {
      this.j.a(this.b);
   }
}
