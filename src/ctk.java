import java.util.Optional;
import javax.annotation.Nullable;

public class ctk extends csk implements czy {
   protected static final eii a = csx.a(0.0, 0.0, 0.0, 16.0, 7.0, 16.0);
   public static final dgc b = dgb.r;
   public static final dgc c = dgb.y;
   public static final dgc d = dgb.C;
   public static final dgf e = dgb.R;
   private static final eii f = csx.a(6.0, 0.0, 6.0, 10.0, 16.0, 10.0);
   private static final int g = 5;
   private final boolean h;
   private final int i;

   public ctk(boolean $$0, int $$1, dfk.d $$2) {
      super($$2);
      this.h = $$0;
      this.i = $$1;
      this.k(this.C.b().a(b, Boolean.valueOf(true)).a(c, Boolean.valueOf(false)).a(d, Boolean.valueOf(false)).a(e, hc.c));
   }

   @Override
   public bha a(dfl $$0, cpx $$1, gw $$2, cbw $$3, bgz $$4, ehl $$5) {
      if ($$1.c_($$2) instanceof ddd $$7) {
         cjh $$8 = $$3.b($$4);
         Optional<cmm<cly>> $$9 = $$7.a($$8);
         if ($$9.isPresent()) {
            if (!$$1.B && $$7.a($$3, $$3.fS().d ? $$8.p() : $$8, $$9.get().b().d())) {
               $$3.a(app.av);
               return bha.a;
            }

            return bha.b;
         }
      }

      return bha.d;
   }

   @Override
   public void a(dfl $$0, cpx $$1, gw $$2, bis $$3) {
      if ($$0.c(b) && $$3 instanceof bji && !cns.j((bji)$$3)) {
         $$3.a($$1.ag().a(), (float)this.i);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(dfl $$0, cpx $$1, gw $$2, dfl $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         dcx $$5 = $$1.c_($$2);
         if ($$5 instanceof ddd) {
            bgw.a($$1, $$2, ((ddd)$$5).c());
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Nullable
   @Override
   public dfl a(clp $$0) {
      cpy $$1 = $$0.q();
      gw $$2 = $$0.a();
      boolean $$3 = $$1.b_($$2).a() == eap.c;
      return this.n().a(d, Boolean.valueOf($$3)).a(c, Boolean.valueOf(this.n($$1.a_($$2.d())))).a(b, Boolean.valueOf(!$$3)).a(e, $$0.g());
   }

   @Override
   public dfl a(dfl $$0, hc $$1, dfl $$2, cpy $$3, gw $$4, gw $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, eap.c, eap.c.a($$3));
      }

      return $$1 == hc.a ? $$0.a(c, Boolean.valueOf(this.n($$2))) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   private boolean n(dfl $$0) {
      return $$0.a(csy.ij);
   }

   @Override
   public eii a(dfl $$0, cpd $$1, gw $$2, ehu $$3) {
      return a;
   }

   @Override
   public czc b_(dfl $$0) {
      return czc.c;
   }

   @Override
   public void a(dfl $$0, cpx $$1, gw $$2, ase $$3) {
      if ($$0.c(b)) {
         if ($$3.a(10) == 0) {
            $$1.a((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, apf.db, apg.e, 0.5F + $$3.i(), $$3.i() * 0.7F + 0.6F, false);
         }

         if (this.h && $$3.a(5) == 0) {
            for (int $$4 = 0; $$4 < $$3.a(1) + 1; $$4++) {
               $$1.a(ix.T, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, (double)($$3.i() / 2.0F), 5.0E-5, (double)($$3.i() / 2.0F));
            }
         }
      }
   }

   public static void a(@Nullable bis $$0, cpy $$1, gw $$2, dfl $$3) {
      if ($$1.w_()) {
         for (int $$4 = 0; $$4 < 20; $$4++) {
            a((cpx)$$1, $$2, $$3.c(c), true);
         }
      }

      dcx $$5 = $$1.c_($$2);
      if ($$5 instanceof ddd) {
         ((ddd)$$5).f();
      }

      $$1.a($$0, djv.c, $$2);
   }

   @Override
   public boolean a(cpy $$0, gw $$1, dfl $$2, eao $$3) {
      if (!$$2.c(dgb.C) && $$3.a() == eap.c) {
         boolean $$4 = $$2.c(b);
         if ($$4) {
            if (!$$0.w_()) {
               $$0.a(null, $$1, apf.iY, apg.e, 1.0F, 1.0F);
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
   public void a(cpx $$0, dfl $$1, ehl $$2, cco $$3) {
      gw $$4 = $$2.a();
      if (!$$0.B && $$3.bM() && $$3.a($$0, $$4) && !$$1.c(b) && !$$1.c(d)) {
         $$0.a($$4, $$1.a(dgb.r, Boolean.valueOf(true)), 11);
      }
   }

   public static void a(cpx $$0, gw $$1, boolean $$2, boolean $$3) {
      ase $$4 = $$0.D_();
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

   public static boolean a(cpx $$0, gw $$1) {
      for (int $$2 = 1; $$2 <= 5; $$2++) {
         gw $$3 = $$1.c($$2);
         dfl $$4 = $$0.a_($$3);
         if (g($$4)) {
            return true;
         }

         boolean $$5 = eif.c(f, $$4.b($$0, $$1, ehu.a()), eht.i);
         if ($$5) {
            dfl $$6 = $$0.a_($$3.d());
            return g($$6);
         }
      }

      return false;
   }

   public static boolean g(dfl $$0) {
      return $$0.b(b) && $$0.a(apu.aU) && $$0.c(b);
   }

   @Override
   public eao c_(dfl $$0) {
      return $$0.c(d) ? eap.c.a(false) : super.c_($$0);
   }

   @Override
   public dfl a(dfl $$0, czj $$1) {
      return $$0.a(e, $$1.a($$0.c(e)));
   }

   @Override
   public dfl a(dfl $$0, cxs $$1) {
      return $$0.a($$1.a($$0.c(e)));
   }

   @Override
   protected void a(dfm.a<csx, dfl> $$0) {
      $$0.a(b, c, d, e);
   }

   @Override
   public dcx a(gw $$0, dfl $$1) {
      return new ddd($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dcx> dcy<T> a(cpx $$0, dfl $$1, dcz<T> $$2) {
      if ($$0.B) {
         return $$1.c(b) ? a($$2, dcz.G, ddd::c) : null;
      } else {
         return $$1.c(b) ? a($$2, dcz.G, ddd::a) : a($$2, dcz.G, ddd::b);
      }
   }

   @Override
   public boolean a(dfl $$0, cpd $$1, gw $$2, ebe $$3) {
      return false;
   }

   public static boolean h(dfl $$0) {
      return $$0.a(apu.aU, $$0x -> $$0x.b(d) && $$0x.b(b)) && !$$0.c(d) && !$$0.c(b);
   }
}
