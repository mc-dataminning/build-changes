import com.mojang.serialization.MapCodec;

public class dim extends dju implements djn {
   public static final MapCodec<dim> a = b(dim::new);
   private static final fbs b = fbp.a(djk.a(0.0, 8.0, 0.0, 16.0, 16.0, 16.0), djk.a(6.0, 0.0, 6.0, 10.0, 8.0, 10.0));

   @Override
   public MapCodec<dim> a() {
      return a;
   }

   protected dim(dwu.d $$0) {
      super($$0);
   }

   @Override
   protected fbs a(dwv $$0, dfl $$1, ji $$2, fbd $$3) {
      return b;
   }

   @Override
   protected boolean b(dwv $$0, dfl $$1, ji $$2) {
      return $$0.a(djm.ee) || super.b($$0, $$1, $$2);
   }

   @Override
   public boolean a(dgj $$0, ji $$1, dwv $$2) {
      return $$0.b_($$1.d()).c();
   }

   @Override
   public boolean a(dgg $$0, azg $$1, ji $$2, dwv $$3) {
      return (double)$$0.A.i() < 0.45;
   }

   @Override
   public void a(arc $$0, azg $$1, ji $$2, dwv $$3) {
      dwk.e.a($$0, $$0.m().g(), $$2, $$3, $$1);
   }

   @Override
   protected boolean a(dwv $$0, etm $$1) {
      return false;
   }
}
