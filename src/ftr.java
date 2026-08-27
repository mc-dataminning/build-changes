public class ftr extends fsn<cce> {
   private static final aer a = new aer("textures/entity/llama/spit.png");
   private final ffi<cce> f;

   public ftr(fso.a $$0) {
      super($$0);
      this.f = new ffi<>($$0.a(fhm.at));
   }

   public void a(cce $$0, float $$1, float $$2, elg $$3, fnl $$4, int $$5) {
      $$3.a();
      $$3.a(0.0F, 0.15F, 0.0F);
      $$3.a(a.d.rotationDegrees(arp.i($$2, $$0.N, $$0.dA()) - 90.0F));
      $$3.a(a.f.rotationDegrees(arp.i($$2, $$0.O, $$0.dC())));
      this.f.a($$0, $$2, 0.0F, -0.1F, 0.0F, 0.0F);
      elk $$6 = $$4.getBuffer(this.f.a(a));
      this.f.a($$3, $$6, $$5, fyc.d, 1.0F, 1.0F, 1.0F, 1.0F);
      $$3.b();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public aer a(cce $$0) {
      return a;
   }
}
