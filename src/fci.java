public class fci extends gvb {
   private static final xl a = xl.c("mco.client.incompatible.title").b(-65536);
   private static final xl b = xl.b(aa.b().c()).b(-65536);
   private static final xl c = xl.a("mco.client.unsupported.snapshot.version", b);
   private static final xl B = xl.a("mco.client.outdated.stable.version", b);
   private final fmy C;
   private final fkm D = new fkm(this);

   public fci(fmy $$0) {
      super(a);
      this.C = $$0;
   }

   @Override
   public void aN_() {
      this.D.a(a, this.p);
      this.D.c(new fht(this.C(), this.p).b(true));
      this.D.b(fgz.a(xk.k, $$0 -> this.d()).a(200).a());
      this.D.a($$1 -> {
         fgx var10000 = this.c($$1);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.D.a();
   }

   @Override
   public void d() {
      this.m.a(this.C);
   }

   private xl C() {
      return aa.b().g() ? B : c;
   }
}
