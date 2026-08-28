import com.mojang.serialization.MapCodec;

public class dhs extends diz implements dit {
   public static final MapCodec<dhs> a = b(dhs::new);
   private static final fas b = fap.a(diq.a(0.0, 8.0, 0.0, 16.0, 16.0, 16.0), diq.a(6.0, 0.0, 6.0, 10.0, 8.0, 10.0));

   @Override
   public MapCodec<dhs> a() {
      return a;
   }

   protected dhs(dvu.d $$0) {
      super($$0);
   }

   @Override
   protected fas a(dvv $$0, der $$1, jh $$2, fad $$3) {
      return b;
   }

   @Override
   protected boolean b(dvv $$0, der $$1, jh $$2) {
      return $$0.a(dis.dR) || super.b($$0, $$1, $$2);
   }

   @Override
   public boolean b(dfp $$0, jh $$1, dvv $$2) {
      return $$0.b_($$1.d()).c();
   }

   @Override
   public boolean a(dfm $$0, azu $$1, jh $$2, dvv $$3) {
      return (double)$$0.A.i() < 0.45;
   }

   @Override
   public void a(arp $$0, azu $$1, jh $$2, dvv $$3) {
      dvk.e.a($$0, $$0.m().g(), $$2, $$3, $$1);
   }

   @Override
   protected boolean a(dvv $$0, esk $$1) {
      return false;
   }
}
