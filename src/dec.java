import com.mojang.serialization.MapCodec;

public class dec extends dfj implements dfd {
   public static final MapCodec<dec> a = b(dec::new);
   private static final ewl b = ewi.a(dfa.a(0.0, 8.0, 0.0, 16.0, 16.0, 16.0), dfa.a(6.0, 0.0, 6.0, 10.0, 8.0, 10.0));

   @Override
   public MapCodec<dec> a() {
      return a;
   }

   protected dec(dsc.d $$0) {
      super($$0);
   }

   @Override
   protected ewl a(dsd $$0, dbf $$1, iz $$2, evx $$3) {
      return b;
   }

   @Override
   protected boolean b(dsd $$0, dbf $$1, iz $$2) {
      return $$0.a(dfc.dR) || super.b($$0, $$1, $$2);
   }

   @Override
   public boolean b(dcc $$0, iz $$1, dsd $$2) {
      return $$0.b_($$1.c()).c();
   }

   @Override
   public boolean a(dbz $$0, azh $$1, iz $$2, dsd $$3) {
      return (double)$$0.z.i() < 0.45;
   }

   @Override
   public void a(arf $$0, azh $$1, iz $$2, dsd $$3) {
      drs.e.a($$0, $$0.l().g(), $$2, $$3, $$1);
   }
}
