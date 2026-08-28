public class fgh extends hee {
   private static final xh a = xh.c("mco.client.incompatible.title").b(-65536);
   private static final xh b = xh.b(ab.b().c()).b(-65536);
   private static final xh c = xh.a("mco.client.unsupported.snapshot.version", b);
   private static final xh B = xh.a("mco.client.outdated.stable.version", b);
   private final fqs C;
   private final fon D = new fon(this);

   public fgh(fqs $$0) {
      super(a);
      this.C = $$0;
   }

   @Override
   public void aS_() {
      this.D.a(a, this.p);
      this.D.c(new flt(this.D(), this.p).b(true));
      this.D.b(fkz.a(xg.k, $$0 -> this.d()).a(200).a());
      this.D.a($$1 -> {
         fkx var10000 = this.c($$1);
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

   private xh D() {
      return ab.b().g() ? B : c;
   }
}
