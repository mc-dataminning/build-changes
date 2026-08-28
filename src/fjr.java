public class fjr extends hhw {
   private static final xv a = xv.c("mco.client.incompatible.title").b(-65536);
   private static final xv b = xv.b(ab.b().c()).b(-65536);
   private static final xv c = xv.a("mco.client.unsupported.snapshot.version", b);
   private static final xv C = xv.a("mco.client.outdated.stable.version", b);
   private final fty D;
   private final fru E = new fru(this);

   public fjr(fty $$0) {
      super(a);
      this.D = $$0;
   }

   @Override
   public void aT_() {
      this.E.a(a, this.p);
      this.E.c(new fpa(this.E(), this.p).b(true));
      this.E.b(fof.a(xu.k, $$0 -> this.aP_()).a(200).a());
      this.E.a($$1 -> {
         fod var10000 = this.c($$1);
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
