import com.mojang.serialization.MapCodec;

public class dmm extends dfb {
   public static final MapCodec<dmm> n = b(dmm::new);

   @Override
   public MapCodec<dmm> a() {
      return n;
   }

   public dmm(dra.d $$0) {
      super($$0, () -> doi.c);
   }

   @Override
   public dog a(io $$0, drb $$1) {
      return new dpz($$0, $$1);
   }

   @Override
   protected avo<akm> c() {
      return avr.i.b(avr.ai);
   }

   @Override
   protected boolean e_(drb $$0) {
      return true;
   }

   @Override
   protected int a(drb $$0, dad $$1, io $$2, it $$3) {
      return ayd.a(don.a($$1, $$2), 0, 15);
   }

   @Override
   protected int b(drb $$0, dad $$1, io $$2, it $$3) {
      return $$3 == it.b ? $$0.b($$1, $$2, $$3) : 0;
   }
}
