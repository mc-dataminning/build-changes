public class ffi extends hct {
   private static final xd a = xd.c("mco.client.incompatible.title").b(-65536);
   private static final xd b = xd.b(ab.b().c()).b(-65536);
   private static final xd c = xd.a("mco.client.unsupported.snapshot.version", b);
   private static final xd B = xd.a("mco.client.outdated.stable.version", b);
   private final fpt C;
   private final fno D = new fno(this);

   public ffi(fpt $$0) {
      super(a);
      this.C = $$0;
   }

   @Override
   public void aT_() {
      this.D.a(a, this.p);
      this.D.c(new fku(this.D(), this.p).b(true));
      this.D.b(fka.a(xc.k, $$0 -> this.d()).a(200).a());
      this.D.a($$1 -> {
         fjy var10000 = this.c($$1);
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

   private xd D() {
      return ab.b().g() ? B : c;
   }
}
