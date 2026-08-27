public class fua extends fsw<ccd> {
   private static final aer a = new aer("textures/entity/llama/spit.png");
   private final ffn<ccd> f;

   public fua(fsx.a $$0) {
      super($$0);
      this.f = new ffn<>($$0.a(fhr.at));
   }

   public void a(ccd $$0, float $$1, float $$2, elf $$3, fnu $$4, int $$5) {
      $$3.a();
      $$3.a(0.0F, 0.15F, 0.0F);
      $$3.a(a.d.rotationDegrees(arp.i($$2, $$0.N, $$0.dA()) - 90.0F));
      $$3.a(a.f.rotationDegrees(arp.i($$2, $$0.O, $$0.dC())));
      this.f.a($$0, $$2, 0.0F, -0.1F, 0.0F, 0.0F);
      elj $$6 = $$4.getBuffer(this.f.a(a));
      this.f.a($$3, $$6, $$5, fyl.d, 1.0F, 1.0F, 1.0F, 1.0F);
      $$3.b();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public aer a(ccd $$0) {
      return a;
   }
}
