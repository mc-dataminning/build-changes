import java.util.Optional;
import javax.annotation.Nullable;

public class cqa extends cpa implements cwo {
   protected static final efb a = cpn.a(0.0, 0.0, 0.0, 16.0, 7.0, 16.0);
   public static final dcs b = dcr.r;
   public static final dcs c = dcr.y;
   public static final dcs d = dcr.C;
   public static final dcv e = dcr.R;
   private static final efb f = cpn.a(6.0, 0.0, 6.0, 10.0, 16.0, 10.0);
   private static final int g = 5;
   private final boolean h;
   private final int i;

   public cqa(boolean $$0, int $$1, dca.d $$2) {
      super($$2);
      this.h = $$0;
      this.i = $$1;
      this.k(this.C.b().a(b, Boolean.valueOf(true)).a(c, Boolean.valueOf(false)).a(d, Boolean.valueOf(false)).a(e, ha.c));
   }

   @Override
   public bdx a(dcb $$0, cmm $$1, gu $$2, byo $$3, bdw $$4, eee $$5) {
      if ($$1.c_($$2) instanceof czt $$7) {
         cfz $$8 = $$3.b($$4);
         Optional<ciq> $$9 = $$7.a($$8);
         if ($$9.isPresent()) {
            if (!$$1.B && $$7.a($$3, $$3.fO().d ? $$8.p() : $$8, $$9.get().d())) {
               $$3.a(amr.av);
               return bdx.a;
            }

            return bdx.b;
         }
      }

      return bdx.d;
   }

   @Override
   public void a(dcb $$0, cmm $$1, gu $$2, bfj $$3) {
      if ($$0.c(b) && $$3 instanceof bfz && !cki.j((bfz)$$3)) {
         $$3.a($$1.ag().a(), (float)this.i);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(dcb $$0, cmm $$1, gu $$2, dcb $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         czn $$5 = $$1.c_($$2);
         if ($$5 instanceof czt) {
            bdt.a($$1, $$2, ((czt)$$5).c());
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Nullable
   @Override
   public dcb a(cih $$0) {
      cmn $$1 = $$0.q();
      gu $$2 = $$0.a();
      boolean $$3 = $$1.b_($$2).a() == dxf.c;
      return this.n().a(d, Boolean.valueOf($$3)).a(c, Boolean.valueOf(this.n($$1.a_($$2.d())))).a(b, Boolean.valueOf(!$$3)).a(e, $$0.g());
   }

   @Override
   public dcb a(dcb $$0, ha $$1, dcb $$2, cmn $$3, gu $$4, gu $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, dxf.c, dxf.c.a($$3));
      }

      return $$1 == ha.a ? $$0.a(c, Boolean.valueOf(this.n($$2))) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   private boolean n(dcb $$0) {
      return $$0.a(cpo.ij);
   }

   @Override
   public efb a(dcb $$0, cls $$1, gu $$2, een $$3) {
      return a;
   }

   @Override
   public cvs b_(dcb $$0) {
      return cvs.c;
   }

   @Override
   public void a(dcb $$0, cmm $$1, gu $$2, apf $$3) {
      if ($$0.c(b)) {
         if ($$3.a(10) == 0) {
            $$1.a((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, amh.db, ami.e, 0.5F + $$3.i(), $$3.i() * 0.7F + 0.6F, false);
         }

         if (this.h && $$3.a(5) == 0) {
            for (int $$4 = 0; $$4 < $$3.a(1) + 1; $$4++) {
               $$1.a(iv.T, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, (double)($$3.i() / 2.0F), 5.0E-5, (double)($$3.i() / 2.0F));
            }
         }
      }
   }

   public static void a(@Nullable bfj $$0, cmn $$1, gu $$2, dcb $$3) {
      if ($$1.r_()) {
         for (int $$4 = 0; $$4 < 20; $$4++) {
            a((cmm)$$1, $$2, $$3.c(c), true);
         }
      }

      czn $$5 = $$1.c_($$2);
      if ($$5 instanceof czt) {
         ((czt)$$5).f();
      }

      $$1.a($$0, dgl.c, $$2);
   }

   @Override
   public boolean a(cmn $$0, gu $$1, dcb $$2, dxe $$3) {
      if (!$$2.c(dcr.C) && $$3.a() == dxf.c) {
         boolean $$4 = $$2.c(b);
         if ($$4) {
            if (!$$0.r_()) {
               $$0.a(null, $$1, amh.iY, ami.e, 1.0F, 1.0F);
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
   public void a(cmm $$0, dcb $$1, eee $$2, bzg $$3) {
      gu $$4 = $$2.a();
      if (!$$0.B && $$3.bL() && $$3.a($$0, $$4) && !$$1.c(b) && !$$1.c(d)) {
         $$0.a($$4, $$1.a(dcr.r, Boolean.valueOf(true)), 11);
      }
   }

   public static void a(cmm $$0, gu $$1, boolean $$2, boolean $$3) {
      apf $$4 = $$0.y_();
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

   public static boolean a(cmm $$0, gu $$1) {
      for (int $$2 = 1; $$2 <= 5; $$2++) {
         gu $$3 = $$1.c($$2);
         dcb $$4 = $$0.a_($$3);
         if (g($$4)) {
            return true;
         }

         boolean $$5 = eey.c(f, $$4.b($$0, $$1, een.a()), eem.i);
         if ($$5) {
            dcb $$6 = $$0.a_($$3.d());
            return g($$6);
         }
      }

      return false;
   }

   public static boolean g(dcb $$0) {
      return $$0.b(b) && $$0.a(amw.aT) && $$0.c(b);
   }

   @Override
   public dxe c_(dcb $$0) {
      return $$0.c(d) ? dxf.c.a(false) : super.c_($$0);
   }

   @Override
   public dcb a(dcb $$0, cvz $$1) {
      return $$0.a(e, $$1.a($$0.c(e)));
   }

   @Override
   public dcb a(dcb $$0, cui $$1) {
      return $$0.a($$1.a($$0.c(e)));
   }

   @Override
   protected void a(dcc.a<cpn, dcb> $$0) {
      $$0.a(b, c, d, e);
   }

   @Override
   public czn a(gu $$0, dcb $$1) {
      return new czt($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends czn> czo<T> a(cmm $$0, dcb $$1, czp<T> $$2) {
      if ($$0.B) {
         return $$1.c(b) ? a($$2, czp.G, czt::c) : null;
      } else {
         return $$1.c(b) ? a($$2, czp.G, czt::a) : a($$2, czp.G, czt::b);
      }
   }

   @Override
   public boolean a(dcb $$0, cls $$1, gu $$2, dxu $$3) {
      return false;
   }

   public static boolean h(dcb $$0) {
      return $$0.a(amw.aT, $$0x -> $$0x.b(d) && $$0x.b(b)) && !$$0.c(d) && !$$0.c(b);
   }
}
