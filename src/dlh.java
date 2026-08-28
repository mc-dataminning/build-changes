import com.mojang.serialization.MapCodec;

public class dlh extends dvr implements dmi {
   public static final MapCodec<dlh> a = b(dlh::new);
   private static final ffk b = ffh.a(dmf.b(16.0, 8.0, 16.0), dmf.b(4.0, 0.0, 8.0));

   @Override
   public MapCodec<dlh> a() {
      return a;
   }

   protected dlh(eag.d $$0) {
      super($$0);
   }

   @Override
   protected ffk a(eah $$0, dig $$1, iu $$2, fev $$3) {
      return b;
   }

   @Override
   protected boolean b(eah $$0, dig $$1, iu $$2) {
      return $$0.a(dmh.ei) || super.b($$0, $$1, $$2);
   }

   @Override
   public boolean a(djd $$0, iu $$1, eah $$2) {
      return $$0.b_($$1.d()).c();
   }

   @Override
   public boolean a(dja $$0, azv $$1, iu $$2, eah $$3) {
      return (double)$$0.A.i() < 0.45;
   }

   @Override
   public void a(arq $$0, azv $$1, iu $$2, eah $$3) {
      dzv.e.a($$0, $$0.m().g(), $$2, $$3, $$1);
   }

   @Override
   protected boolean a(eah $$0, exd $$1) {
      return false;
   }
}
