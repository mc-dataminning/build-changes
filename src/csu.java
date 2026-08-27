import com.google.common.collect.ImmutableMap;
import it.unimi.dsi.fastutil.objects.Object2IntArrayMap;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import java.util.Map;
import javax.annotation.Nullable;

public class csu extends cwq implements csz, czy {
   private static final dgc a = dgb.C;
   private static final dgj<dgw> b = dgb.bl;
   private static final int c = -1;
   private static final Object2IntMap<dgw> d = ac.a(new Object2IntArrayMap(), $$0 -> {
      $$0.defaultReturnValue(-1);
      $$0.put(dgw.b, 10);
      $$0.put(dgw.c, 10);
      $$0.put(dgw.d, 100);
   });
   private static final int e = 5;
   private static final int f = 6;
   private static final int g = 11;
   private static final int h = 13;
   private static final Map<dgw, eii> i = ImmutableMap.of(
      dgw.a,
      csx.a(0.0, 11.0, 0.0, 16.0, 15.0, 16.0),
      dgw.b,
      csx.a(0.0, 11.0, 0.0, 16.0, 15.0, 16.0),
      dgw.c,
      csx.a(0.0, 11.0, 0.0, 16.0, 13.0, 16.0),
      dgw.d,
      eif.a()
   );
   private static final eii j = csx.a(0.0, 13.0, 0.0, 16.0, 16.0, 16.0);
   private static final Map<hc, eii> k = ImmutableMap.of(
      hc.c, eif.b(csv.a, j, eht.e), hc.d, eif.b(csv.b, j, eht.e), hc.f, eif.b(csv.c, j, eht.e), hc.e, eif.b(csv.d, j, eht.e)
   );
   private final Map<dfl, eii> l;

   protected csu(dfk.d $$0) {
      super($$0);
      this.k(this.C.b().a(a, Boolean.valueOf(false)).a(aC, hc.c).a(b, dgw.a));
      this.l = this.a(csu::h);
   }

   private static eii h(dfl $$0) {
      return eif.a(i.get($$0.c(b)), k.get($$0.c(aC)));
   }

   public static void a(cpy $$0, ase $$1, gw $$2, hc $$3) {
      int $$4 = ary.a($$1, 2, 5);
      gw.a $$5 = $$2.j();
      int $$6 = 0;

      while ($$6 < $$4 && a((cpz)$$0, $$5, $$0.a_($$5))) {
         $$6++;
         $$5.c(hc.b);
      }

      int $$7 = $$2.v() + $$6 - 1;
      $$5.q($$2.v());

      while ($$5.v() < $$7) {
         csv.a($$0, $$5, $$0.b_($$5), $$3);
         $$5.c(hc.b);
      }

      a($$0, $$5, $$0.b_($$5), $$3);
   }

   private static boolean n(dfl $$0) {
      return $$0.i() || $$0.a(csy.G) || $$0.a(csy.rE);
   }

   protected static boolean a(cpz $$0, gw $$1, dfl $$2) {
      return !$$0.r($$1) && n($$2);
   }

   protected static boolean a(cpy $$0, gw $$1, eao $$2, hc $$3) {
      dfl $$4 = csy.rC.n().a(a, Boolean.valueOf($$2.a(eap.c))).a(aC, $$3);
      return $$0.a($$1, $$4, 3);
   }

   @Override
   public void a(cpx $$0, dfl $$1, ehl $$2, cco $$3) {
      this.a($$1, $$0, $$2.a(), dgw.d, apf.gu);
   }

   @Override
   public eao c_(dfl $$0) {
      return $$0.c(a) ? eap.c.a(false) : super.c_($$0);
   }

   @Override
   public boolean a(dfl $$0, cqa $$1, gw $$2) {
      gw $$3 = $$2.d();
      dfl $$4 = $$1.a_($$3);
      return $$4.a(this) || $$4.a(csy.rD) || $$4.a(apu.bx);
   }

