import com.mojang.serialization.MapCodec;

public class dfx extends dhe implements dgy {
   public static final MapCodec<dfx> a = b(dfx::new);
   private static final eyx b = eyu.a(dgv.a(0.0, 8.0, 0.0, 16.0, 16.0, 16.0), dgv.a(6.0, 0.0, 6.0, 10.0, 8.0, 10.0));

   @Override
   public MapCodec<dfx> a() {
      return a;
   }

   protected dfx(dtz.d $$0) {
      super($$0);
   }

   @Override
   protected eyx a(dua $$0, dcx $$1, je $$2, eyj $$3) {
      return b;
   }

   @Override
   protected boolean b(dua $$0, dcx $$1, je $$2) {
      return $$0.a(dgx.dR) || super.b($$0, $$1, $$2);
   }

   @Override
   public boolean b(ddv $$0, je $$1, dua $$2) {
      return $$0.b_($$1.d()).c();
   }

   @Override
   public boolean a(dds $$0, azk $$1, je $$2, dua $$3) {
      return (double)$$0.z.i() < 0.45;
   }

   @Override
   public void a(arg $$0, azk $$1, je $$2, dua $$3) {
      dtp.e.a($$0, $$0.l().g(), $$2, $$3, $$1);
   }

   @Override
   protected boolean a(dua $$0, eqq $$1) {
      return false;
   }
}
