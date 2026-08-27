import com.mojang.serialization.MapCodec;

public class dez extends dac implements daf {
   public static final MapCodec<dez> a = b(dez::new);

   @Override
   public MapCodec<dez> a() {
      return a;
   }

   public dez(dna.d $$0) {
      super($$0);
   }

   @Override
   public boolean b(cxe $$0, ib $$1, dnb $$2) {
      return $$0.a_($$1.c()).i();
   }

   @Override
   public boolean a(cxb $$0, axd $$1, ib $$2, dnb $$3) {
      return true;
   }

   @Override
   public void a(apf $$0, axd $$1, ib $$2, dnb $$3) {
      $$0.H_().c(kj.ax).flatMap($$0x -> $$0x.b(qo.n)).ifPresent($$3x -> ((dvf)$$3x.a()).a($$0, $$0.l().g(), $$1, $$2.c()));
   }

   @Override
   public daf.a at_() {
      return daf.a.a;
   }
}
