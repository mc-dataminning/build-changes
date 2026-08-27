import com.google.common.collect.ImmutableMap;
import it.unimi.dsi.fastutil.objects.Object2IntArrayMap;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import java.util.Map;
import javax.annotation.Nullable;

public class csn extends cwj implements css, czr {
   private static final dfv a = dfu.C;
   private static final dgc<dgp> b = dfu.bl;
   private static final int c = -1;
   private static final Object2IntMap<dgp> d = ac.a(new Object2IntArrayMap(), $$0 -> {
      $$0.defaultReturnValue(-1);
      $$0.put(dgp.b, 10);
      $$0.put(dgp.c, 10);
      $$0.put(dgp.d, 100);
   });
   private static final int e = 5;
   private static final int f = 6;
   private static final int g = 11;
   private static final int h = 13;
   private static final Map<dgp, eib> i = ImmutableMap.of(
      dgp.a,
      csq.a(0.0, 11.0, 0.0, 16.0, 15.0, 16.0),
      dgp.b,
      csq.a(0.0, 11.0, 0.0, 16.0, 15.0, 16.0),
      dgp.c,
      csq.a(0.0, 11.0, 0.0, 16.0, 13.0, 16.0),
      dgp.d,
      ehy.a()
   );
   private static final eib j = csq.a(0.0, 13.0, 0.0, 16.0, 16.0, 16.0);
   private static final Map<hc, eib> k = ImmutableMap.of(
      hc.c, ehy.b(cso.a, j, ehm.e), hc.d, ehy.b(cso.b, j, ehm.e), hc.f, ehy.b(cso.c, j, ehm.e), hc.e, ehy.b(cso.d, j, ehm.e)
   );
   private final Map<dfe, eib> l;

   protected csn(dfd.d $$0) {
      super($$0);
      this.k(this.C.b().a(a, Boolean.valueOf(false)).a(aC, hc.c).a(b, dgp.a));
      this.l = this.a(csn::h);
   }

   private static eib h(dfe $$0) {
      return ehy.a(i.get($$0.c(b)), k.get($$0.c(aC)));
   }

   public static void a(cpr $$0, arx $$1, gw $$2, hc $$3) {
      int $$4 = ars.a($$1, 2, 5);
      gw.a $$5 = $$2.j();
      int $$6 = 0;

      while ($$6 < $$4 && a((cps)$$0, $$5, $$0.a_($$5))) {
         $$6++;
         $$5.c(hc.b);
      }

      int $$7 = $$2.v() + $$6 - 1;
      $$5.q($$2.v());

      while ($$5.v() < $$7) {
         cso.a($$0, $$5, $$0.b_($$5), $$3);
         $$5.c(hc.b);
      }

      a($$0, $$5, $$0.b_($$5), $$3);
   }

   private static boolean n(dfe $$0) {
      return $$0.i() || $$0.a(csr.G) || $$0.a(csr.rE);
   }

   protected static boolean a(cps $$0, gw $$1, dfe $$2) {
      return !$$0.r($$1) && n($$2);
   }

   protected static boolean a(cpr $$0, gw $$1, eah $$2, hc $$3) {
      dfe $$4 = csr.rC.n().a(a, Boolean.valueOf($$2.a(eai.c))).a(aC, $$3);
      return $$0.a($$1, $$4, 3);
   }

   @Override
   public void a(cpq $$0, dfe $$1, ehe $$2, cch $$3) {
      this.a($$1, $$0, $$2.a(), dgp.d, aoz.gu);
   }

   @Override
   public eah c_(dfe $$0) {
      return $$0.c(a) ? eai.c.a(false) : super.c_($$0);
   }

   @Override
   public boolean a(dfe $$0, cpt $$1, gw $$2) {
      gw $$3 = $$2.d();
      dfe $$4 = $$1.a_($$3);
      return $$4.a(this) || $$4.a(csr.rD) || $$4.a(apo.bx);
   }

