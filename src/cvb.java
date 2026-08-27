import com.mojang.serialization.MapCodec;

public class cvb extends cwi implements cwc {
   public static final MapCodec<cvb> a = b(cvb::new);
   private static final elu b = elr.a(cvz.a(0.0, 8.0, 0.0, 16.0, 16.0, 16.0), cvz.a(6.0, 0.0, 6.0, 10.0, 8.0, 10.0));

   @Override
   public MapCodec<cvb> a() {
      return a;
   }

   protected cvb(dio.d $$0) {
      super($$0);
   }

   @Override
   public elu a(dip $$0, cse $$1, hv $$2, elg $$3) {
      return b;
   }

   @Override
   protected boolean b(dip $$0, cse $$1, hv $$2) {
      return $$0.a(cwb.dR) || super.b($$0, $$1, $$2);
   }

   @Override
   public boolean b(ctb $$0, hv $$1, dip $$2) {
      return $$0.b_($$1.c()).c();
   }

   @Override
   public boolean a(csy $$0, auf $$1, hv $$2, dip $$3) {
      return (double)$$0.z.i() < 0.45;
   }

   @Override
   public void a(amp $$0, auf $$1, hv $$2, dip $$3) {
      die.e.a($$0, $$0.k().g(), $$2, $$3, $$1);
   }
}
