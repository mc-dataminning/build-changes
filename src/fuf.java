public class fuf extends ftb<ccg> {
   private static final aeu a = new aeu("textures/entity/llama/spit.png");
   private final ffs<ccg> f;

   public fuf(ftc.a $$0) {
      super($$0);
      this.f = new ffs<>($$0.a(fhw.at));
   }

   public void a(ccg $$0, float $$1, float $$2, elk $$3, fnz $$4, int $$5) {
      $$3.a();
      $$3.a(0.0F, 0.15F, 0.0F);
      $$3.a(a.d.rotationDegrees(ars.i($$2, $$0.N, $$0.dA()) - 90.0F));
      $$3.a(a.f.rotationDegrees(ars.i($$2, $$0.O, $$0.dC())));
      this.f.a($$0, $$2, 0.0F, -0.1F, 0.0F, 0.0F);
      elo $$6 = $$4.getBuffer(this.f.a(a));
      this.f.a($$3, $$6, $$5, fyq.d, 1.0F, 1.0F, 1.0F, 1.0F);
      $$3.b();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public aeu a(ccg $$0) {
      return a;
   }
}