   @Override
   public dfe a(dfe $$0, hc $$1, dfe $$2, cpr $$3, gw $$4, gw $$5) {
      if ($$1 == hc.a && !$$0.a($$3, $$4)) {
         return csr.a.n();
      } else {
         if ($$0.c(a)) {
            $$3.a($$4, eai.c, eai.c.a($$3));
         }

         return $$1 == hc.b && $$2.a(this) ? csr.rD.l($$0) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   public boolean a(cpt $$0, gw $$1, dfe $$2) {
      dfe $$3 = $$0.a_($$1.c());
      return n($$3);
   }

   @Override
   public boolean a(cpq $$0, arx $$1, gw $$2, dfe $$3) {
      return true;
   }

   @Override
   public void a(akn $$0, arx $$1, gw $$2, dfe $$3) {
      gw $$4 = $$2.c();
      dfe $$5 = $$0.a_($$4);
      if (a((cps)$$0, $$4, $$5)) {
         hc $$6 = $$3.c(aC);
         cso.a($$0, $$2, $$3.u(), $$6);
         a($$0, $$4, $$5.u(), $$6);
      }
   }

   @Override
   public void a(dfe $$0, cpq $$1, gw $$2, bil $$3) {
      if (!$$1.B) {
         if ($$0.c(b) == dgp.a && a($$2, $$3) && !$$1.B($$2)) {
            this.a($$0, $$1, $$2, dgp.b, null);
         }
      }
   }

   @Override
   public void a(dfe $$0, akn $$1, gw $$2, arx $$3) {
      if ($$1.B($$2)) {
         d($$0, $$1, $$2);
      } else {
         dgp $$4 = $$0.c(b);
         if ($$4 == dgp.b) {
            this.a($$0, $$1, $$2, dgp.c, aoz.gu);
         } else if ($$4 == dgp.c) {
            this.a($$0, $$1, $$2, dgp.d, aoz.gu);
         } else if ($$4 == dgp.d) {
            d($$0, $$1, $$2);
         }
      }
   }

   @Override
   public void a(dfe $$0, cpq $$1, gw $$2, csq $$3, gw $$4, boolean $$5) {
      if ($$1.B($$2)) {
         d($$0, $$1, $$2);
      }
   }

   private static void a(cpq $$0, gw $$1, aoy $$2) {
      float $$3 = ars.b($$0.z, 0.8F, 1.2F);
      $$0.a(null, $$1, $$2, apa.e, 1.0F, $$3);
   }

   private static boolean a(gw $$0, bil $$1) {
      return $$1.aA() && $$1.di().d > (double)((float)$$0.v() + 0.6875F);
   }

   private void a(dfe $$0, cpq $$1, gw $$2, dgp $$3, @Nullable aoy $$4) {
      a($$0, $$1, $$2, $$3);
      if ($$4 != null) {
         a($$1, $$2, $$4);
      }

      int $$5 = d.getInt($$3);
      if ($$5 != -1) {
         $$1.a($$2, this, $$5);
      }
   }

   private static void d(dfe $$0, cpq $$1, gw $$2) {
      a($$0, $$1, $$2, dgp.a);
      if ($$0.c(b) != dgp.a) {
         a($$1, $$2, aoz.gv);
      }
   }

   private static void a(dfe $$0, cpq $$1, gw $$2, dgp $$3) {
      dgp $$4 = $$0.c(b);
      $$1.a($$2, $$0.a(b, $$3), 2);
      if ($$3.a() && $$3 != $$4) {
         $$1.a(null, djo.c, $$2);
      }
   }

   @Override
   public eib c(dfe $$0, cow $$1, gw $$2, ehn $$3) {
      return i.get($$0.c(b));
   }

   @Override
   public eib a(dfe $$0, cow $$1, gw $$2, ehn $$3) {
      return this.l.get($$0);
   }

   @Override
   public dfe a(cli $$0) {
      dfe $$1 = $$0.q().a_($$0.a().d());
      eah $$2 = $$0.q().b_($$0.a());
      boolean $$3 = $$1.a(csr.rC) || $$1.a(csr.rD);
      return this.n().a(a, Boolean.valueOf($$2.a(eai.c))).a(aC, $$3 ? $$1.c(aC) : $$0.g().g());
   }

   @Override
   protected void a(dff.a<csq, dfe> $$0) {
      $$0.a(a, aC, b);
   }
}
