import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dcv extends cwi implements cwc, dcz {
   public static final MapCodec<dcv> a = b(dcv::new);
   public static final int b = 4;
   public static final djp c = djf.aS;
   public static final djg d = djf.C;
   protected static final elu e = cvz.a(6.0, 0.0, 6.0, 10.0, 6.0, 10.0);
   protected static final elu f = cvz.a(3.0, 0.0, 3.0, 13.0, 6.0, 13.0);
   protected static final elu g = cvz.a(2.0, 0.0, 2.0, 14.0, 6.0, 14.0);
   protected static final elu h = cvz.a(2.0, 0.0, 2.0, 14.0, 7.0, 14.0);

   @Override
   public MapCodec<dcv> a() {
      return a;
   }

   protected dcv(dio.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(1)).a(d, Boolean.valueOf(true)));
   }

   @Nullable
   @Override
   public dip a(coq $$0) {
      dip $$1 = $$0.q().a_($$0.a());
      if ($$1.a(this)) {
         return $$1.a(c, Integer.valueOf(Math.min(4, $$1.c(c) + 1)));
      } else {
         edz $$2 = $$0.q().b_($$0.a());
         boolean $$3 = $$2.a() == eea.c;
         return super.a($$0).a(d, Boolean.valueOf($$3));
      }
   }

   public static boolean h(dip $$0) {
      return !$$0.c(d);
   }

   @Override
   protected boolean b(dip $$0, cse $$1, hv $$2) {
      return !$$0.k($$1, $$2).a(ia.b).c() || $$0.d($$1, $$2, ia.b);
   }

   @Override
   public boolean a(dip $$0, ctb $$1, hv $$2) {
      hv $$3 = $$2.d();
      return this.b($$1.a_($$3), $$1, $$3);
   }

   @Override
   public dip a(dip $$0, ia $$1, dip $$2, csz $$3, hv $$4, hv $$5) {
      if (!$$0.a($$3, $$4)) {
         return cwb.a.o();
      } else {
         if ($$0.c(d)) {
            $$3.a($$4, eea.c, eea.c.a($$3));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   public boolean a(dip $$0, coq $$1) {
      return !$$1.h() && $$1.n().a(this.k()) && $$0.c(c) < 4 ? true : super.a($$0, $$1);
   }

   @Override
   public elu a(dip $$0, cse $$1, hv $$2, elg $$3) {
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
   public edz c_(dip $$0) {
      return $$0.c(d) ? eea.c.a(false) : super.c_($$0);
   }

   @Override
   protected void a(diq.a<cvz, dip> $$0) {
      $$0.a(c, d);
   }

   @Override
   public boolean b(ctb $$0, hv $$1, dip $$2) {
      return true;
   }

   @Override
   public boolean a(csy $$0, auf $$1, hv $$2, dip $$3) {
      return true;
   }

   @Override
   public void a(amp $$0, auf $$1, hv $$2, dip $$3) {
      if (!h($$3) && $$0.a_($$2.d()).a(arr.ap)) {
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
                  hv $$14 = new hv($$8 + $$10, $$13, $$2.w() - $$9 + $$11);
                  if ($$14 != $$2 && $$1.a(6) == 0 && $$0.a_($$14).a(cwb.G)) {
                     dip $$15 = $$0.a_($$14.d());
                     if ($$15.a(arr.ap)) {
                        $$0.a($$14, cwb.mV.o().a(c, Integer.valueOf($$1.a(4) + 1)), 3);
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
   public boolean a(dip $$0, cse $$1, hv $$2, eep $$3) {
      return false;
   }
}
