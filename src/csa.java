public class csa extends bwz {
   private final crz b;

   public csa(crz $$0) {
      this.b = $$0;
   }

   @Override
   public daa a(bxf $$0, daa $$1) {
      return $$0 == bxf.a ? this.b.gj().b($$1) : super.a($$0, $$1);
   }

   @Override
   public daa a(bxf $$0) {
      return $$0 == bxf.a ? this.b.gj().g() : super.a($$0);
   }

   @Override
   public boolean a() {
      return this.b.gj().g().f() && super.a();
   }
}
