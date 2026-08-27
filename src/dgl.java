import com.mojang.serialization.MapCodec;

public class dgl extends dac implements daf {
   public static final MapCodec<dgl> a = b(dgl::new);

   @Override
   public MapCodec<dgl> a() {
      return a;
   }

   public dgl(dna.d $$0) {
      super($$0);
   }

   @Override
   public boolean b(cxe $$0, ib $$1, dnb $$2) {
      return $$0.a_($$1.d()).i();
   }

   @Override
   public boolean a(cxb $$0, axd $$1, ib $$2, dnb $$3) {
      return true;
   }

   @Override
   public void a(apf $$0, axd $$1, ib $$2, dnb $$3) {
      $$0.b($$2.d(), dae.sG.o());
   }

   @Override
   public ib a(ib $$0) {
      return $$0.d();
   }
}
