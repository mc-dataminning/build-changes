import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class czw extends csk {
   private static final float c = 1.0F;
   private static final eii d = csx.a(0.0, 15.0, 0.0, 16.0, 16.0, 16.0);
   private static final eii e = csx.a(0.0, 0.0, 0.0, 16.0, 1.0, 16.0);
   private static final eii f = csx.a(0.0, 0.0, 0.0, 1.0, 16.0, 16.0);
   private static final eii g = csx.a(15.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   private static final eii h = csx.a(0.0, 0.0, 0.0, 16.0, 16.0, 1.0);
   private static final eii i = csx.a(0.0, 0.0, 15.0, 16.0, 16.0, 16.0);
   private static final Map<hc, eii> j = ac.a(Maps.newEnumMap(hc.class), $$0 -> {
      $$0.put(hc.c, h);
      $$0.put(hc.f, g);
      $$0.put(hc.d, i);
      $$0.put(hc.e, f);
      $$0.put(hc.b, d);
      $$0.put(hc.a, e);
   });
   public static final dgj<hc> a = cuw.a;
   public static final aey b = new aey("contents");
   @Nullable
   private final chv k;

   public czw(@Nullable chv $$0, dfk.d $$1) {
      super($$1);
      this.k = $$0;
      this.k(this.C.b().a(a, hc.b));
   }

   @Override
   public dcx a(gw $$0, dfl $$1) {
      return new dee(this.k, $$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dcx> dcy<T> a(cpx $$0, dfl $$1, dcz<T> $$2) {
      return a($$2, dcz.x, dee::a);
   }

   @Override
   public czc b_(dfl $$0) {
      return czc.b;
   }

   @Override
   public bha a(dfl $$0, cpx $$1, gw $$2, cbw $$3, bgz $$4, ehl $$5) {
      if ($$1.B) {
         return bha.a;
      } else if ($$3.M_()) {
         return bha.b;
      } else if ($$1.c_($$2) instanceof dee $$7) {
         if (a($$0, $$1, $$2, $$7)) {
            $$3.a($$7);
            $$3.a(app.aq);
            can.a($$3, true);
         }

         return bha.b;
      } else {
         return bha.d;
      }
   }

   private static boolean a(dfl $$0, cpx $$1, gw $$2, dee $$3) {
      if ($$3.i() != dee.a.a) {
         return true;
      } else {
         ehk $$4 = bzq.a($$0.c(a), 0.0F, 0.5F).a($$2).h(1.0E-6);
         return $$1.b($$4);
      }
   }

   @Override
   public dfl a(clp $$0) {
      return this.n().a(a, $$0.k());
   }

   @Override
   protected void a(dfm.a<csx, dfl> $$0) {
      $$0.a(a);
   }

   @Override
   public void a(cpx $$0, gw $$1, dfl $$2, cbw $$3) {
      dcx $$4 = $$0.c_($$1);
      if ($$4 instanceof dee $$5) {
         if (!$$0.B && $$3.f() && !$$5.af_()) {
            cjh $$6 = b(this.a());
            $$4.e($$6);
            if ($$5.ac()) {
               $$6.a($$5.ad());
            }

            byp $$7 = new byp($$0, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, $$6);
            $$7.t();
            $$0.b($$7);
         } else {
            $$5.e($$3);
         }
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public List<cjh> a(dfl $$0, ecy.a $$1) {
      dcx $$2 = $$1.b(efd.h);
      if ($$2 instanceof dee $$3) {
         $$1 = $$1.a(b, $$1x -> {
            for (int $$2x = 0; $$2x < $$3.b(); $$2x++) {
               $$1x.accept($$3.a($$2x));
            }
         });
      }

      return super.a($$0, $$1);
   }

   @Override
   public void a(cpx $$0, gw $$1, dfl $$2, bji $$3, cjh $$4) {
      if ($$4.A()) {
         dcx $$5 = $$0.c_($$1);
         if ($$5 instanceof dee) {
            ((dee)$$5).a($$4.y());
         }
      }
   }

   @Override
   public void a(dfl $$0, cpx $$1, gw $$2, dfl $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         dcx $$5 = $$1.c_($$2);
         if ($$5 instanceof dee) {
            $$1.c($$2, $$0.b());
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public void a(cjh $$0, @Nullable cpd $$1, List<tn> $$2, cky $$3) {
      super.a($$0, $$1, $$2, $$3);
      qy $$4 = cha.a($$0);
      if ($$4 != null) {
         if ($$4.b("LootTable", 8)) {
            $$2.add(tn.c("container.shulkerBox.unknownContents"));
         }

         if ($$4.b("Items", 9)) {
            hp<cjh> $$5 = hp.a(27, cjh.b);
            bgu.b($$4, $$5);
            int $$6 = 0;
            int $$7 = 0;

            for (cjh $$8 : $$5) {
               if (!$$8.b()) {
                  $$7++;
                  if ($$6 <= 4) {
                     $$6++;
                     $$2.add(tn.a("container.shulkerBox.itemCount", $$8.y(), String.valueOf($$8.L())));
                  }
               }
            }

            if ($$7 - $$6 > 0) {
               $$2.add(tn.a("container.shulkerBox.more", $$7 - $$6).a(n.u));
            }
         }
      }
   }

   @Override
   public eii b_(dfl $$0, cpd $$1, gw $$2) {
      if ($$1.c_($$2) instanceof dee $$4 && !$$4.v()) {
         return j.get($$0.c(a).g());
      }

      return eif.b();
   }

   @Override
   public eii a(dfl $$0, cpd $$1, gw $$2, ehu $$3) {
      dcx $$4 = $$1.c_($$2);
      return $$4 instanceof dee ? eif.a(((dee)$$4).a($$0)) : eif.b();
   }

   @Override
   public boolean d_(dfl $$0) {
      return true;
   }

   @Override
   public int a(dfl $$0, cpx $$1, gw $$2) {
      return cen.a($$1.c_($$2));
   }

   @Override
   public cjh a(cpd $$0, gw $$1, dfl $$2) {
      cjh $$3 = super.a($$0, $$1, $$2);
      $$0.a($$1, dcz.x).ifPresent($$1x -> $$1x.e($$3));
      return $$3;
   }

   @Nullable
   public static chv b(cjc $$0) {
      return a(csx.a($$0));
   }

   @Nullable
   public static chv a(csx $$0) {
      return $$0 instanceof czw ? ((czw)$$0).a() : null;
   }

   public static csx a(@Nullable chv $$0) {
      if ($$0 == null) {
         return csy.kP;
      } else {
         switch ($$0) {
            case a:
               return csy.kQ;
            case b:
               return csy.kR;
            case c:
               return csy.kS;
            case d:
               return csy.kT;
            case e:
               return csy.kU;
            case f:
               return csy.kV;
            case g:
               return csy.kW;
            case h:
               return csy.kX;
            case i:
               return csy.kY;
            case j:
               return csy.kZ;
            case k:
            default:
               return csy.la;
            case l:
               return csy.lb;
            case m:
               return csy.lc;
            case n:
               return csy.ld;
            case o:
               return csy.le;
            case p:
               return csy.lf;
         }
      }
   }

   @Nullable
   public chv a() {
      return this.k;
   }

   public static cjh b(@Nullable chv $$0) {
      return new cjh(a($$0));
   }

   @Override
   public dfl a(dfl $$0, czj $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   public dfl a(dfl $$0, cxs $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }
}
