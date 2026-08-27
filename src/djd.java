import com.mojang.serialization.MapCodec;

public class djd extends deh {
   public static final MapCodec<djd> a = b(djd::new);
   protected static final evd b = ddy.a(2.0, 0.0, 2.0, 14.0, 3.0, 14.0);

   @Override
   public MapCodec<djd> a() {
      return a;
   }

   public djd(dra.d $$0) {
      super($$0);
   }

   @Override
   protected evd a(drb $$0, dad $$1, io $$2, eup $$3) {
      return b;
   }

   @Override
   protected boolean b(drb $$0, dad $$1, io $$2) {
      return $$0.a(avw.aL) || $$0.a(dea.dX) || super.b($$0, $$1, $$2);
   }
}
