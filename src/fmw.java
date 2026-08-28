public class fmw extends fne {
   protected final fne b;
   protected final ffk c;
   public final fks d = new fks(this);

   public fmw(fne $$0, ffk $$1, xp $$2) {
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
      this.d.b(fhf.a(xo.d, $$0 -> this.d()).a(200).a());
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
      for (fjb $$0 : this.aD_()) {
         if ($$0 instanceof fic $$1) {
            $$1.c();
         }
      }

      this.m.a(this.b);
   }
}
