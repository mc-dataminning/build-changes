public class eud extends euh {
   private static final vf b = vf.c("mco.connect.connecting");
   private final gkl c;
   private final erh d;
   private final eri e;

   public eud(fda $$0, erh $$1, eri $$2) {
      this.d = $$1;
      this.e = $$2;
      this.c = new gkl($$0);
   }

   @Override
   public void run() {
      this.c.a(this.d, fpe.a(this.e.a));
   }

   @Override
   public void b() {
      super.b();
      this.c.a();
      evh.O().ac().i();
   }

   @Override
   public void c() {
      this.c.b();
   }

   @Override
   public vf a() {
      return b;
   }
}
