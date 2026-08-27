import com.mojang.serialization.MapCodec;

public class dba extends dch implements dcb {
   public static final MapCodec<dba> a = b(dba::new);
   private static final est b = esq.a(dby.a(0.0, 8.0, 0.0, 16.0, 16.0, 16.0), dby.a(6.0, 0.0, 6.0, 10.0, 8.0, 10.0));

   @Override
   public MapCodec<dba> a() {
      return a;
   }

   protected dba(doy.d $$0) {
      super($$0);
   }

   @Override
   protected est a(doz $$0, cyd $$1, ib $$2, esf $$3) {
      return b;
   }

   @Override
   protected boolean b(doz $$0, cyd $$1, ib $$2) {
      return $$0.a(dca.dR) || super.b($$0, $$1, $$2);
   }

   @Override
   public boolean b(cza $$0, ib $$1, doz $$2) {
      return $$0.b_($$1.c()).c();
   }

   @Override
   public boolean a(cyx $$0, axr $$1, ib $$2, doz $$3) {
      return (double)$$0.z.i() < 0.45;
   }

   @Override
   public void a(aps $$0, axr $$1, ib $$2, doz $$3) {
      doo.e.a($$0, $$0.l().g(), $$2, $$3, $$1);
   }
}
