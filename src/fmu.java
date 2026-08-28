public class fmu extends fnc {
   protected final fnc b;
   protected final ffi c;
   public final fkq d = new fkq(this);

   public fmu(fnc $$0, ffi $$1, xo $$2) {
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
      this.d.b(fhd.a(xn.d, $$0 -> this.d()).a(200).a());
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
      for (fiz $$0 : this.aD_()) {
         if ($$0 instanceof fia $$1) {
            $$1.c();
         }
      }

      this.m.a(this.b);
   }
}
