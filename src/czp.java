import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class czp extends csd {
   private static final float c = 1.0F;
   private static final eib d = csq.a(0.0, 15.0, 0.0, 16.0, 16.0, 16.0);
   private static final eib e = csq.a(0.0, 0.0, 0.0, 16.0, 1.0, 16.0);
   private static final eib f = csq.a(0.0, 0.0, 0.0, 1.0, 16.0, 16.0);
   private static final eib g = csq.a(15.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   private static final eib h = csq.a(0.0, 0.0, 0.0, 16.0, 16.0, 1.0);
   private static final eib i = csq.a(0.0, 0.0, 15.0, 16.0, 16.0, 16.0);
   private static final Map<hc, eib> j = ac.a(Maps.newEnumMap(hc.class), $$0 -> {
      $$0.put(hc.c, h);
      $$0.put(hc.f, g);
      $$0.put(hc.d, i);
      $$0.put(hc.e, f);
      $$0.put(hc.b, d);
      $$0.put(hc.a, e);
   });
   public static final dgc<hc> a = cup.a;
   public static final aeu b = new aeu("contents");
   @Nullable
   private final cho k;

   public czp(@Nullable cho $$0, dfd.d $$1) {
      super($$1);
      this.k = $$0;
      this.k(this.C.b().a(a, hc.b));
   }

   @Override
   public dcq a(gw $$0, dfe $$1) {
      return new ddx(this.k, $$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dcq> dcr<T> a(cpq $$0, dfe $$1, dcs<T> $$2) {
      return a($$2, dcs.x, ddx::a);
   }

   @Override
   public cyv b_(dfe $$0) {
      return cyv.b;
   }

   @Override
   public bgt a(dfe $$0, cpq $$1, gw $$2, cbp $$3, bgs $$4, ehe $$5) {
      if ($$1.B) {
         return bgt.a;
      } else if ($$3.G_()) {
         return bgt.b;
      } else if ($$1.c_($$2) instanceof ddx $$7) {
         if (a($$0, $$1, $$2, $$7)) {
            $$3.a($$7);
            $$3.a(apj.aq);
            cag.a($$3, true);
         }

         return bgt.b;
      } else {
         return bgt.d;
      }
   }

   private static boolean a(dfe $$0, cpq $$1, gw $$2, ddx $$3) {
      if ($$3.i() != ddx.a.a) {
         return true;
      } else {
         ehd $$4 = bzj.a($$0.c(a), 0.0F, 0.5F).a($$2).h(1.0E-6);
         return $$1.b($$4);
      }
   }

   @Override
   public dfe a(cli $$0) {
      return this.n().a(a, $$0.k());
   }

   @Override
   protected void a(dff.a<csq, dfe> $$0) {
      $$0.a(a);
   }

   @Override
   public void a(cpq $$0, gw $$1, dfe $$2, cbp $$3) {
      dcq $$4 = $$0.c_($$1);
      if ($$4 instanceof ddx $$5) {
         if (!$$0.B && $$3.f() && !$$5.aa_()) {
            cja $$6 = b(this.a());
            $$4.e($$6);
            if ($$5.ac()) {
               $$6.a($$5.ad());
            }

            byi $$7 = new byi($$0, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, $$6);
            $$7.o();
            $$0.b($$7);
         } else {
            $$5.e($$3);
         }
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public List<cja> a(dfe $$0, ecr.a $$1) {
      dcq $$2 = $$1.b(eew.h);
      if ($$2 instanceof ddx $$3) {
         $$1 = $$1.a(b, $$1x -> {
            for (int $$2x = 0; $$2x < $$3.b(); $$2x++) {
               $$1x.accept($$3.a($$2x));
            }
         });
      }

      return super.a($$0, $$1);
   }

   @Override
   public void a(cpq $$0, gw $$1, dfe $$2, bjb $$3, cja $$4) {
      if ($$4.A()) {
         dcq $$5 = $$0.c_($$1);
         if ($$5 instanceof ddx) {
            ((ddx)$$5).a($$4.y());
         }
      }
   }

   @Override
   public void a(dfe $$0, cpq $$1, gw $$2, dfe $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         dcq $$5 = $$1.c_($$2);
         if ($$5 instanceof ddx) {
            $$1.c($$2, $$0.b());
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public void a(cja $$0, @Nullable cow $$1, List<ti> $$2, ckr $$3) {
      super.a($$0, $$1, $$2, $$3);
      qu $$4 = cgt.a($$0);
      if ($$4 != null) {
         if ($$4.b("LootTable", 8)) {
            $$2.add(ti.b("???????"));
         }

         if ($$4.b("Items", 9)) {
            hp<cja> $$5 = hp.a(27, cja.b);
            bgn.b($$4, $$5);
            int $$6 = 0;
            int $$7 = 0;

            for (cja $$8 : $$5) {
               if (!$$8.b()) {
                  $$7++;
                  if ($$6 <= 4) {
                     $$6++;
                     tv $$9 = $$8.y().e();
                     $$9.f(" x").f(String.valueOf($$8.L()));
                     $$2.add($$9);
                  }
               }
            }

            if ($$7 - $$6 > 0) {
               $$2.add(ti.a("container.shulkerBox.more", $$7 - $$6).a(n.u));
            }
         }
      }
   }

   @Override
   public eib b_(dfe $$0, cow $$1, gw $$2) {
      if ($$1.c_($$2) instanceof ddx $$4 && !$$4.v()) {
         return j.get($$0.c(a).g());
      }

      return ehy.b();
   }

   @Override
   public eib a(dfe $$0, cow $$1, gw $$2, ehn $$3) {
      dcq $$4 = $$1.c_($$2);
      return $$4 instanceof ddx ? ehy.a(((ddx)$$4).a($$0)) : ehy.b();
   }

   @Override
   public boolean d_(dfe $$0) {
      return true;
   }

   @Override
   public int a(dfe $$0, cpq $$1, gw $$2) {
      return ceg.a($$1.c_($$2));
   }

   @Override
   public cja a(cow $$0, gw $$1, dfe $$2) {
      cja $$3 = super.a($$0, $$1, $$2);
      $$0.a($$1, dcs.x).ifPresent($$1x -> $$1x.e($$3));
      return $$3;
   }

   @Nullable
   public static cho b(civ $$0) {
      return a(csq.a($$0));
   }

   @Nullable
   public static cho a(csq $$0) {
      return $$0 instanceof czp ? ((czp)$$0).a() : null;
   }

   public static csq a(@Nullable cho $$0) {
      if ($$0 == null) {
         return csr.kP;
      } else {
         switch ($$0) {
            case a:
               return csr.kQ;
            case b:
               return csr.kR;
            case c:
               return csr.kS;
            case d:
               return csr.kT;
            case e:
               return csr.kU;
            case f:
               return csr.kV;
            case g:
               return csr.kW;
            case h:
               return csr.kX;
            case i:
               return csr.kY;
            case j:
               return csr.kZ;
            case k:
            default:
               return csr.la;
            case l:
               return csr.lb;
            case m:
               return csr.lc;
            case n:
               return csr.ld;
            case o:
               return csr.le;
            case p:
               return csr.lf;
         }
      }
   }

   @Nullable
   public cho a() {
      return this.k;
   }

   public static cja b(@Nullable cho $$0) {
      return new cja(a($$0));
   }

   @Override
   public dfe a(dfe $$0, czc $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   public dfe a(dfe $$0, cxl $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }
}
