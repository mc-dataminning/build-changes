public class fhp extends hfq {
   private static final xj a = xj.c("mco.client.incompatible.title").b(-65536);
   private static final xj b = xj.b(ab.b().c()).b(-65536);
   private static final xj c = xj.a("mco.client.unsupported.snapshot.version", b);
   private static final xj B = xj.a("mco.client.outdated.stable.version", b);
   private final frw C;
   private final fps D = new fps(this);

   public fhp(frw $$0) {
      super(a);
      this.C = $$0;
   }

   @Override
   public void aR_() {
      this.D.a(a, this.p);
      this.D.c(new fmx(this.F(), this.p).b(true));
      this.D.b(fmd.a(xi.k, $$0 -> this.aO_()).a(200).a());
      this.D.a($$1 -> {
         fmb var10000 = this.c($$1);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.D.a();
   }

   @Override
   public void aO_() {
      this.m.a(this.C);
   }

   private xj F() {
      return ab.b().g() ? B : c;
   }
}
