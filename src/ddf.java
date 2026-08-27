import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class ddf extends dft implements dcb {
   public static final MapCodec<ddf> a = b(ddf::new);
   public static final int b = 2;
   public static final dpz c = dpp.ar;
   protected static final int d = 4;
   protected static final int e = 5;
   protected static final int f = 2;
   protected static final int g = 6;
   protected static final int h = 7;
   protected static final int i = 3;
   protected static final int j = 8;
   protected static final int k = 9;
   protected static final int l = 4;
   protected static final est[] m = new est[]{
      dby.a(11.0, 7.0, 6.0, 15.0, 12.0, 10.0), dby.a(9.0, 5.0, 5.0, 15.0, 12.0, 11.0), dby.a(7.0, 3.0, 4.0, 15.0, 12.0, 12.0)
   };
   protected static final est[] n = new est[]{
      dby.a(1.0, 7.0, 6.0, 5.0, 12.0, 10.0), dby.a(1.0, 5.0, 5.0, 7.0, 12.0, 11.0), dby.a(1.0, 3.0, 4.0, 9.0, 12.0, 12.0)
   };
   protected static final est[] o = new est[]{
      dby.a(6.0, 7.0, 1.0, 10.0, 12.0, 5.0), dby.a(5.0, 5.0, 1.0, 11.0, 12.0, 7.0), dby.a(4.0, 3.0, 1.0, 12.0, 12.0, 9.0)
   };
   protected static final est[] F = new est[]{
      dby.a(6.0, 7.0, 11.0, 10.0, 12.0, 15.0), dby.a(5.0, 5.0, 9.0, 11.0, 12.0, 15.0), dby.a(4.0, 3.0, 7.0, 12.0, 12.0, 15.0)
   };

   @Override
   public MapCodec<ddf> a() {
      return a;
   }

   public ddf(doy.d $$0) {
      super($$0);
      this.k(this.E.b().a(aE, ih.c).a(c, Integer.valueOf(0)));
   }

   @Override
   protected boolean e_(doz $$0) {
      return $$0.c(c) < 2;
   }

   @Override
   protected void b(doz $$0, aps $$1, ib $$2, axr $$3) {
      if ($$1.z.a(5) == 0) {
         int $$4 = $$0.c(c);
         if ($$4 < 2) {
            $$1.a($$2, $$0.a(c, Integer.valueOf($$4 + 1)), 2);
         }
      }
   }

   @Override
   protected boolean a(doz $$0, cza $$1, ib $$2) {
      doz $$3 = $$1.a_($$2.a($$0.c(aE)));
      return $$3.a(avc.z);
   }

   @Override
   protected est a(doz $$0, cyd $$1, ib $$2, esf $$3) {
      int $$4 = $$0.c(c);
      switch ((ih)$$0.c(aE)) {
         case d:
            return F[$$4];
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
   public doz a(cuo $$0) {
      doz $$1 = this.n();
      cza $$2 = $$0.q();
      ib $$3 = $$0.a();

      for (ih $$4 : $$0.f()) {
         if ($$4.o().d()) {
            $$1 = $$1.a(aE, $$4);
            if ($$1.a($$2, $$3)) {
               return $$1;
            }
         }
      }

      return null;
   }

   @Override
   protected doz a(doz $$0, ih $$1, doz $$2, cyy $$3, ib $$4, ib $$5) {
      return $$1 == $$0.c(aE) && !$$0.a($$3, $$4) ? dca.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean b(cza $$0, ib $$1, doz $$2) {
      return $$2.c(c) < 2;
   }

   @Override
   public boolean a(cyx $$0, axr $$1, ib $$2, doz $$3) {
      return true;
   }

   @Override
   public void a(aps $$0, axr $$1, ib $$2, doz $$3) {
      $$0.a($$2, $$3.a(c, Integer.valueOf($$3.c(c) + 1)), 2);
   }

   @Override
   protected void a(dpa.a<dby, doz> $$0) {
      $$0.a(aE, c);
   }

   @Override
   protected boolean a(doz $$0, elh $$1) {
      return false;
   }
}
