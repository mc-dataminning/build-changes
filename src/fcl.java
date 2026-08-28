public class fcl extends gve {
   private static final xo a = xo.c("mco.client.incompatible.title").b(-65536);
   private static final xo b = xo.b(aa.b().c()).b(-65536);
   private static final xo c = xo.a("mco.client.unsupported.snapshot.version", b);
   private static final xo B = xo.a("mco.client.outdated.stable.version", b);
   private final fnb C;
   private final fkp D = new fkp(this);

   public fcl(fnb $$0) {
      super(a);
      this.C = $$0;
   }

   @Override
   public void aM_() {
      this.D.a(a, this.p);
      this.D.c(new fhw(this.D(), this.p).b(true));
      this.D.b(fhc.a(xn.k, $$0 -> this.d()).a(200).a());
      this.D.a($$1 -> {
         fha var10000 = this.c($$1);
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

   private xo D() {
      return aa.b().g() ? B : c;
   }
}
