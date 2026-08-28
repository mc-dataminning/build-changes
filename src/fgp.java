public class fgp extends hep {
   private static final xi a = xi.c("mco.client.incompatible.title").b(-65536);
   private static final xi b = xi.b(ab.b().c()).b(-65536);
   private static final xi c = xi.a("mco.client.unsupported.snapshot.version", b);
   private static final xi B = xi.a("mco.client.outdated.stable.version", b);
   private final fra C;
   private final fow D = new fow(this);

   public fgp(fra $$0) {
      super(a);
      this.C = $$0;
   }

   @Override
   public void aR_() {
      this.D.a(a, this.p);
      this.D.c(new fmb(this.D(), this.p).b(true));
      this.D.b(flh.a(xh.k, $$0 -> this.d()).a(200).a());
      this.D.a($$1 -> {
         flf var10000 = this.c($$1);
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

   private xi D() {
      return ab.b().g() ? B : c;
   }
}
