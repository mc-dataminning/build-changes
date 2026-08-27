import java.util.Optional;
import javax.annotation.Nullable;

public class cti extends csi implements czw {
   protected static final eig a = csv.a(0.0, 0.0, 0.0, 16.0, 7.0, 16.0);
   public static final dga b = dfz.r;
   public static final dga c = dfz.y;
   public static final dga d = dfz.C;
   public static final dgd e = dfz.R;
   private static final eig f = csv.a(6.0, 0.0, 6.0, 10.0, 16.0, 10.0);
   private static final int g = 5;
   private final boolean h;
   private final int i;

   public cti(boolean $$0, int $$1, dfi.d $$2) {
      super($$2);
      this.h = $$0;
      this.i = $$1;
      this.k(this.C.b().a(b, Boolean.valueOf(true)).a(c, Boolean.valueOf(false)).a(d, Boolean.valueOf(false)).a(e, hc.c));
   }

   @Override
   public bgy a(dfj $$0, cpv $$1, gw $$2, cbu $$3, bgx $$4, ehj $$5) {
      if ($$1.c_($$2) instanceof ddb $$7) {
         cjf $$8 = $$3.b($$4);
         Optional<cmk<clw>> $$9 = $$7.a($$8);
         if ($$9.isPresent()) {
            if (!$$1.B && $$7.a($$3, $$3.fS().d ? $$8.p() : $$8, $$9.get().b().d())) {
               $$3.a(apo.av);
               return bgy.a;
            }

            return bgy.b;
         }
      }

      return bgy.d;
   }

   @Override
   public void a(dfj $$0, cpv $$1, gw $$2, biq $$3) {
      if ($$0.c(b) && $$3 instanceof bjg && !cnq.j((bjg)$$3)) {
         $$3.a($$1.ag().a(), (float)this.i);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(dfj $$0, cpv $$1, gw $$2, dfj $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         dcv $$5 = $$1.c_($$2);
         if ($$5 instanceof ddb) {
            bgu.a($$1, $$2, ((ddb)$$5).c());
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Nullable
   @Override
   public dfj a(cln $$0) {
      cpw $$1 = $$0.q();
      gw $$2 = $$0.a();
      boolean $$3 = $$1.b_($$2).a() == ean.c;
      return this.n().a(d, Boolean.valueOf($$3)).a(c, Boolean.valueOf(this.n($$1.a_($$2.d())))).a(b, Boolean.valueOf(!$$3)).a(e, $$0.g());
   }

   @Override
   public dfj a(dfj $$0, hc $$1, dfj $$2, cpw $$3, gw $$4, gw $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, ean.c, ean.c.a($$3));
      }

      return $$1 == hc.a ? $$0.a(c, Boolean.valueOf(this.n($$2))) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   private boolean n(dfj $$0) {
      return $$0.a(csw.ij);
   }

   @Override
   public eig a(dfj $$0, cpb $$1, gw $$2, ehs $$3) {
      return a;
   }

   @Override
   public cza b_(dfj $$0) {
      return cza.c;
   }

   @Override
   public void a(dfj $$0, cpv $$1, gw $$2, asc $$3) {
      if ($$0.c(b)) {
         if ($$3.a(10) == 0) {
            $$1.a((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, ape.db, apf.e, 0.5F + $$3.i(), $$3.i() * 0.7F + 0.6F, false);
         }

         if (this.h && $$3.a(5) == 0) {
            for (int $$4 = 0; $$4 < $$3.a(1) + 1; $$4++) {
               $$1.a(ix.T, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, (double)($$3.i() / 2.0F), 5.0E-5, (double)($$3.i() / 2.0F));
            }
         }
      }
   }

   public static void a(@Nullable biq $$0, cpw $$1, gw $$2, dfj $$3) {
      if ($$1.w_()) {
         for (int $$4 = 0; $$4 < 20; $$4++) {
            a((cpv)$$1, $$2, $$3.c(c), true);
         }
      }

      dcv $$5 = $$1.c_($$2);
      if ($$5 instanceof ddb) {
         ((ddb)$$5).f();
      }

      $$1.a($$0, djt.c, $$2);
   }

   @Override
   public boolean a(cpw $$0, gw $$1, dfj $$2, eam $$3) {
      if (!$$2.c(dfz.C) && $$3.a() == ean.c) {
         boolean $$4 = $$2.c(b);
         if ($$4) {
            if (!$$0.w_()) {
               $$0.a(null, $$1, ape.iY, apf.e, 1.0F, 1.0F);
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
   public void a(cpv $$0, dfj $$1, ehj $$2, ccm $$3) {
      gw $$4 = $$2.a();
      if (!$$0.B && $$3.bN() && $$3.a($$0, $$4) && !$$1.c(b) && !$$1.c(d)) {
         $$0.a($$4, $$1.a(dfz.r, Boolean.valueOf(true)), 11);
      }
   }

   public static void a(cpv $$0, gw $$1, boolean $$2, boolean $$3) {
      asc $$4 = $$0.D_();
      ja $$5 = $$2 ? ix.ao : ix.an;
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
            ix.Z,
            (double)$$1.u() + 0.5 + $$4.j() / 4.0 * (double)($$4.h() ? 1 : -1),
            (double)$$1.v() + 0.4,
            (double)$$1.w() + 0.5 + $$4.j() / 4.0 * (double)($$4.h() ? 1 : -1),
            0.0,
            0.005,
            0.0
         );
      }
   }

   public static boolean a(cpv $$0, gw $$1) {
      for (int $$2 = 1; $$2 <= 5; $$2++) {
         gw $$3 = $$1.c($$2);
         dfj $$4 = $$0.a_($$3);
         if (g($$4)) {
            return true;
         }

         boolean $$5 = eid.c(f, $$4.b($$0, $$1, ehs.a()), ehr.i);
         if ($$5) {
            dfj $$6 = $$0.a_($$3.d());
            return g($$6);
         }
      }

      return false;
   }

   public static boolean g(dfj $$0) {
      return $$0.b(b) && $$0.a(apt.aU) && $$0.c(b);
   }

   @Override
   public eam c_(dfj $$0) {
      return $$0.c(d) ? ean.c.a(false) : super.c_($$0);
   }

   @Override
   public dfj a(dfj $$0, czh $$1) {
      return $$0.a(e, $$1.a($$0.c(e)));
   }

   @Override
   public dfj a(dfj $$0, cxq $$1) {
      return $$0.a($$1.a($$0.c(e)));
   }

   @Override
   protected void a(dfk.a<csv, dfj> $$0) {
      $$0.a(b, c, d, e);
   }

   @Override
   public dcv a(gw $$0, dfj $$1) {
      return new ddb($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dcv> dcw<T> a(cpv $$0, dfj $$1, dcx<T> $$2) {
      if ($$0.B) {
         return $$1.c(b) ? a($$2, dcx.G, ddb::c) : null;
      } else {
         return $$1.c(b) ? a($$2, dcx.G, ddb::a) : a($$2, dcx.G, ddb::b);
      }
   }

   @Override
   public boolean a(dfj $$0, cpb $$1, gw $$2, ebc $$3) {
      return false;
   }

   public static boolean h(dfj $$0) {
      return $$0.a(apt.aU, $$0x -> $$0x.b(d) && $$0x.b(b)) && !$$0.c(d) && !$$0.c(b);
   }
}
