import com.mojang.serialization.MapCodec;

public class dio extends djw implements djp {
   public static final MapCodec<dio> a = b(dio::new);
   private static final fbu b = fbr.a(djm.a(0.0, 8.0, 0.0, 16.0, 16.0, 16.0), djm.a(6.0, 0.0, 6.0, 10.0, 8.0, 10.0));

   @Override
   public MapCodec<dio> a() {
      return a;
   }

   protected dio(dww.d $$0) {
      super($$0);
   }

   @Override
   protected fbu a(dwx $$0, dfn $$1, ji $$2, fbf $$3) {
      return b;
   }

   @Override
   protected boolean b(dwx $$0, dfn $$1, ji $$2) {
      return $$0.a(djo.ee) || super.b($$0, $$1, $$2);
   }

   @Override
   public boolean a(dgl $$0, ji $$1, dwx $$2) {
      return $$0.b_($$1.d()).c();
   }

   @Override
   public boolean a(dgi $$0, azh $$1, ji $$2, dwx $$3) {
      return (double)$$0.A.i() < 0.45;
   }

   @Override
   public void a(arc $$0, azh $$1, ji $$2, dwx $$3) {
      dwm.e.a($$0, $$0.m().g(), $$2, $$3, $$1);
   }

   @Override
   protected boolean a(dwx $$0, eto $$1) {
      return false;
   }
}
