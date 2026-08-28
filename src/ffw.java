public class ffw extends hdp {
   private static final xe a = xe.c("mco.client.incompatible.title").b(-65536);
   private static final xe b = xe.b(ab.b().c()).b(-65536);
   private static final xe c = xe.a("mco.client.unsupported.snapshot.version", b);
   private static final xe B = xe.a("mco.client.outdated.stable.version", b);
   private final fqh C;
   private final foc D = new foc(this);

   public ffw(fqh $$0) {
      super(a);
      this.C = $$0;
   }

   @Override
   public void aS_() {
      this.D.a(a, this.p);
      this.D.c(new fli(this.D(), this.p).b(true));
      this.D.b(fko.a(xd.k, $$0 -> this.d()).a(200).a());
      this.D.a($$1 -> {
         fkm var10000 = this.c($$1);
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

   private xe D() {
      return ab.b().g() ? B : c;
   }
}