   @Override
   public dfl a(dfl $$0, hc $$1, dfl $$2, cpy $$3, gw $$4, gw $$5) {
      if ($$1 == hc.a && !$$0.a($$3, $$4)) {
         return csy.a.n();
      } else {
         if ($$0.c(a)) {
            $$3.a($$4, eap.c, eap.c.a($$3));
         }

         return $$1 == hc.b && $$2.a(this) ? csy.rD.l($$0) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   public boolean a(cqa $$0, gw $$1, dfl $$2) {
      dfl $$3 = $$0.a_($$1.c());
      return n($$3);
   }

   @Override
   public boolean a(cpx $$0, ase $$1, gw $$2, dfl $$3) {
      return true;
   }

   @Override
   public void a(aks $$0, ase $$1, gw $$2, dfl $$3) {
      gw $$4 = $$2.c();
      dfl $$5 = $$0.a_($$4);
      if (a((cpz)$$0, $$4, $$5)) {
         hc $$6 = $$3.c(aC);
         csv.a($$0, $$2, $$3.u(), $$6);
         a($$0, $$4, $$5.u(), $$6);
      }
   }

   @Override
   public void a(dfl $$0, cpx $$1, gw $$2, bis $$3) {
      if (!$$1.B) {
         if ($$0.c(b) == dgw.a && a($$2, $$3) && !$$1.B($$2)) {
            this.a($$0, $$1, $$2, dgw.b, null);
         }
      }
   }

   @Override
   public void a(dfl $$0, aks $$1, gw $$2, ase $$3) {
      if ($$1.B($$2)) {
         d($$0, $$1, $$2);
      } else {
         dgw $$4 = $$0.c(b);
         if ($$4 == dgw.b) {
            this.a($$0, $$1, $$2, dgw.c, apf.gu);
         } else if ($$4 == dgw.c) {
            this.a($$0, $$1, $$2, dgw.d, apf.gu);
         } else if ($$4 == dgw.d) {
            d($$0, $$1, $$2);
         }
      }
   }

   @Override
   public void a(dfl $$0, cpx $$1, gw $$2, csx $$3, gw $$4, boolean $$5) {
      if ($$1.B($$2)) {
         d($$0, $$1, $$2);
      }
   }

   private static void a(cpx $$0, gw $$1, ape $$2) {
      float $$3 = ary.b($$0.z, 0.8F, 1.2F);
      $$0.a(null, $$1, $$2, apg.e, 1.0F, $$3);
   }

   private static boolean a(gw $$0, bis $$1) {
      return $$1.aA() && $$1.dj().d > (double)((float)$$0.v() + 0.6875F);
   }

   private void a(dfl $$0, cpx $$1, gw $$2, dgw $$3, @Nullable ape $$4) {
      a($$0, $$1, $$2, $$3);
      if ($$4 != null) {
         a($$1, $$2, $$4);
      }

      int $$5 = d.getInt($$3);
      if ($$5 != -1) {
         $$1.a($$2, this, $$5);
      }
   }

   private static void d(dfl $$0, cpx $$1, gw $$2) {
      a($$0, $$1, $$2, dgw.a);
      if ($$0.c(b) != dgw.a) {
         a($$1, $$2, apf.gv);
      }
   }

   private static void a(dfl $$0, cpx $$1, gw $$2, dgw $$3) {
      dgw $$4 = $$0.c(b);
      $$1.a($$2, $$0.a(b, $$3), 2);
      if ($$3.a() && $$3 != $$4) {
         $$1.a(null, djv.c, $$2);
      }
   }

   @Override
   public eii c(dfl $$0, cpd $$1, gw $$2, ehu $$3) {
      return i.get($$0.c(b));
   }

   @Override
   public eii a(dfl $$0, cpd $$1, gw $$2, ehu $$3) {
      return this.l.get($$0);
   }

   @Override
   public dfl a(clp $$0) {
      dfl $$1 = $$0.q().a_($$0.a().d());
      eao $$2 = $$0.q().b_($$0.a());
      boolean $$3 = $$1.a(csy.rC) || $$1.a(csy.rD);
      return this.n().a(a, Boolean.valueOf($$2.a(eap.c))).a(aC, $$3 ? $$1.c(aC) : $$0.g().g());
   }

   @Override
   protected void a(dfm.a<csx, dfl> $$0) {
      $$0.a(a, aC, b);
   }
}
