import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class dfb extends det {
   public static final MapCodec<dfb> a = b(dfb::new);
   public static final dte b = djd.aE;
   public static final dtk c = dta.aN;
   public static final int d = 5;
   private static final int e = 3;

   @Override
   public MapCodec<dfb> a() {
      return a;
   }

   public dfb(dsj.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(0)).a(b, jf.c));
   }

   @Override
   protected boolean c_(dsk $$0) {
      return true;
   }

   @Override
   protected int a(dsk $$0, dcf $$1, ja $$2) {
      return $$0.c(c);
   }

   @Override
   public void a(dcf $$0, cmk $$1, ja $$2, dsk $$3, @Nullable dpp $$4, cuc $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      if (!$$0.B && $$4 instanceof dpm $$6) {
         if (!czn.a($$5, avz.q)) {
            $$6.a($$1, $$3, dpm.b.c);
            $$0.c($$2, this);
            this.b($$0, $$2);
         }

         am.L.a((aqn)$$1, $$3, $$5, $$6.f());
      }
   }

   private void b(dcf $$0, ja $$1) {
      ewa $$2 = new ewa($$1).c(8.0, 6.0, 8.0);
      List<ces> $$3 = $$0.a(ces.class, $$2);
      if (!$$3.isEmpty()) {
         List<cmk> $$4 = $$0.a(cmk.class, $$2);
         if ($$4.isEmpty()) {
            return;
         }

         for (ces $$5 : $$3) {
            if ($$5.p() == null) {
               cmk $$6 = ac.a($$4, $$0.z);
               $$5.h($$6);
            }
         }
      }
   }

   public static void a(dcf $$0, ja $$1) {
      a($$0, $$1, new cuc(cuf.wz, 3));
   }

   @Override
   protected bqi a(cuc $$0, dsk $$1, dcf $$2, ja $$3, cmk $$4, bqf $$5, ewb $$6) {
      int $$7 = $$1.c(c);
      boolean $$8 = false;
      if ($$7 >= 5) {
         ctx $$9 = $$0.g();
         if ($$0.a(cuf.rV)) {
            $$2.a($$4, $$4.dv(), $$4.dx(), $$4.dB(), avh.bX, avi.e, 1.0F, 1.0F);
            a($$2, $$3);
            $$0.a(1, $$4, btb.d($$5));
            $$8 = true;
            $$2.a($$4, dxg.M, $$3);
         } else if ($$0.a(cuf.sl)) {
            $$0.h(1);
            $$2.a($$4, $$4.dv(), $$4.dx(), $$4.dB(), avh.cC, avi.e, 1.0F, 1.0F);
            if ($$0.e()) {
               $$4.a($$5, new cuc(cuf.wC));
            } else if (!$$4.fZ().f(new cuc(cuf.wC))) {
               $$4.a(new cuc(cuf.wC), false);
            }

            $$8 = true;
            $$2.a($$4, dxg.y, $$3);
         }

         if (!$$2.x_() && $$8) {
            $$4.b(avr.c.b($$9));
         }
      }

      if ($$8) {
         if (!dfv.a($$2, $$3)) {
            if (this.c($$2, $$3)) {
               this.b($$2, $$3);
            }

            this.a($$2, $$1, $$3, $$4, dpm.b.c);
         } else {
            this.a($$2, $$1, $$3);
         }

         return bqi.a($$2.B);
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   private boolean c(dcf $$0, ja $$1) {
      return $$0.c_($$1) instanceof dpm $$3 ? !$$3.c() : false;
   }

   public void a(dcf $$0, dsk $$1, ja $$2, @Nullable cmk $$3, dpm.b $$4) {
      this.a($$0, $$1, $$2);
      if ($$0.c_($$2) instanceof dpm $$6) {
         $$6.a($$3, $$1, $$4);
      }
   }

   public void a(dcf $$0, dsk $$1, ja $$2) {
      $$0.a($$2, $$1.a(c, Integer.valueOf(0)), 3);
   }

   @Override
   public void a(dsk $$0, dcf $$1, ja $$2, ayo $$3) {
      if ($$0.c(c) >= 5) {
         for (int $$4 = 0; $$4 < $$3.a(1) + 1; $$4++) {
            this.a($$1, $$2, $$0);
         }
      }
   }

   private void a(dcf $$0, ja $$1, dsk $$2) {
      if ($$2.u().c() && !($$0.z.i() < 0.3F)) {
         ewy $$3 = $$2.k($$0, $$1);
         double $$4 = $$3.c(jf.a.b);
         if ($$4 >= 1.0 && !$$2.a(avw.ao)) {
            double $$5 = $$3.b(jf.a.b);
            if ($$5 > 0.0) {
               this.a($$0, $$1, $$3, (double)$$1.v() + $$5 - 0.05);
            } else {
               ja $$6 = $$1.d();
               dsk $$7 = $$0.a_($$6);
               ewy $$8 = $$7.k($$0, $$6);
               double $$9 = $$8.c(jf.a.b);
               if (($$9 < 1.0 || !$$7.r($$0, $$6)) && $$7.u().c()) {
                  this.a($$0, $$1, $$3, (double)$$1.v() - 0.05);
               }
            }
         }
      }
   }

   private void a(dcf $$0, ja $$1, ewy $$2, double $$3) {
      this.a($$0, (double)$$1.u() + $$2.b(jf.a.a), (double)$$1.u() + $$2.c(jf.a.a), (double)$$1.w() + $$2.b(jf.a.c), (double)$$1.w() + $$2.c(jf.a.c), $$3);
   }

   private void a(dcf $$0, double $$1, double $$2, double $$3, double $$4, double $$5) {
      $$0.a(lj.av, ayg.d($$0.z.j(), $$1, $$2), $$5, ayg.d($$0.z.j(), $$3, $$4), 0.0, 0.0, 0.0);
   }

   @Override
   public dsk a(cxm $$0) {
      return this.o().a(b, $$0.g().g());
   }

   @Override
   protected void a(dsl.a<dfh, dsk> $$0) {
      $$0.a(c, b);
   }

   @Override
   protected dln a_(dsk $$0) {
      return dln.c;
   }

   @Nullable
   @Override
   public dpp a(ja $$0, dsk $$1) {
      return new dpm($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dpp> dpq<T> a(dcf $$0, dsk $$1, dpr<T> $$2) {
      return $$0.B ? null : a($$2, dpr.H, dpm::a);
   }

   @Override
   public dsk a(dcf $$0, ja $$1, dsk $$2, cmk $$3) {
      if (!$$0.B && $$3.f() && $$0.ab().b(dcb.h) && $$0.c_($$1) instanceof dpm $$5) {
         int $$6 = $$2.c(c);
         boolean $$7 = !$$5.c();
         if ($$7 || $$6 > 0) {
            cuc $$8 = new cuc(this);
            $$8.b($$5.s());
            $$8.b(kn.ab, cwm.a.a(c, $$6));
            ciu $$9 = new ciu($$0, (double)$$1.u(), (double)$$1.v(), (double)$$1.w(), $$8);
            $$9.v();
            $$0.b($$9);
         }
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected List<cuc> a(dsk $$0, eqx.a $$1) {
      bsg $$2 = $$1.b(etq.a);
      if ($$2 instanceof civ || $$2 instanceof cjc || $$2 instanceof cnq || $$2 instanceof cih || $$2 instanceof cos) {
         dpp $$3 = $$1.b(etq.h);
         if ($$3 instanceof dpm $$4) {
            $$4.a(null, $$0, dpm.b.c);
         }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected dsk a(dsk $$0, jf $$1, dsk $$2, dcg $$3, ja $$4, ja $$5) {
      if ($$3.a_($$5).b() instanceof dih && $$3.c_($$4) instanceof dpm $$7) {
         $$7.a(null, $$0, dpm.b.c);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public dsk a(dsk $$0, dlu $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public dsk a(dsk $$0, dke $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }
}
