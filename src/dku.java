import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dku extends dnl implements djq {
   public static final MapCodec<dku> a = b(dku::new);
   public static final int b = 2;
   public static final dxx c = dxo.au;
   protected static final int d = 4;
   protected static final int e = 5;
   protected static final int f = 2;
   protected static final int g = 6;
   protected static final int h = 7;
   protected static final int i = 3;
   protected static final int j = 8;
   protected static final int k = 9;
   protected static final int l = 4;
   protected static final fbv[] m = new fbv[]{
      djn.a(11.0, 7.0, 6.0, 15.0, 12.0, 10.0), djn.a(9.0, 5.0, 5.0, 15.0, 12.0, 11.0), djn.a(7.0, 3.0, 4.0, 15.0, 12.0, 12.0)
   };
   protected static final fbv[] n = new fbv[]{
      djn.a(1.0, 7.0, 6.0, 5.0, 12.0, 10.0), djn.a(1.0, 5.0, 5.0, 7.0, 12.0, 11.0), djn.a(1.0, 3.0, 4.0, 9.0, 12.0, 12.0)
   };
   protected static final fbv[] o = new fbv[]{
      djn.a(6.0, 7.0, 1.0, 10.0, 12.0, 5.0), djn.a(5.0, 5.0, 1.0, 11.0, 12.0, 7.0), djn.a(4.0, 3.0, 1.0, 12.0, 12.0, 9.0)
   };
   protected static final fbv[] G = new fbv[]{
      djn.a(6.0, 7.0, 11.0, 10.0, 12.0, 15.0), djn.a(5.0, 5.0, 9.0, 11.0, 12.0, 15.0), djn.a(4.0, 3.0, 7.0, 12.0, 12.0, 15.0)
   };

   @Override
   public MapCodec<dku> a() {
      return a;
   }

   public dku(dwx.d $$0) {
      super($$0);
      this.l(this.F.b().b(aF, jn.c).b(c, Integer.valueOf(0)));
   }

   @Override
   protected boolean f(dwy $$0) {
      return $$0.c(c) < 2;
   }

   @Override
   protected void b(dwy $$0, ard $$1, ji $$2, azh $$3) {
      if ($$1.A.a(5) == 0) {
         int $$4 = $$0.c(c);
         if ($$4 < 2) {
            $$1.a($$2, $$0.b(c, Integer.valueOf($$4 + 1)), 2);
         }
      }
   }

   @Override
   protected boolean a(dwy $$0, dgm $$1, ji $$2) {
      dwy $$3 = $$1.a_($$2.a($$0.c(aF)));
      return $$3.a(awp.B);
   }

   @Override
   protected fbv a(dwy $$0, dfo $$1, ji $$2, fbg $$3) {
      int $$4 = $$0.c(c);
      switch ((jn)$$0.c(aF)) {
         case d:
            return G[$$4];
         case c:
         default:
            return o[$$4];
         case e:
            return n[$$4];
         case f:
            return m[$$4];
      }
   }

   @Nullable
   @Override
   public dwy a(dah $$0) {
      dwy $$1 = this.m();
      dgm $$2 = $$0.q();
      ji $$3 = $$0.a();

      for (jn $$4 : $$0.f()) {
         if ($$4.o().d()) {
            $$1 = $$1.b(aF, $$4);
            if ($$1.a($$2, $$3)) {
               return $$1;
            }
         }
      }

      return null;
   }

   @Override
   protected dwy a(dwy $$0, dgm $$1, dgy $$2, ji $$3, jn $$4, ji $$5, dwy $$6, azh $$7) {
      return $$4 == $$0.c(aF) && !$$0.a($$1, $$3) ? djp.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   public boolean a(dgm $$0, ji $$1, dwy $$2) {
      return $$2.c(c) < 2;
   }

   @Override
   public boolean a(dgj $$0, azh $$1, ji $$2, dwy $$3) {
      return true;
   }

   @Override
   public void a(ard $$0, azh $$1, ji $$2, dwy $$3) {
      $$0.a($$2, $$3.b(c, Integer.valueOf($$3.c(c) + 1)), 2);
   }

   @Override
   protected void a(dwz.a<djn, dwy> $$0) {
      $$0.a(aF, c);
   }

   @Override
   protected boolean a(dwy $$0, etp $$1) {
      return false;
   }
}
