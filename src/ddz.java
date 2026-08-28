import com.mojang.serialization.MapCodec;

public class ddz extends dfg implements dfa {
   public static final MapCodec<ddz> a = b(ddz::new);
   private static final ewi b = ewf.a(dex.a(0.0, 8.0, 0.0, 16.0, 16.0, 16.0), dex.a(6.0, 0.0, 6.0, 10.0, 8.0, 10.0));

   @Override
   public MapCodec<ddz> a() {
      return a;
   }

   protected ddz(drz.d $$0) {
      super($$0);
   }

   @Override
   protected ewi a(dsa $$0, dbc $$1, iz $$2, evu $$3) {
      return b;
   }

   @Override
   protected boolean b(dsa $$0, dbc $$1, iz $$2) {
      return $$0.a(dez.dR) || super.b($$0, $$1, $$2);
   }

   @Override
   public boolean b(dbz $$0, iz $$1, dsa $$2) {
      return $$0.b_($$1.c()).c();
   }

   @Override
   public boolean a(dbw $$0, azf $$1, iz $$2, dsa $$3) {
      return (double)$$0.z.i() < 0.45;
   }

   @Override
   public void a(are $$0, azf $$1, iz $$2, dsa $$3) {
      drp.e.a($$0, $$0.l().g(), $$2, $$3, $$1);
   }
}
