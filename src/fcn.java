public class fcn extends gvg {
   private static final xp a = xp.c("mco.client.incompatible.title").b(-65536);
   private static final xp b = xp.b(aa.b().c()).b(-65536);
   private static final xp c = xp.a("mco.client.unsupported.snapshot.version", b);
   private static final xp B = xp.a("mco.client.outdated.stable.version", b);
   private final fnd C;
   private final fkr D = new fkr(this);

   public fcn(fnd $$0) {
      super(a);
      this.C = $$0;
   }

   @Override
   public void aM_() {
      this.D.a(a, this.p);
      this.D.c(new fhy(this.E(), this.p).b(true));
      this.D.b(fhe.a(xo.k, $$0 -> this.d()).a(200).a());
      this.D.a($$1 -> {
         fhc var10000 = this.c($$1);
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

   private xp E() {
      return aa.b().g() ? B : c;
   }
}
