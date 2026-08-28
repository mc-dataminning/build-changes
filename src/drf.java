import com.mojang.serialization.MapCodec;

public class drf extends djk {
   public static final MapCodec<drf> a = b(drf::new);
   private static final fbs b = djk.a(2.0, 13.0, 2.0, 14.0, 16.0, 14.0);
   private static final int c = 14;
   private static final int d = 10;
   private static final int e = 10;

   @Override
   public MapCodec<drf> a() {
      return a;
   }

   public drf(dwu.d $$0) {
      super($$0);
   }

   @Override
   protected boolean a(dwv $$0, dgj $$1, ji $$2) {
      return djk.a($$1, $$2.d(), jn.a) && !$$1.z($$2);
   }

   @Override
   protected dwv a(dwv $$0, dgj $$1, dgv $$2, ji $$3, jn $$4, ji $$5, dwv $$6, azg $$7) {
      return $$4 == jn.b && !this.a($$0, $$1, $$3) ? djm.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   public void a(dwv $$0, dgg $$1, ji $$2, azg $$3) {
      int $$4 = $$2.u();
      int $$5 = $$2.v();
      int $$6 = $$2.w();
      double $$7 = (double)$$4 + $$3.j();
      double $$8 = (double)$$5 + 0.7;
      double $$9 = (double)$$6 + $$3.j();
      $$1.a(lt.aB, $$7, $$8, $$9, 0.0, 0.0, 0.0);
      ji.a $$10 = new ji.a();

      for (int $$11 = 0; $$11 < 14; $$11++) {
         $$10.d($$4 + ayy.a($$3, -10, 10), $$5 - $$3.a(10), $$6 + ayy.a($$3, -10, 10));
         dwv $$12 = $$1.a_($$10);
         if (!$$12.m($$1, $$10)) {
            $$1.a(lt.aF, (double)$$10.u() + $$3.j(), (double)$$10.v() + $$3.j(), (double)$$10.w() + $$3.j(), 0.0, 0.0, 0.0);
         }
      }
   }

   @Override
   protected fbs a(dwv $$0, dfl $$1, ji $$2, fbd $$3) {
      return b;
   }
}
