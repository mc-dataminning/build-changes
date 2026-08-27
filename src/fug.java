public class fug extends ftc<ccr> {
   private static final aez a = new aez("textures/entity/llama/spit.png");
   private final ffs<ccr> f;

   public fug(ftd.a $$0) {
      super($$0);
      this.f = new ffs<>($$0.a(fhw.at));
   }

   public void a(ccr $$0, float $$1, float $$2, elj $$3, foa $$4, int $$5) {
      $$3.a();
      $$3.a(0.0F, 0.15F, 0.0F);
      $$3.a(a.d.rotationDegrees(asb.i($$2, $$0.N, $$0.dB()) - 90.0F));
      $$3.a(a.f.rotationDegrees(asb.i($$2, $$0.O, $$0.dD())));
      this.f.a($$0, $$2, 0.0F, -0.1F, 0.0F, 0.0F);
      eln $$6 = $$4.getBuffer(this.f.a(a));
      this.f.a($$3, $$6, $$5, fyr.d, 1.0F, 1.0F, 1.0F, 1.0F);
      $$3.b();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public aez a(ccr $$0) {
      return a;
   }
}
