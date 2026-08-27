import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dcb extends cvo implements cvi, dcf {
   public static final MapCodec<dcb> a = b(dcb::new);
   public static final int b = 4;
   public static final din c = did.aS;
   public static final die d = did.C;
   protected static final eks e = cvf.a(6.0, 0.0, 6.0, 10.0, 6.0, 10.0);
   protected static final eks f = cvf.a(3.0, 0.0, 3.0, 13.0, 6.0, 13.0);
   protected static final eks g = cvf.a(2.0, 0.0, 2.0, 14.0, 6.0, 14.0);
   protected static final eks h = cvf.a(2.0, 0.0, 2.0, 14.0, 7.0, 14.0);

   @Override
   public MapCodec<dcb> a() {
      return a;
   }

   protected dcb(dhm.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(1)).a(d, Boolean.valueOf(true)));
   }

   @Nullable
   @Override
   public dhn a(cnw $$0) {
      dhn $$1 = $$0.q().a_($$0.a());
      if ($$1.a(this)) {
         return $$1.a(c, Integer.valueOf(Math.min(4, $$1.c(c) + 1)));
      } else {
         ecx $$2 = $$0.q().b_($$0.a());
         boolean $$3 = $$2.a() == ecy.c;
         return super.a($$0).a(d, Boolean.valueOf($$3));
      }
   }

   public static boolean h(dhn $$0) {
      return !$$0.c(d);
   }

   @Override
   protected boolean b(dhn $$0, crl $$1, hx $$2) {
      return !$$0.k($$1, $$2).a(ib.b).c() || $$0.d($$1, $$2, ib.b);
   }

   @Override
   public boolean a(dhn $$0, csi $$1, hx $$2) {
      hx $$3 = $$2.d();
      return this.b($$1.a_($$3), $$1, $$3);
   }

   @Override
   public dhn a(dhn $$0, ib $$1, dhn $$2, csg $$3, hx $$4, hx $$5) {
      if (!$$0.a($$3, $$4)) {
         return cvh.a.o();
      } else {
         if ($$0.c(d)) {
            $$3.a($$4, ecy.c, ecy.c.a($$3));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   public boolean a(dhn $$0, cnw $$1) {
      return !$$1.h() && $$1.n().a(this.k()) && $$0.c(c) < 4 ? true : super.a($$0, $$1);
   }

   @Override
   public eks a(dhn $$0, crl $$1, hx $$2, eke $$3) {
      switch ($$0.c(c)) {
         case 1:
         default:
            return e;
         case 2:
            return f;
         case 3:
            return g;
         case 4:
            return h;
      }
   }

   @Override
   public ecx c_(dhn $$0) {
      return $$0.c(d) ? ecy.c.a(false) : super.c_($$0);
   }

   @Override
   protected void a(dho.a<cvf, dhn> $$0) {
      $$0.a(c, d);
   }

   @Override
   public boolean b(csi $$0, hx $$1, dhn $$2) {
      return true;
   }

   @Override
   public boolean a(csf $$0, atw $$1, hx $$2, dhn $$3) {
      return true;
   }

   @Override
   public void a(ami $$0, atw $$1, hx $$2, dhn $$3) {
      if (!h($$3) && $$0.a_($$2.d()).a(ark.ap)) {
         int $$4 = 5;
         int $$5 = 1;
         int $$6 = 2;
         int $$7 = 0;
         int $$8 = $$2.u() - 2;
         int $$9 = 0;

         for (int $$10 = 0; $$10 < 5; $$10++) {
            for (int $$11 = 0; $$11 < $$5; $$11++) {
               int $$12 = 2 + $$2.v() - 1;

               for (int $$13 = $$12 - 2; $$13 < $$12; $$13++) {
                  hx $$14 = new hx($$8 + $$10, $$13, $$2.w() - $$9 + $$11);
                  if ($$14 != $$2 && $$1.a(6) == 0 && $$0.a_($$14).a(cvh.G)) {
                     dhn $$15 = $$0.a_($$14.d());
                     if ($$15.a(ark.ap)) {
                        $$0.a($$14, cvh.mV.o().a(c, Integer.valueOf($$1.a(4) + 1)), 3);
                     }
                  }
               }
            }

            if ($$7 < 2) {
               $$5 += 2;
               $$9++;
            } else {
               $$5 -= 2;
               $$9--;
            }

            $$7++;
         }

         $$0.a($$2, $$3.a(c, Integer.valueOf(4)), 2);
      }
   }

   @Override
   public boolean a(dhn $$0, crl $$1, hx $$2, edn $$3) {
      return false;
   }
}
