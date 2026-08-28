public class fjq extends hhv {
   private static final xv a = xv.c("mco.client.incompatible.title").b(-65536);
   private static final xv b = xv.b(ab.b().c()).b(-65536);
   private static final xv c = xv.a("mco.client.unsupported.snapshot.version", b);
   private static final xv C = xv.a("mco.client.outdated.stable.version", b);
   private final ftx D;
   private final frt E = new frt(this);

   public fjq(ftx $$0) {
      super(a);
      this.D = $$0;
   }

   @Override
   public void aT_() {
      this.E.a(a, this.p);
      this.E.c(new foz(this.E(), this.p).b(true));
      this.E.b(foe.a(xu.k, $$0 -> this.aP_()).a(200).a());
      this.E.a($$1 -> {
         foc var10000 = this.c($$1);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.E.a();
   }

   @Override
   public void aP_() {
      this.m.a(this.D);
   }

   private xv E() {
      return ab.b().g() ? C : c;
   }
}
