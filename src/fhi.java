public class fhi extends hff {
   private static final xl a = xl.c("mco.client.incompatible.title").b(-65536);
   private static final xl b = xl.b(ab.b().c()).b(-65536);
   private static final xl c = xl.a("mco.client.unsupported.snapshot.version", b);
   private static final xl B = xl.a("mco.client.outdated.stable.version", b);
   private final frp C;
   private final fpl D = new fpl(this);

   public fhi(frp $$0) {
      super(a);
      this.C = $$0;
   }

   @Override
   public void aS_() {
      this.D.a(a, this.p);
      this.D.c(new fmq(this.D(), this.p).b(true));
      this.D.b(flw.a(xk.k, $$0 -> this.aP_()).a(200).a());
      this.D.a($$1 -> {
         flu var10000 = this.c($$1);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.D.a();
   }

   @Override
   public void aP_() {
      this.m.a(this.C);
   }

   private xl D() {
      return ab.b().g() ? B : c;
   }
}
