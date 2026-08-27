import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class czl extends crz {
   private static final float c = 1.0F;
   private static final ehx d = csm.a(0.0, 15.0, 0.0, 16.0, 16.0, 16.0);
   private static final ehx e = csm.a(0.0, 0.0, 0.0, 16.0, 1.0, 16.0);
   private static final ehx f = csm.a(0.0, 0.0, 0.0, 1.0, 16.0, 16.0);
   private static final ehx g = csm.a(15.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   private static final ehx h = csm.a(0.0, 0.0, 0.0, 16.0, 16.0, 1.0);
   private static final ehx i = csm.a(0.0, 0.0, 15.0, 16.0, 16.0, 16.0);
   private static final Map<ha, ehx> j = ac.a(Maps.newEnumMap(ha.class), $$0 -> {
      $$0.put(ha.c, h);
      $$0.put(ha.f, g);
      $$0.put(ha.d, i);
      $$0.put(ha.e, f);
      $$0.put(ha.b, d);
      $$0.put(ha.a, e);
   });
   public static final dfy<ha> a = cul.a;
   public static final aer b = new aer("contents");
   @Nullable
   private final chm k;

   public czl(@Nullable chm $$0, dez.d $$1) {
      super($$1);
      this.k = $$0;
      this.k(this.C.b().a(a, ha.b));
   }

   @Override
   public dcm a(gu $$0, dfa $$1) {
      return new ddt(this.k, $$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dcm> dcn<T> a(cpm $$0, dfa $$1, dco<T> $$2) {
      return a($$2, dco.x, ddt::a);
   }

   @Override
   public cyr b_(dfa $$0) {
      return cyr.b;
   }

   @Override
   public bgq a(dfa $$0, cpm $$1, gu $$2, cbn $$3, bgp $$4, eha $$5) {
      if ($$1.B) {
         return bgq.a;
      } else if ($$3.G_()) {
         return bgq.b;
      } else if ($$1.c_($$2) instanceof ddt $$7) {
         if (a($$0, $$1, $$2, $$7)) {
            $$3.a($$7);
            $$3.a(apg.aq);
            cae.a($$3, true);
         }

         return bgq.b;
      } else {
         return bgq.d;
      }
   }

   private static boolean a(dfa $$0, cpm $$1, gu $$2, ddt $$3) {
      if ($$3.i() != ddt.a.a) {
         return true;
      } else {
         egz $$4 = bzh.a($$0.c(a), 0.0F, 0.5F).a($$2).h(1.0E-6);
         return $$1.b($$4);
      }
   }

   @Override
   public dfa a(clg $$0) {
      return this.n().a(a, $$0.k());
   }

   @Override
   protected void a(dfb.a<csm, dfa> $$0) {
      $$0.a(a);
   }

   @Override
   public void a(cpm $$0, gu $$1, dfa $$2, cbn $$3) {
      dcm $$4 = $$0.c_($$1);
      if ($$4 instanceof ddt $$5) {
         if (!$$0.B && $$3.f() && !$$5.ab_()) {
            ciy $$6 = b(this.a());
            $$4.e($$6);
            if ($$5.ac()) {
               $$6.a($$5.ad());
            }

            byg $$7 = new byg($$0, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, $$6);
            $$7.o();
            $$0.b($$7);
         } else {
            $$5.e($$3);
         }
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public List<ciy> a(dfa $$0, ecn.a $$1) {
      dcm $$2 = $$1.b(ees.h);
      if ($$2 instanceof ddt $$3) {
         $$1 = $$1.a(b, $$1x -> {
            for (int $$2x = 0; $$2x < $$3.b(); $$2x++) {
               $$1x.accept($$3.a($$2x));
            }
         });
      }

      return super.a($$0, $$1);
   }

   @Override
   public void a(cpm $$0, gu $$1, dfa $$2, biy $$3, ciy $$4) {
      if ($$4.A()) {
         dcm $$5 = $$0.c_($$1);
         if ($$5 instanceof ddt) {
            ((ddt)$$5).a($$4.y());
         }
      }
   }

   @Override
   public void a(dfa $$0, cpm $$1, gu $$2, dfa $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         dcm $$5 = $$1.c_($$2);
         if ($$5 instanceof ddt) {
            $$1.c($$2, $$0.b());
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public void a(ciy $$0, @Nullable cos $$1, List<tf> $$2, ckp $$3) {
      super.a($$0, $$1, $$2, $$3);
      qr $$4 = cgr.a($$0);
      if ($$4 != null) {
         if ($$4.b("LootTable", 8)) {
            $$2.add(tf.b("???????"));
         }

         if ($$4.b("Items", 9)) {
            hn<ciy> $$5 = hn.a(27, ciy.b);
            bgk.b($$4, $$5);
            int $$6 = 0;
            int $$7 = 0;

            for (ciy $$8 : $$5) {
               if (!$$8.b()) {
                  $$7++;
                  if ($$6 <= 4) {
                     $$6++;
                     ts $$9 = $$8.y().e();
                     $$9.f(" x").f(String.valueOf($$8.L()));
                     $$2.add($$9);
                  }
               }
            }

            if ($$7 - $$6 > 0) {
               $$2.add(tf.a("container.shulkerBox.more", $$7 - $$6).a(n.u));
            }
         }
      }
   }

   @Override
   public ehx b_(dfa $$0, cos $$1, gu $$2) {
      if ($$1.c_($$2) instanceof ddt $$4 && !$$4.v()) {
         return j.get($$0.c(a).g());
      }

      return ehu.b();
   }

   @Override
   public ehx a(dfa $$0, cos $$1, gu $$2, ehj $$3) {
      dcm $$4 = $$1.c_($$2);
      return $$4 instanceof ddt ? ehu.a(((ddt)$$4).a($$0)) : ehu.b();
   }

   @Override
   public boolean d_(dfa $$0) {
      return true;
   }

   @Override
   public int a(dfa $$0, cpm $$1, gu $$2) {
      return cee.b((bgj)$$1.c_($$2));
   }

   @Override
   public ciy a(cos $$0, gu $$1, dfa $$2) {
      ciy $$3 = super.a($$0, $$1, $$2);
      $$0.a($$1, dco.x).ifPresent($$1x -> $$1x.e($$3));
      return $$3;
   }

   @Nullable
   public static chm b(cit $$0) {
      return a(csm.a($$0));
   }

   @Nullable
   public static chm a(csm $$0) {
      return $$0 instanceof czl ? ((czl)$$0).a() : null;
   }

   public static csm a(@Nullable chm $$0) {
      if ($$0 == null) {
         return csn.kP;
      } else {
         switch ($$0) {
            case a:
               return csn.kQ;
            case b:
               return csn.kR;
            case c:
               return csn.kS;
            case d:
               return csn.kT;
            case e:
               return csn.kU;
            case f:
               return csn.kV;
            case g:
               return csn.kW;
            case h:
               return csn.kX;
            case i:
               return csn.kY;
            case j:
               return csn.kZ;
            case k:
            default:
               return csn.la;
            case l:
               return csn.lb;
            case m:
               return csn.lc;
            case n:
               return csn.ld;
            case o:
               return csn.le;
            case p:
               return csn.lf;
         }
      }
   }

   @Nullable
   public chm a() {
      return this.k;
   }

   public static ciy b(@Nullable chm $$0) {
      return new ciy(a($$0));
   }

   @Override
   public dfa a(dfa $$0, cyy $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   public dfa a(dfa $$0, cxh $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }
}
