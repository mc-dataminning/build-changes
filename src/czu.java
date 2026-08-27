import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class czu extends csi {
   private static final float c = 1.0F;
   private static final eig d = csv.a(0.0, 15.0, 0.0, 16.0, 16.0, 16.0);
   private static final eig e = csv.a(0.0, 0.0, 0.0, 16.0, 1.0, 16.0);
   private static final eig f = csv.a(0.0, 0.0, 0.0, 1.0, 16.0, 16.0);
   private static final eig g = csv.a(15.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   private static final eig h = csv.a(0.0, 0.0, 0.0, 16.0, 16.0, 1.0);
   private static final eig i = csv.a(0.0, 0.0, 15.0, 16.0, 16.0, 16.0);
   private static final Map<hc, eig> j = ac.a(Maps.newEnumMap(hc.class), $$0 -> {
      $$0.put(hc.c, h);
      $$0.put(hc.f, g);
      $$0.put(hc.d, i);
      $$0.put(hc.e, f);
      $$0.put(hc.b, d);
      $$0.put(hc.a, e);
   });
   public static final dgh<hc> a = cuu.a;
   public static final aex b = new aex("contents");
   @Nullable
   private final cht k;

   public czu(@Nullable cht $$0, dfi.d $$1) {
      super($$1);
      this.k = $$0;
      this.k(this.C.b().a(a, hc.b));
   }

   @Override
   public dcv a(gw $$0, dfj $$1) {
      return new dec(this.k, $$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dcv> dcw<T> a(cpv $$0, dfj $$1, dcx<T> $$2) {
      return a($$2, dcx.x, dec::a);
   }

   @Override
   public cza b_(dfj $$0) {
      return cza.b;
   }

   @Override
   public bgy a(dfj $$0, cpv $$1, gw $$2, cbu $$3, bgx $$4, ehj $$5) {
      if ($$1.B) {
         return bgy.a;
      } else if ($$3.M_()) {
         return bgy.b;
      } else if ($$1.c_($$2) instanceof dec $$7) {
         if (a($$0, $$1, $$2, $$7)) {
            $$3.a($$7);
            $$3.a(apo.aq);
            cal.a($$3, true);
         }

         return bgy.b;
      } else {
         return bgy.d;
      }
   }

   private static boolean a(dfj $$0, cpv $$1, gw $$2, dec $$3) {
      if ($$3.i() != dec.a.a) {
         return true;
      } else {
         ehi $$4 = bzo.a($$0.c(a), 0.0F, 0.5F).a($$2).h(1.0E-6);
         return $$1.b($$4);
      }
   }

   @Override
   public dfj a(cln $$0) {
      return this.n().a(a, $$0.k());
   }

   @Override
   protected void a(dfk.a<csv, dfj> $$0) {
      $$0.a(a);
   }

   @Override
   public void a(cpv $$0, gw $$1, dfj $$2, cbu $$3) {
      dcv $$4 = $$0.c_($$1);
      if ($$4 instanceof dec $$5) {
         if (!$$0.B && $$3.f() && !$$5.af_()) {
            cjf $$6 = b(this.a());
            $$4.e($$6);
            if ($$5.ac()) {
               $$6.a($$5.ad());
            }

            byn $$7 = new byn($$0, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, $$6);
            $$7.t();
            $$0.b($$7);
         } else {
            $$5.e($$3);
         }
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public List<cjf> a(dfj $$0, ecw.a $$1) {
      dcv $$2 = $$1.b(efb.h);
      if ($$2 instanceof dec $$3) {
         $$1 = $$1.a(b, $$1x -> {
            for (int $$2x = 0; $$2x < $$3.b(); $$2x++) {
               $$1x.accept($$3.a($$2x));
            }
         });
      }

      return super.a($$0, $$1);
   }

   @Override
   public void a(cpv $$0, gw $$1, dfj $$2, bjg $$3, cjf $$4) {
      if ($$4.A()) {
         dcv $$5 = $$0.c_($$1);
         if ($$5 instanceof dec) {
            ((dec)$$5).a($$4.y());
         }
      }
   }

   @Override
   public void a(dfj $$0, cpv $$1, gw $$2, dfj $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         dcv $$5 = $$1.c_($$2);
         if ($$5 instanceof dec) {
            $$1.c($$2, $$0.b());
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public void a(cjf $$0, @Nullable cpb $$1, List<tm> $$2, ckw $$3) {
      super.a($$0, $$1, $$2, $$3);
      qy $$4 = cgy.a($$0);
      if ($$4 != null) {
         if ($$4.b("LootTable", 8)) {
            $$2.add(tm.c("container.shulkerBox.unknownContents"));
         }

         if ($$4.b("Items", 9)) {
            hp<cjf> $$5 = hp.a(27, cjf.b);
            bgs.b($$4, $$5);
            int $$6 = 0;
            int $$7 = 0;

            for (cjf $$8 : $$5) {
               if (!$$8.b()) {
                  $$7++;
                  if ($$6 <= 4) {
                     $$6++;
                     $$2.add(tm.a("container.shulkerBox.itemCount", $$8.y(), String.valueOf($$8.L())));
                  }
               }
            }

            if ($$7 - $$6 > 0) {
               $$2.add(tm.a("container.shulkerBox.more", $$7 - $$6).a(n.u));
            }
         }
      }
   }

   @Override
   public eig b_(dfj $$0, cpb $$1, gw $$2) {
      if ($$1.c_($$2) instanceof dec $$4 && !$$4.v()) {
         return j.get($$0.c(a).g());
      }

      return eid.b();
   }

   @Override
   public eig a(dfj $$0, cpb $$1, gw $$2, ehs $$3) {
      dcv $$4 = $$1.c_($$2);
      return $$4 instanceof dec ? eid.a(((dec)$$4).a($$0)) : eid.b();
   }

   @Override
   public boolean d_(dfj $$0) {
      return true;
   }

   @Override
   public int a(dfj $$0, cpv $$1, gw $$2) {
      return cel.a($$1.c_($$2));
   }

   @Override
   public cjf a(cpb $$0, gw $$1, dfj $$2) {
      cjf $$3 = super.a($$0, $$1, $$2);
      $$0.a($$1, dcx.x).ifPresent($$1x -> $$1x.e($$3));
      return $$3;
   }

   @Nullable
   public static cht b(cja $$0) {
      return a(csv.a($$0));
   }

   @Nullable
   public static cht a(csv $$0) {
      return $$0 instanceof czu ? ((czu)$$0).a() : null;
   }

   public static csv a(@Nullable cht $$0) {
      if ($$0 == null) {
         return csw.kP;
      } else {
         switch ($$0) {
            case a:
               return csw.kQ;
            case b:
               return csw.kR;
            case c:
               return csw.kS;
            case d:
               return csw.kT;
            case e:
               return csw.kU;
            case f:
               return csw.kV;
            case g:
               return csw.kW;
            case h:
               return csw.kX;
            case i:
               return csw.kY;
            case j:
               return csw.kZ;
            case k:
            default:
               return csw.la;
            case l:
               return csw.lb;
            case m:
               return csw.lc;
            case n:
               return csw.ld;
            case o:
               return csw.le;
            case p:
               return csw.lf;
         }
      }
   }

   @Nullable
   public cht a() {
      return this.k;
   }

   public static cjf b(@Nullable cht $$0) {
      return new cjf(a($$0));
   }

   @Override
   public dfj a(dfj $$0, czh $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   public dfj a(dfj $$0, cxq $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }
}
