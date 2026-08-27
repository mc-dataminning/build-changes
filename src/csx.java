import java.util.Optional;
import javax.annotation.Nullable;

public class csx extends crx implements czl {
   protected static final ehy a = csk.a(0.0, 0.0, 0.0, 16.0, 7.0, 16.0);
   public static final dfp b = dfo.r;
   public static final dfp c = dfo.y;
   public static final dfp d = dfo.C;
   public static final dfs e = dfo.R;
   private static final ehy f = csk.a(6.0, 0.0, 6.0, 10.0, 16.0, 10.0);
   private static final int g = 5;
   private final boolean h;
   private final int i;

   public csx(boolean $$0, int $$1, dex.d $$2) {
      super($$2);
      this.h = $$0;
      this.i = $$1;
      this.k(this.C.b().a(b, Boolean.valueOf(true)).a(c, Boolean.valueOf(false)).a(d, Boolean.valueOf(false)).a(e, hb.c));
   }

   @Override
   public bgo a(dey $$0, cpk $$1, gv $$2, cbl $$3, bgn $$4, ehb $$5) {
      if ($$1.c_($$2) instanceof dcq $$7) {
         ciw $$8 = $$3.b($$4);
         Optional<cln> $$9 = $$7.a($$8);
         if ($$9.isPresent()) {
            if (!$$1.B && $$7.a($$3, $$3.fR().d ? $$8.p() : $$8, $$9.get().d())) {
               $$3.a(ape.av);
               return bgo.a;
            }

            return bgo.b;
         }
      }

      return bgo.d;
   }

