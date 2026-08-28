public class fom extends hrm {
   private static final xa a = xa.c("mco.client.incompatible.title").b(-65536);
   private static final xa b = xa.b(ac.b().c()).b(-65536);
   private static final xa c = xa.a("mco.client.unsupported.snapshot.version", b);
   private static final xa C = xa.a("mco.client.outdated.stable.version", b);
   private final gad D;
   private final fxz E = new fxz(this);

   public fom(gad $$0) {
      super(a);
      this.D = $$0;
   }

   @Override
   public void aS_() {
      this.E.a(a, this.p);
      this.E.c(new fvf(this.E(), this.p).b(true));
      this.E.b(ful.a(wz.k, $$0 -> this.aP_()).a(200).a());
      this.E.a($$1 -> {
         fuj var10000 = this.c($$1);
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

   private xa E() {
      return ac.b().g() ? C : c;
   }
}
