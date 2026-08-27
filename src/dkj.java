import com.mojang.serialization.MapCodec;

public class dkj extends deh {
   public static final MapCodec<dkj> a = b(dkj::new);
   protected static final float b = 6.0F;
   protected static final evd c = ddy.a(2.0, 0.0, 2.0, 14.0, 13.0, 14.0);

   @Override
   public MapCodec<dkj> a() {
      return a;
   }

   protected dkj(dra.d $$0) {
      super($$0);
   }

   @Override
   protected evd a(drb $$0, dad $$1, io $$2, eup $$3) {
      return c;
   }

   @Override
   protected boolean b(drb $$0, dad $$1, io $$2) {
      return $$0.a(avw.aL) || $$0.a(dea.dX) || super.b($$0, $$1, $$2);
   }
}
