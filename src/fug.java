public class fug extends ftg<byh> {
   private static final aew a = new aew("textures/entity/lead_knot.png");
   private final ffu<byh> f;

   public fug(fth.a $$0) {
      super($$0);
      this.f = new ffu<>($$0.a(fib.aq));
   }

   public void a(byh $$0, float $$1, float $$2, elp $$3, foe $$4, int $$5) {
      $$3.a();
      $$3.b(-1.0F, -1.0F, 1.0F);
      this.f.a($$0, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
      elt $$6 = $$4.getBuffer(this.f.a(a));
      this.f.a($$3, $$6, $$5, fyv.d, 1.0F, 1.0F, 1.0F, 1.0F);
      $$3.b();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public aew a(byh $$0) {
      return a;
   }
}
