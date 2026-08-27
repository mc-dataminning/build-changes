public class ezg extends gru {
   private static final wi a = wi.c("mco.client.incompatible.title").b(-65536);
   private static final wi b = wi.b(aa.b().c()).b(-65536);
   private static final wi c = wi.a("mco.client.unsupported.snapshot.version", b);
   private static final wi y = wi.a("mco.client.outdated.stable.version", b);
   private final fjx z;
   private final fhl A = new fhl(this);

   public ezg(fjx $$0) {
      super(a);
      this.z = $$0;
   }

   @Override
   public void aM_() {
      this.A.a(a, this.m);
      this.A.c(new fes(this.C(), this.m).b(true));
      this.A.b(fdy.a(wh.k, $$0 -> this.d()).a(200).a());
      this.A.a($$1 -> {
         fdw var10000 = this.c($$1);
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

   private wi C() {
      return aa.b().g() ? y : c;
   }
}
