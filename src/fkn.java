public class fkn extends hne {
   private static final wv a = wv.c("mco.client.incompatible.title").b(-65536);
   private static final wv b = wv.b(ab.b().c()).b(-65536);
   private static final wv c = wv.a("mco.client.unsupported.snapshot.version", b);
   private static final wv C = wv.a("mco.client.outdated.stable.version", b);
   private final fwf D;
   private final fub E = new fub(this);

   public fkn(fwf $$0) {
      super(a);
      this.D = $$0;
   }

   @Override
   public void aN_() {
      this.E.a(a, this.p);
      this.E.c(new frh(this.E(), this.p).b(true));
      this.E.b(fqn.a(wu.k, $$0 -> this.aK_()).a(200).a());
      this.E.a($$1 -> {
         fql var10000 = this.c($$1);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.E.a();
   }

   @Override
   public void aK_() {
      this.m.a(this.D);
   }

   private wv E() {
      return ab.b().g() ? C : c;
   }
}
