import java.util.Optional;
import javax.annotation.Nullable;

public class ctd extends csd implements czr {
   protected static final eib a = csq.a(0.0, 0.0, 0.0, 16.0, 7.0, 16.0);
   public static final dfv b = dfu.r;
   public static final dfv c = dfu.y;
   public static final dfv d = dfu.C;
   public static final dfy e = dfu.R;
   private static final eib f = csq.a(6.0, 0.0, 6.0, 10.0, 16.0, 10.0);
   private static final int g = 5;
   private final boolean h;
   private final int i;

   public ctd(boolean $$0, int $$1, dfd.d $$2) {
      super($$2);
      this.h = $$0;
      this.i = $$1;
      this.k(this.C.b().a(b, Boolean.valueOf(true)).a(c, Boolean.valueOf(false)).a(d, Boolean.valueOf(false)).a(e, hc.c));
   }

   @Override
   public bgt a(dfe $$0, cpq $$1, gw $$2, cbp $$3, bgs $$4, ehe $$5) {
      if ($$1.c_($$2) instanceof dcw $$7) {
         cja $$8 = $$3.b($$4);
         Optional<cmf<clr>> $$9 = $$7.a($$8);
         if ($$9.isPresent()) {
            if (!$$1.B && $$7.a($$3, $$3.fR().d ? $$8.p() : $$8, $$9.get().b().d())) {
               $$3.a(apj.av);
               return bgt.a;
            }

            return bgt.b;
         }
      }

      return bgt.d;
   }

   @Override
   public void a(dfe $$0, cpq $$1, gw $$2, bil $$3) {
      if ($$0.c(b) && $$3 instanceof bjb && !cnl.j((bjb)$$3)) {
         $$3.a($$1.ag().a(), (float)this.i);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(dfe $$0, cpq $$1, gw $$2, dfe $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         dcq $$5 = $$1.c_($$2);
         if ($$5 instanceof dcw) {
            bgp.a($$1, $$2, ((dcw)$$5).c());
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Nullable
   @Override
   public dfe a(cli $$0) {
      cpr $$1 = $$0.q();
      gw $$2 = $$0.a();
      boolean $$3 = $$1.b_($$2).a() == eai.c;
      return this.n().a(d, Boolean.valueOf($$3)).a(c, Boolean.valueOf(this.n($$1.a_($$2.d())))).a(b, Boolean.valueOf(!$$3)).a(e, $$0.g());
   }

   @Override
   public dfe a(dfe $$0, hc $$1, dfe $$2, cpr $$3, gw $$4, gw $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, eai.c, eai.c.a($$3));
      }

      return $$1 == hc.a ? $$0.a(c, Boolean.valueOf(this.n($$2))) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   private boolean n(dfe $$0) {
      return $$0.a(csr.ij);
   }

   @Override
   public eib a(dfe $$0, cow $$1, gw $$2, ehn $$3) {
      return a;
   }

   @Override
   public cyv b_(dfe $$0) {
      return cyv.c;
   }

   @Override
   public void a(dfe $$0, cpq $$1, gw $$2, arx $$3) {
      if ($$0.c(b)) {
         if ($$3.a(10) == 0) {
            $$1.a((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, aoz.db, apa.e, 0.5F + $$3.i(), $$3.i() * 0.7F + 0.6F, false);
         }

         if (this.h && $$3.a(5) == 0) {
            for (int $$4 = 0; $$4 < $$3.a(1) + 1; $$4++) {
               $$1.a(ix.T, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, (double)($$3.i() / 2.0F), 5.0E-5, (double)($$3.i() / 2.0F));
            }
         }
      }
   }

   public static void a(@Nullable bil $$0, cpr $$1, gw $$2, dfe $$3) {
      if ($$1.r_()) {
         for (int $$4 = 0; $$4 < 20; $$4++) {
            a((cpq)$$1, $$2, $$3.c(c), true);
         }
      }

      dcq $$5 = $$1.c_($$2);
      if ($$5 instanceof dcw) {
         ((dcw)$$5).f();
      }

      $$1.a($$0, djo.c, $$2);
   }

   @Override
   public boolean a(cpr $$0, gw $$1, dfe $$2, eah $$3) {
      if (!$$2.c(dfu.C) && $$3.a() == eai.c) {
         boolean $$4 = $$2.c(b);
         if ($$4) {
            if (!$$0.r_()) {
               $$0.a(null, $$1, aoz.iY, apa.e, 1.0F, 1.0F);
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
   public void a(cpq $$0, dfe $$1, ehe $$2, cch $$3) {
      gw $$4 = $$2.a();
      if (!$$0.B && $$3.bM() && $$3.a($$0, $$4) && !$$1.c(b) && !$$1.c(d)) {
         $$0.a($$4, $$1.a(dfu.r, Boolean.valueOf(true)), 11);
      }
   }

   public static void a(cpq $$0, gw $$1, boolean $$2, boolean $$3) {
      arx $$4 = $$0.y_();
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

   public static boolean a(cpq $$0, gw $$1) {
      for (int $$2 = 1; $$2 <= 5; $$2++) {
         gw $$3 = $$1.c($$2);
         dfe $$4 = $$0.a_($$3);
         if (g($$4)) {
            return true;
         }

         boolean $$5 = ehy.c(f, $$4.b($$0, $$1, ehn.a()), ehm.i);
         if ($$5) {
            dfe $$6 = $$0.a_($$3.d());
            return g($$6);
         }
      }

      return false;
   }

   public static boolean g(dfe $$0) {
      return $$0.b(b) && $$0.a(apo.aU) && $$0.c(b);
   }

   @Override
   public eah c_(dfe $$0) {
      return $$0.c(d) ? eai.c.a(false) : super.c_($$0);
   }

   @Override
   public dfe a(dfe $$0, czc $$1) {
      return $$0.a(e, $$1.a($$0.c(e)));
   }

   @Override
   public dfe a(dfe $$0, cxl $$1) {
      return $$0.a($$1.a($$0.c(e)));
   }

   @Override
   protected void a(dff.a<csq, dfe> $$0) {
      $$0.a(b, c, d, e);
   }

   @Override
   public dcq a(gw $$0, dfe $$1) {
      return new dcw($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dcq> dcr<T> a(cpq $$0, dfe $$1, dcs<T> $$2) {
      if ($$0.B) {
         return $$1.c(b) ? a($$2, dcs.G, dcw::c) : null;
      } else {
         return $$1.c(b) ? a($$2, dcs.G, dcw::a) : a($$2, dcs.G, dcw::b);
      }
   }

   @Override
   public boolean a(dfe $$0, cow $$1, gw $$2, eax $$3) {
      return false;
   }

   public static boolean h(dfe $$0) {
      return $$0.a(apo.aU, $$0x -> $$0x.b(d) && $$0x.b(b)) && !$$0.c(d) && !$$0.c(b);
   }
}