   @Override
   public void a(dey $$0, cpk $$1, gv $$2, big $$3) {
      if ($$0.c(b) && $$3 instanceof biw && !cnf.j((biw)$$3)) {
         $$3.a($$1.ag().a(), (float)this.i);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(dey $$0, cpk $$1, gv $$2, dey $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         dck $$5 = $$1.c_($$2);
         if ($$5 instanceof dcq) {
            bgk.a($$1, $$2, ((dcq)$$5).c());
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Nullable
   @Override
   public dey a(cle $$0) {
      cpl $$1 = $$0.q();
      gv $$2 = $$0.a();
      boolean $$3 = $$1.b_($$2).a() == eac.c;
      return this.n().a(d, Boolean.valueOf($$3)).a(c, Boolean.valueOf(this.n($$1.a_($$2.d())))).a(b, Boolean.valueOf(!$$3)).a(e, $$0.g());
   }

   @Override
   public dey a(dey $$0, hb $$1, dey $$2, cpl $$3, gv $$4, gv $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, eac.c, eac.c.a($$3));
      }

      return $$1 == hb.a ? $$0.a(c, Boolean.valueOf(this.n($$2))) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   private boolean n(dey $$0) {
      return $$0.a(csl.ij);
   }

   @Override
   public ehy a(dey $$0, coq $$1, gv $$2, ehk $$3) {
      return a;
   }

   @Override
   public cyp b_(dey $$0) {
      return cyp.c;
   }

   @Override
   public void a(dey $$0, cpk $$1, gv $$2, art $$3) {
      if ($$0.c(b)) {
         if ($$3.a(10) == 0) {
            $$1.a((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, aou.db, aov.e, 0.5F + $$3.i(), $$3.i() * 0.7F + 0.6F, false);
         }

         if (this.h && $$3.a(5) == 0) {
            for (int $$4 = 0; $$4 < $$3.a(1) + 1; $$4++) {
               $$1.a(iw.T, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, (double)($$3.i() / 2.0F), 5.0E-5, (double)($$3.i() / 2.0F));
            }
         }
      }
   }

   public static void a(@Nullable big $$0, cpl $$1, gv $$2, dey $$3) {
      if ($$1.r_()) {
         for (int $$4 = 0; $$4 < 20; $$4++) {
            a((cpk)$$1, $$2, $$3.c(c), true);
         }
      }

      dck $$5 = $$1.c_($$2);
      if ($$5 instanceof dcq) {
         ((dcq)$$5).f();
      }

      $$1.a($$0, dji.c, $$2);
   }

   @Override
   public boolean a(cpl $$0, gv $$1, dey $$2, eab $$3) {
      if (!$$2.c(dfo.C) && $$3.a() == eac.c) {
         boolean $$4 = $$2.c(b);
         if ($$4) {
            if (!$$0.r_()) {
               $$0.a(null, $$1, aou.iY, aov.e, 1.0F, 1.0F);
            }

            a(null, $$0, $$1, $$2);
         }

         $$0.a($$1, $$2.a(d, Boolean.valueOf(true)).a(b, Boolean.valueOf(false)), 3);
         $$0.a($$1, $$3.a(), $$3.a().a($$0));
         return true;
      } else {
         return false;
      }
   }

   @Override
   public void a(cpk $$0, dey $$1, ehb $$2, ccd $$3) {
      gv $$4 = $$2.a();
      if (!$$0.B && $$3.bM() && $$3.a($$0, $$4) && !$$1.c(b) && !$$1.c(d)) {
         $$0.a($$4, $$1.a(dfo.r, Boolean.valueOf(true)), 11);
      }
   }

   public static void a(cpk $$0, gv $$1, boolean $$2, boolean $$3) {
      art $$4 = $$0.y_();
      iz $$5 = $$2 ? iw.ao : iw.an;
      $$0.b(
         $$5,
         true,
         (double)$$1.u() + 0.5 + $$4.j() / 3.0 * (double)($$4.h() ? 1 : -1),
         (double)$$1.v() + $$4.j() + $$4.j(),
         (double)$$1.w() + 0.5 + $$4.j() / 3.0 * (double)($$4.h() ? 1 : -1),
         0.0,
         0.07,
         0.0
      );
      if ($$3) {
         $$0.a(
            iw.Z,
            (double)$$1.u() + 0.5 + $$4.j() / 4.0 * (double)($$4.h() ? 1 : -1),
            (double)$$1.v() + 0.4,
            (double)$$1.w() + 0.5 + $$4.j() / 4.0 * (double)($$4.h() ? 1 : -1),
            0.0,
            0.005,
            0.0
         );
      }
   }

   public static boolean a(cpk $$0, gv $$1) {
      for (int $$2 = 1; $$2 <= 5; $$2++) {
         gv $$3 = $$1.c($$2);
         dey $$4 = $$0.a_($$3);
         if (g($$4)) {
            return true;
         }

         boolean $$5 = ehv.c(f, $$4.b($$0, $$1, ehk.a()), ehj.i);
         if ($$5) {
            dey $$6 = $$0.a_($$3.d());
            return g($$6);
         }
      }

      return false;
   }

   public static boolean g(dey $$0) {
      return $$0.b(b) && $$0.a(apj.aU) && $$0.c(b);
   }

   @Override
   public eab c_(dey $$0) {
      return $$0.c(d) ? eac.c.a(false) : super.c_($$0);
   }

   @Override
   public dey a(dey $$0, cyw $$1) {
      return $$0.a(e, $$1.a($$0.c(e)));
   }

   @Override
   public dey a(dey $$0, cxf $$1) {
      return $$0.a($$1.a($$0.c(e)));
   }

   @Override
   protected void a(dez.a<csk, dey> $$0) {
      $$0.a(b, c, d, e);
   }

   @Override
   public dck a(gv $$0, dey $$1) {
      return new dcq($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dck> dcl<T> a(cpk $$0, dey $$1, dcm<T> $$2) {
      if ($$0.B) {
         return $$1.c(b) ? a($$2, dcm.G, dcq::c) : null;
      } else {
         return $$1.c(b) ? a($$2, dcm.G, dcq::a) : a($$2, dcm.G, dcq::b);
      }
   }

   @Override
   public boolean a(dey $$0, coq $$1, gv $$2, ear $$3) {
      return false;
   }

   public static boolean h(dey $$0) {
      return $$0.a(apj.aU, $$0x -> $$0x.b(d) && $$0x.b(b)) && !$$0.c(d) && !$$0.c(b);
   }
}
