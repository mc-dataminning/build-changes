import com.mojang.serialization.MapCodec;

public class daw extends cvz implements cwc {
   public static final MapCodec<daw> a = b(daw::new);

   @Override
   public MapCodec<daw> a() {
      return a;
   }

   public daw(dio.d $$0) {
      super($$0);
   }

   @Override
   public boolean b(ctb $$0, hv $$1, dip $$2) {
      return $$0.a_($$1.c()).i();
   }

   @Override
   public boolean a(csy $$0, auf $$1, hv $$2, dip $$3) {
      return true;
   }

   @Override
   public void a(amp $$0, auf $$1, hv $$2, dip $$3) {
      $$0.I_().c(kc.av).flatMap($$0x -> $$0x.b(qd.n)).ifPresent($$3x -> ((dqp)$$3x.a()).a($$0, $$0.k().g(), $$1, $$2.c()));
   }
}
