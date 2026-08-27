import com.mojang.serialization.MapCodec;

public class czx extends cva implements cvd {
   public static final MapCodec<czx> a = b(czx::new);

   @Override
   public MapCodec<czx> a() {
      return a;
   }

   public czx(dhh.d $$0) {
      super($$0);
   }

   @Override
   public boolean b(csd $$0, ht $$1, dhi $$2) {
      return $$0.a_($$1.c()).i();
   }

   @Override
   public boolean a(csa $$0, ats $$1, ht $$2, dhi $$3) {
      return true;
   }

   @Override
   public void a(ame $$0, ats $$1, ht $$2, dhi $$3) {
      $$0.H_().c(jz.au).flatMap($$0x -> $$0x.b(pt.n)).ifPresent($$3x -> ((dpi)$$3x.a()).a($$0, $$0.k().g(), $$1, $$2.c()));
   }
}
