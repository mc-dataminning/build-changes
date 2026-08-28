public class fnz extends hrc {
   private static final xg a = xg.c("mco.client.incompatible.title").b(-65536);
   private static final xg b = xg.b(ac.b().c()).b(-65536);
   private static final xg c = xg.a("mco.client.unsupported.snapshot.version", b);
   private static final xg C = xg.a("mco.client.outdated.stable.version", b);
   private final fzq D;
   private final fxm E = new fxm(this);

   public fnz(fzq $$0) {
      super(a);
      this.D = $$0;
   }

   @Override
   public void aT_() {
      this.E.a(a, this.p);
      this.E.c(new fus(this.E(), this.p).b(true));
      this.E.b(fty.a(xf.k, $$0 -> this.aQ_()).a(200).a());
      this.E.a($$1 -> {
         ftw var10000 = this.c($$1);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.E.a();
   }

   @Override
   public void aQ_() {
      this.m.a(this.D);
   }

   private xg E() {
      return ac.b().g() ? C : c;
   }
}
