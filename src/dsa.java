import com.mojang.serialization.MapCodec;

public class dsa extends dke {
   public static final MapCodec<dsa> a = b(dsa::new);
   private static final fcr b = dke.b(12.0, 13.0, 16.0);
   private static final int c = 14;
   private static final int d = 10;
   private static final int e = 10;

   @Override
   public MapCodec<dsa> a() {
      return a;
   }

   public dsa(dxp.d $$0) {
      super($$0);
   }

   @Override
   protected boolean a(dxq $$0, dhc $$1, ji $$2) {
      return dke.a($$1, $$2.d(), jn.a) && !$$1.z($$2);
   }

   @Override
   protected dxq a(dxq $$0, dhc $$1, dho $$2, ji $$3, jn $$4, ji $$5, dxq $$6, azh $$7) {
      return $$4 == jn.b && !this.a($$0, $$1, $$3) ? dkg.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   public void a(dxq $$0, dgz $$1, ji $$2, azh $$3) {
      int $$4 = $$2.u();
      int $$5 = $$2.v();
      int $$6 = $$2.w();
      double $$7 = (double)$$4 + $$3.j();
      double $$8 = (double)$$5 + 0.7;
      double $$9 = (double)$$6 + $$3.j();
      $$1.a(lt.aC, $$7, $$8, $$9, 0.0, 0.0, 0.0);
      ji.a $$10 = new ji.a();

      for (int $$11 = 0; $$11 < 14; $$11++) {
         $$10.d($$4 + ayz.a($$3, -10, 10), $$5 - $$3.a(10), $$6 + ayz.a($$3, -10, 10));
         dxq $$12 = $$1.a_($$10);
         if (!$$12.m($$1, $$10)) {
            $$1.a(lt.aG, (double)$$10.u() + $$3.j(), (double)$$10.v() + $$3.j(), (double)$$10.w() + $$3.j(), 0.0, 0.0, 0.0);
         }
      }
   }

   @Override
   protected fcr a(dxq $$0, dgf $$1, ji $$2, fcc $$3) {
      return b;
   }
}
