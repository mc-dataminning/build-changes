import com.mojang.serialization.MapCodec;

public class dkw extends dme implements dlx {
   public static final MapCodec<dkw> a = b(dkw::new);
   private static final feq b = fen.a(dlu.b(16.0, 8.0, 16.0), dlu.b(4.0, 0.0, 8.0));

   @Override
   public MapCodec<dkw> a() {
      return a;
   }

   protected dkw(dzn.d $$0) {
      super($$0);
   }

   @Override
   protected feq a(dzo $$0, dhv $$1, iu $$2, feb $$3) {
      return b;
   }

   @Override
   protected boolean b(dzo $$0, dhv $$1, iu $$2) {
      return $$0.a(dlw.ee) || super.b($$0, $$1, $$2);
   }

   @Override
   public boolean a(dis $$0, iu $$1, dzo $$2) {
      return $$0.b_($$1.d()).c();
   }

   @Override
   public boolean a(dip $$0, azt $$1, iu $$2, dzo $$3) {
      return (double)$$0.A.i() < 0.45;
   }

   @Override
   public void a(aro $$0, azt $$1, iu $$2, dzo $$3) {
      dzd.e.a($$0, $$0.m().g(), $$2, $$3, $$1);
   }

   @Override
   protected boolean a(dzo $$0, ewk $$1) {
      return false;
   }
}
