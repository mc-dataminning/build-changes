import com.mojang.serialization.MapCodec;

public class djw extends dle implements dkx {
   public static final MapCodec<djw> a = b(djw::new);
   private static final fdo b = fdl.a(dku.b(16.0, 8.0, 16.0), dku.b(4.0, 0.0, 8.0));

   @Override
   public MapCodec<djw> a() {
      return a;
   }

   protected djw(dyl.d $$0) {
      super($$0);
   }

   @Override
   protected fdo a(dym $$0, dgv $$1, jj $$2, fcz $$3) {
      return b;
   }

   @Override
   protected boolean b(dym $$0, dgv $$1, jj $$2) {
      return $$0.a(dkw.ee) || super.b($$0, $$1, $$2);
   }

   @Override
   public boolean a(dhs $$0, jj $$1, dym $$2) {
      return $$0.b_($$1.d()).c();
   }

   @Override
   public boolean a(dhp $$0, azs $$1, jj $$2, dym $$3) {
      return (double)$$0.A.i() < 0.45;
   }

   @Override
   public void a(arn $$0, azs $$1, jj $$2, dym $$3) {
      dyb.e.a($$0, $$0.m().g(), $$2, $$3, $$1);
   }

   @Override
   protected boolean a(dym $$0, evi $$1) {
      return false;
   }
}
