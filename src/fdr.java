public class fdr extends gxb {
   private static final xe a = xe.c("mco.client.incompatible.title").b(-65536);
   private static final xe b = xe.b(ab.b().c()).b(-65536);
   private static final xe c = xe.a("mco.client.unsupported.snapshot.version", b);
   private static final xe B = xe.a("mco.client.outdated.stable.version", b);
   private final fon C;
   private final fma D = new fma(this);

   public fdr(fon $$0) {
      super(a);
      this.C = $$0;
   }

   @Override
   public void aN_() {
      this.D.a(a, this.p);
      this.D.c(new fjh(this.C(), this.p).b(true));
      this.D.b(fin.a(xd.k, $$0 -> this.d()).a(200).a());
      this.D.a($$1 -> {
         fil var10000 = this.c($$1);
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

   private xe C() {
      return ab.b().g() ? B : c;
   }
}
