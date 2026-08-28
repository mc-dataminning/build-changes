public class fjk extends hhs {
   private static final xk a = xk.c("mco.client.incompatible.title").b(-65536);
   private static final xk b = xk.b(ab.b().c()).b(-65536);
   private static final xk c = xk.a("mco.client.unsupported.snapshot.version", b);
   private static final xk C = xk.a("mco.client.outdated.stable.version", b);
   private final ftr D;
   private final frn E = new frn(this);

   public fjk(ftr $$0) {
      super(a);
      this.D = $$0;
   }

   @Override
   public void aT_() {
      this.E.a(a, this.p);
      this.E.c(new fot(this.E(), this.p).b(true));
      this.E.b(fny.a(xj.k, $$0 -> this.aP_()).a(200).a());
      this.E.a($$1 -> {
         fnw var10000 = this.c($$1);
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

   private xk E() {
      return ab.b().g() ? C : c;
   }
}
