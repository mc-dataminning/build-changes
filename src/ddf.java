import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class ddf extends cws implements cwm, ddj {
   public static final MapCodec<ddf> a = b(ddf::new);
   public static final int b = 4;
   public static final dka c = djq.aS;
   public static final djr d = djq.C;
   protected static final emf e = cwj.a(6.0, 0.0, 6.0, 10.0, 6.0, 10.0);
   protected static final emf f = cwj.a(3.0, 0.0, 3.0, 13.0, 6.0, 13.0);
   protected static final emf g = cwj.a(2.0, 0.0, 2.0, 14.0, 6.0, 14.0);
   protected static final emf h = cwj.a(2.0, 0.0, 2.0, 14.0, 7.0, 14.0);

   @Override
   public MapCodec<ddf> a() {
      return a;
   }

   protected ddf(diz.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(1)).a(d, Boolean.valueOf(true)));
   }

   @Nullable
   @Override
   public dja a(cpa $$0) {
      dja $$1 = $$0.q().a_($$0.a());
      if ($$1.a(this)) {
         return $$1.a(c, Integer.valueOf(Math.min(4, $$1.c(c) + 1)));
      } else {
         eek $$2 = $$0.q().b_($$0.a());
         boolean $$3 = $$2.a() == eel.c;
         return super.a($$0).a(d, Boolean.valueOf($$3));
      }
   }

   public static boolean h(dja $$0) {
      return !$$0.c(d);
   }

   @Override
   protected boolean b(dja $$0, cso $$1, hx $$2) {
      return !$$0.k($$1, $$2).a(ic.b).c() || $$0.d($$1, $$2, ic.b);
   }

   @Override
   public boolean a(dja $$0, ctl $$1, hx $$2) {
      hx $$3 = $$2.d();
      return this.b($$1.a_($$3), $$1, $$3);
   }

   @Override
   public dja a(dja $$0, ic $$1, dja $$2, ctj $$3, hx $$4, hx $$5) {
      if (!$$0.a($$3, $$4)) {
         return cwl.a.o();
      } else {
         if ($$0.c(d)) {
            $$3.a($$4, eel.c, eel.c.a($$3));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   public boolean a(dja $$0, cpa $$1) {
      return !$$1.h() && $$1.n().a(this.k()) && $$0.c(c) < 4 ? true : super.a($$0, $$1);
   }

   @Override
   public emf a(dja $$0, cso $$1, hx $$2, elr $$3) {
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
   public eek c_(dja $$0) {
      return $$0.c(d) ? eel.c.a(false) : super.c_($$0);
   }

   @Override
   protected void a(djb.a<cwj, dja> $$0) {
      $$0.a(c, d);
   }

   @Override
   public boolean b(ctl $$0, hx $$1, dja $$2) {
      return true;
   }

   @Override
   public boolean a(cti $$0, aup $$1, hx $$2, dja $$3) {
      return true;
   }

   @Override
   public void a(amz $$0, aup $$1, hx $$2, dja $$3) {
      if (!h($$3) && $$0.a_($$2.d()).a(asb.ap)) {
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
                  if ($$14 != $$2 && $$1.a(6) == 0 && $$0.a_($$14).a(cwl.G)) {
                     dja $$15 = $$0.a_($$14.d());
                     if ($$15.a(asb.ap)) {
                        $$0.a($$14, cwl.mV.o().a(c, Integer.valueOf($$1.a(4) + 1)), 3);
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
   public boolean a(dja $$0, cso $$1, hx $$2, efa $$3) {
      return false;
   }
}
