public class eyx extends grl {
   private static final wg a = wg.c("mco.client.incompatible.title").b(-65536);
   private static final wg b = wg.b(aa.b().c()).b(-65536);
   private static final wg c = wg.a("mco.client.unsupported.snapshot.version", b);
   private static final wg y = wg.a("mco.client.outdated.stable.version", b);
   private final fjo z;
   private final fhc A = new fhc(this);

   public eyx(fjo $$0) {
      super(a);
      this.z = $$0;
   }

   @Override
   public void aN_() {
      this.A.a(a, this.m);
      this.A.c(new fej(this.C(), this.m).b(true));
      this.A.b(fdp.a(wf.k, $$0 -> this.d()).a(200).a());
      this.A.a($$1 -> {
         fdn var10000 = this.c($$1);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.A.a();
   }

   @Override
   public void d() {
      this.j.a(this.z);
   }

   private wg C() {
      return aa.b().g() ? y : c;
   }
}
