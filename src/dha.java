import com.mojang.serialization.MapCodec;

public class dha extends dih implements dib {
   public static final MapCodec<dha> a = b(dha::new);
   private static final fab b = ezy.a(dhy.a(0.0, 8.0, 0.0, 16.0, 16.0, 16.0), dhy.a(6.0, 0.0, 6.0, 10.0, 8.0, 10.0));

   @Override
   public MapCodec<dha> a() {
      return a;
   }

   protected dha(dvc.d $$0) {
      super($$0);
   }

   @Override
   protected fab a(dvd $$0, dea $$1, jg $$2, ezm $$3) {
      return b;
   }

   @Override
   protected boolean b(dvd $$0, dea $$1, jg $$2) {
      return $$0.a(dia.dR) || super.b($$0, $$1, $$2);
   }

   @Override
   public boolean b(dey $$0, jg $$1, dvd $$2) {
      return $$0.b_($$1.d()).c();
   }

   @Override
   public boolean a(dev $$0, azr $$1, jg $$2, dvd $$3) {
      return (double)$$0.A.i() < 0.45;
   }

   @Override
   public void a(arm $$0, azr $$1, jg $$2, dvd $$3) {
      dus.e.a($$0, $$0.l().g(), $$2, $$3, $$1);
   }

   @Override
   protected boolean a(dvd $$0, ert $$1) {
      return false;
   }
}
