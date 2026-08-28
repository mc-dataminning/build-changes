import com.mojang.serialization.MapCodec;

public class dri extends djn {
   public static final MapCodec<dri> a = b(dri::new);
   private static final fbv b = djn.a(2.0, 13.0, 2.0, 14.0, 16.0, 14.0);
   private static final int c = 14;
   private static final int d = 10;
   private static final int e = 10;

   @Override
   public MapCodec<dri> a() {
      return a;
   }

   public dri(dwx.d $$0) {
      super($$0);
   }

   @Override
   protected boolean a(dwy $$0, dgm $$1, ji $$2) {
      return djn.a($$1, $$2.d(), jn.a) && !$$1.z($$2);
   }

   @Override
   protected dwy a(dwy $$0, dgm $$1, dgy $$2, ji $$3, jn $$4, ji $$5, dwy $$6, azh $$7) {
      return $$4 == jn.b && !this.a($$0, $$1, $$3) ? djp.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   public void a(dwy $$0, dgj $$1, ji $$2, azh $$3) {
      int $$4 = $$2.u();
      int $$5 = $$2.v();
      int $$6 = $$2.w();
      double $$7 = (double)$$4 + $$3.j();
      double $$8 = (double)$$5 + 0.7;
      double $$9 = (double)$$6 + $$3.j();
      $$1.a(lt.aB, $$7, $$8, $$9, 0.0, 0.0, 0.0);
      ji.a $$10 = new ji.a();

      for (int $$11 = 0; $$11 < 14; $$11++) {
         $$10.d($$4 + ayz.a($$3, -10, 10), $$5 - $$3.a(10), $$6 + ayz.a($$3, -10, 10));
         dwy $$12 = $$1.a_($$10);
         if (!$$12.m($$1, $$10)) {
            $$1.a(lt.aF, (double)$$10.u() + $$3.j(), (double)$$10.v() + $$3.j(), (double)$$10.w() + $$3.j(), 0.0, 0.0, 0.0);
         }
      }
   }

   @Override
   protected fbv a(dwy $$0, dfo $$1, ji $$2, fbg $$3) {
      return b;
   }
}
