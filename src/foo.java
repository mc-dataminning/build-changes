public class foo extends hro {
   private static final xc a = xc.c("mco.client.incompatible.title").b(-65536);
   private static final xc b = xc.b(ac.b().c()).b(-65536);
   private static final xc c = xc.a("mco.client.unsupported.snapshot.version", b);
   private static final xc C = xc.a("mco.client.outdated.stable.version", b);
   private final gaf D;
   private final fyb E = new fyb(this);

   public foo(gaf $$0) {
      super(a);
      this.D = $$0;
   }

   @Override
   public void aS_() {
      this.E.a(a, this.p);
      this.E.c(new fvh(this.E(), this.p).b(true));
      this.E.b(fun.a(xb.k, $$0 -> this.aP_()).a(200).a());
      this.E.a($$1 -> {
         ful var10000 = this.c($$1);
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

   private xc E() {
      return ac.b().g() ? C : c;
   }
}
