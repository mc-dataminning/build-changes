import java.util.Optional;
import javax.annotation.Nullable;

public class csz extends crz implements czn {
   protected static final ehx a = csm.a(0.0, 0.0, 0.0, 16.0, 7.0, 16.0);
   public static final dfr b = dfq.r;
   public static final dfr c = dfq.y;
   public static final dfr d = dfq.C;
   public static final dfu e = dfq.R;
   private static final ehx f = csm.a(6.0, 0.0, 6.0, 10.0, 16.0, 10.0);
   private static final int g = 5;
   private final boolean h;
   private final int i;

   public csz(boolean $$0, int $$1, dez.d $$2) {
      super($$2);
      this.h = $$0;
      this.i = $$1;
      this.k(this.C.b().a(b, Boolean.valueOf(true)).a(c, Boolean.valueOf(false)).a(d, Boolean.valueOf(false)).a(e, ha.c));
   }

   @Override
   public bgq a(dfa $$0, cpm $$1, gu $$2, cbn $$3, bgp $$4, eha $$5) {
      if ($$1.c_($$2) instanceof dcs $$7) {
         ciy $$8 = $$3.b($$4);
         Optional<clp> $$9 = $$7.a($$8);
         if ($$9.isPresent()) {
            if (!$$1.B && $$7.a($$3, $$3.fR().d ? $$8.p() : $$8, $$9.get().d())) {
               $$3.a(apg.av);
               return bgq.a;
            }

            return bgq.b;
         }
      }

      return bgq.d;
   }

   @Override
   public void a(dfa $$0, cpm $$1, gu $$2, bii $$3) {
      if ($$0.c(b) && $$3 instanceof biy && !cnh.j((biy)$$3)) {
         $$3.a($$1.ag().a(), (float)this.i);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(dfa $$0, cpm $$1, gu $$2, dfa $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         dcm $$5 = $$1.c_($$2);
         if ($$5 instanceof dcs) {
            bgm.a($$1, $$2, ((dcs)$$5).c());
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Nullable
   @Override
   public dfa a(clg $$0) {
      cpn $$1 = $$0.q();
      gu $$2 = $$0.a();
      boolean $$3 = $$1.b_($$2).a() == eae.c;
      return this.n().a(d, Boolean.valueOf($$3)).a(c, Boolean.valueOf(this.n($$1.a_($$2.d())))).a(b, Boolean.valueOf(!$$3)).a(e, $$0.g());
   }

   @Override
   public dfa a(dfa $$0, ha $$1, dfa $$2, cpn $$3, gu $$4, gu $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, eae.c, eae.c.a($$3));
      }

      return $$1 == ha.a ? $$0.a(c, Boolean.valueOf(this.n($$2))) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   private boolean n(dfa $$0) {
      return $$0.a(csn.ij);
   }

   @Override
   public ehx a(dfa $$0, cos $$1, gu $$2, ehj $$3) {
      return a;
   }

   @Override
   public cyr b_(dfa $$0) {
      return cyr.c;
   }

   @Override
   public void a(dfa $$0, cpm $$1, gu $$2, aru $$3) {
      if ($$0.c(b)) {
         if ($$3.a(10) == 0) {
            $$1.a((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, aow.db, aox.e, 0.5F + $$3.i(), $$3.i() * 0.7F + 0.6F, false);
         }

         if (this.h && $$3.a(5) == 0) {
            for (int $$4 = 0; $$4 < $$3.a(1) + 1; $$4++) {
               $$1.a(iv.T, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, (double)($$3.i() / 2.0F), 5.0E-5, (double)($$3.i() / 2.0F));
            }
         }
      }
   }

   public static void a(@Nullable bii $$0, cpn $$1, gu $$2, dfa $$3) {
      if ($$1.r_()) {
         for (int $$4 = 0; $$4 < 20; $$4++) {
            a((cpm)$$1, $$2, $$3.c(c), true);
         }
      }

      dcm $$5 = $$1.c_($$2);
      if ($$5 instanceof dcs) {
         ((dcs)$$5).f();
      }

      $$1.a($$0, djk.c, $$2);
   }

   @Override
   public boolean a(cpn $$0, gu $$1, dfa $$2, ead $$3) {
      if (!$$2.c(dfq.C) && $$3.a() == eae.c) {
         boolean $$4 = $$2.c(b);
         if ($$4) {
            if (!$$0.r_()) {
               $$0.a(null, $$1, aow.iY, aox.e, 1.0F, 1.0F);
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
   public void a(cpm $$0, dfa $$1, eha $$2, ccf $$3) {
      gu $$4 = $$2.a();
      if (!$$0.B && $$3.bM() && $$3.a($$0, $$4) && !$$1.c(b) && !$$1.c(d)) {
         $$0.a($$4, $$1.a(dfq.r, Boolean.valueOf(true)), 11);
      }
   }

   public static void a(cpm $$0, gu $$1, boolean $$2, boolean $$3) {
      aru $$4 = $$0.y_();
      iy $$5 = $$2 ? iv.ao : iv.an;
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
            iv.Z,
            (double)$$1.u() + 0.5 + $$4.j() / 4.0 * (double)($$4.h() ? 1 : -1),
            (double)$$1.v() + 0.4,
            (double)$$1.w() + 0.5 + $$4.j() / 4.0 * (double)($$4.h() ? 1 : -1),
            0.0,
            0.005,
            0.0
         );
      }
   }

   public static boolean a(cpm $$0, gu $$1) {
      for (int $$2 = 1; $$2 <= 5; $$2++) {
         gu $$3 = $$1.c($$2);
         dfa $$4 = $$0.a_($$3);
         if (g($$4)) {
            return true;
         }

         boolean $$5 = ehu.c(f, $$4.b($$0, $$1, ehj.a()), ehi.i);
         if ($$5) {
            dfa $$6 = $$0.a_($$3.d());
            return g($$6);
         }
      }

      return false;
   }

   public static boolean g(dfa $$0) {
      return $$0.b(b) && $$0.a(apl.aU) && $$0.c(b);
   }

   @Override
   public ead c_(dfa $$0) {
      return $$0.c(d) ? eae.c.a(false) : super.c_($$0);
   }

   @Override
   public dfa a(dfa $$0, cyy $$1) {
      return $$0.a(e, $$1.a($$0.c(e)));
   }

   @Override
   public dfa a(dfa $$0, cxh $$1) {
      return $$0.a($$1.a($$0.c(e)));
   }

   @Override
   protected void a(dfb.a<csm, dfa> $$0) {
      $$0.a(b, c, d, e);
   }

   @Override
   public dcm a(gu $$0, dfa $$1) {
      return new dcs($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dcm> dcn<T> a(cpm $$0, dfa $$1, dco<T> $$2) {
      if ($$0.B) {
         return $$1.c(b) ? a($$2, dco.G, dcs::c) : null;
      } else {
         return $$1.c(b) ? a($$2, dco.G, dcs::a) : a($$2, dco.G, dcs::b);
      }
   }

   @Override
   public boolean a(dfa $$0, cos $$1, gu $$2, eat $$3) {
      return false;
   }

   public static boolean h(dfa $$0) {
      return $$0.a(apl.aU, $$0x -> $$0x.b(d) && $$0x.b(b)) && !$$0.c(d) && !$$0.c(b);
   }
}
